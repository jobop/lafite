// Generated from LafiteParser.g4 by ANTLR 4.8

package com.github.jobop.lafite.interpreter;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LafiteParser extends LafiteParserBase {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BREAK=1, DEFAULT=2, FUNC=3, LA=4, ELSE=5, NAMESPACE=6, SWITCH=7, CONST=8, 
		FALLTHROUGH=9, IF=10, WHILE=11, RANGE=12, TYPE=13, CONTINUE=14, FOR=15, 
		IMPORT=16, RETURN=17, OUT=18, VAR=19, NIL_LIT=20, IDENTIFIER=21, L_PAREN=22, 
		R_PAREN=23, L_CURLY=24, R_CURLY=25, L_BRACKET=26, R_BRACKET=27, ASSIGN=28, 
		COMMA=29, SEMI=30, COLON=31, DOT=32, PLUS_PLUS=33, MINUS_MINUS=34, DECLARE_ASSIGN=35, 
		ELLIPSIS=36, LOGICAL_OR=37, LOGICAL_AND=38, EQUALS=39, NOT_EQUALS=40, 
		LESS=41, LESS_OR_EQUALS=42, GREATER=43, GREATER_OR_EQUALS=44, OR=45, DIV=46, 
		MOD=47, LSHIFT=48, RSHIFT=49, BIT_CLEAR=50, EXCLAMATION=51, PLUS=52, MINUS=53, 
		CARET=54, STAR=55, AMPERSAND=56, RECEIVE=57, DECIMAL_LIT=58, OCTAL_LIT=59, 
		HEX_LIT=60, FLOAT_LIT=61, IMAGINARY_LIT=62, RUNE_LIT=63, RAW_STRING_LIT=64, 
		INTERPRETED_STRING_LIT=65, WS=66, COMMENT=67, TERMINATOR=68, LINE_COMMENT=69, 
		DENTIFIER=70;
	public static final int
		RULE_sourceFile = 0, RULE_namespaceClause = 1, RULE_importDecl = 2, RULE_importSpec = 3, 
		RULE_importPath = 4, RULE_declaration = 5, RULE_constDecl = 6, RULE_constSpec = 7, 
		RULE_identifierList = 8, RULE_param_identifierList = 9, RULE_call_param_identifierList = 10, 
		RULE_expressionList = 11, RULE_functionDecl = 12, RULE_varDecl = 13, RULE_varSpec = 14, 
		RULE_block = 15, RULE_statementList = 16, RULE_statement = 17, RULE_simpleStmt = 18, 
		RULE_expressionStmt = 19, RULE_incDecStmt = 20, RULE_assignment = 21, 
		RULE_assign_op = 22, RULE_shortVarDecl = 23, RULE_emptyStmt = 24, RULE_returnStmt = 25, 
		RULE_outStmt = 26, RULE_mixList = 27, RULE_breakStmt = 28, RULE_continueStmt = 29, 
		RULE_ifStmt = 30, RULE_whileStmt = 31, RULE_recvStmt = 32, RULE_forStmt = 33, 
		RULE_forClause = 34, RULE_rangeClause = 35, RULE_laStmt = 36, RULE_arrayLength = 37, 
		RULE_methodSpec = 38, RULE_functionType = 39, RULE_signature = 40, RULE_parameters = 41, 
		RULE_call_parameters = 42, RULE_expression = 43, RULE_twoExpr = 44, RULE_primaryExpr = 45, 
		RULE_callStmt = 46, RULE_invokeParam = 47, RULE_unaryExpr = 48, RULE_operand = 49, 
		RULE_literal = 50, RULE_basicLit = 51, RULE_operandName = 52, RULE_qualifiedIdent = 53, 
		RULE_compositeLit = 54, RULE_literalValue = 55, RULE_elementList = 56, 
		RULE_keyedElement = 57, RULE_key = 58, RULE_element = 59, RULE_fieldDecl = 60, 
		RULE_string_ = 61, RULE_functionLit = 62, RULE_index = 63, RULE_arguments = 64, 
		RULE_methodExpr = 65, RULE_eos = 66;
	private static String[] makeRuleNames() {
		return new String[] {
			"sourceFile", "namespaceClause", "importDecl", "importSpec", "importPath", 
			"declaration", "constDecl", "constSpec", "identifierList", "param_identifierList", 
			"call_param_identifierList", "expressionList", "functionDecl", "varDecl", 
			"varSpec", "block", "statementList", "statement", "simpleStmt", "expressionStmt", 
			"incDecStmt", "assignment", "assign_op", "shortVarDecl", "emptyStmt", 
			"returnStmt", "outStmt", "mixList", "breakStmt", "continueStmt", "ifStmt", 
			"whileStmt", "recvStmt", "forStmt", "forClause", "rangeClause", "laStmt", 
			"arrayLength", "methodSpec", "functionType", "signature", "parameters", 
			"call_parameters", "expression", "twoExpr", "primaryExpr", "callStmt", 
			"invokeParam", "unaryExpr", "operand", "literal", "basicLit", "operandName", 
			"qualifiedIdent", "compositeLit", "literalValue", "elementList", "keyedElement", 
			"key", "element", "fieldDecl", "string_", "functionLit", "index", "arguments", 
			"methodExpr", "eos"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'break'", "'default'", "'func'", "'la'", "'else'", "'namespace'", 
			"'switch'", "'const'", "'fallthrough'", "'if'", "'while'", "'range'", 
			"'type'", "'continue'", "'for'", "'import'", "'return'", "'out'", "'var'", 
			"'nil'", null, "'('", "')'", "'{'", "'}'", "'['", "']'", "'='", "','", 
			"';'", "':'", "'.'", "'++'", "'--'", "':='", "'...'", "'||'", "'&&'", 
			"'=='", "'!='", "'<'", "'<='", "'>'", "'>='", "'|'", "'/'", "'%'", "'<<'", 
			"'>>'", "'&^'", "'!'", "'+'", "'-'", "'^'", "'*'", "'&'", "'<-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BREAK", "DEFAULT", "FUNC", "LA", "ELSE", "NAMESPACE", "SWITCH", 
			"CONST", "FALLTHROUGH", "IF", "WHILE", "RANGE", "TYPE", "CONTINUE", "FOR", 
			"IMPORT", "RETURN", "OUT", "VAR", "NIL_LIT", "IDENTIFIER", "L_PAREN", 
			"R_PAREN", "L_CURLY", "R_CURLY", "L_BRACKET", "R_BRACKET", "ASSIGN", 
			"COMMA", "SEMI", "COLON", "DOT", "PLUS_PLUS", "MINUS_MINUS", "DECLARE_ASSIGN", 
			"ELLIPSIS", "LOGICAL_OR", "LOGICAL_AND", "EQUALS", "NOT_EQUALS", "LESS", 
			"LESS_OR_EQUALS", "GREATER", "GREATER_OR_EQUALS", "OR", "DIV", "MOD", 
			"LSHIFT", "RSHIFT", "BIT_CLEAR", "EXCLAMATION", "PLUS", "MINUS", "CARET", 
			"STAR", "AMPERSAND", "RECEIVE", "DECIMAL_LIT", "OCTAL_LIT", "HEX_LIT", 
			"FLOAT_LIT", "IMAGINARY_LIT", "RUNE_LIT", "RAW_STRING_LIT", "INTERPRETED_STRING_LIT", 
			"WS", "COMMENT", "TERMINATOR", "LINE_COMMENT", "DENTIFIER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "LafiteParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LafiteParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SourceFileContext extends ParserRuleContext {
		public NamespaceClauseContext namespaceClause() {
			return getRuleContext(NamespaceClauseContext.class,0);
		}
		public List<EosContext> eos() {
			return getRuleContexts(EosContext.class);
		}
		public EosContext eos(int i) {
			return getRuleContext(EosContext.class,i);
		}
		public List<ImportDeclContext> importDecl() {
			return getRuleContexts(ImportDeclContext.class);
		}
		public ImportDeclContext importDecl(int i) {
			return getRuleContext(ImportDeclContext.class,i);
		}
		public List<FunctionDeclContext> functionDecl() {
			return getRuleContexts(FunctionDeclContext.class);
		}
		public FunctionDeclContext functionDecl(int i) {
			return getRuleContext(FunctionDeclContext.class,i);
		}
		public List<ShortVarDeclContext> shortVarDecl() {
			return getRuleContexts(ShortVarDeclContext.class);
		}
		public ShortVarDeclContext shortVarDecl(int i) {
			return getRuleContext(ShortVarDeclContext.class,i);
		}
		public SourceFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).enterSourceFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).exitSourceFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LafiteParserVisitor ) return ((LafiteParserVisitor<? extends T>)visitor).visitSourceFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceFileContext sourceFile() throws RecognitionException {
		SourceFileContext _localctx = new SourceFileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sourceFile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			namespaceClause();
			setState(135);
			eos();
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(136);
				importDecl();
				setState(137);
				eos();
				}
				}
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNC || _la==IDENTIFIER) {
				{
				{
				setState(146);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FUNC:
					{
					setState(144);
					functionDecl();
					}
					break;
				case IDENTIFIER:
					{
					setState(145);
					shortVarDecl();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(148);
				eos();
				}
				}
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamespaceClauseContext extends ParserRuleContext {
		public TerminalNode NAMESPACE() { return getToken(LafiteParser.NAMESPACE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(LafiteParser.IDENTIFIER, 0); }
		public NamespaceClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).enterNamespaceClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).exitNamespaceClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LafiteParserVisitor ) return ((LafiteParserVisitor<? extends T>)visitor).visitNamespaceClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceClauseContext namespaceClause() throws RecognitionException {
		NamespaceClauseContext _localctx = new NamespaceClauseContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_namespaceClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(NAMESPACE);
			setState(156);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDeclContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(LafiteParser.IMPORT, 0); }
		public ImportSpecContext importSpec() {
			return getRuleContext(ImportSpecContext.class,0);
		}
		public ImportDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).enterImportDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).exitImportDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LafiteParserVisitor ) return ((LafiteParserVisitor<? extends T>)visitor).visitImportDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDeclContext importDecl() throws RecognitionException {
		ImportDeclContext _localctx = new ImportDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(IMPORT);
			setState(159);
			importSpec();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportSpecContext extends ParserRuleContext {
		public ImportPathContext importPath() {
			return getRuleContext(ImportPathContext.class,0);
		}
		public TerminalNode DENTIFIER() { return getToken(LafiteParser.DENTIFIER, 0); }
		public ImportSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).enterImportSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).exitImportSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LafiteParserVisitor ) return ((LafiteParserVisitor<? extends T>)visitor).visitImportSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportSpecContext importSpec() throws RecognitionException {
		ImportSpecContext _localctx = new ImportSpecContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_importSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DENTIFIER) {
				{
				setState(161);
				match(DENTIFIER);
				}
			}

			setState(164);
			importPath();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportPathContext extends ParserRuleContext {
		public String_Context string_() {
			return getRuleContext(String_Context.class,0);
		}
		public ImportPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).enterImportPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).exitImportPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LafiteParserVisitor ) return ((LafiteParserVisitor<? extends T>)visitor).visitImportPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportPathContext importPath() throws RecognitionException {
		ImportPathContext _localctx = new ImportPathContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_importPath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			string_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LafiteParserVisitor ) return ((LafiteParserVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			varDecl();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstDeclContext extends ParserRuleContext {
		public ConstDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDecl; }
	 
		public ConstDeclContext() { }
		public void copyFrom(ConstDeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Declaration_constDeclContext extends ConstDeclContext {
		public TerminalNode CONST() { return getToken(LafiteParser.CONST, 0); }
		public ConstSpecContext constSpec() {
			return getRuleContext(ConstSpecContext.class,0);
		}
		public Declaration_constDeclContext(ConstDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).enterDeclaration_constDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).exitDeclaration_constDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LafiteParserVisitor ) return ((LafiteParserVisitor<? extends T>)visitor).visitDeclaration_constDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstDeclContext constDecl() throws RecognitionException {
		ConstDeclContext _localctx = new ConstDeclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_constDecl);
		try {
			_localctx = new Declaration_constDeclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(CONST);
			setState(171);
			constSpec();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstSpecContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public ConstSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).enterConstSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).exitConstSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LafiteParserVisitor ) return ((LafiteParserVisitor<? extends T>)visitor).visitConstSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstSpecContext constSpec() throws RecognitionException {
		ConstSpecContext _localctx = new ConstSpecContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_constSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			identifierList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierListContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(LafiteParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(LafiteParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LafiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LafiteParser.COMMA, i);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).exitIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LafiteParserVisitor ) return ((LafiteParserVisitor<? extends T>)visitor).visitIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(IDENTIFIER);
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(176);
				match(COMMA);
				setState(177);
				match(IDENTIFIER);
				}
				}
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Param_identifierListContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(LafiteParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(LafiteParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LafiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LafiteParser.COMMA, i);
		}
		public Param_identifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).enterParam_identifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).exitParam_identifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LafiteParserVisitor ) return ((LafiteParserVisitor<? extends T>)visitor).visitParam_identifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_identifierListContext param_identifierList() throws RecognitionException {
		Param_identifierListContext _localctx = new Param_identifierListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_param_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(IDENTIFIER);
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(184);
				match(COMMA);
				setState(185);
				match(IDENTIFIER);
				}
				}
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Call_param_identifierListContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(LafiteParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(LafiteParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LafiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LafiteParser.COMMA, i);
		}
		public Call_param_identifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_param_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).enterCall_param_identifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).exitCall_param_identifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LafiteParserVisitor ) return ((LafiteParserVisitor<? extends T>)visitor).visitCall_param_identifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Call_param_identifierListContext call_param_identifierList() throws RecognitionException {
		Call_param_identifierListContext _localctx = new Call_param_identifierListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_call_param_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(IDENTIFIER);
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(192);
				match(COMMA);
				setState(193);
				match(IDENTIFIER);
				}
				}
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LafiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LafiteParser.COMMA, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LafiteParserVisitor ) return ((LafiteParserVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expressionList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			expression(0);
			setState(204);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(200);
					match(COMMA);
					setState(201);
					expression(0);
					}
					} 
				}
				setState(206);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDeclContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(LafiteParser.FUNC, 0); }
		public TerminalNode IDENTIFIER() { return getToken(LafiteParser.IDENTIFIER, 0); }
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunctionDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).enterFunctionDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).exitFunctionDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LafiteParserVisitor ) return ((LafiteParserVisitor<? extends T>)visitor).visitFunctionDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclContext functionDecl() throws RecognitionException {
		FunctionDeclContext _localctx = new FunctionDeclContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_functionDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(FUNC);
			setState(208);
			match(IDENTIFIER);
			{
			setState(209);
			signature();
			setState(211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(210);
				block();
				}
				break;
			}
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclContext extends ParserRuleContext {
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
	 
		public VarDeclContext() { }
		public void copyFrom(VarDeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarDecl_Context extends VarDeclContext {
		public TerminalNode VAR() { return getToken(LafiteParser.VAR, 0); }
		public VarSpecContext varSpec() {
			return getRuleContext(VarSpecContext.class,0);
		}
		public VarDecl_Context(VarDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).enterVarDecl_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).exitVarDecl_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LafiteParserVisitor ) return ((LafiteParserVisitor<? extends T>)visitor).visitVarDecl_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_varDecl);
		try {
			_localctx = new VarDecl_Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(VAR);
			setState(214);
			varSpec();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarSpecContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public VarSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).enterVarSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).exitVarSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LafiteParserVisitor ) return ((LafiteParserVisitor<? extends T>)visitor).visitVarSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarSpecContext varSpec() throws RecognitionException {
		VarSpecContext _localctx = new VarSpecContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_varSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			identifierList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode L_CURLY() { return getToken(LafiteParser.L_CURLY, 0); }
		public TerminalNode R_CURLY() { return getToken(LafiteParser.R_CURLY, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LafiteParserVisitor ) return ((LafiteParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(L_CURLY);
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BREAK) | (1L << FUNC) | (1L << LA) | (1L << IF) | (1L << WHILE) | (1L << CONTINUE) | (1L << RETURN) | (1L << OUT) | (1L << NIL_LIT) | (1L << IDENTIFIER) | (1L << L_PAREN) | (1L << L_CURLY) | (1L << SEMI) | (1L << EXCLAMATION) | (1L << PLUS) | (1L << MINUS) | (1L << DECIMAL_LIT) | (1L << FLOAT_LIT))) != 0) || _la==RAW_STRING_LIT || _la==INTERPRETED_STRING_LIT) {
				{
				setState(219);
				statementList();
				}
			}

			setState(222);
			match(R_CURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementListContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<EosContext> eos() {
			return getRuleContexts(EosContext.class);
		}
		public EosContext eos(int i) {
			return getRuleContext(EosContext.class,i);
		}
		public StatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).enterStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).exitStatementList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LafiteParserVisitor ) return ((LafiteParserVisitor<? extends T>)visitor).visitStatementList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementListContext statementList() throws RecognitionException {
		StatementListContext _localctx = new StatementListContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_statementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(224);
				statement();
				setState(225);
				eos();
				}
				}
				setState(229); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BREAK) | (1L << FUNC) | (1L << LA) | (1L << IF) | (1L << WHILE) | (1L << CONTINUE) | (1L << RETURN) | (1L << OUT) | (1L << NIL_LIT) | (1L << IDENTIFIER) | (1L << L_PAREN) | (1L << L_CURLY) | (1L << SEMI) | (1L << EXCLAMATION) | (1L << PLUS) | (1L << MINUS) | (1L << DECIMAL_LIT) | (1L << FLOAT_LIT))) != 0) || _la==RAW_STRING_LIT || _la==INTERPRETED_STRING_LIT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public ShortVarDeclContext shortVarDecl() {
			return getRuleContext(ShortVarDeclContext.class,0);
		}
		public SimpleStmtContext simpleStmt() {
			return getRuleContext(SimpleStmtContext.class,0);
		}
		public LaStmtContext laStmt() {
			return getRuleContext(LaStmtContext.class,0);
		}
		public ReturnStmtContext returnStmt() {
			return getRuleContext(ReturnStmtContext.class,0);
		}
		public BreakStmtContext breakStmt() {
			return getRuleContext(BreakStmtContext.class,0);
		}
		public ContinueStmtContext continueStmt() {
			return getRuleContext(ContinueStmtContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public WhileStmtContext whileStmt() {
			return getRuleContext(WhileStmtContext.class,0);
		}
		public OutStmtContext outStmt() {
			return getRuleContext(OutStmtContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LafiteParserVisitor ) return ((LafiteParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_statement);
		try {
			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				shortVarDecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				simpleStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(233);
				laStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(234);
				returnStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(235);
				breakStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(236);
				continueStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(237);
				block();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(238);
				ifStmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(239);
				whileStmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(240);
				outStmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleStmtContext extends ParserRuleContext {
		public ExpressionStmtContext expressionStmt() {
			return getRuleContext(ExpressionStmtContext.class,0);
		}
		public IncDecStmtContext incDecStmt() {
			return getRuleContext(IncDecStmtContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ShortVarDeclContext shortVarDecl() {
			return getRuleContext(ShortVarDeclContext.class,0);
		}
		public EmptyStmtContext emptyStmt() {
			return getRuleContext(EmptyStmtContext.class,0);
		}
		public SimpleStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).enterSimpleStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).exitSimpleStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LafiteParserVisitor ) return ((LafiteParserVisitor<? extends T>)visitor).visitSimpleStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleStmtContext simpleStmt() throws RecognitionException {
		SimpleStmtContext _localctx = new SimpleStmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_simpleStmt);
		try {
			setState(248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(243);
				expressionStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(244);
				incDecStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(245);
				assignment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(246);
				shortVarDecl();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(247);
				emptyStmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionStmtContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).enterExpressionStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).exitExpressionStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LafiteParserVisitor ) return ((LafiteParserVisitor<? extends T>)visitor).visitExpressionStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStmtContext expressionStmt() throws RecognitionException {
		ExpressionStmtContext _localctx = new ExpressionStmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expressionStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IncDecStmtContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PLUS_PLUS() { return getToken(LafiteParser.PLUS_PLUS, 0); }
		public TerminalNode MINUS_MINUS() { return getToken(LafiteParser.MINUS_MINUS, 0); }
		public IncDecStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incDecStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).enterIncDecStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).exitIncDecStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LafiteParserVisitor ) return ((LafiteParserVisitor<? extends T>)visitor).visitIncDecStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncDecStmtContext incDecStmt() throws RecognitionException {
		IncDecStmtContext _localctx = new IncDecStmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_incDecStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			expression(0);
			setState(253);
			_la = _input.LA(1);
			if ( !(_la==PLUS_PLUS || _la==MINUS_MINUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public Assign_opContext assign_op() {
			return getRuleContext(Assign_opContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LafiteParserVisitor ) return ((LafiteParserVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			identifierList();
			setState(256);
			assign_op();
			setState(257);
			expressionList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assign_opContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(LafiteParser.ASSIGN, 0); }
		public Assign_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).enterAssign_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).exitAssign_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LafiteParserVisitor ) return ((LafiteParserVisitor<? extends T>)visitor).visitAssign_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_opContext assign_op() throws RecognitionException {
		Assign_opContext _localctx = new Assign_opContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_assign_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(ASSIGN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShortVarDeclContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode DECLARE_ASSIGN() { return getToken(LafiteParser.DECLARE_ASSIGN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ShortVarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shortVarDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).enterShortVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).exitShortVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LafiteParserVisitor ) return ((LafiteParserVisitor<? extends T>)visitor).visitShortVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShortVarDeclContext shortVarDecl() throws RecognitionException {
		ShortVarDeclContext _localctx = new ShortVarDeclContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_shortVarDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			identifierList();
			setState(262);
			match(DECLARE_ASSIGN);
			setState(263);
			expressionList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmptyStmtContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(LafiteParser.SEMI, 0); }
		public EmptyStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).enterEmptyStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).exitEmptyStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LafiteParserVisitor ) return ((LafiteParserVisitor<? extends T>)visitor).visitEmptyStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyStmtContext emptyStmt() throws RecognitionException {
		EmptyStmtContext _localctx = new EmptyStmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_emptyStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStmtContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(LafiteParser.RETURN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ReturnStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).enterReturnStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).exitReturnStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LafiteParserVisitor ) return ((LafiteParserVisitor<? extends T>)visitor).visitReturnStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStmtContext returnStmt() throws RecognitionException {
		ReturnStmtContext _localctx = new ReturnStmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_returnStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(RETURN);
			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(268);
				expressionList();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OutStmtContext extends ParserRuleContext {
		public TerminalNode OUT() { return getToken(LafiteParser.OUT, 0); }
		public List<MixListContext> mixList() {
			return getRuleContexts(MixListContext.class);
		}
		public MixListContext mixList(int i) {
			return getRuleContext(MixListContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LafiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LafiteParser.COMMA, i);
		}
		public OutStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).enterOutStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).exitOutStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LafiteParserVisitor ) return ((LafiteParserVisitor<? extends T>)visitor).visitOutStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutStmtContext outStmt() throws RecognitionException {
		OutStmtContext _localctx = new OutStmtContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_outStmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(OUT);
			{
			setState(272);
			mixList();
			}
			setState(277);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(273);
					match(COMMA);
					setState(274);
					mixList();
					}
					} 
				}
				setState(279);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MixListContext extends ParserRuleContext {
		public BasicLitContext basicLit() {
			return getRuleContext(BasicLitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(LafiteParser.IDENTIFIER, 0); }
		public MixListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mixList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).enterMixList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).exitMixList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LafiteParserVisitor ) return ((LafiteParserVisitor<? extends T>)visitor).visitMixList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MixListContext mixList() throws RecognitionException {
		MixListContext _localctx = new MixListContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_mixList);
		try {
			setState(283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(280);
				basicLit();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(282);
				match(IDENTIFIER);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BreakStmtContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(LafiteParser.BREAK, 0); }
		public BreakStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).enterBreakStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).exitBreakStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LafiteParserVisitor ) return ((LafiteParserVisitor<? extends T>)visitor).visitBreakStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStmtContext breakStmt() throws RecognitionException {
		BreakStmtContext _localctx = new BreakStmtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_breakStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(BREAK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContinueStmtContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(LafiteParser.CONTINUE, 0); }
		public ContinueStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).enterContinueStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).exitContinueStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LafiteParserVisitor ) return ((LafiteParserVisitor<? extends T>)visitor).visitContinueStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueStmtContext continueStmt() throws RecognitionException {
		ContinueStmtContext _localctx = new ContinueStmtContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_continueStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(CONTINUE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(LafiteParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(LafiteParser.ELSE, 0); }
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).exitIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LafiteParserVisitor ) return ((LafiteParserVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_ifStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(IF);
			setState(290);
			expression(0);
			setState(291);
			block();
			setState(297);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(292);
				match(ELSE);
				setState(295);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IF:
					{
					setState(293);
					ifStmt();
					}
					break;
				case L_CURLY:
					{
					setState(294);
					block();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStmtContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(LafiteParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).enterWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).exitWhileStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LafiteParserVisitor ) return ((LafiteParserVisitor<? extends T>)visitor).visitWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStmtContext whileStmt() throws RecognitionException {
		WhileStmtContext _localctx = new WhileStmtContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_whileStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(WHILE);
			setState(300);
			expression(0);
			setState(301);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RecvStmtContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(LafiteParser.ASSIGN, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode DECLARE_ASSIGN() { return getToken(LafiteParser.DECLARE_ASSIGN, 0); }
		public RecvStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recvStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).enterRecvStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).exitRecvStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LafiteParserVisitor ) return ((LafiteParserVisitor<? extends T>)visitor).visitRecvStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecvStmtContext recvStmt() throws RecognitionException {
		RecvStmtContext _localctx = new RecvStmtContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_recvStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(303);
				expressionList();
				setState(304);
				match(ASSIGN);
				}
				break;
			case 2:
				{
				setState(306);
				identifierList();
				setState(307);
				match(DECLARE_ASSIGN);
				}
				break;
			}
			setState(311);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStmtContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(LafiteParser.FOR, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForClauseContext forClause() {
			return getRuleContext(ForClauseContext.class,0);
		}
		public RangeClauseContext rangeClause() {
			return getRuleContext(RangeClauseContext.class,0);
		}
		public ForStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).enterForStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).exitForStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LafiteParserVisitor ) return ((LafiteParserVisitor<? extends T>)visitor).visitForStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStmtContext forStmt() throws RecognitionException {
		ForStmtContext _localctx = new ForStmtContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_forStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(FOR);
			setState(317);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(314);
				expression(0);
				}
				break;
			case 2:
				{
				setState(315);
				forClause();
				}
				break;
			case 3:
				{
				setState(316);
				rangeClause();
				}
				break;
			}
			setState(319);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForClauseContext extends ParserRuleContext {
		public List<TerminalNode> SEMI() { return getTokens(LafiteParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(LafiteParser.SEMI, i);
		}
		public List<SimpleStmtContext> simpleStmt() {
			return getRuleContexts(SimpleStmtContext.class);
		}
		public SimpleStmtContext simpleStmt(int i) {
			return getRuleContext(SimpleStmtContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).enterForClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).exitForClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LafiteParserVisitor ) return ((LafiteParserVisitor<? extends T>)visitor).visitForClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForClauseContext forClause() throws RecognitionException {
		ForClauseContext _localctx = new ForClauseContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_forClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(321);
				simpleStmt();
				}
				break;
			}
			setState(324);
			match(SEMI);
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (FUNC - 3)) | (1L << (NIL_LIT - 3)) | (1L << (IDENTIFIER - 3)) | (1L << (L_PAREN - 3)) | (1L << (L_CURLY - 3)) | (1L << (EXCLAMATION - 3)) | (1L << (PLUS - 3)) | (1L << (MINUS - 3)) | (1L << (DECIMAL_LIT - 3)) | (1L << (FLOAT_LIT - 3)) | (1L << (RAW_STRING_LIT - 3)) | (1L << (INTERPRETED_STRING_LIT - 3)))) != 0)) {
				{
				setState(325);
				expression(0);
				}
			}

			setState(328);
			match(SEMI);
			setState(330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(329);
				simpleStmt();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RangeClauseContext extends ParserRuleContext {
		public TerminalNode RANGE() { return getToken(LafiteParser.RANGE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(LafiteParser.ASSIGN, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode DECLARE_ASSIGN() { return getToken(LafiteParser.DECLARE_ASSIGN, 0); }
		public RangeClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).enterRangeClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).exitRangeClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LafiteParserVisitor ) return ((LafiteParserVisitor<? extends T>)visitor).visitRangeClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeClauseContext rangeClause() throws RecognitionException {
		RangeClauseContext _localctx = new RangeClauseContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_rangeClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(332);
				expressionList();
				setState(333);
				match(ASSIGN);
				}
				break;
			case 2:
				{
				setState(335);
				identifierList();
				setState(336);
				match(DECLARE_ASSIGN);
				}
				break;
			}
			setState(340);
			match(RANGE);
			setState(341);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LaStmtContext extends ParserRuleContext {
		public TerminalNode LA() { return getToken(LafiteParser.LA, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LaStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_laStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).enterLaStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).exitLaStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LafiteParserVisitor ) return ((LafiteParserVisitor<? extends T>)visitor).visitLaStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LaStmtContext laStmt() throws RecognitionException {
		LaStmtContext _localctx = new LaStmtContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_laStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(LA);
			setState(344);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayLengthContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayLengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLength; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).enterArrayLength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).exitArrayLength(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LafiteParserVisitor ) return ((LafiteParserVisitor<? extends T>)visitor).visitArrayLength(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayLengthContext arrayLength() throws RecognitionException {
		ArrayLengthContext _localctx = new ArrayLengthContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_arrayLength);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodSpecContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(LafiteParser.IDENTIFIER, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public MethodSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).enterMethodSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).exitMethodSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LafiteParserVisitor ) return ((LafiteParserVisitor<? extends T>)visitor).visitMethodSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodSpecContext methodSpec() throws RecognitionException {
		MethodSpecContext _localctx = new MethodSpecContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_methodSpec);
		try {
			setState(353);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(348);
				if (!(noTerminatorAfterParams(2))) throw new FailedPredicateException(this, "noTerminatorAfterParams(2)");
				setState(349);
				match(IDENTIFIER);
				setState(350);
				parameters();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(351);
				match(IDENTIFIER);
				setState(352);
				parameters();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionTypeContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(LafiteParser.FUNC, 0); }
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public FunctionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).enterFunctionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).exitFunctionType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LafiteParserVisitor ) return ((LafiteParserVisitor<? extends T>)visitor).visitFunctionType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTypeContext functionType() throws RecognitionException {
		FunctionTypeContext _localctx = new FunctionTypeContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_functionType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(FUNC);
			setState(356);
			signature();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SignatureContext extends ParserRuleContext {
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public SignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).enterSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).exitSignature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LafiteParserVisitor ) return ((LafiteParserVisitor<? extends T>)visitor).visitSignature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignatureContext signature() throws RecognitionException {
		SignatureContext _localctx = new SignatureContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_signature);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			parameters();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametersContext extends ParserRuleContext {
		public TerminalNode L_PAREN() { return getToken(LafiteParser.L_PAREN, 0); }
		public TerminalNode R_PAREN() { return getToken(LafiteParser.R_PAREN, 0); }
		public Param_identifierListContext param_identifierList() {
			return getRuleContext(Param_identifierListContext.class,0);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LafiteParserVisitor ) return ((LafiteParserVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(L_PAREN);
			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(361);
				param_identifierList();
				}
			}

			setState(364);
			match(R_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Call_parametersContext extends ParserRuleContext {
		public TerminalNode L_PAREN() { return getToken(LafiteParser.L_PAREN, 0); }
		public TerminalNode R_PAREN() { return getToken(LafiteParser.R_PAREN, 0); }
		public Call_param_identifierListContext call_param_identifierList() {
			return getRuleContext(Call_param_identifierListContext.class,0);
		}
		public Call_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).enterCall_parameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).exitCall_parameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LafiteParserVisitor ) return ((LafiteParserVisitor<? extends T>)visitor).visitCall_parameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Call_parametersContext call_parameters() throws RecognitionException {
		Call_parametersContext _localctx = new Call_parametersContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_call_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(L_PAREN);
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(367);
				call_param_identifierList();
				}
			}

			setState(370);
			match(R_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrimaryExpr_Context extends ExpressionContext {
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public PrimaryExpr_Context(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).enterPrimaryExpr_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).exitPrimaryExpr_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LafiteParserVisitor ) return ((LafiteParserVisitor<? extends T>)visitor).visitPrimaryExpr_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryExpr_Context extends ExpressionContext {
		public UnaryExprContext unaryExpr() {
			return getRuleContext(UnaryExprContext.class,0);
		}
		public UnaryExpr_Context(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).enterUnaryExpr_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).exitUnaryExpr_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LafiteParserVisitor ) return ((LafiteParserVisitor<? extends T>)visitor).visitUnaryExpr_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallParent_Context extends ExpressionContext {
		public CallStmtContext callStmt() {
			return getRuleContext(CallStmtContext.class,0);
		}
		public CallParent_Context(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).enterCallParent_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).exitCallParent_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LafiteParserVisitor ) return ((LafiteParserVisitor<? extends T>)visitor).visitCallParent_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrExpr_Context extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LOGICAL_OR() { return getToken(LafiteParser.LOGICAL_OR, 0); }
		public OrExpr_Context(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).enterOrExpr_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).exitOrExpr_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LafiteParserVisitor ) return ((LafiteParserVisitor<? extends T>)visitor).visitOrExpr_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddsubExpr_Context extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(LafiteParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(LafiteParser.MINUS, 0); }
		public AddsubExpr_Context(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).enterAddsubExpr_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).exitAddsubExpr_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LafiteParserVisitor ) return ((LafiteParserVisitor<? extends T>)visitor).visitAddsubExpr_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MuldivmodExpr_Context extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode STAR() { return getToken(LafiteParser.STAR, 0); }
		public TerminalNode DIV() { return getToken(LafiteParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(LafiteParser.MOD, 0); }
		public MuldivmodExpr_Context(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).enterMuldivmodExpr_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).exitMuldivmodExpr_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LafiteParserVisitor ) return ((LafiteParserVisitor<? extends T>)visitor).visitMuldivmodExpr_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndExpr_Context extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LOGICAL_AND() { return getToken(LafiteParser.LOGICAL_AND, 0); }
		public AndExpr_Context(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).enterAndExpr_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).exitAndExpr_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LafiteParserVisitor ) return ((LafiteParserVisitor<? extends T>)visitor).visitAndExpr_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompareExpr_Context extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQUALS() { return getToken(LafiteParser.EQUALS, 0); }
		public TerminalNode NOT_EQUALS() { return getToken(LafiteParser.NOT_EQUALS, 0); }
		public TerminalNode LESS() { return getToken(LafiteParser.LESS, 0); }
		public TerminalNode LESS_OR_EQUALS() { return getToken(LafiteParser.LESS_OR_EQUALS, 0); }
		public TerminalNode GREATER() { return getToken(LafiteParser.GREATER, 0); }
		public TerminalNode GREATER_OR_EQUALS() { return getToken(LafiteParser.GREATER_OR_EQUALS, 0); }
		public CompareExpr_Context(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).enterCompareExpr_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).exitCompareExpr_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LafiteParserVisitor ) return ((LafiteParserVisitor<? extends T>)visitor).visitCompareExpr_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 86;
		enterRecursionRule(_localctx, 86, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				_localctx = new CallParent_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(373);
				callStmt();
				}
				break;
			case 2:
				{
				_localctx = new PrimaryExpr_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(374);
				primaryExpr(0);
				}
				break;
			case 3:
				{
				_localctx = new UnaryExpr_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(375);
				unaryExpr();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(395);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(393);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new MuldivmodExpr_Context(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(378);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(379);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIV) | (1L << MOD) | (1L << STAR))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(380);
						expression(6);
						}
						break;
					case 2:
						{
						_localctx = new AddsubExpr_Context(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(381);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(382);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(383);
						expression(5);
						}
						break;
					case 3:
						{
						_localctx = new CompareExpr_Context(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(384);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(385);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUALS) | (1L << NOT_EQUALS) | (1L << LESS) | (1L << LESS_OR_EQUALS) | (1L << GREATER) | (1L << GREATER_OR_EQUALS))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(386);
						expression(4);
						}
						break;
					case 4:
						{
						_localctx = new AndExpr_Context(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(387);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(388);
						match(LOGICAL_AND);
						setState(389);
						expression(3);
						}
						break;
					case 5:
						{
						_localctx = new OrExpr_Context(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(390);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(391);
						match(LOGICAL_OR);
						setState(392);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(397);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TwoExprContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode STAR() { return getToken(LafiteParser.STAR, 0); }
		public TerminalNode DIV() { return getToken(LafiteParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(LafiteParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(LafiteParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(LafiteParser.MINUS, 0); }
		public TerminalNode EQUALS() { return getToken(LafiteParser.EQUALS, 0); }
		public TerminalNode NOT_EQUALS() { return getToken(LafiteParser.NOT_EQUALS, 0); }
		public TerminalNode LESS() { return getToken(LafiteParser.LESS, 0); }
		public TerminalNode LESS_OR_EQUALS() { return getToken(LafiteParser.LESS_OR_EQUALS, 0); }
		public TerminalNode GREATER() { return getToken(LafiteParser.GREATER, 0); }
		public TerminalNode GREATER_OR_EQUALS() { return getToken(LafiteParser.GREATER_OR_EQUALS, 0); }
		public TerminalNode LOGICAL_AND() { return getToken(LafiteParser.LOGICAL_AND, 0); }
		public TerminalNode LOGICAL_OR() { return getToken(LafiteParser.LOGICAL_OR, 0); }
		public TwoExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_twoExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).enterTwoExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).exitTwoExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LafiteParserVisitor ) return ((LafiteParserVisitor<? extends T>)visitor).visitTwoExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TwoExprContext twoExpr() throws RecognitionException {
		TwoExprContext _localctx = new TwoExprContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_twoExpr);
		int _la;
		try {
			setState(418);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(398);
				expression(0);
				setState(399);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIV) | (1L << MOD) | (1L << STAR))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(400);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(402);
				expression(0);
				setState(403);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(404);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(406);
				expression(0);
				setState(407);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUALS) | (1L << NOT_EQUALS) | (1L << LESS) | (1L << LESS_OR_EQUALS) | (1L << GREATER) | (1L << GREATER_OR_EQUALS))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(408);
				expression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(410);
				expression(0);
				setState(411);
				match(LOGICAL_AND);
				setState(412);
				expression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(414);
				expression(0);
				setState(415);
				match(LOGICAL_OR);
				setState(416);
				expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryExprContext extends ParserRuleContext {
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public InvokeParamContext invokeParam() {
			return getRuleContext(InvokeParamContext.class,0);
		}
		public PrimaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).enterPrimaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).exitPrimaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LafiteParserVisitor ) return ((LafiteParserVisitor<? extends T>)visitor).visitPrimaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExprContext primaryExpr() throws RecognitionException {
		return primaryExpr(0);
	}

	private PrimaryExprContext primaryExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrimaryExprContext _localctx = new PrimaryExprContext(_ctx, _parentState);
		PrimaryExprContext _prevctx = _localctx;
		int _startState = 90;
		enterRecursionRule(_localctx, 90, RULE_primaryExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(421);
			operand();
			}
			_ctx.stop = _input.LT(-1);
			setState(427);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PrimaryExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_primaryExpr);
					setState(423);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					{
					setState(424);
					invokeParam();
					}
					}
					} 
				}
				setState(429);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CallStmtContext extends ParserRuleContext {
		public CallStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callStmt; }
	 
		public CallStmtContext() { }
		public void copyFrom(CallStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Call_Context extends CallStmtContext {
		public MethodExprContext methodExpr() {
			return getRuleContext(MethodExprContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public Call_Context(CallStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).enterCall_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).exitCall_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LafiteParserVisitor ) return ((LafiteParserVisitor<? extends T>)visitor).visitCall_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallStmtContext callStmt() throws RecognitionException {
		CallStmtContext _localctx = new CallStmtContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_callStmt);
		try {
			_localctx = new Call_Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			methodExpr();
			setState(431);
			arguments();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InvokeParamContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(LafiteParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(LafiteParser.IDENTIFIER, 0); }
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public InvokeParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invokeParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).enterInvokeParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).exitInvokeParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LafiteParserVisitor ) return ((LafiteParserVisitor<? extends T>)visitor).visitInvokeParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InvokeParamContext invokeParam() throws RecognitionException {
		InvokeParamContext _localctx = new InvokeParamContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_invokeParam);
		try {
			setState(437);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(433);
				match(DOT);
				setState(434);
				match(IDENTIFIER);
				}
				break;
			case L_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(435);
				index();
				}
				break;
			case L_PAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(436);
				arguments();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryExprContext extends ParserRuleContext {
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(LafiteParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(LafiteParser.MINUS, 0); }
		public TerminalNode EXCLAMATION() { return getToken(LafiteParser.EXCLAMATION, 0); }
		public UnaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).enterUnaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).exitUnaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LafiteParserVisitor ) return ((LafiteParserVisitor<? extends T>)visitor).visitUnaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExprContext unaryExpr() throws RecognitionException {
		UnaryExprContext _localctx = new UnaryExprContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_unaryExpr);
		int _la;
		try {
			setState(442);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNC:
			case NIL_LIT:
			case IDENTIFIER:
			case L_PAREN:
			case L_CURLY:
			case DECIMAL_LIT:
			case FLOAT_LIT:
			case RAW_STRING_LIT:
			case INTERPRETED_STRING_LIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(439);
				primaryExpr(0);
				}
				break;
			case EXCLAMATION:
			case PLUS:
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(440);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EXCLAMATION) | (1L << PLUS) | (1L << MINUS))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(441);
				expression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperandContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public OperandNameContext operandName() {
			return getRuleContext(OperandNameContext.class,0);
		}
		public MethodExprContext methodExpr() {
			return getRuleContext(MethodExprContext.class,0);
		}
		public TerminalNode L_PAREN() { return getToken(LafiteParser.L_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(LafiteParser.R_PAREN, 0); }
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).enterOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).exitOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LafiteParserVisitor ) return ((LafiteParserVisitor<? extends T>)visitor).visitOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_operand);
		try {
			setState(451);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(444);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(445);
				operandName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(446);
				methodExpr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(447);
				match(L_PAREN);
				setState(448);
				expression(0);
				setState(449);
				match(R_PAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public BasicLitContext basicLit() {
			return getRuleContext(BasicLitContext.class,0);
		}
		public CompositeLitContext compositeLit() {
			return getRuleContext(CompositeLitContext.class,0);
		}
		public FunctionLitContext functionLit() {
			return getRuleContext(FunctionLitContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LafiteParserVisitor ) return ((LafiteParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_literal);
		try {
			setState(456);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NIL_LIT:
			case DECIMAL_LIT:
			case FLOAT_LIT:
			case RAW_STRING_LIT:
			case INTERPRETED_STRING_LIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(453);
				basicLit();
				}
				break;
			case L_CURLY:
				enterOuterAlt(_localctx, 2);
				{
				setState(454);
				compositeLit();
				}
				break;
			case FUNC:
				enterOuterAlt(_localctx, 3);
				{
				setState(455);
				functionLit();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BasicLitContext extends ParserRuleContext {
		public TerminalNode NIL_LIT() { return getToken(LafiteParser.NIL_LIT, 0); }
		public TerminalNode DECIMAL_LIT() { return getToken(LafiteParser.DECIMAL_LIT, 0); }
		public String_Context string_() {
			return getRuleContext(String_Context.class,0);
		}
		public TerminalNode FLOAT_LIT() { return getToken(LafiteParser.FLOAT_LIT, 0); }
		public BasicLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicLit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).enterBasicLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).exitBasicLit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LafiteParserVisitor ) return ((LafiteParserVisitor<? extends T>)visitor).visitBasicLit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasicLitContext basicLit() throws RecognitionException {
		BasicLitContext _localctx = new BasicLitContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_basicLit);
		try {
			setState(462);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NIL_LIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(458);
				match(NIL_LIT);
				}
				break;
			case DECIMAL_LIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(459);
				match(DECIMAL_LIT);
				}
				break;
			case RAW_STRING_LIT:
			case INTERPRETED_STRING_LIT:
				enterOuterAlt(_localctx, 3);
				{
				setState(460);
				string_();
				}
				break;
			case FLOAT_LIT:
				enterOuterAlt(_localctx, 4);
				{
				setState(461);
				match(FLOAT_LIT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperandNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(LafiteParser.IDENTIFIER, 0); }
		public QualifiedIdentContext qualifiedIdent() {
			return getRuleContext(QualifiedIdentContext.class,0);
		}
		public OperandNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operandName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).enterOperandName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).exitOperandName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LafiteParserVisitor ) return ((LafiteParserVisitor<? extends T>)visitor).visitOperandName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperandNameContext operandName() throws RecognitionException {
		OperandNameContext _localctx = new OperandNameContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_operandName);
		try {
			setState(466);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(464);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(465);
				qualifiedIdent();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedIdentContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(LafiteParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(LafiteParser.IDENTIFIER, i);
		}
		public TerminalNode DOT() { return getToken(LafiteParser.DOT, 0); }
		public QualifiedIdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedIdent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).enterQualifiedIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).exitQualifiedIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LafiteParserVisitor ) return ((LafiteParserVisitor<? extends T>)visitor).visitQualifiedIdent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedIdentContext qualifiedIdent() throws RecognitionException {
		QualifiedIdentContext _localctx = new QualifiedIdentContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_qualifiedIdent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			match(IDENTIFIER);
			setState(469);
			match(DOT);
			setState(470);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompositeLitContext extends ParserRuleContext {
		public LiteralValueContext literalValue() {
			return getRuleContext(LiteralValueContext.class,0);
		}
		public CompositeLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compositeLit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).enterCompositeLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).exitCompositeLit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LafiteParserVisitor ) return ((LafiteParserVisitor<? extends T>)visitor).visitCompositeLit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompositeLitContext compositeLit() throws RecognitionException {
		CompositeLitContext _localctx = new CompositeLitContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_compositeLit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			literalValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralValueContext extends ParserRuleContext {
		public TerminalNode L_CURLY() { return getToken(LafiteParser.L_CURLY, 0); }
		public TerminalNode R_CURLY() { return getToken(LafiteParser.R_CURLY, 0); }
		public ElementListContext elementList() {
			return getRuleContext(ElementListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(LafiteParser.COMMA, 0); }
		public LiteralValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).enterLiteralValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).exitLiteralValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LafiteParserVisitor ) return ((LafiteParserVisitor<? extends T>)visitor).visitLiteralValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralValueContext literalValue() throws RecognitionException {
		LiteralValueContext _localctx = new LiteralValueContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_literalValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			match(L_CURLY);
			setState(479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (FUNC - 3)) | (1L << (NIL_LIT - 3)) | (1L << (IDENTIFIER - 3)) | (1L << (L_PAREN - 3)) | (1L << (L_CURLY - 3)) | (1L << (EXCLAMATION - 3)) | (1L << (PLUS - 3)) | (1L << (MINUS - 3)) | (1L << (DECIMAL_LIT - 3)) | (1L << (FLOAT_LIT - 3)) | (1L << (RAW_STRING_LIT - 3)) | (1L << (INTERPRETED_STRING_LIT - 3)))) != 0)) {
				{
				setState(475);
				elementList();
				setState(477);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(476);
					match(COMMA);
					}
				}

				}
			}

			setState(481);
			match(R_CURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementListContext extends ParserRuleContext {
		public List<KeyedElementContext> keyedElement() {
			return getRuleContexts(KeyedElementContext.class);
		}
		public KeyedElementContext keyedElement(int i) {
			return getRuleContext(KeyedElementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LafiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LafiteParser.COMMA, i);
		}
		public ElementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).enterElementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).exitElementList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LafiteParserVisitor ) return ((LafiteParserVisitor<? extends T>)visitor).visitElementList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementListContext elementList() throws RecognitionException {
		ElementListContext _localctx = new ElementListContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_elementList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			keyedElement();
			setState(488);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(484);
					match(COMMA);
					setState(485);
					keyedElement();
					}
					} 
				}
				setState(490);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeyedElementContext extends ParserRuleContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public TerminalNode COLON() { return getToken(LafiteParser.COLON, 0); }
		public KeyedElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyedElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).enterKeyedElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).exitKeyedElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LafiteParserVisitor ) return ((LafiteParserVisitor<? extends T>)visitor).visitKeyedElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyedElementContext keyedElement() throws RecognitionException {
		KeyedElementContext _localctx = new KeyedElementContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_keyedElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(491);
				key();
				setState(492);
				match(COLON);
				}
				break;
			}
			setState(496);
			element();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeyContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(LafiteParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LiteralValueContext literalValue() {
			return getRuleContext(LiteralValueContext.class,0);
		}
		public KeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).enterKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).exitKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LafiteParserVisitor ) return ((LafiteParserVisitor<? extends T>)visitor).visitKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyContext key() throws RecognitionException {
		KeyContext _localctx = new KeyContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_key);
		try {
			setState(501);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(498);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(499);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(500);
				literalValue();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LiteralValueContext literalValue() {
			return getRuleContext(LiteralValueContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).exitElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LafiteParserVisitor ) return ((LafiteParserVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_element);
		try {
			setState(505);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(503);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(504);
				literalValue();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDeclContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public String_Context string_() {
			return getRuleContext(String_Context.class,0);
		}
		public FieldDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).enterFieldDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).exitFieldDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LafiteParserVisitor ) return ((LafiteParserVisitor<? extends T>)visitor).visitFieldDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclContext fieldDecl() throws RecognitionException {
		FieldDeclContext _localctx = new FieldDeclContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_fieldDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(507);
			if (!(noTerminatorBetween(2))) throw new FailedPredicateException(this, "noTerminatorBetween(2)");
			setState(508);
			identifierList();
			}
			setState(511);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RAW_STRING_LIT || _la==INTERPRETED_STRING_LIT) {
				{
				setState(510);
				string_();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class String_Context extends ParserRuleContext {
		public TerminalNode RAW_STRING_LIT() { return getToken(LafiteParser.RAW_STRING_LIT, 0); }
		public TerminalNode INTERPRETED_STRING_LIT() { return getToken(LafiteParser.INTERPRETED_STRING_LIT, 0); }
		public String_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).enterString_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).exitString_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LafiteParserVisitor ) return ((LafiteParserVisitor<? extends T>)visitor).visitString_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_Context string_() throws RecognitionException {
		String_Context _localctx = new String_Context(_ctx, getState());
		enterRule(_localctx, 122, RULE_string_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			_la = _input.LA(1);
			if ( !(_la==RAW_STRING_LIT || _la==INTERPRETED_STRING_LIT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionLitContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(LafiteParser.FUNC, 0); }
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunctionLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionLit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).enterFunctionLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).exitFunctionLit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LafiteParserVisitor ) return ((LafiteParserVisitor<? extends T>)visitor).visitFunctionLit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionLitContext functionLit() throws RecognitionException {
		FunctionLitContext _localctx = new FunctionLitContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_functionLit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			match(FUNC);
			setState(516);
			signature();
			setState(517);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexContext extends ParserRuleContext {
		public TerminalNode L_BRACKET() { return getToken(LafiteParser.L_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode R_BRACKET() { return getToken(LafiteParser.R_BRACKET, 0); }
		public IndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).enterIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).exitIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LafiteParserVisitor ) return ((LafiteParserVisitor<? extends T>)visitor).visitIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexContext index() throws RecognitionException {
		IndexContext _localctx = new IndexContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_index);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			match(L_BRACKET);
			setState(520);
			expression(0);
			setState(521);
			match(R_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public TerminalNode L_PAREN() { return getToken(LafiteParser.L_PAREN, 0); }
		public TerminalNode R_PAREN() { return getToken(LafiteParser.R_PAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode ELLIPSIS() { return getToken(LafiteParser.ELLIPSIS, 0); }
		public List<TerminalNode> COMMA() { return getTokens(LafiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LafiteParser.COMMA, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LafiteParserVisitor ) return ((LafiteParserVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			match(L_PAREN);
			setState(537);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(529);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FUNC:
				case NIL_LIT:
				case IDENTIFIER:
				case L_PAREN:
				case L_CURLY:
				case EXCLAMATION:
				case PLUS:
				case MINUS:
				case DECIMAL_LIT:
				case FLOAT_LIT:
				case RAW_STRING_LIT:
				case INTERPRETED_STRING_LIT:
					{
					setState(524);
					expressionList();
					}
					break;
				case R_PAREN:
				case COMMA:
				case ELLIPSIS:
					{
					setState(527);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
					case 1:
						{
						setState(525);
						match(COMMA);
						setState(526);
						expressionList();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(532);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELLIPSIS) {
					{
					setState(531);
					match(ELLIPSIS);
					}
				}

				setState(535);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(534);
					match(COMMA);
					}
				}

				}
				break;
			}
			setState(539);
			match(R_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodExprContext extends ParserRuleContext {
		public MethodExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodExpr; }
	 
		public MethodExprContext() { }
		public void copyFrom(MethodExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MethodExpr_Context extends MethodExprContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(LafiteParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(LafiteParser.IDENTIFIER, i);
		}
		public TerminalNode DOT() { return getToken(LafiteParser.DOT, 0); }
		public MethodExpr_Context(MethodExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).enterMethodExpr_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).exitMethodExpr_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LafiteParserVisitor ) return ((LafiteParserVisitor<? extends T>)visitor).visitMethodExpr_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodExprContext methodExpr() throws RecognitionException {
		MethodExprContext _localctx = new MethodExprContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_methodExpr);
		try {
			_localctx = new MethodExpr_Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(541);
				match(IDENTIFIER);
				setState(542);
				match(DOT);
				}
				break;
			}
			setState(545);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EosContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(LafiteParser.SEMI, 0); }
		public TerminalNode EOF() { return getToken(LafiteParser.EOF, 0); }
		public EosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).enterEos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LafiteParserListener ) ((LafiteParserListener)listener).exitEos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LafiteParserVisitor ) return ((LafiteParserVisitor<? extends T>)visitor).visitEos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EosContext eos() throws RecognitionException {
		EosContext _localctx = new EosContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_eos);
		try {
			setState(551);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(547);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(548);
				match(EOF);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(549);
				if (!(lineTerminatorAhead())) throw new FailedPredicateException(this, "lineTerminatorAhead()");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(550);
				if (!(checkPreviousTokenText("}"))) throw new FailedPredicateException(this, "checkPreviousTokenText(\"}\")");
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 38:
			return methodSpec_sempred((MethodSpecContext)_localctx, predIndex);
		case 43:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 45:
			return primaryExpr_sempred((PrimaryExprContext)_localctx, predIndex);
		case 60:
			return fieldDecl_sempred((FieldDeclContext)_localctx, predIndex);
		case 66:
			return eos_sempred((EosContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean methodSpec_sempred(MethodSpecContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return noTerminatorAfterParams(2);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean primaryExpr_sempred(PrimaryExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean fieldDecl_sempred(FieldDeclContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return noTerminatorBetween(2);
		}
		return true;
	}
	private boolean eos_sempred(EosContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return lineTerminatorAhead();
		case 9:
			return checkPreviousTokenText("}");
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3H\u022c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\3\2\3\2\3\2\3\2\3\2\7\2\u008e"+
		"\n\2\f\2\16\2\u0091\13\2\3\2\3\2\5\2\u0095\n\2\3\2\3\2\7\2\u0099\n\2\f"+
		"\2\16\2\u009c\13\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\5\5\u00a5\n\5\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\7\n\u00b5\n\n\f\n\16\n"+
		"\u00b8\13\n\3\13\3\13\3\13\7\13\u00bd\n\13\f\13\16\13\u00c0\13\13\3\f"+
		"\3\f\3\f\7\f\u00c5\n\f\f\f\16\f\u00c8\13\f\3\r\3\r\3\r\7\r\u00cd\n\r\f"+
		"\r\16\r\u00d0\13\r\3\16\3\16\3\16\3\16\5\16\u00d6\n\16\3\17\3\17\3\17"+
		"\3\20\3\20\3\21\3\21\5\21\u00df\n\21\3\21\3\21\3\22\3\22\3\22\6\22\u00e6"+
		"\n\22\r\22\16\22\u00e7\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\5\23\u00f4\n\23\3\24\3\24\3\24\3\24\3\24\5\24\u00fb\n\24\3\25\3\25"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\33\3\33\5\33\u0110\n\33\3\34\3\34\3\34\3\34\7\34\u0116\n\34\f"+
		"\34\16\34\u0119\13\34\3\35\3\35\3\35\5\35\u011e\n\35\3\36\3\36\3\37\3"+
		"\37\3 \3 \3 \3 \3 \3 \5 \u012a\n \5 \u012c\n \3!\3!\3!\3!\3\"\3\"\3\""+
		"\3\"\3\"\3\"\5\"\u0138\n\"\3\"\3\"\3#\3#\3#\3#\5#\u0140\n#\3#\3#\3$\5"+
		"$\u0145\n$\3$\3$\5$\u0149\n$\3$\3$\5$\u014d\n$\3%\3%\3%\3%\3%\3%\5%\u0155"+
		"\n%\3%\3%\3%\3&\3&\3&\3\'\3\'\3(\3(\3(\3(\3(\5(\u0164\n(\3)\3)\3)\3*\3"+
		"*\3+\3+\5+\u016d\n+\3+\3+\3,\3,\5,\u0173\n,\3,\3,\3-\3-\3-\3-\5-\u017b"+
		"\n-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\7-\u018c\n-\f-\16-\u018f"+
		"\13-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u01a5"+
		"\n.\3/\3/\3/\3/\3/\7/\u01ac\n/\f/\16/\u01af\13/\3\60\3\60\3\60\3\61\3"+
		"\61\3\61\3\61\5\61\u01b8\n\61\3\62\3\62\3\62\5\62\u01bd\n\62\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\5\63\u01c6\n\63\3\64\3\64\3\64\5\64\u01cb\n"+
		"\64\3\65\3\65\3\65\3\65\5\65\u01d1\n\65\3\66\3\66\5\66\u01d5\n\66\3\67"+
		"\3\67\3\67\3\67\38\38\39\39\39\59\u01e0\n9\59\u01e2\n9\39\39\3:\3:\3:"+
		"\7:\u01e9\n:\f:\16:\u01ec\13:\3;\3;\3;\5;\u01f1\n;\3;\3;\3<\3<\3<\5<\u01f8"+
		"\n<\3=\3=\5=\u01fc\n=\3>\3>\3>\3>\5>\u0202\n>\3?\3?\3@\3@\3@\3@\3A\3A"+
		"\3A\3A\3B\3B\3B\3B\5B\u0212\nB\5B\u0214\nB\3B\5B\u0217\nB\3B\5B\u021a"+
		"\nB\5B\u021c\nB\3B\3B\3C\3C\5C\u0222\nC\3C\3C\3D\3D\3D\3D\5D\u022a\nD"+
		"\3D\2\4X\\E\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\2\b\3\2"+
		"#$\4\2\60\6199\3\2\66\67\3\2).\3\2\65\67\3\2BC\2\u023c\2\u0088\3\2\2\2"+
		"\4\u009d\3\2\2\2\6\u00a0\3\2\2\2\b\u00a4\3\2\2\2\n\u00a8\3\2\2\2\f\u00aa"+
		"\3\2\2\2\16\u00ac\3\2\2\2\20\u00af\3\2\2\2\22\u00b1\3\2\2\2\24\u00b9\3"+
		"\2\2\2\26\u00c1\3\2\2\2\30\u00c9\3\2\2\2\32\u00d1\3\2\2\2\34\u00d7\3\2"+
		"\2\2\36\u00da\3\2\2\2 \u00dc\3\2\2\2\"\u00e5\3\2\2\2$\u00f3\3\2\2\2&\u00fa"+
		"\3\2\2\2(\u00fc\3\2\2\2*\u00fe\3\2\2\2,\u0101\3\2\2\2.\u0105\3\2\2\2\60"+
		"\u0107\3\2\2\2\62\u010b\3\2\2\2\64\u010d\3\2\2\2\66\u0111\3\2\2\28\u011d"+
		"\3\2\2\2:\u011f\3\2\2\2<\u0121\3\2\2\2>\u0123\3\2\2\2@\u012d\3\2\2\2B"+
		"\u0137\3\2\2\2D\u013b\3\2\2\2F\u0144\3\2\2\2H\u0154\3\2\2\2J\u0159\3\2"+
		"\2\2L\u015c\3\2\2\2N\u0163\3\2\2\2P\u0165\3\2\2\2R\u0168\3\2\2\2T\u016a"+
		"\3\2\2\2V\u0170\3\2\2\2X\u017a\3\2\2\2Z\u01a4\3\2\2\2\\\u01a6\3\2\2\2"+
		"^\u01b0\3\2\2\2`\u01b7\3\2\2\2b\u01bc\3\2\2\2d\u01c5\3\2\2\2f\u01ca\3"+
		"\2\2\2h\u01d0\3\2\2\2j\u01d4\3\2\2\2l\u01d6\3\2\2\2n\u01da\3\2\2\2p\u01dc"+
		"\3\2\2\2r\u01e5\3\2\2\2t\u01f0\3\2\2\2v\u01f7\3\2\2\2x\u01fb\3\2\2\2z"+
		"\u01fd\3\2\2\2|\u0203\3\2\2\2~\u0205\3\2\2\2\u0080\u0209\3\2\2\2\u0082"+
		"\u020d\3\2\2\2\u0084\u0221\3\2\2\2\u0086\u0229\3\2\2\2\u0088\u0089\5\4"+
		"\3\2\u0089\u008f\5\u0086D\2\u008a\u008b\5\6\4\2\u008b\u008c\5\u0086D\2"+
		"\u008c\u008e\3\2\2\2\u008d\u008a\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d"+
		"\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u009a\3\2\2\2\u0091\u008f\3\2\2\2\u0092"+
		"\u0095\5\32\16\2\u0093\u0095\5\60\31\2\u0094\u0092\3\2\2\2\u0094\u0093"+
		"\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\5\u0086D\2\u0097\u0099\3\2\2"+
		"\2\u0098\u0094\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b"+
		"\3\2\2\2\u009b\3\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u009e\7\b\2\2\u009e"+
		"\u009f\7\27\2\2\u009f\5\3\2\2\2\u00a0\u00a1\7\22\2\2\u00a1\u00a2\5\b\5"+
		"\2\u00a2\7\3\2\2\2\u00a3\u00a5\7H\2\2\u00a4\u00a3\3\2\2\2\u00a4\u00a5"+
		"\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\5\n\6\2\u00a7\t\3\2\2\2\u00a8"+
		"\u00a9\5|?\2\u00a9\13\3\2\2\2\u00aa\u00ab\5\34\17\2\u00ab\r\3\2\2\2\u00ac"+
		"\u00ad\7\n\2\2\u00ad\u00ae\5\20\t\2\u00ae\17\3\2\2\2\u00af\u00b0\5\22"+
		"\n\2\u00b0\21\3\2\2\2\u00b1\u00b6\7\27\2\2\u00b2\u00b3\7\37\2\2\u00b3"+
		"\u00b5\7\27\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3"+
		"\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\23\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9"+
		"\u00be\7\27\2\2\u00ba\u00bb\7\37\2\2\u00bb\u00bd\7\27\2\2\u00bc\u00ba"+
		"\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf"+
		"\25\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c6\7\27\2\2\u00c2\u00c3\7\37"+
		"\2\2\u00c3\u00c5\7\27\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6"+
		"\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\27\3\2\2\2\u00c8\u00c6\3\2\2"+
		"\2\u00c9\u00ce\5X-\2\u00ca\u00cb\7\37\2\2\u00cb\u00cd\5X-\2\u00cc\u00ca"+
		"\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf"+
		"\31\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d2\7\5\2\2\u00d2\u00d3\7\27\2"+
		"\2\u00d3\u00d5\5R*\2\u00d4\u00d6\5 \21\2\u00d5\u00d4\3\2\2\2\u00d5\u00d6"+
		"\3\2\2\2\u00d6\33\3\2\2\2\u00d7\u00d8\7\25\2\2\u00d8\u00d9\5\36\20\2\u00d9"+
		"\35\3\2\2\2\u00da\u00db\5\22\n\2\u00db\37\3\2\2\2\u00dc\u00de\7\32\2\2"+
		"\u00dd\u00df\5\"\22\2\u00de\u00dd\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0"+
		"\3\2\2\2\u00e0\u00e1\7\33\2\2\u00e1!\3\2\2\2\u00e2\u00e3\5$\23\2\u00e3"+
		"\u00e4\5\u0086D\2\u00e4\u00e6\3\2\2\2\u00e5\u00e2\3\2\2\2\u00e6\u00e7"+
		"\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8#\3\2\2\2\u00e9"+
		"\u00f4\5\60\31\2\u00ea\u00f4\5&\24\2\u00eb\u00f4\5J&\2\u00ec\u00f4\5\64"+
		"\33\2\u00ed\u00f4\5:\36\2\u00ee\u00f4\5<\37\2\u00ef\u00f4\5 \21\2\u00f0"+
		"\u00f4\5> \2\u00f1\u00f4\5@!\2\u00f2\u00f4\5\66\34\2\u00f3\u00e9\3\2\2"+
		"\2\u00f3\u00ea\3\2\2\2\u00f3\u00eb\3\2\2\2\u00f3\u00ec\3\2\2\2\u00f3\u00ed"+
		"\3\2\2\2\u00f3\u00ee\3\2\2\2\u00f3\u00ef\3\2\2\2\u00f3\u00f0\3\2\2\2\u00f3"+
		"\u00f1\3\2\2\2\u00f3\u00f2\3\2\2\2\u00f4%\3\2\2\2\u00f5\u00fb\5(\25\2"+
		"\u00f6\u00fb\5*\26\2\u00f7\u00fb\5,\27\2\u00f8\u00fb\5\60\31\2\u00f9\u00fb"+
		"\5\62\32\2\u00fa\u00f5\3\2\2\2\u00fa\u00f6\3\2\2\2\u00fa\u00f7\3\2\2\2"+
		"\u00fa\u00f8\3\2\2\2\u00fa\u00f9\3\2\2\2\u00fb\'\3\2\2\2\u00fc\u00fd\5"+
		"X-\2\u00fd)\3\2\2\2\u00fe\u00ff\5X-\2\u00ff\u0100\t\2\2\2\u0100+\3\2\2"+
		"\2\u0101\u0102\5\22\n\2\u0102\u0103\5.\30\2\u0103\u0104\5\30\r\2\u0104"+
		"-\3\2\2\2\u0105\u0106\7\36\2\2\u0106/\3\2\2\2\u0107\u0108\5\22\n\2\u0108"+
		"\u0109\7%\2\2\u0109\u010a\5\30\r\2\u010a\61\3\2\2\2\u010b\u010c\7 \2\2"+
		"\u010c\63\3\2\2\2\u010d\u010f\7\23\2\2\u010e\u0110\5\30\r\2\u010f\u010e"+
		"\3\2\2\2\u010f\u0110\3\2\2\2\u0110\65\3\2\2\2\u0111\u0112\7\24\2\2\u0112"+
		"\u0117\58\35\2\u0113\u0114\7\37\2\2\u0114\u0116\58\35\2\u0115\u0113\3"+
		"\2\2\2\u0116\u0119\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118"+
		"\67\3\2\2\2\u0119\u0117\3\2\2\2\u011a\u011e\5h\65\2\u011b\u011e\5X-\2"+
		"\u011c\u011e\7\27\2\2\u011d\u011a\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011c"+
		"\3\2\2\2\u011e9\3\2\2\2\u011f\u0120\7\3\2\2\u0120;\3\2\2\2\u0121\u0122"+
		"\7\20\2\2\u0122=\3\2\2\2\u0123\u0124\7\f\2\2\u0124\u0125\5X-\2\u0125\u012b"+
		"\5 \21\2\u0126\u0129\7\7\2\2\u0127\u012a\5> \2\u0128\u012a\5 \21\2\u0129"+
		"\u0127\3\2\2\2\u0129\u0128\3\2\2\2\u012a\u012c\3\2\2\2\u012b\u0126\3\2"+
		"\2\2\u012b\u012c\3\2\2\2\u012c?\3\2\2\2\u012d\u012e\7\r\2\2\u012e\u012f"+
		"\5X-\2\u012f\u0130\5 \21\2\u0130A\3\2\2\2\u0131\u0132\5\30\r\2\u0132\u0133"+
		"\7\36\2\2\u0133\u0138\3\2\2\2\u0134\u0135\5\22\n\2\u0135\u0136\7%\2\2"+
		"\u0136\u0138\3\2\2\2\u0137\u0131\3\2\2\2\u0137\u0134\3\2\2\2\u0137\u0138"+
		"\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013a\5X-\2\u013aC\3\2\2\2\u013b\u013f"+
		"\7\21\2\2\u013c\u0140\5X-\2\u013d\u0140\5F$\2\u013e\u0140\5H%\2\u013f"+
		"\u013c\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u013e\3\2\2\2\u013f\u0140\3\2"+
		"\2\2\u0140\u0141\3\2\2\2\u0141\u0142\5 \21\2\u0142E\3\2\2\2\u0143\u0145"+
		"\5&\24\2\u0144\u0143\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0146\3\2\2\2\u0146"+
		"\u0148\7 \2\2\u0147\u0149\5X-\2\u0148\u0147\3\2\2\2\u0148\u0149\3\2\2"+
		"\2\u0149\u014a\3\2\2\2\u014a\u014c\7 \2\2\u014b\u014d\5&\24\2\u014c\u014b"+
		"\3\2\2\2\u014c\u014d\3\2\2\2\u014dG\3\2\2\2\u014e\u014f\5\30\r\2\u014f"+
		"\u0150\7\36\2\2\u0150\u0155\3\2\2\2\u0151\u0152\5\22\n\2\u0152\u0153\7"+
		"%\2\2\u0153\u0155\3\2\2\2\u0154\u014e\3\2\2\2\u0154\u0151\3\2\2\2\u0154"+
		"\u0155\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0157\7\16\2\2\u0157\u0158\5"+
		"X-\2\u0158I\3\2\2\2\u0159\u015a\7\6\2\2\u015a\u015b\5X-\2\u015bK\3\2\2"+
		"\2\u015c\u015d\5X-\2\u015dM\3\2\2\2\u015e\u015f\6(\2\2\u015f\u0160\7\27"+
		"\2\2\u0160\u0164\5T+\2\u0161\u0162\7\27\2\2\u0162\u0164\5T+\2\u0163\u015e"+
		"\3\2\2\2\u0163\u0161\3\2\2\2\u0164O\3\2\2\2\u0165\u0166\7\5\2\2\u0166"+
		"\u0167\5R*\2\u0167Q\3\2\2\2\u0168\u0169\5T+\2\u0169S\3\2\2\2\u016a\u016c"+
		"\7\30\2\2\u016b\u016d\5\24\13\2\u016c\u016b\3\2\2\2\u016c\u016d\3\2\2"+
		"\2\u016d\u016e\3\2\2\2\u016e\u016f\7\31\2\2\u016fU\3\2\2\2\u0170\u0172"+
		"\7\30\2\2\u0171\u0173\5\26\f\2\u0172\u0171\3\2\2\2\u0172\u0173\3\2\2\2"+
		"\u0173\u0174\3\2\2\2\u0174\u0175\7\31\2\2\u0175W\3\2\2\2\u0176\u0177\b"+
		"-\1\2\u0177\u017b\5^\60\2\u0178\u017b\5\\/\2\u0179\u017b\5b\62\2\u017a"+
		"\u0176\3\2\2\2\u017a\u0178\3\2\2\2\u017a\u0179\3\2\2\2\u017b\u018d\3\2"+
		"\2\2\u017c\u017d\f\7\2\2\u017d\u017e\t\3\2\2\u017e\u018c\5X-\b\u017f\u0180"+
		"\f\6\2\2\u0180\u0181\t\4\2\2\u0181\u018c\5X-\7\u0182\u0183\f\5\2\2\u0183"+
		"\u0184\t\5\2\2\u0184\u018c\5X-\6\u0185\u0186\f\4\2\2\u0186\u0187\7(\2"+
		"\2\u0187\u018c\5X-\5\u0188\u0189\f\3\2\2\u0189\u018a\7\'\2\2\u018a\u018c"+
		"\5X-\4\u018b\u017c\3\2\2\2\u018b\u017f\3\2\2\2\u018b\u0182\3\2\2\2\u018b"+
		"\u0185\3\2\2\2\u018b\u0188\3\2\2\2\u018c\u018f\3\2\2\2\u018d\u018b\3\2"+
		"\2\2\u018d\u018e\3\2\2\2\u018eY\3\2\2\2\u018f\u018d\3\2\2\2\u0190\u0191"+
		"\5X-\2\u0191\u0192\t\3\2\2\u0192\u0193\5X-\2\u0193\u01a5\3\2\2\2\u0194"+
		"\u0195\5X-\2\u0195\u0196\t\4\2\2\u0196\u0197\5X-\2\u0197\u01a5\3\2\2\2"+
		"\u0198\u0199\5X-\2\u0199\u019a\t\5\2\2\u019a\u019b\5X-\2\u019b\u01a5\3"+
		"\2\2\2\u019c\u019d\5X-\2\u019d\u019e\7(\2\2\u019e\u019f\5X-\2\u019f\u01a5"+
		"\3\2\2\2\u01a0\u01a1\5X-\2\u01a1\u01a2\7\'\2\2\u01a2\u01a3\5X-\2\u01a3"+
		"\u01a5\3\2\2\2\u01a4\u0190\3\2\2\2\u01a4\u0194\3\2\2\2\u01a4\u0198\3\2"+
		"\2\2\u01a4\u019c\3\2\2\2\u01a4\u01a0\3\2\2\2\u01a5[\3\2\2\2\u01a6\u01a7"+
		"\b/\1\2\u01a7\u01a8\5d\63\2\u01a8\u01ad\3\2\2\2\u01a9\u01aa\f\3\2\2\u01aa"+
		"\u01ac\5`\61\2\u01ab\u01a9\3\2\2\2\u01ac\u01af\3\2\2\2\u01ad\u01ab\3\2"+
		"\2\2\u01ad\u01ae\3\2\2\2\u01ae]\3\2\2\2\u01af\u01ad\3\2\2\2\u01b0\u01b1"+
		"\5\u0084C\2\u01b1\u01b2\5\u0082B\2\u01b2_\3\2\2\2\u01b3\u01b4\7\"\2\2"+
		"\u01b4\u01b8\7\27\2\2\u01b5\u01b8\5\u0080A\2\u01b6\u01b8\5\u0082B\2\u01b7"+
		"\u01b3\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b7\u01b6\3\2\2\2\u01b8a\3\2\2\2"+
		"\u01b9\u01bd\5\\/\2\u01ba\u01bb\t\6\2\2\u01bb\u01bd\5X-\2\u01bc\u01b9"+
		"\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bdc\3\2\2\2\u01be\u01c6\5f\64\2\u01bf"+
		"\u01c6\5j\66\2\u01c0\u01c6\5\u0084C\2\u01c1\u01c2\7\30\2\2\u01c2\u01c3"+
		"\5X-\2\u01c3\u01c4\7\31\2\2\u01c4\u01c6\3\2\2\2\u01c5\u01be\3\2\2\2\u01c5"+
		"\u01bf\3\2\2\2\u01c5\u01c0\3\2\2\2\u01c5\u01c1\3\2\2\2\u01c6e\3\2\2\2"+
		"\u01c7\u01cb\5h\65\2\u01c8\u01cb\5n8\2\u01c9\u01cb\5~@\2\u01ca\u01c7\3"+
		"\2\2\2\u01ca\u01c8\3\2\2\2\u01ca\u01c9\3\2\2\2\u01cbg\3\2\2\2\u01cc\u01d1"+
		"\7\26\2\2\u01cd\u01d1\7<\2\2\u01ce\u01d1\5|?\2\u01cf\u01d1\7?\2\2\u01d0"+
		"\u01cc\3\2\2\2\u01d0\u01cd\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d0\u01cf\3\2"+
		"\2\2\u01d1i\3\2\2\2\u01d2\u01d5\7\27\2\2\u01d3\u01d5\5l\67\2\u01d4\u01d2"+
		"\3\2\2\2\u01d4\u01d3\3\2\2\2\u01d5k\3\2\2\2\u01d6\u01d7\7\27\2\2\u01d7"+
		"\u01d8\7\"\2\2\u01d8\u01d9\7\27\2\2\u01d9m\3\2\2\2\u01da\u01db\5p9\2\u01db"+
		"o\3\2\2\2\u01dc\u01e1\7\32\2\2\u01dd\u01df\5r:\2\u01de\u01e0\7\37\2\2"+
		"\u01df\u01de\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e2\3\2\2\2\u01e1\u01dd"+
		"\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e4\7\33\2\2"+
		"\u01e4q\3\2\2\2\u01e5\u01ea\5t;\2\u01e6\u01e7\7\37\2\2\u01e7\u01e9\5t"+
		";\2\u01e8\u01e6\3\2\2\2\u01e9\u01ec\3\2\2\2\u01ea\u01e8\3\2\2\2\u01ea"+
		"\u01eb\3\2\2\2\u01ebs\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ed\u01ee\5v<\2\u01ee"+
		"\u01ef\7!\2\2\u01ef\u01f1\3\2\2\2\u01f0\u01ed\3\2\2\2\u01f0\u01f1\3\2"+
		"\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f3\5x=\2\u01f3u\3\2\2\2\u01f4\u01f8"+
		"\7\27\2\2\u01f5\u01f8\5X-\2\u01f6\u01f8\5p9\2\u01f7\u01f4\3\2\2\2\u01f7"+
		"\u01f5\3\2\2\2\u01f7\u01f6\3\2\2\2\u01f8w\3\2\2\2\u01f9\u01fc\5X-\2\u01fa"+
		"\u01fc\5p9\2\u01fb\u01f9\3\2\2\2\u01fb\u01fa\3\2\2\2\u01fcy\3\2\2\2\u01fd"+
		"\u01fe\6>\t\2\u01fe\u01ff\5\22\n\2\u01ff\u0201\3\2\2\2\u0200\u0202\5|"+
		"?\2\u0201\u0200\3\2\2\2\u0201\u0202\3\2\2\2\u0202{\3\2\2\2\u0203\u0204"+
		"\t\7\2\2\u0204}\3\2\2\2\u0205\u0206\7\5\2\2\u0206\u0207\5R*\2\u0207\u0208"+
		"\5 \21\2\u0208\177\3\2\2\2\u0209\u020a\7\34\2\2\u020a\u020b\5X-\2\u020b"+
		"\u020c\7\35\2\2\u020c\u0081\3\2\2\2\u020d\u021b\7\30\2\2\u020e\u0214\5"+
		"\30\r\2\u020f\u0210\7\37\2\2\u0210\u0212\5\30\r\2\u0211\u020f\3\2\2\2"+
		"\u0211\u0212\3\2\2\2\u0212\u0214\3\2\2\2\u0213\u020e\3\2\2\2\u0213\u0211"+
		"\3\2\2\2\u0214\u0216\3\2\2\2\u0215\u0217\7&\2\2\u0216\u0215\3\2\2\2\u0216"+
		"\u0217\3\2\2\2\u0217\u0219\3\2\2\2\u0218\u021a\7\37\2\2\u0219\u0218\3"+
		"\2\2\2\u0219\u021a\3\2\2\2\u021a\u021c\3\2\2\2\u021b\u0213\3\2\2\2\u021b"+
		"\u021c\3\2\2\2\u021c\u021d\3\2\2\2\u021d\u021e\7\31\2\2\u021e\u0083\3"+
		"\2\2\2\u021f\u0220\7\27\2\2\u0220\u0222\7\"\2\2\u0221\u021f\3\2\2\2\u0221"+
		"\u0222\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0224\7\27\2\2\u0224\u0085\3"+
		"\2\2\2\u0225\u022a\7 \2\2\u0226\u022a\7\2\2\3\u0227\u022a\6D\n\2\u0228"+
		"\u022a\6D\13\2\u0229\u0225\3\2\2\2\u0229\u0226\3\2\2\2\u0229\u0227\3\2"+
		"\2\2\u0229\u0228\3\2\2\2\u022a\u0087\3\2\2\2\66\u008f\u0094\u009a\u00a4"+
		"\u00b6\u00be\u00c6\u00ce\u00d5\u00de\u00e7\u00f3\u00fa\u010f\u0117\u011d"+
		"\u0129\u012b\u0137\u013f\u0144\u0148\u014c\u0154\u0163\u016c\u0172\u017a"+
		"\u018b\u018d\u01a4\u01ad\u01b7\u01bc\u01c5\u01ca\u01d0\u01d4\u01df\u01e1"+
		"\u01ea\u01f0\u01f7\u01fb\u0201\u0211\u0213\u0216\u0219\u021b\u0221\u0229";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}