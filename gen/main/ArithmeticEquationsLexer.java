// Generated from C:/Java/JavaBasics\ArithmeticEquations.g4 by ANTLR 4.12.0
package main;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ArithmeticEquationsLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VARIABLE=1, SCIENTIFIC_NUMBER=2, LPAREN=3, RPAREN=4, PLUS=5, MINUS=6, 
		MULT=7, DIV=8, EQ=9, POINT=10, WS=11;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"VARIABLE", "VALID_ID", "SCIENTIFIC_NUMBER", "NUMBER", "UNSIGNED_INTEGER", 
			"SIGN", "LPAREN", "RPAREN", "PLUS", "MINUS", "MULT", "DIV", "EQ", "POINT", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'('", "')'", "'+'", "'-'", "'*'", "'/'", "'='", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "VARIABLE", "SCIENTIFIC_NUMBER", "LPAREN", "RPAREN", "PLUS", "MINUS", 
			"MULT", "DIV", "EQ", "POINT", "WS"
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


	public ArithmeticEquationsLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ArithmeticEquations.g4"; }

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
		"\u0004\u0000\u000bU\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0003"+
		"\u0002&\b\u0002\u0001\u0002\u0003\u0002)\b\u0002\u0001\u0003\u0004\u0003"+
		",\b\u0003\u000b\u0003\f\u0003-\u0001\u0003\u0001\u0003\u0004\u00032\b"+
		"\u0003\u000b\u0003\f\u00033\u0003\u00036\b\u0003\u0001\u0004\u0004\u0004"+
		"9\b\u0004\u000b\u0004\f\u0004:\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n"+
		"\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\u000e\u0004\u000eP\b\u000e\u000b\u000e\f\u000eQ\u0001\u000e\u0001\u000e"+
		"\u0000\u0000\u000f\u0001\u0001\u0003\u0000\u0005\u0002\u0007\u0000\t\u0000"+
		"\u000b\u0000\r\u0003\u000f\u0004\u0011\u0005\u0013\u0006\u0015\u0007\u0017"+
		"\b\u0019\t\u001b\n\u001d\u000b\u0001\u0000\u0002\u0002\u0000XXxx\u0003"+
		"\u0000\t\n\r\r  W\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000"+
		"\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0001\u001f\u0001\u0000"+
		"\u0000\u0000\u0003!\u0001\u0000\u0000\u0000\u0005#\u0001\u0000\u0000\u0000"+
		"\u0007+\u0001\u0000\u0000\u0000\t8\u0001\u0000\u0000\u0000\u000b<\u0001"+
		"\u0000\u0000\u0000\r>\u0001\u0000\u0000\u0000\u000f@\u0001\u0000\u0000"+
		"\u0000\u0011B\u0001\u0000\u0000\u0000\u0013D\u0001\u0000\u0000\u0000\u0015"+
		"F\u0001\u0000\u0000\u0000\u0017H\u0001\u0000\u0000\u0000\u0019J\u0001"+
		"\u0000\u0000\u0000\u001bL\u0001\u0000\u0000\u0000\u001dO\u0001\u0000\u0000"+
		"\u0000\u001f \u0003\u0003\u0001\u0000 \u0002\u0001\u0000\u0000\u0000!"+
		"\"\u0007\u0000\u0000\u0000\"\u0004\u0001\u0000\u0000\u0000#(\u0003\u0007"+
		"\u0003\u0000$&\u0003\u000b\u0005\u0000%$\u0001\u0000\u0000\u0000%&\u0001"+
		"\u0000\u0000\u0000&\'\u0001\u0000\u0000\u0000\')\u0003\t\u0004\u0000("+
		"%\u0001\u0000\u0000\u0000()\u0001\u0000\u0000\u0000)\u0006\u0001\u0000"+
		"\u0000\u0000*,\u000209\u0000+*\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000"+
		"\u0000-+\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000.5\u0001\u0000"+
		"\u0000\u0000/1\u0005.\u0000\u000002\u000209\u000010\u0001\u0000\u0000"+
		"\u000023\u0001\u0000\u0000\u000031\u0001\u0000\u0000\u000034\u0001\u0000"+
		"\u0000\u000046\u0001\u0000\u0000\u00005/\u0001\u0000\u0000\u000056\u0001"+
		"\u0000\u0000\u00006\b\u0001\u0000\u0000\u000079\u000209\u000087\u0001"+
		"\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000"+
		":;\u0001\u0000\u0000\u0000;\n\u0001\u0000\u0000\u0000<=\u0005-\u0000\u0000"+
		"=\f\u0001\u0000\u0000\u0000>?\u0005(\u0000\u0000?\u000e\u0001\u0000\u0000"+
		"\u0000@A\u0005)\u0000\u0000A\u0010\u0001\u0000\u0000\u0000BC\u0005+\u0000"+
		"\u0000C\u0012\u0001\u0000\u0000\u0000DE\u0005-\u0000\u0000E\u0014\u0001"+
		"\u0000\u0000\u0000FG\u0005*\u0000\u0000G\u0016\u0001\u0000\u0000\u0000"+
		"HI\u0005/\u0000\u0000I\u0018\u0001\u0000\u0000\u0000JK\u0005=\u0000\u0000"+
		"K\u001a\u0001\u0000\u0000\u0000LM\u0005.\u0000\u0000M\u001c\u0001\u0000"+
		"\u0000\u0000NP\u0007\u0001\u0000\u0000ON\u0001\u0000\u0000\u0000PQ\u0001"+
		"\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000"+
		"RS\u0001\u0000\u0000\u0000ST\u0006\u000e\u0000\u0000T\u001e\u0001\u0000"+
		"\u0000\u0000\b\u0000%(-35:Q\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}