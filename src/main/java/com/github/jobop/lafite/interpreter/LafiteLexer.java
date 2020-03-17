// Generated from LafiteLexer.g4 by ANTLR 4.8

package com.github.jobop.lafite.interpreter;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LafiteLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BREAK=1, DEFAULT=2, FUNC=3, LA=4, ELSE=5, NAMESPACE=6, SWITCH=7, CONST=8, 
		FALLTHROUGH=9, IF=10, RANGE=11, TYPE=12, CONTINUE=13, FOR=14, IMPORT=15, 
		RETURN=16, VAR=17, NIL_LIT=18, IDENTIFIER=19, L_PAREN=20, R_PAREN=21, 
		L_CURLY=22, R_CURLY=23, L_BRACKET=24, R_BRACKET=25, ASSIGN=26, COMMA=27, 
		SEMI=28, COLON=29, DOT=30, PLUS_PLUS=31, MINUS_MINUS=32, DECLARE_ASSIGN=33, 
		ELLIPSIS=34, LOGICAL_OR=35, LOGICAL_AND=36, EQUALS=37, NOT_EQUALS=38, 
		LESS=39, LESS_OR_EQUALS=40, GREATER=41, GREATER_OR_EQUALS=42, OR=43, DIV=44, 
		MOD=45, LSHIFT=46, RSHIFT=47, BIT_CLEAR=48, EXCLAMATION=49, PLUS=50, MINUS=51, 
		CARET=52, STAR=53, AMPERSAND=54, RECEIVE=55, DECIMAL_LIT=56, OCTAL_LIT=57, 
		HEX_LIT=58, FLOAT_LIT=59, IMAGINARY_LIT=60, RUNE_LIT=61, RAW_STRING_LIT=62, 
		INTERPRETED_STRING_LIT=63, WS=64, COMMENT=65, TERMINATOR=66, LINE_COMMENT=67;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"BREAK", "DEFAULT", "FUNC", "LA", "ELSE", "NAMESPACE", "SWITCH", "CONST", 
			"FALLTHROUGH", "IF", "RANGE", "TYPE", "CONTINUE", "FOR", "IMPORT", "RETURN", 
			"VAR", "NIL_LIT", "IDENTIFIER", "L_PAREN", "R_PAREN", "L_CURLY", "R_CURLY", 
			"L_BRACKET", "R_BRACKET", "ASSIGN", "COMMA", "SEMI", "COLON", "DOT", 
			"PLUS_PLUS", "MINUS_MINUS", "DECLARE_ASSIGN", "ELLIPSIS", "LOGICAL_OR", 
			"LOGICAL_AND", "EQUALS", "NOT_EQUALS", "LESS", "LESS_OR_EQUALS", "GREATER", 
			"GREATER_OR_EQUALS", "OR", "DIV", "MOD", "LSHIFT", "RSHIFT", "BIT_CLEAR", 
			"EXCLAMATION", "PLUS", "MINUS", "CARET", "STAR", "AMPERSAND", "RECEIVE", 
			"DECIMAL_LIT", "OCTAL_LIT", "HEX_LIT", "FLOAT_LIT", "IMAGINARY_LIT", 
			"RUNE_LIT", "RAW_STRING_LIT", "INTERPRETED_STRING_LIT", "WS", "COMMENT", 
			"TERMINATOR", "LINE_COMMENT", "ESCAPED_VALUE", "DECIMALS", "OCTAL_DIGIT", 
			"HEX_DIGIT", "EXPONENT", "LETTER", "UNICODE_DIGIT", "UNICODE_LETTER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'break'", "'default'", "'func'", "'la'", "'else'", "'namespace'", 
			"'switch'", "'const'", "'fallthrough'", "'if'", "'range'", "'type'", 
			"'continue'", "'for'", "'import'", "'return'", "'var'", "'nil'", null, 
			"'('", "')'", "'{'", "'}'", "'['", "']'", "'='", "','", "';'", "':'", 
			"'.'", "'++'", "'--'", "':='", "'...'", "'||'", "'&&'", "'=='", "'!='", 
			"'<'", "'<='", "'>'", "'>='", "'|'", "'/'", "'%'", "'<<'", "'>>'", "'&^'", 
			"'!'", "'+'", "'-'", "'^'", "'*'", "'&'", "'<-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BREAK", "DEFAULT", "FUNC", "LA", "ELSE", "NAMESPACE", "SWITCH", 
			"CONST", "FALLTHROUGH", "IF", "RANGE", "TYPE", "CONTINUE", "FOR", "IMPORT", 
			"RETURN", "VAR", "NIL_LIT", "IDENTIFIER", "L_PAREN", "R_PAREN", "L_CURLY", 
			"R_CURLY", "L_BRACKET", "R_BRACKET", "ASSIGN", "COMMA", "SEMI", "COLON", 
			"DOT", "PLUS_PLUS", "MINUS_MINUS", "DECLARE_ASSIGN", "ELLIPSIS", "LOGICAL_OR", 
			"LOGICAL_AND", "EQUALS", "NOT_EQUALS", "LESS", "LESS_OR_EQUALS", "GREATER", 
			"GREATER_OR_EQUALS", "OR", "DIV", "MOD", "LSHIFT", "RSHIFT", "BIT_CLEAR", 
			"EXCLAMATION", "PLUS", "MINUS", "CARET", "STAR", "AMPERSAND", "RECEIVE", 
			"DECIMAL_LIT", "OCTAL_LIT", "HEX_LIT", "FLOAT_LIT", "IMAGINARY_LIT", 
			"RUNE_LIT", "RAW_STRING_LIT", "INTERPRETED_STRING_LIT", "WS", "COMMENT", 
			"TERMINATOR", "LINE_COMMENT"
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


	public LafiteLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LafiteLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2E\u020a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\7\24\u010c\n\24\f\24\16\24\u010f\13\24"+
		"\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\""+
		"\3#\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3)\3)\3)\3*"+
		"\3*\3+\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61"+
		"\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\38"+
		"\39\39\79\u016a\n9\f9\169\u016d\139\3:\3:\7:\u0171\n:\f:\16:\u0174\13"+
		":\3;\3;\3;\6;\u0179\n;\r;\16;\u017a\3<\3<\3<\5<\u0180\n<\3<\5<\u0183\n"+
		"<\3<\5<\u0186\n<\3<\3<\3<\5<\u018b\n<\5<\u018d\n<\3=\3=\5=\u0191\n=\3"+
		"=\3=\3>\3>\3>\5>\u0198\n>\3>\3>\3?\3?\7?\u019e\n?\f?\16?\u01a1\13?\3?"+
		"\3?\3@\3@\3@\7@\u01a8\n@\f@\16@\u01ab\13@\3@\3@\3A\6A\u01b0\nA\rA\16A"+
		"\u01b1\3A\3A\3B\3B\3B\3B\7B\u01ba\nB\fB\16B\u01bd\13B\3B\3B\3B\3B\3B\3"+
		"C\6C\u01c5\nC\rC\16C\u01c6\3C\3C\3D\3D\3D\3D\7D\u01cf\nD\fD\16D\u01d2"+
		"\13D\3D\3D\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3"+
		"E\3E\3E\3E\3E\3E\3E\5E\u01f0\nE\3F\6F\u01f3\nF\rF\16F\u01f4\3G\3G\3H\3"+
		"H\3I\3I\5I\u01fd\nI\3I\3I\3J\3J\5J\u0203\nJ\3K\5K\u0206\nK\3L\5L\u0209"+
		"\nL\3\u01bb\2M\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34"+
		"\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g"+
		"\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089\2"+
		"\u008b\2\u008d\2\u008f\2\u0091\2\u0093\2\u0095\2\u0097\2\3\2\21\3\2\63"+
		";\3\2\62;\4\2ZZzz\4\2\f\f^^\3\2bb\4\2$$^^\4\2\13\13\"\"\4\2\f\f\17\17"+
		"\13\2$$))^^cdhhppttvvxx\3\2\629\5\2\62;CHch\4\2GGgg\4\2--//\26\2\62;\u0662"+
		"\u066b\u06f2\u06fb\u0968\u0971\u09e8\u09f1\u0a68\u0a71\u0ae8\u0af1\u0b68"+
		"\u0b71\u0be9\u0bf1\u0c68\u0c71\u0ce8\u0cf1\u0d68\u0d71\u0e52\u0e5b\u0ed2"+
		"\u0edb\u0f22\u0f2b\u1042\u104b\u136b\u1373\u17e2\u17eb\u1812\u181b\uff12"+
		"\uff1b\u0104\2C\\c|\u00ac\u00ac\u00b7\u00b7\u00bc\u00bc\u00c2\u00d8\u00da"+
		"\u00f8\u00fa\u0221\u0224\u0235\u0252\u02af\u02b2\u02ba\u02bd\u02c3\u02d2"+
		"\u02d3\u02e2\u02e6\u02f0\u02f0\u037c\u037c\u0388\u0388\u038a\u038c\u038e"+
		"\u038e\u0390\u03a3\u03a5\u03d0\u03d2\u03d9\u03dc\u03f5\u0402\u0483\u048e"+
		"\u04c6\u04c9\u04ca\u04cd\u04ce\u04d2\u04f7\u04fa\u04fb\u0533\u0558\u055b"+
		"\u055b\u0563\u0589\u05d2\u05ec\u05f2\u05f4\u0623\u063c\u0642\u064c\u0673"+
		"\u06d5\u06d7\u06d7\u06e7\u06e8\u06fc\u06fe\u0712\u0712\u0714\u072e\u0782"+
		"\u07a7\u0907\u093b\u093f\u093f\u0952\u0952\u095a\u0963\u0987\u098e\u0991"+
		"\u0992\u0995\u09aa\u09ac\u09b2\u09b4\u09b4\u09b8\u09bb\u09de\u09df\u09e1"+
		"\u09e3\u09f2\u09f3\u0a07\u0a0c\u0a11\u0a12\u0a15\u0a2a\u0a2c\u0a32\u0a34"+
		"\u0a35\u0a37\u0a38\u0a3a\u0a3b\u0a5b\u0a5e\u0a60\u0a60\u0a74\u0a76\u0a87"+
		"\u0a8d\u0a8f\u0a8f\u0a91\u0a93\u0a95\u0aaa\u0aac\u0ab2\u0ab4\u0ab5\u0ab7"+
		"\u0abb\u0abf\u0abf\u0ad2\u0ad2\u0ae2\u0ae2\u0b07\u0b0e\u0b11\u0b12\u0b15"+
		"\u0b2a\u0b2c\u0b32\u0b34\u0b35\u0b38\u0b3b\u0b3f\u0b3f\u0b5e\u0b5f\u0b61"+
		"\u0b63\u0b87\u0b8c\u0b90\u0b92\u0b94\u0b97\u0b9b\u0b9c\u0b9e\u0b9e\u0ba0"+
		"\u0ba1\u0ba5\u0ba6\u0baa\u0bac\u0bb0\u0bb7\u0bb9\u0bbb\u0c07\u0c0e\u0c10"+
		"\u0c12\u0c14\u0c2a\u0c2c\u0c35\u0c37\u0c3b\u0c62\u0c63\u0c87\u0c8e\u0c90"+
		"\u0c92\u0c94\u0caa\u0cac\u0cb5\u0cb7\u0cbb\u0ce0\u0ce0\u0ce2\u0ce3\u0d07"+
		"\u0d0e\u0d10\u0d12\u0d14\u0d2a\u0d2c\u0d3b\u0d62\u0d63\u0d87\u0d98\u0d9c"+
		"\u0db3\u0db5\u0dbd\u0dbf\u0dbf\u0dc2\u0dc8\u0e03\u0e32\u0e34\u0e35\u0e42"+
		"\u0e48\u0e83\u0e84\u0e86\u0e86\u0e89\u0e8a\u0e8c\u0e8c\u0e8f\u0e8f\u0e96"+
		"\u0e99\u0e9b\u0ea1\u0ea3\u0ea5\u0ea7\u0ea7\u0ea9\u0ea9\u0eac\u0ead\u0eaf"+
		"\u0eb2\u0eb4\u0eb5\u0ebf\u0ec6\u0ec8\u0ec8\u0ede\u0edf\u0f02\u0f02\u0f42"+
		"\u0f6c\u0f8a\u0f8d\u1002\u1023\u1025\u1029\u102b\u102c\u1052\u1057\u10a2"+
		"\u10c7\u10d2\u10f8\u1102\u115b\u1161\u11a4\u11aa\u11fb\u1202\u1208\u120a"+
		"\u1248\u124a\u124a\u124c\u124f\u1252\u1258\u125a\u125a\u125c\u125f\u1262"+
		"\u1288\u128a\u128a\u128c\u128f\u1292\u12b0\u12b2\u12b2\u12b4\u12b7\u12ba"+
		"\u12c0\u12c2\u12c2\u12c4\u12c7\u12ca\u12d0\u12d2\u12d8\u12da\u12f0\u12f2"+
		"\u1310\u1312\u1312\u1314\u1317\u131a\u1320\u1322\u1348\u134a\u135c\u13a2"+
		"\u13f6\u1403\u1678\u1683\u169c\u16a2\u16ec\u1782\u17b5\u1822\u1879\u1882"+
		"\u18aa\u1e02\u1e9d\u1ea2\u1efb\u1f02\u1f17\u1f1a\u1f1f\u1f22\u1f47\u1f4a"+
		"\u1f4f\u1f52\u1f59\u1f5b\u1f5b\u1f5d\u1f5d\u1f5f\u1f5f\u1f61\u1f7f\u1f82"+
		"\u1fb6\u1fb8\u1fbe\u1fc0\u1fc0\u1fc4\u1fc6\u1fc8\u1fce\u1fd2\u1fd5\u1fd8"+
		"\u1fdd\u1fe2\u1fee\u1ff4\u1ff6\u1ff8\u1ffe\u2081\u2081\u2104\u2104\u2109"+
		"\u2109\u210c\u2115\u2117\u2117\u211b\u211f\u2126\u2126\u2128\u2128\u212a"+
		"\u212a\u212c\u212f\u2131\u2133\u2135\u213b\u2162\u2185\u3007\u3009\u3023"+
		"\u302b\u3033\u3037\u303a\u303c\u3043\u3096\u309f\u30a0\u30a3\u30fc\u30fe"+
		"\u3100\u3107\u312e\u3133\u3190\u31a2\u31b9\u3402\u3402\u4db7\u4db7\u4e02"+
		"\u4e02\u9fa7\u9fa7\ua002\ua48e\uac02\uac02\ud7a5\ud7a5\uf902\ufa2f\ufb02"+
		"\ufb08\ufb15\ufb19\ufb1f\ufb1f\ufb21\ufb2a\ufb2c\ufb38\ufb3a\ufb3e\ufb40"+
		"\ufb40\ufb42\ufb43\ufb45\ufb46\ufb48\ufbb3\ufbd5\ufd3f\ufd52\ufd91\ufd94"+
		"\ufdc9\ufdf2\ufdfd\ufe72\ufe74\ufe76\ufe76\ufe78\ufefe\uff23\uff3c\uff43"+
		"\uff5c\uff68\uffc0\uffc4\uffc9\uffcc\uffd1\uffd4\uffd9\uffdc\uffde\2\u021b"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2"+
		"\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2"+
		"{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085"+
		"\3\2\2\2\2\u0087\3\2\2\2\3\u0099\3\2\2\2\5\u009f\3\2\2\2\7\u00a7\3\2\2"+
		"\2\t\u00ac\3\2\2\2\13\u00af\3\2\2\2\r\u00b4\3\2\2\2\17\u00be\3\2\2\2\21"+
		"\u00c5\3\2\2\2\23\u00cb\3\2\2\2\25\u00d7\3\2\2\2\27\u00da\3\2\2\2\31\u00e0"+
		"\3\2\2\2\33\u00e5\3\2\2\2\35\u00ee\3\2\2\2\37\u00f2\3\2\2\2!\u00f9\3\2"+
		"\2\2#\u0100\3\2\2\2%\u0104\3\2\2\2\'\u0108\3\2\2\2)\u0110\3\2\2\2+\u0112"+
		"\3\2\2\2-\u0114\3\2\2\2/\u0116\3\2\2\2\61\u0118\3\2\2\2\63\u011a\3\2\2"+
		"\2\65\u011c\3\2\2\2\67\u011e\3\2\2\29\u0120\3\2\2\2;\u0122\3\2\2\2=\u0124"+
		"\3\2\2\2?\u0126\3\2\2\2A\u0129\3\2\2\2C\u012c\3\2\2\2E\u012f\3\2\2\2G"+
		"\u0133\3\2\2\2I\u0136\3\2\2\2K\u0139\3\2\2\2M\u013c\3\2\2\2O\u013f\3\2"+
		"\2\2Q\u0141\3\2\2\2S\u0144\3\2\2\2U\u0146\3\2\2\2W\u0149\3\2\2\2Y\u014b"+
		"\3\2\2\2[\u014d\3\2\2\2]\u014f\3\2\2\2_\u0152\3\2\2\2a\u0155\3\2\2\2c"+
		"\u0158\3\2\2\2e\u015a\3\2\2\2g\u015c\3\2\2\2i\u015e\3\2\2\2k\u0160\3\2"+
		"\2\2m\u0162\3\2\2\2o\u0164\3\2\2\2q\u0167\3\2\2\2s\u016e\3\2\2\2u\u0175"+
		"\3\2\2\2w\u018c\3\2\2\2y\u0190\3\2\2\2{\u0194\3\2\2\2}\u019b\3\2\2\2\177"+
		"\u01a4\3\2\2\2\u0081\u01af\3\2\2\2\u0083\u01b5\3\2\2\2\u0085\u01c4\3\2"+
		"\2\2\u0087\u01ca\3\2\2\2\u0089\u01d5\3\2\2\2\u008b\u01f2\3\2\2\2\u008d"+
		"\u01f6\3\2\2\2\u008f\u01f8\3\2\2\2\u0091\u01fa\3\2\2\2\u0093\u0202\3\2"+
		"\2\2\u0095\u0205\3\2\2\2\u0097\u0208\3\2\2\2\u0099\u009a\7d\2\2\u009a"+
		"\u009b\7t\2\2\u009b\u009c\7g\2\2\u009c\u009d\7c\2\2\u009d\u009e\7m\2\2"+
		"\u009e\4\3\2\2\2\u009f\u00a0\7f\2\2\u00a0\u00a1\7g\2\2\u00a1\u00a2\7h"+
		"\2\2\u00a2\u00a3\7c\2\2\u00a3\u00a4\7w\2\2\u00a4\u00a5\7n\2\2\u00a5\u00a6"+
		"\7v\2\2\u00a6\6\3\2\2\2\u00a7\u00a8\7h\2\2\u00a8\u00a9\7w\2\2\u00a9\u00aa"+
		"\7p\2\2\u00aa\u00ab\7e\2\2\u00ab\b\3\2\2\2\u00ac\u00ad\7n\2\2\u00ad\u00ae"+
		"\7c\2\2\u00ae\n\3\2\2\2\u00af\u00b0\7g\2\2\u00b0\u00b1\7n\2\2\u00b1\u00b2"+
		"\7u\2\2\u00b2\u00b3\7g\2\2\u00b3\f\3\2\2\2\u00b4\u00b5\7p\2\2\u00b5\u00b6"+
		"\7c\2\2\u00b6\u00b7\7o\2\2\u00b7\u00b8\7g\2\2\u00b8\u00b9\7u\2\2\u00b9"+
		"\u00ba\7r\2\2\u00ba\u00bb\7c\2\2\u00bb\u00bc\7e\2\2\u00bc\u00bd\7g\2\2"+
		"\u00bd\16\3\2\2\2\u00be\u00bf\7u\2\2\u00bf\u00c0\7y\2\2\u00c0\u00c1\7"+
		"k\2\2\u00c1\u00c2\7v\2\2\u00c2\u00c3\7e\2\2\u00c3\u00c4\7j\2\2\u00c4\20"+
		"\3\2\2\2\u00c5\u00c6\7e\2\2\u00c6\u00c7\7q\2\2\u00c7\u00c8\7p\2\2\u00c8"+
		"\u00c9\7u\2\2\u00c9\u00ca\7v\2\2\u00ca\22\3\2\2\2\u00cb\u00cc\7h\2\2\u00cc"+
		"\u00cd\7c\2\2\u00cd\u00ce\7n\2\2\u00ce\u00cf\7n\2\2\u00cf\u00d0\7v\2\2"+
		"\u00d0\u00d1\7j\2\2\u00d1\u00d2\7t\2\2\u00d2\u00d3\7q\2\2\u00d3\u00d4"+
		"\7w\2\2\u00d4\u00d5\7i\2\2\u00d5\u00d6\7j\2\2\u00d6\24\3\2\2\2\u00d7\u00d8"+
		"\7k\2\2\u00d8\u00d9\7h\2\2\u00d9\26\3\2\2\2\u00da\u00db\7t\2\2\u00db\u00dc"+
		"\7c\2\2\u00dc\u00dd\7p\2\2\u00dd\u00de\7i\2\2\u00de\u00df\7g\2\2\u00df"+
		"\30\3\2\2\2\u00e0\u00e1\7v\2\2\u00e1\u00e2\7{\2\2\u00e2\u00e3\7r\2\2\u00e3"+
		"\u00e4\7g\2\2\u00e4\32\3\2\2\2\u00e5\u00e6\7e\2\2\u00e6\u00e7\7q\2\2\u00e7"+
		"\u00e8\7p\2\2\u00e8\u00e9\7v\2\2\u00e9\u00ea\7k\2\2\u00ea\u00eb\7p\2\2"+
		"\u00eb\u00ec\7w\2\2\u00ec\u00ed\7g\2\2\u00ed\34\3\2\2\2\u00ee\u00ef\7"+
		"h\2\2\u00ef\u00f0\7q\2\2\u00f0\u00f1\7t\2\2\u00f1\36\3\2\2\2\u00f2\u00f3"+
		"\7k\2\2\u00f3\u00f4\7o\2\2\u00f4\u00f5\7r\2\2\u00f5\u00f6\7q\2\2\u00f6"+
		"\u00f7\7t\2\2\u00f7\u00f8\7v\2\2\u00f8 \3\2\2\2\u00f9\u00fa\7t\2\2\u00fa"+
		"\u00fb\7g\2\2\u00fb\u00fc\7v\2\2\u00fc\u00fd\7w\2\2\u00fd\u00fe\7t\2\2"+
		"\u00fe\u00ff\7p\2\2\u00ff\"\3\2\2\2\u0100\u0101\7x\2\2\u0101\u0102\7c"+
		"\2\2\u0102\u0103\7t\2\2\u0103$\3\2\2\2\u0104\u0105\7p\2\2\u0105\u0106"+
		"\7k\2\2\u0106\u0107\7n\2\2\u0107&\3\2\2\2\u0108\u010d\5\u0093J\2\u0109"+
		"\u010c\5\u0093J\2\u010a\u010c\5\u0095K\2\u010b\u0109\3\2\2\2\u010b\u010a"+
		"\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e"+
		"(\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u0111\7*\2\2\u0111*\3\2\2\2\u0112"+
		"\u0113\7+\2\2\u0113,\3\2\2\2\u0114\u0115\7}\2\2\u0115.\3\2\2\2\u0116\u0117"+
		"\7\177\2\2\u0117\60\3\2\2\2\u0118\u0119\7]\2\2\u0119\62\3\2\2\2\u011a"+
		"\u011b\7_\2\2\u011b\64\3\2\2\2\u011c\u011d\7?\2\2\u011d\66\3\2\2\2\u011e"+
		"\u011f\7.\2\2\u011f8\3\2\2\2\u0120\u0121\7=\2\2\u0121:\3\2\2\2\u0122\u0123"+
		"\7<\2\2\u0123<\3\2\2\2\u0124\u0125\7\60\2\2\u0125>\3\2\2\2\u0126\u0127"+
		"\7-\2\2\u0127\u0128\7-\2\2\u0128@\3\2\2\2\u0129\u012a\7/\2\2\u012a\u012b"+
		"\7/\2\2\u012bB\3\2\2\2\u012c\u012d\7<\2\2\u012d\u012e\7?\2\2\u012eD\3"+
		"\2\2\2\u012f\u0130\7\60\2\2\u0130\u0131\7\60\2\2\u0131\u0132\7\60\2\2"+
		"\u0132F\3\2\2\2\u0133\u0134\7~\2\2\u0134\u0135\7~\2\2\u0135H\3\2\2\2\u0136"+
		"\u0137\7(\2\2\u0137\u0138\7(\2\2\u0138J\3\2\2\2\u0139\u013a\7?\2\2\u013a"+
		"\u013b\7?\2\2\u013bL\3\2\2\2\u013c\u013d\7#\2\2\u013d\u013e\7?\2\2\u013e"+
		"N\3\2\2\2\u013f\u0140\7>\2\2\u0140P\3\2\2\2\u0141\u0142\7>\2\2\u0142\u0143"+
		"\7?\2\2\u0143R\3\2\2\2\u0144\u0145\7@\2\2\u0145T\3\2\2\2\u0146\u0147\7"+
		"@\2\2\u0147\u0148\7?\2\2\u0148V\3\2\2\2\u0149\u014a\7~\2\2\u014aX\3\2"+
		"\2\2\u014b\u014c\7\61\2\2\u014cZ\3\2\2\2\u014d\u014e\7\'\2\2\u014e\\\3"+
		"\2\2\2\u014f\u0150\7>\2\2\u0150\u0151\7>\2\2\u0151^\3\2\2\2\u0152\u0153"+
		"\7@\2\2\u0153\u0154\7@\2\2\u0154`\3\2\2\2\u0155\u0156\7(\2\2\u0156\u0157"+
		"\7`\2\2\u0157b\3\2\2\2\u0158\u0159\7#\2\2\u0159d\3\2\2\2\u015a\u015b\7"+
		"-\2\2\u015bf\3\2\2\2\u015c\u015d\7/\2\2\u015dh\3\2\2\2\u015e\u015f\7`"+
		"\2\2\u015fj\3\2\2\2\u0160\u0161\7,\2\2\u0161l\3\2\2\2\u0162\u0163\7(\2"+
		"\2\u0163n\3\2\2\2\u0164\u0165\7>\2\2\u0165\u0166\7/\2\2\u0166p\3\2\2\2"+
		"\u0167\u016b\t\2\2\2\u0168\u016a\t\3\2\2\u0169\u0168\3\2\2\2\u016a\u016d"+
		"\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016cr\3\2\2\2\u016d"+
		"\u016b\3\2\2\2\u016e\u0172\7\62\2\2\u016f\u0171\5\u008dG\2\u0170\u016f"+
		"\3\2\2\2\u0171\u0174\3\2\2\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173"+
		"t\3\2\2\2\u0174\u0172\3\2\2\2\u0175\u0176\7\62\2\2\u0176\u0178\t\4\2\2"+
		"\u0177\u0179\5\u008fH\2\u0178\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a"+
		"\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017bv\3\2\2\2\u017c\u0185\5\u008b"+
		"F\2\u017d\u017f\7\60\2\2\u017e\u0180\5\u008bF\2\u017f\u017e\3\2\2\2\u017f"+
		"\u0180\3\2\2\2\u0180\u0182\3\2\2\2\u0181\u0183\5\u0091I\2\u0182\u0181"+
		"\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0186\3\2\2\2\u0184\u0186\5\u0091I"+
		"\2\u0185\u017d\3\2\2\2\u0185\u0184\3\2\2\2\u0186\u018d\3\2\2\2\u0187\u0188"+
		"\7\60\2\2\u0188\u018a\5\u008bF\2\u0189\u018b\5\u0091I\2\u018a\u0189\3"+
		"\2\2\2\u018a\u018b\3\2\2\2\u018b\u018d\3\2\2\2\u018c\u017c\3\2\2\2\u018c"+
		"\u0187\3\2\2\2\u018dx\3\2\2\2\u018e\u0191\5\u008bF\2\u018f\u0191\5w<\2"+
		"\u0190\u018e\3\2\2\2\u0190\u018f\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0193"+
		"\7k\2\2\u0193z\3\2\2\2\u0194\u0197\7)\2\2\u0195\u0198\n\5\2\2\u0196\u0198"+
		"\5\u0089E\2\u0197\u0195\3\2\2\2\u0197\u0196\3\2\2\2\u0198\u0199\3\2\2"+
		"\2\u0199\u019a\7)\2\2\u019a|\3\2\2\2\u019b\u019f\7b\2\2\u019c\u019e\n"+
		"\6\2\2\u019d\u019c\3\2\2\2\u019e\u01a1\3\2\2\2\u019f\u019d\3\2\2\2\u019f"+
		"\u01a0\3\2\2\2\u01a0\u01a2\3\2\2\2\u01a1\u019f\3\2\2\2\u01a2\u01a3\7b"+
		"\2\2\u01a3~\3\2\2\2\u01a4\u01a9\7$\2\2\u01a5\u01a8\n\7\2\2\u01a6\u01a8"+
		"\5\u0089E\2\u01a7\u01a5\3\2\2\2\u01a7\u01a6\3\2\2\2\u01a8\u01ab\3\2\2"+
		"\2\u01a9\u01a7\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ac\3\2\2\2\u01ab\u01a9"+
		"\3\2\2\2\u01ac\u01ad\7$\2\2\u01ad\u0080\3\2\2\2\u01ae\u01b0\t\b\2\2\u01af"+
		"\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01af\3\2\2\2\u01b1\u01b2\3\2"+
		"\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b4\bA\2\2\u01b4\u0082\3\2\2\2\u01b5"+
		"\u01b6\7\61\2\2\u01b6\u01b7\7,\2\2\u01b7\u01bb\3\2\2\2\u01b8\u01ba\13"+
		"\2\2\2\u01b9\u01b8\3\2\2\2\u01ba\u01bd\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bb"+
		"\u01b9\3\2\2\2\u01bc\u01be\3\2\2\2\u01bd\u01bb\3\2\2\2\u01be\u01bf\7,"+
		"\2\2\u01bf\u01c0\7\61\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c2\bB\2\2\u01c2"+
		"\u0084\3\2\2\2\u01c3\u01c5\t\t\2\2\u01c4\u01c3\3\2\2\2\u01c5\u01c6\3\2"+
		"\2\2\u01c6\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8"+
		"\u01c9\bC\2\2\u01c9\u0086\3\2\2\2\u01ca\u01cb\7\61\2\2\u01cb\u01cc\7\61"+
		"\2\2\u01cc\u01d0\3\2\2\2\u01cd\u01cf\n\t\2\2\u01ce\u01cd\3\2\2\2\u01cf"+
		"\u01d2\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d3\3\2"+
		"\2\2\u01d2\u01d0\3\2\2\2\u01d3\u01d4\bD\2\2\u01d4\u0088\3\2\2\2\u01d5"+
		"\u01ef\7^\2\2\u01d6\u01d7\7w\2\2\u01d7\u01d8\5\u008fH\2\u01d8\u01d9\5"+
		"\u008fH\2\u01d9\u01da\5\u008fH\2\u01da\u01db\5\u008fH\2\u01db\u01f0\3"+
		"\2\2\2\u01dc\u01dd\7W\2\2\u01dd\u01de\5\u008fH\2\u01de\u01df\5\u008fH"+
		"\2\u01df\u01e0\5\u008fH\2\u01e0\u01e1\5\u008fH\2\u01e1\u01e2\5\u008fH"+
		"\2\u01e2\u01e3\5\u008fH\2\u01e3\u01e4\5\u008fH\2\u01e4\u01e5\5\u008fH"+
		"\2\u01e5\u01f0\3\2\2\2\u01e6\u01f0\t\n\2\2\u01e7\u01e8\5\u008dG\2\u01e8"+
		"\u01e9\5\u008dG\2\u01e9\u01ea\5\u008dG\2\u01ea\u01f0\3\2\2\2\u01eb\u01ec"+
		"\7z\2\2\u01ec\u01ed\5\u008fH\2\u01ed\u01ee\5\u008fH\2\u01ee\u01f0\3\2"+
		"\2\2\u01ef\u01d6\3\2\2\2\u01ef\u01dc\3\2\2\2\u01ef\u01e6\3\2\2\2\u01ef"+
		"\u01e7\3\2\2\2\u01ef\u01eb\3\2\2\2\u01f0\u008a\3\2\2\2\u01f1\u01f3\t\3"+
		"\2\2\u01f2\u01f1\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f4"+
		"\u01f5\3\2\2\2\u01f5\u008c\3\2\2\2\u01f6\u01f7\t\13\2\2\u01f7\u008e\3"+
		"\2\2\2\u01f8\u01f9\t\f\2\2\u01f9\u0090\3\2\2\2\u01fa\u01fc\t\r\2\2\u01fb"+
		"\u01fd\t\16\2\2\u01fc\u01fb\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01fe\3"+
		"\2\2\2\u01fe\u01ff\5\u008bF\2\u01ff\u0092\3\2\2\2\u0200\u0203\5\u0097"+
		"L\2\u0201\u0203\7a\2\2\u0202\u0200\3\2\2\2\u0202\u0201\3\2\2\2\u0203\u0094"+
		"\3\2\2\2\u0204\u0206\t\17\2\2\u0205\u0204\3\2\2\2\u0206\u0096\3\2\2\2"+
		"\u0207\u0209\t\20\2\2\u0208\u0207\3\2\2\2\u0209\u0098\3\2\2\2\34\2\u010b"+
		"\u010d\u016b\u0172\u017a\u017f\u0182\u0185\u018a\u018c\u0190\u0197\u019f"+
		"\u01a7\u01a9\u01b1\u01bb\u01c6\u01d0\u01ef\u01f4\u01fc\u0202\u0205\u0208"+
		"\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}