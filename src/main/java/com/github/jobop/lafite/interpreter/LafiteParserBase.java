package com.github.jobop.lafite.interpreter;


import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;

import java.util.List;

/**
 * Created by Enzo Cotter on 2020/3/12.
 */
public class LafiteParserBase extends Parser
{
    protected LafiteParserBase(TokenStream input) {
        super(input);
    }

    /**
     * Returns {@code true} iff on the current index of the parser's
     * token stream a token exists on the {@code HIDDEN} channel which
     * either is a line terminator, or is a multi line comment that
     * contains a line terminator.
     *
     * @return {@code true} iff on the current index of the parser's
     * token stream a token exists on the {@code HIDDEN} channel which
     * either is a line terminator, or is a multi line comment that
     * contains a line terminator.
     */
    protected boolean lineTerminatorAhead() {
        // Get the token ahead of the current index.
        int possibleIndexEosToken = this.getCurrentToken().getTokenIndex() - 1;

        if (possibleIndexEosToken == -1)
        {
            return true;
        }

        Token ahead = _input.get(possibleIndexEosToken);
        if (ahead.getChannel() != Lexer.HIDDEN) {
            // We're only interested in tokens on the HIDDEN channel.
            return false;
        }

        if (ahead.getType() == LafiteLexer.TERMINATOR) {
            // There is definitely a line terminator ahead.
            return true;
        }

        if (ahead.getType() == LafiteLexer.WS) {
            // Get the token ahead of the current whitespaces.
            possibleIndexEosToken = this.getCurrentToken().getTokenIndex() - 2;
            ahead = _input.get(possibleIndexEosToken);
        }

        // Get the token's text and type.
        String text = ahead.getText();
        int type = ahead.getType();

        // Check if the token is, or contains a line terminator.
        return (type == LafiteLexer.COMMENT && (text.contains("\r") || text.contains("\n"))) ||
                (type == LafiteLexer.TERMINATOR);
    }

    /**
     * Returns {@code true} if no line terminator exists between the specified
     * token offset and the prior one on the {@code HIDDEN} channel.
     *
     * @return {@code true} if no line terminator exists between the specified
     * token offset and the prior one on the {@code HIDDEN} channel.
     */
    protected boolean noTerminatorBetween(int tokenOffset) {
        BufferedTokenStream stream = (BufferedTokenStream)_input;
        List<Token> tokens = stream.getHiddenTokensToLeft(stream.LT(tokenOffset).getTokenIndex());

        if (tokens == null) {
            return true;
        }

        for (Token token : tokens) {
            if (token.getText().contains("\n"))
                return false;
        }

        return true;
    }

    /**
     * Returns {@code true} if no line terminator exists after any encounterd
     * parameters beyond the specified token offset and the next on the
     * {@code HIDDEN} channel.
     *
     * @return {@code true} if no line terminator exists after any encounterd
     * parameters beyond the specified token offset and the next on the
     * {@code HIDDEN} channel.
     */
    protected boolean noTerminatorAfterParams(int tokenOffset) {
        BufferedTokenStream stream = (BufferedTokenStream)_input;
        int leftParams = 1;
        int rightParams = 0;
        int valueType;

        if (stream.LT(tokenOffset).getType() == LafiteLexer.L_PAREN) {
            // Scan past parameters
            while (leftParams != rightParams) {
                tokenOffset++;
                valueType = stream.LT(tokenOffset).getType();

                if (valueType == LafiteLexer.L_PAREN){
                    leftParams++;
                }
                else if (valueType == LafiteLexer.R_PAREN) {
                    rightParams++;
                }
            }

            tokenOffset++;
            return noTerminatorBetween(tokenOffset);
        }

        return true;
    }

    protected boolean checkPreviousTokenText(String text)
    {
        BufferedTokenStream stream = (BufferedTokenStream)_input;
        String prevTokenText = stream.LT(1).getText();

        if (prevTokenText == null)
            return false;

        return prevTokenText.equals(text);
    }

    @Override
    public String[] getTokenNames() {
        return new String[0];
    }

    @Override
    public String[] getRuleNames() {
        return new String[0];
    }

    @Override
    public String getGrammarFileName() {
        return null;
    }

    @Override
    public ATN getATN() {
        return null;
    }
}