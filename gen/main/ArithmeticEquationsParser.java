// Generated from C:/Java/JavaBasics\ArithmeticEquations.g4 by ANTLR 4.12.0
package main;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ArithmeticEquationsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VARIABLE=1, SCIENTIFIC_NUMBER=2, LPAREN=3, RPAREN=4, PLUS=5, MINUS=6, 
		MULT=7, DIV=8, EQ=9, POINT=10, WS=11;
	public static final int
		RULE_input = 0, RULE_equation = 1, RULE_expression = 2, RULE_atom = 3, 
		RULE_scientific = 4, RULE_variable = 5, RULE_relop = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"input", "equation", "expression", "atom", "scientific", "variable", 
			"relop"
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

	@Override
	public String getGrammarFileName() { return "ArithmeticEquations.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ArithmeticEquationsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InputContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ArithmeticEquationsParser.EOF, 0); }
		public List<EquationContext> equation() {
			return getRuleContexts(EquationContext.class);
		}
		public EquationContext equation(int i) {
			return getRuleContext(EquationContext.class,i);
		}
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticEquationsListener ) ((ArithmeticEquationsListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticEquationsListener ) ((ArithmeticEquationsListener)listener).exitInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArithmeticEquationsVisitor ) return ((ArithmeticEquationsVisitor<? extends T>)visitor).visitInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_input);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 78L) != 0)) {
				{
				{
				setState(14);
				equation();
				}
				}
				setState(19);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(20);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EquationContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public RelopContext relop() {
			return getRuleContext(RelopContext.class,0);
		}
		public EquationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticEquationsListener ) ((ArithmeticEquationsListener)listener).enterEquation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticEquationsListener ) ((ArithmeticEquationsListener)listener).exitEquation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArithmeticEquationsVisitor ) return ((ArithmeticEquationsVisitor<? extends T>)visitor).visitEquation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EquationContext equation() throws RecognitionException {
		EquationContext _localctx = new EquationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_equation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			expression(0);
			setState(23);
			relop();
			setState(24);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ArithmeticEquationsParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(ArithmeticEquationsParser.RPAREN, 0); }
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public List<TerminalNode> MINUS() { return getTokens(ArithmeticEquationsParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(ArithmeticEquationsParser.MINUS, i);
		}
		public TerminalNode MULT() { return getToken(ArithmeticEquationsParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(ArithmeticEquationsParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(ArithmeticEquationsParser.PLUS, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticEquationsListener ) ((ArithmeticEquationsListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticEquationsListener ) ((ArithmeticEquationsListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArithmeticEquationsVisitor ) return ((ArithmeticEquationsVisitor<? extends T>)visitor).visitExpression(this);
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
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				setState(27);
				match(LPAREN);
				setState(28);
				expression(0);
				setState(29);
				match(RPAREN);
				}
				break;
			case VARIABLE:
			case SCIENTIFIC_NUMBER:
			case MINUS:
				{
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MINUS) {
					{
					{
					setState(31);
					match(MINUS);
					}
					}
					setState(36);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(37);
				atom();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(48);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(46);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(40);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(41);
						_la = _input.LA(1);
						if ( !(_la==MULT || _la==DIV) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(42);
						expression(5);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(43);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(44);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(45);
						expression(4);
						}
						break;
					}
					} 
				}
				setState(50);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AtomContext extends ParserRuleContext {
		public ScientificContext scientific() {
			return getRuleContext(ScientificContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticEquationsListener ) ((ArithmeticEquationsListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticEquationsListener ) ((ArithmeticEquationsListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArithmeticEquationsVisitor ) return ((ArithmeticEquationsVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_atom);
		try {
			setState(53);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SCIENTIFIC_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				scientific();
				}
				break;
			case VARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				variable();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ScientificContext extends ParserRuleContext {
		public TerminalNode SCIENTIFIC_NUMBER() { return getToken(ArithmeticEquationsParser.SCIENTIFIC_NUMBER, 0); }
		public ScientificContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scientific; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticEquationsListener ) ((ArithmeticEquationsListener)listener).enterScientific(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticEquationsListener ) ((ArithmeticEquationsListener)listener).exitScientific(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArithmeticEquationsVisitor ) return ((ArithmeticEquationsVisitor<? extends T>)visitor).visitScientific(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScientificContext scientific() throws RecognitionException {
		ScientificContext _localctx = new ScientificContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_scientific);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(SCIENTIFIC_NUMBER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(ArithmeticEquationsParser.VARIABLE, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticEquationsListener ) ((ArithmeticEquationsListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticEquationsListener ) ((ArithmeticEquationsListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArithmeticEquationsVisitor ) return ((ArithmeticEquationsVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(VARIABLE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RelopContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(ArithmeticEquationsParser.EQ, 0); }
		public RelopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticEquationsListener ) ((ArithmeticEquationsListener)listener).enterRelop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticEquationsListener ) ((ArithmeticEquationsListener)listener).exitRelop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArithmeticEquationsVisitor ) return ((ArithmeticEquationsVisitor<? extends T>)visitor).visitRelop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelopContext relop() throws RecognitionException {
		RelopContext _localctx = new RelopContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_relop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(EQ);
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
		case 2:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u000b>\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0005\u0000\u0010"+
		"\b\u0000\n\u0000\f\u0000\u0013\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002!\b\u0002\n\u0002\f\u0002"+
		"$\t\u0002\u0001\u0002\u0003\u0002\'\b\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002/\b\u0002\n\u0002"+
		"\f\u00022\t\u0002\u0001\u0003\u0001\u0003\u0003\u00036\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0000\u0001\u0004\u0007\u0000\u0002\u0004\u0006\b\n\f\u0000\u0002\u0001"+
		"\u0000\u0007\b\u0001\u0000\u0005\u0006<\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0002\u0016\u0001\u0000\u0000\u0000\u0004&\u0001\u0000\u0000\u0000"+
		"\u00065\u0001\u0000\u0000\u0000\b7\u0001\u0000\u0000\u0000\n9\u0001\u0000"+
		"\u0000\u0000\f;\u0001\u0000\u0000\u0000\u000e\u0010\u0003\u0002\u0001"+
		"\u0000\u000f\u000e\u0001\u0000\u0000\u0000\u0010\u0013\u0001\u0000\u0000"+
		"\u0000\u0011\u000f\u0001\u0000\u0000\u0000\u0011\u0012\u0001\u0000\u0000"+
		"\u0000\u0012\u0014\u0001\u0000\u0000\u0000\u0013\u0011\u0001\u0000\u0000"+
		"\u0000\u0014\u0015\u0005\u0000\u0000\u0001\u0015\u0001\u0001\u0000\u0000"+
		"\u0000\u0016\u0017\u0003\u0004\u0002\u0000\u0017\u0018\u0003\f\u0006\u0000"+
		"\u0018\u0019\u0003\u0004\u0002\u0000\u0019\u0003\u0001\u0000\u0000\u0000"+
		"\u001a\u001b\u0006\u0002\uffff\uffff\u0000\u001b\u001c\u0005\u0003\u0000"+
		"\u0000\u001c\u001d\u0003\u0004\u0002\u0000\u001d\u001e\u0005\u0004\u0000"+
		"\u0000\u001e\'\u0001\u0000\u0000\u0000\u001f!\u0005\u0006\u0000\u0000"+
		" \u001f\u0001\u0000\u0000\u0000!$\u0001\u0000\u0000\u0000\" \u0001\u0000"+
		"\u0000\u0000\"#\u0001\u0000\u0000\u0000#%\u0001\u0000\u0000\u0000$\"\u0001"+
		"\u0000\u0000\u0000%\'\u0003\u0006\u0003\u0000&\u001a\u0001\u0000\u0000"+
		"\u0000&\"\u0001\u0000\u0000\u0000\'0\u0001\u0000\u0000\u0000()\n\u0004"+
		"\u0000\u0000)*\u0007\u0000\u0000\u0000*/\u0003\u0004\u0002\u0005+,\n\u0003"+
		"\u0000\u0000,-\u0007\u0001\u0000\u0000-/\u0003\u0004\u0002\u0004.(\u0001"+
		"\u0000\u0000\u0000.+\u0001\u0000\u0000\u0000/2\u0001\u0000\u0000\u0000"+
		"0.\u0001\u0000\u0000\u000001\u0001\u0000\u0000\u00001\u0005\u0001\u0000"+
		"\u0000\u000020\u0001\u0000\u0000\u000036\u0003\b\u0004\u000046\u0003\n"+
		"\u0005\u000053\u0001\u0000\u0000\u000054\u0001\u0000\u0000\u00006\u0007"+
		"\u0001\u0000\u0000\u000078\u0005\u0002\u0000\u00008\t\u0001\u0000\u0000"+
		"\u00009:\u0005\u0001\u0000\u0000:\u000b\u0001\u0000\u0000\u0000;<\u0005"+
		"\t\u0000\u0000<\r\u0001\u0000\u0000\u0000\u0006\u0011\"&.05";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}