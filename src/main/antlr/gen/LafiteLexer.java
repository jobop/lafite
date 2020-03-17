// Generated from /Users/zhengwei/projects/java/lafite/src/main/antlr/LafiteLexer.g4 by ANTLR 4.8
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
		BREAK=1, DEFAULT=2, FUNC=3, INTERFACE=4, SELECT=5, CASE=6, DEFER=7, GO=8, 
		MAP=9, STRUCT=10, CHAN=11, ELSE=12, PACKAGE=13, SWITCH=14, CONST=15, FALLTHROUGH=16, 
		IF=17, RANGE=18, TYPE=19, CONTINUE=20, FOR=21, IMPORT=22, RETURN=23, VAR=24, 
		NIL_LIT=25, IDENTIFIER=26, L_PAREN=27, R_PAREN=28, L_CURLY=29, R_CURLY=30, 
		L_BRACKET=31, R_BRACKET=32, ASSIGN=33, COMMA=34, SEMI=35, COLON=36, DOT=37, 
		PLUS_PLUS=38, MINUS_MINUS=39, DECLARE_ASSIGN=40, ELLIPSIS=41, LOGICAL_OR=42, 
		LOGICAL_AND=43, EQUALS=44, NOT_EQUALS=45, LESS=46, LESS_OR_EQUALS=47, 
		GREATER=48, GREATER_OR_EQUALS=49, OR=50, DIV=51, MOD=52, LSHIFT=53, RSHIFT=54, 
		BIT_CLEAR=55, EXCLAMATION=56, PLUS=57, MINUS=58, CARET=59, STAR=60, AMPERSAND=61, 
		RECEIVE=62, DECIMAL_LIT=63, OCTAL_LIT=64, HEX_LIT=65, FLOAT_LIT=66, IMAGINARY_LIT=67, 
		RUNE_LIT=68, RAW_STRING_LIT=69, INTERPRETED_STRING_LIT=70, WS=71, COMMENT=72, 
		TERMINATOR=73, LINE_COMMENT=74;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"BREAK", "DEFAULT", "FUNC", "INTERFACE", "SELECT", "CASE", "DEFER", "GO", 
			"MAP", "STRUCT", "CHAN", "ELSE", "PACKAGE", "SWITCH", "CONST", "FALLTHROUGH", 
			"IF", "RANGE", "TYPE", "CONTINUE", "FOR", "IMPORT", "RETURN", "VAR", 
			"NIL_LIT", "IDENTIFIER", "L_PAREN", "R_PAREN", "L_CURLY", "R_CURLY", 
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
			null, "'break'", "'default'", "'func'", "'interface'", "'select'", "'case'", 
			"'defer'", "'go'", "'map'", "'struct'", "'chan'", "'else'", "'package'", 
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
			null, "BREAK", "DEFAULT", "FUNC", "INTERFACE", "SELECT", "CASE", "DEFER", 
			"GO", "MAP", "STRUCT", "CHAN", "ELSE", "PACKAGE", "SWITCH", "CONST", 
			"FALLTHROUGH", "IF", "RANGE", "TYPE", "CONTINUE", "FOR", "IMPORT", "RETURN", 
			"VAR", "NIL_LIT", "IDENTIFIER", "L_PAREN", "R_PAREN", "L_CURLY", "R_CURLY", 
			"L_BRACKET", "R_BRACKET", "ASSIGN", "COMMA", "SEMI", "COLON", "DOT", 
			"PLUS_PLUS", "MINUS_MINUS", "DECLARE_ASSIGN", "ELLIPSIS", "LOGICAL_OR", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2L\u0242\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\7\33\u0144\n\33\f\33\16\33\u0147\13\33\3\34\3\34\3\35\3\35"+
		"\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3"+
		"\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3-\3.\3."+
		"\3.\3/\3/\3\60\3\60\3\60\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\64\3\64"+
		"\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3\67\38\38\38\39\39\3:\3:\3;\3;\3"+
		"<\3<\3=\3=\3>\3>\3?\3?\3?\3@\3@\7@\u01a2\n@\f@\16@\u01a5\13@\3A\3A\7A"+
		"\u01a9\nA\fA\16A\u01ac\13A\3B\3B\3B\6B\u01b1\nB\rB\16B\u01b2\3C\3C\3C"+
		"\5C\u01b8\nC\3C\5C\u01bb\nC\3C\5C\u01be\nC\3C\3C\3C\5C\u01c3\nC\5C\u01c5"+
		"\nC\3D\3D\5D\u01c9\nD\3D\3D\3E\3E\3E\5E\u01d0\nE\3E\3E\3F\3F\7F\u01d6"+
		"\nF\fF\16F\u01d9\13F\3F\3F\3G\3G\3G\7G\u01e0\nG\fG\16G\u01e3\13G\3G\3"+
		"G\3H\6H\u01e8\nH\rH\16H\u01e9\3H\3H\3I\3I\3I\3I\7I\u01f2\nI\fI\16I\u01f5"+
		"\13I\3I\3I\3I\3I\3I\3J\6J\u01fd\nJ\rJ\16J\u01fe\3J\3J\3K\3K\3K\3K\7K\u0207"+
		"\nK\fK\16K\u020a\13K\3K\3K\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3"+
		"L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\5L\u0228\nL\3M\6M\u022b\nM\rM\16M\u022c"+
		"\3N\3N\3O\3O\3P\3P\5P\u0235\nP\3P\3P\3Q\3Q\5Q\u023b\nQ\3R\5R\u023e\nR"+
		"\3S\5S\u0241\nS\3\u01f3\2T\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a"+
		"\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087"+
		"E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095L\u0097\2\u0099\2\u009b"+
		"\2\u009d\2\u009f\2\u00a1\2\u00a3\2\u00a5\2\3\2\21\3\2\63;\3\2\62;\4\2"+
		"ZZzz\4\2\f\f^^\3\2bb\4\2$$^^\4\2\13\13\"\"\4\2\f\f\17\17\13\2$$))^^cd"+
		"hhppttvvxx\3\2\629\5\2\62;CHch\4\2GGgg\4\2--//\26\2\62;\u0662\u066b\u06f2"+
		"\u06fb\u0968\u0971\u09e8\u09f1\u0a68\u0a71\u0ae8\u0af1\u0b68\u0b71\u0be9"+
		"\u0bf1\u0c68\u0c71\u0ce8\u0cf1\u0d68\u0d71\u0e52\u0e5b\u0ed2\u0edb\u0f22"+
		"\u0f2b\u1042\u104b\u136b\u1373\u17e2\u17eb\u1812\u181b\uff12\uff1b\u0104"+
		"\2C\\c|\u00ac\u00ac\u00b7\u00b7\u00bc\u00bc\u00c2\u00d8\u00da\u00f8\u00fa"+
		"\u0221\u0224\u0235\u0252\u02af\u02b2\u02ba\u02bd\u02c3\u02d2\u02d3\u02e2"+
		"\u02e6\u02f0\u02f0\u037c\u037c\u0388\u0388\u038a\u038c\u038e\u038e\u0390"+
		"\u03a3\u03a5\u03d0\u03d2\u03d9\u03dc\u03f5\u0402\u0483\u048e\u04c6\u04c9"+
		"\u04ca\u04cd\u04ce\u04d2\u04f7\u04fa\u04fb\u0533\u0558\u055b\u055b\u0563"+
		"\u0589\u05d2\u05ec\u05f2\u05f4\u0623\u063c\u0642\u064c\u0673\u06d5\u06d7"+
		"\u06d7\u06e7\u06e8\u06fc\u06fe\u0712\u0712\u0714\u072e\u0782\u07a7\u0907"+
		"\u093b\u093f\u093f\u0952\u0952\u095a\u0963\u0987\u098e\u0991\u0992\u0995"+
		"\u09aa\u09ac\u09b2\u09b4\u09b4\u09b8\u09bb\u09de\u09df\u09e1\u09e3\u09f2"+
		"\u09f3\u0a07\u0a0c\u0a11\u0a12\u0a15\u0a2a\u0a2c\u0a32\u0a34\u0a35\u0a37"+
		"\u0a38\u0a3a\u0a3b\u0a5b\u0a5e\u0a60\u0a60\u0a74\u0a76\u0a87\u0a8d\u0a8f"+
		"\u0a8f\u0a91\u0a93\u0a95\u0aaa\u0aac\u0ab2\u0ab4\u0ab5\u0ab7\u0abb\u0abf"+
		"\u0abf\u0ad2\u0ad2\u0ae2\u0ae2\u0b07\u0b0e\u0b11\u0b12\u0b15\u0b2a\u0b2c"+
		"\u0b32\u0b34\u0b35\u0b38\u0b3b\u0b3f\u0b3f\u0b5e\u0b5f\u0b61\u0b63\u0b87"+
		"\u0b8c\u0b90\u0b92\u0b94\u0b97\u0b9b\u0b9c\u0b9e\u0b9e\u0ba0\u0ba1\u0ba5"+
		"\u0ba6\u0baa\u0bac\u0bb0\u0bb7\u0bb9\u0bbb\u0c07\u0c0e\u0c10\u0c12\u0c14"+
		"\u0c2a\u0c2c\u0c35\u0c37\u0c3b\u0c62\u0c63\u0c87\u0c8e\u0c90\u0c92\u0c94"+
		"\u0caa\u0cac\u0cb5\u0cb7\u0cbb\u0ce0\u0ce0\u0ce2\u0ce3\u0d07\u0d0e\u0d10"+
		"\u0d12\u0d14\u0d2a\u0d2c\u0d3b\u0d62\u0d63\u0d87\u0d98\u0d9c\u0db3\u0db5"+
		"\u0dbd\u0dbf\u0dbf\u0dc2\u0dc8\u0e03\u0e32\u0e34\u0e35\u0e42\u0e48\u0e83"+
		"\u0e84\u0e86\u0e86\u0e89\u0e8a\u0e8c\u0e8c\u0e8f\u0e8f\u0e96\u0e99\u0e9b"+
		"\u0ea1\u0ea3\u0ea5\u0ea7\u0ea7\u0ea9\u0ea9\u0eac\u0ead\u0eaf\u0eb2\u0eb4"+
		"\u0eb5\u0ebf\u0ec6\u0ec8\u0ec8\u0ede\u0edf\u0f02\u0f02\u0f42\u0f6c\u0f8a"+
		"\u0f8d\u1002\u1023\u1025\u1029\u102b\u102c\u1052\u1057\u10a2\u10c7\u10d2"+
		"\u10f8\u1102\u115b\u1161\u11a4\u11aa\u11fb\u1202\u1208\u120a\u1248\u124a"+
		"\u124a\u124c\u124f\u1252\u1258\u125a\u125a\u125c\u125f\u1262\u1288\u128a"+
		"\u128a\u128c\u128f\u1292\u12b0\u12b2\u12b2\u12b4\u12b7\u12ba\u12c0\u12c2"+
		"\u12c2\u12c4\u12c7\u12ca\u12d0\u12d2\u12d8\u12da\u12f0\u12f2\u1310\u1312"+
		"\u1312\u1314\u1317\u131a\u1320\u1322\u1348\u134a\u135c\u13a2\u13f6\u1403"+
		"\u1678\u1683\u169c\u16a2\u16ec\u1782\u17b5\u1822\u1879\u1882\u18aa\u1e02"+
		"\u1e9d\u1ea2\u1efb\u1f02\u1f17\u1f1a\u1f1f\u1f22\u1f47\u1f4a\u1f4f\u1f52"+
		"\u1f59\u1f5b\u1f5b\u1f5d\u1f5d\u1f5f\u1f5f\u1f61\u1f7f\u1f82\u1fb6\u1fb8"+
		"\u1fbe\u1fc0\u1fc0\u1fc4\u1fc6\u1fc8\u1fce\u1fd2\u1fd5\u1fd8\u1fdd\u1fe2"+
		"\u1fee\u1ff4\u1ff6\u1ff8\u1ffe\u2081\u2081\u2104\u2104\u2109\u2109\u210c"+
		"\u2115\u2117\u2117\u211b\u211f\u2126\u2126\u2128\u2128\u212a\u212a\u212c"+
		"\u212f\u2131\u2133\u2135\u213b\u2162\u2185\u3007\u3009\u3023\u302b\u3033"+
		"\u3037\u303a\u303c\u3043\u3096\u309f\u30a0\u30a3\u30fc\u30fe\u3100\u3107"+
		"\u312e\u3133\u3190\u31a2\u31b9\u3402\u3402\u4db7\u4db7\u4e02\u4e02\u9fa7"+
		"\u9fa7\ua002\ua48e\uac02\uac02\ud7a5\ud7a5\uf902\ufa2f\ufb02\ufb08\ufb15"+
		"\ufb19\ufb1f\ufb1f\ufb21\ufb2a\ufb2c\ufb38\ufb3a\ufb3e\ufb40\ufb40\ufb42"+
		"\ufb43\ufb45\ufb46\ufb48\ufbb3\ufbd5\ufd3f\ufd52\ufd91\ufd94\ufdc9\ufdf2"+
		"\ufdfd\ufe72\ufe74\ufe76\ufe76\ufe78\ufefe\uff23\uff3c\uff43\uff5c\uff68"+
		"\uffc0\uffc4\uffc9\uffcc\uffd1\uffd4\uffd9\uffdc\uffde\2\u0253\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3"+
		"\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2"+
		"\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2"+
		"c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3"+
		"\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2"+
		"\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3"+
		"\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2"+
		"\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\3\u00a7"+
		"\3\2\2\2\5\u00ad\3\2\2\2\7\u00b5\3\2\2\2\t\u00ba\3\2\2\2\13\u00c4\3\2"+
		"\2\2\r\u00cb\3\2\2\2\17\u00d0\3\2\2\2\21\u00d6\3\2\2\2\23\u00d9\3\2\2"+
		"\2\25\u00dd\3\2\2\2\27\u00e4\3\2\2\2\31\u00e9\3\2\2\2\33\u00ee\3\2\2\2"+
		"\35\u00f6\3\2\2\2\37\u00fd\3\2\2\2!\u0103\3\2\2\2#\u010f\3\2\2\2%\u0112"+
		"\3\2\2\2\'\u0118\3\2\2\2)\u011d\3\2\2\2+\u0126\3\2\2\2-\u012a\3\2\2\2"+
		"/\u0131\3\2\2\2\61\u0138\3\2\2\2\63\u013c\3\2\2\2\65\u0140\3\2\2\2\67"+
		"\u0148\3\2\2\29\u014a\3\2\2\2;\u014c\3\2\2\2=\u014e\3\2\2\2?\u0150\3\2"+
		"\2\2A\u0152\3\2\2\2C\u0154\3\2\2\2E\u0156\3\2\2\2G\u0158\3\2\2\2I\u015a"+
		"\3\2\2\2K\u015c\3\2\2\2M\u015e\3\2\2\2O\u0161\3\2\2\2Q\u0164\3\2\2\2S"+
		"\u0167\3\2\2\2U\u016b\3\2\2\2W\u016e\3\2\2\2Y\u0171\3\2\2\2[\u0174\3\2"+
		"\2\2]\u0177\3\2\2\2_\u0179\3\2\2\2a\u017c\3\2\2\2c\u017e\3\2\2\2e\u0181"+
		"\3\2\2\2g\u0183\3\2\2\2i\u0185\3\2\2\2k\u0187\3\2\2\2m\u018a\3\2\2\2o"+
		"\u018d\3\2\2\2q\u0190\3\2\2\2s\u0192\3\2\2\2u\u0194\3\2\2\2w\u0196\3\2"+
		"\2\2y\u0198\3\2\2\2{\u019a\3\2\2\2}\u019c\3\2\2\2\177\u019f\3\2\2\2\u0081"+
		"\u01a6\3\2\2\2\u0083\u01ad\3\2\2\2\u0085\u01c4\3\2\2\2\u0087\u01c8\3\2"+
		"\2\2\u0089\u01cc\3\2\2\2\u008b\u01d3\3\2\2\2\u008d\u01dc\3\2\2\2\u008f"+
		"\u01e7\3\2\2\2\u0091\u01ed\3\2\2\2\u0093\u01fc\3\2\2\2\u0095\u0202\3\2"+
		"\2\2\u0097\u020d\3\2\2\2\u0099\u022a\3\2\2\2\u009b\u022e\3\2\2\2\u009d"+
		"\u0230\3\2\2\2\u009f\u0232\3\2\2\2\u00a1\u023a\3\2\2\2\u00a3\u023d\3\2"+
		"\2\2\u00a5\u0240\3\2\2\2\u00a7\u00a8\7d\2\2\u00a8\u00a9\7t\2\2\u00a9\u00aa"+
		"\7g\2\2\u00aa\u00ab\7c\2\2\u00ab\u00ac\7m\2\2\u00ac\4\3\2\2\2\u00ad\u00ae"+
		"\7f\2\2\u00ae\u00af\7g\2\2\u00af\u00b0\7h\2\2\u00b0\u00b1\7c\2\2\u00b1"+
		"\u00b2\7w\2\2\u00b2\u00b3\7n\2\2\u00b3\u00b4\7v\2\2\u00b4\6\3\2\2\2\u00b5"+
		"\u00b6\7h\2\2\u00b6\u00b7\7w\2\2\u00b7\u00b8\7p\2\2\u00b8\u00b9\7e\2\2"+
		"\u00b9\b\3\2\2\2\u00ba\u00bb\7k\2\2\u00bb\u00bc\7p\2\2\u00bc\u00bd\7v"+
		"\2\2\u00bd\u00be\7g\2\2\u00be\u00bf\7t\2\2\u00bf\u00c0\7h\2\2\u00c0\u00c1"+
		"\7c\2\2\u00c1\u00c2\7e\2\2\u00c2\u00c3\7g\2\2\u00c3\n\3\2\2\2\u00c4\u00c5"+
		"\7u\2\2\u00c5\u00c6\7g\2\2\u00c6\u00c7\7n\2\2\u00c7\u00c8\7g\2\2\u00c8"+
		"\u00c9\7e\2\2\u00c9\u00ca\7v\2\2\u00ca\f\3\2\2\2\u00cb\u00cc\7e\2\2\u00cc"+
		"\u00cd\7c\2\2\u00cd\u00ce\7u\2\2\u00ce\u00cf\7g\2\2\u00cf\16\3\2\2\2\u00d0"+
		"\u00d1\7f\2\2\u00d1\u00d2\7g\2\2\u00d2\u00d3\7h\2\2\u00d3\u00d4\7g\2\2"+
		"\u00d4\u00d5\7t\2\2\u00d5\20\3\2\2\2\u00d6\u00d7\7i\2\2\u00d7\u00d8\7"+
		"q\2\2\u00d8\22\3\2\2\2\u00d9\u00da\7o\2\2\u00da\u00db\7c\2\2\u00db\u00dc"+
		"\7r\2\2\u00dc\24\3\2\2\2\u00dd\u00de\7u\2\2\u00de\u00df\7v\2\2\u00df\u00e0"+
		"\7t\2\2\u00e0\u00e1\7w\2\2\u00e1\u00e2\7e\2\2\u00e2\u00e3\7v\2\2\u00e3"+
		"\26\3\2\2\2\u00e4\u00e5\7e\2\2\u00e5\u00e6\7j\2\2\u00e6\u00e7\7c\2\2\u00e7"+
		"\u00e8\7p\2\2\u00e8\30\3\2\2\2\u00e9\u00ea\7g\2\2\u00ea\u00eb\7n\2\2\u00eb"+
		"\u00ec\7u\2\2\u00ec\u00ed\7g\2\2\u00ed\32\3\2\2\2\u00ee\u00ef\7r\2\2\u00ef"+
		"\u00f0\7c\2\2\u00f0\u00f1\7e\2\2\u00f1\u00f2\7m\2\2\u00f2\u00f3\7c\2\2"+
		"\u00f3\u00f4\7i\2\2\u00f4\u00f5\7g\2\2\u00f5\34\3\2\2\2\u00f6\u00f7\7"+
		"u\2\2\u00f7\u00f8\7y\2\2\u00f8\u00f9\7k\2\2\u00f9\u00fa\7v\2\2\u00fa\u00fb"+
		"\7e\2\2\u00fb\u00fc\7j\2\2\u00fc\36\3\2\2\2\u00fd\u00fe\7e\2\2\u00fe\u00ff"+
		"\7q\2\2\u00ff\u0100\7p\2\2\u0100\u0101\7u\2\2\u0101\u0102\7v\2\2\u0102"+
		" \3\2\2\2\u0103\u0104\7h\2\2\u0104\u0105\7c\2\2\u0105\u0106\7n\2\2\u0106"+
		"\u0107\7n\2\2\u0107\u0108\7v\2\2\u0108\u0109\7j\2\2\u0109\u010a\7t\2\2"+
		"\u010a\u010b\7q\2\2\u010b\u010c\7w\2\2\u010c\u010d\7i\2\2\u010d\u010e"+
		"\7j\2\2\u010e\"\3\2\2\2\u010f\u0110\7k\2\2\u0110\u0111\7h\2\2\u0111$\3"+
		"\2\2\2\u0112\u0113\7t\2\2\u0113\u0114\7c\2\2\u0114\u0115\7p\2\2\u0115"+
		"\u0116\7i\2\2\u0116\u0117\7g\2\2\u0117&\3\2\2\2\u0118\u0119\7v\2\2\u0119"+
		"\u011a\7{\2\2\u011a\u011b\7r\2\2\u011b\u011c\7g\2\2\u011c(\3\2\2\2\u011d"+
		"\u011e\7e\2\2\u011e\u011f\7q\2\2\u011f\u0120\7p\2\2\u0120\u0121\7v\2\2"+
		"\u0121\u0122\7k\2\2\u0122\u0123\7p\2\2\u0123\u0124\7w\2\2\u0124\u0125"+
		"\7g\2\2\u0125*\3\2\2\2\u0126\u0127\7h\2\2\u0127\u0128\7q\2\2\u0128\u0129"+
		"\7t\2\2\u0129,\3\2\2\2\u012a\u012b\7k\2\2\u012b\u012c\7o\2\2\u012c\u012d"+
		"\7r\2\2\u012d\u012e\7q\2\2\u012e\u012f\7t\2\2\u012f\u0130\7v\2\2\u0130"+
		".\3\2\2\2\u0131\u0132\7t\2\2\u0132\u0133\7g\2\2\u0133\u0134\7v\2\2\u0134"+
		"\u0135\7w\2\2\u0135\u0136\7t\2\2\u0136\u0137\7p\2\2\u0137\60\3\2\2\2\u0138"+
		"\u0139\7x\2\2\u0139\u013a\7c\2\2\u013a\u013b\7t\2\2\u013b\62\3\2\2\2\u013c"+
		"\u013d\7p\2\2\u013d\u013e\7k\2\2\u013e\u013f\7n\2\2\u013f\64\3\2\2\2\u0140"+
		"\u0145\5\u00a1Q\2\u0141\u0144\5\u00a1Q\2\u0142\u0144\5\u00a3R\2\u0143"+
		"\u0141\3\2\2\2\u0143\u0142\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0143\3\2"+
		"\2\2\u0145\u0146\3\2\2\2\u0146\66\3\2\2\2\u0147\u0145\3\2\2\2\u0148\u0149"+
		"\7*\2\2\u01498\3\2\2\2\u014a\u014b\7+\2\2\u014b:\3\2\2\2\u014c\u014d\7"+
		"}\2\2\u014d<\3\2\2\2\u014e\u014f\7\177\2\2\u014f>\3\2\2\2\u0150\u0151"+
		"\7]\2\2\u0151@\3\2\2\2\u0152\u0153\7_\2\2\u0153B\3\2\2\2\u0154\u0155\7"+
		"?\2\2\u0155D\3\2\2\2\u0156\u0157\7.\2\2\u0157F\3\2\2\2\u0158\u0159\7="+
		"\2\2\u0159H\3\2\2\2\u015a\u015b\7<\2\2\u015bJ\3\2\2\2\u015c\u015d\7\60"+
		"\2\2\u015dL\3\2\2\2\u015e\u015f\7-\2\2\u015f\u0160\7-\2\2\u0160N\3\2\2"+
		"\2\u0161\u0162\7/\2\2\u0162\u0163\7/\2\2\u0163P\3\2\2\2\u0164\u0165\7"+
		"<\2\2\u0165\u0166\7?\2\2\u0166R\3\2\2\2\u0167\u0168\7\60\2\2\u0168\u0169"+
		"\7\60\2\2\u0169\u016a\7\60\2\2\u016aT\3\2\2\2\u016b\u016c\7~\2\2\u016c"+
		"\u016d\7~\2\2\u016dV\3\2\2\2\u016e\u016f\7(\2\2\u016f\u0170\7(\2\2\u0170"+
		"X\3\2\2\2\u0171\u0172\7?\2\2\u0172\u0173\7?\2\2\u0173Z\3\2\2\2\u0174\u0175"+
		"\7#\2\2\u0175\u0176\7?\2\2\u0176\\\3\2\2\2\u0177\u0178\7>\2\2\u0178^\3"+
		"\2\2\2\u0179\u017a\7>\2\2\u017a\u017b\7?\2\2\u017b`\3\2\2\2\u017c\u017d"+
		"\7@\2\2\u017db\3\2\2\2\u017e\u017f\7@\2\2\u017f\u0180\7?\2\2\u0180d\3"+
		"\2\2\2\u0181\u0182\7~\2\2\u0182f\3\2\2\2\u0183\u0184\7\61\2\2\u0184h\3"+
		"\2\2\2\u0185\u0186\7\'\2\2\u0186j\3\2\2\2\u0187\u0188\7>\2\2\u0188\u0189"+
		"\7>\2\2\u0189l\3\2\2\2\u018a\u018b\7@\2\2\u018b\u018c\7@\2\2\u018cn\3"+
		"\2\2\2\u018d\u018e\7(\2\2\u018e\u018f\7`\2\2\u018fp\3\2\2\2\u0190\u0191"+
		"\7#\2\2\u0191r\3\2\2\2\u0192\u0193\7-\2\2\u0193t\3\2\2\2\u0194\u0195\7"+
		"/\2\2\u0195v\3\2\2\2\u0196\u0197\7`\2\2\u0197x\3\2\2\2\u0198\u0199\7,"+
		"\2\2\u0199z\3\2\2\2\u019a\u019b\7(\2\2\u019b|\3\2\2\2\u019c\u019d\7>\2"+
		"\2\u019d\u019e\7/\2\2\u019e~\3\2\2\2\u019f\u01a3\t\2\2\2\u01a0\u01a2\t"+
		"\3\2\2\u01a1\u01a0\3\2\2\2\u01a2\u01a5\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a3"+
		"\u01a4\3\2\2\2\u01a4\u0080\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a6\u01aa\7\62"+
		"\2\2\u01a7\u01a9\5\u009bN\2\u01a8\u01a7\3\2\2\2\u01a9\u01ac\3\2\2\2\u01aa"+
		"\u01a8\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u0082\3\2\2\2\u01ac\u01aa\3\2"+
		"\2\2\u01ad\u01ae\7\62\2\2\u01ae\u01b0\t\4\2\2\u01af\u01b1\5\u009dO\2\u01b0"+
		"\u01af\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b2\u01b3\3\2"+
		"\2\2\u01b3\u0084\3\2\2\2\u01b4\u01bd\5\u0099M\2\u01b5\u01b7\7\60\2\2\u01b6"+
		"\u01b8\5\u0099M\2\u01b7\u01b6\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01ba"+
		"\3\2\2\2\u01b9\u01bb\5\u009fP\2\u01ba\u01b9\3\2\2\2\u01ba\u01bb\3\2\2"+
		"\2\u01bb\u01be\3\2\2\2\u01bc\u01be\5\u009fP\2\u01bd\u01b5\3\2\2\2\u01bd"+
		"\u01bc\3\2\2\2\u01be\u01c5\3\2\2\2\u01bf\u01c0\7\60\2\2\u01c0\u01c2\5"+
		"\u0099M\2\u01c1\u01c3\5\u009fP\2\u01c2\u01c1\3\2\2\2\u01c2\u01c3\3\2\2"+
		"\2\u01c3\u01c5\3\2\2\2\u01c4\u01b4\3\2\2\2\u01c4\u01bf\3\2\2\2\u01c5\u0086"+
		"\3\2\2\2\u01c6\u01c9\5\u0099M\2\u01c7\u01c9\5\u0085C\2\u01c8\u01c6\3\2"+
		"\2\2\u01c8\u01c7\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01cb\7k\2\2\u01cb"+
		"\u0088\3\2\2\2\u01cc\u01cf\7)\2\2\u01cd\u01d0\n\5\2\2\u01ce\u01d0\5\u0097"+
		"L\2\u01cf\u01cd\3\2\2\2\u01cf\u01ce\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1"+
		"\u01d2\7)\2\2\u01d2\u008a\3\2\2\2\u01d3\u01d7\7b\2\2\u01d4\u01d6\n\6\2"+
		"\2\u01d5\u01d4\3\2\2\2\u01d6\u01d9\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d7\u01d8"+
		"\3\2\2\2\u01d8\u01da\3\2\2\2\u01d9\u01d7\3\2\2\2\u01da\u01db\7b\2\2\u01db"+
		"\u008c\3\2\2\2\u01dc\u01e1\7$\2\2\u01dd\u01e0\n\7\2\2\u01de\u01e0\5\u0097"+
		"L\2\u01df\u01dd\3\2\2\2\u01df\u01de\3\2\2\2\u01e0\u01e3\3\2\2\2\u01e1"+
		"\u01df\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e4\3\2\2\2\u01e3\u01e1\3\2"+
		"\2\2\u01e4\u01e5\7$\2\2\u01e5\u008e\3\2\2\2\u01e6\u01e8\t\b\2\2\u01e7"+
		"\u01e6\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01e7\3\2\2\2\u01e9\u01ea\3\2"+
		"\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ec\bH\2\2\u01ec\u0090\3\2\2\2\u01ed"+
		"\u01ee\7\61\2\2\u01ee\u01ef\7,\2\2\u01ef\u01f3\3\2\2\2\u01f0\u01f2\13"+
		"\2\2\2\u01f1\u01f0\3\2\2\2\u01f2\u01f5\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f3"+
		"\u01f1\3\2\2\2\u01f4\u01f6\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f6\u01f7\7,"+
		"\2\2\u01f7\u01f8\7\61\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01fa\bI\2\2\u01fa"+
		"\u0092\3\2\2\2\u01fb\u01fd\t\t\2\2\u01fc\u01fb\3\2\2\2\u01fd\u01fe\3\2"+
		"\2\2\u01fe\u01fc\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0200\3\2\2\2\u0200"+
		"\u0201\bJ\2\2\u0201\u0094\3\2\2\2\u0202\u0203\7\61\2\2\u0203\u0204\7\61"+
		"\2\2\u0204\u0208\3\2\2\2\u0205\u0207\n\t\2\2\u0206\u0205\3\2\2\2\u0207"+
		"\u020a\3\2\2\2\u0208\u0206\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u020b\3\2"+
		"\2\2\u020a\u0208\3\2\2\2\u020b\u020c\bK\2\2\u020c\u0096\3\2\2\2\u020d"+
		"\u0227\7^\2\2\u020e\u020f\7w\2\2\u020f\u0210\5\u009dO\2\u0210\u0211\5"+
		"\u009dO\2\u0211\u0212\5\u009dO\2\u0212\u0213\5\u009dO\2\u0213\u0228\3"+
		"\2\2\2\u0214\u0215\7W\2\2\u0215\u0216\5\u009dO\2\u0216\u0217\5\u009dO"+
		"\2\u0217\u0218\5\u009dO\2\u0218\u0219\5\u009dO\2\u0219\u021a\5\u009dO"+
		"\2\u021a\u021b\5\u009dO\2\u021b\u021c\5\u009dO\2\u021c\u021d\5\u009dO"+
		"\2\u021d\u0228\3\2\2\2\u021e\u0228\t\n\2\2\u021f\u0220\5\u009bN\2\u0220"+
		"\u0221\5\u009bN\2\u0221\u0222\5\u009bN\2\u0222\u0228\3\2\2\2\u0223\u0224"+
		"\7z\2\2\u0224\u0225\5\u009dO\2\u0225\u0226\5\u009dO\2\u0226\u0228\3\2"+
		"\2\2\u0227\u020e\3\2\2\2\u0227\u0214\3\2\2\2\u0227\u021e\3\2\2\2\u0227"+
		"\u021f\3\2\2\2\u0227\u0223\3\2\2\2\u0228\u0098\3\2\2\2\u0229\u022b\t\3"+
		"\2\2\u022a\u0229\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u022a\3\2\2\2\u022c"+
		"\u022d\3\2\2\2\u022d\u009a\3\2\2\2\u022e\u022f\t\13\2\2\u022f\u009c\3"+
		"\2\2\2\u0230\u0231\t\f\2\2\u0231\u009e\3\2\2\2\u0232\u0234\t\r\2\2\u0233"+
		"\u0235\t\16\2\2\u0234\u0233\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u0236\3"+
		"\2\2\2\u0236\u0237\5\u0099M\2\u0237\u00a0\3\2\2\2\u0238\u023b\5\u00a5"+
		"S\2\u0239\u023b\7a\2\2\u023a\u0238\3\2\2\2\u023a\u0239\3\2\2\2\u023b\u00a2"+
		"\3\2\2\2\u023c\u023e\t\17\2\2\u023d\u023c\3\2\2\2\u023e\u00a4\3\2\2\2"+
		"\u023f\u0241\t\20\2\2\u0240\u023f\3\2\2\2\u0241\u00a6\3\2\2\2\34\2\u0143"+
		"\u0145\u01a3\u01aa\u01b2\u01b7\u01ba\u01bd\u01c2\u01c4\u01c8\u01cf\u01d7"+
		"\u01df\u01e1\u01e9\u01f3\u01fe\u0208\u0227\u022c\u0234\u023a\u023d\u0240"+
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