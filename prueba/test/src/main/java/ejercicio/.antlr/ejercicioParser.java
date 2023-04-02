// Generated from c:\Users\Gsu\OneDrive - UNIVERSIDAD BLAS PASCAL\UBP\,,\TC\prueba\test\src\main\java\ejercicio\ejercicio.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ejercicioParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		DIGIT=18, WS=19;
	public static final int
		RULE_fecha_pares = 0, RULE_hora_manana = 1, RULE_hora_noche = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"fecha_pares", "hora_manana", "hora_noche"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'/'", "'02'", "'04'", "'06'", "'08'", "'10'", "'12'", "'09'", 
			"'1'", "':'", "'0'", "'2'", "'18'", "'19'", "'20'", "'21'", "'3'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "DIGIT", "WS"
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
	public String getGrammarFileName() { return "ejercicio.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ejercicioParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Fecha_paresContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(ejercicioParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(ejercicioParser.DIGIT, i);
		}
		public Fecha_paresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fecha_pares; }
	}

	public final Fecha_paresContext fecha_pares() throws RecognitionException {
		Fecha_paresContext _localctx = new Fecha_paresContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_fecha_pares);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(6);
			match(DIGIT);
			setState(7);
			match(DIGIT);
			setState(8);
			match(T__0);
			setState(9);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(10);
			match(T__0);
			setState(11);
			match(DIGIT);
			setState(12);
			match(DIGIT);
			setState(13);
			match(DIGIT);
			setState(14);
			match(DIGIT);
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

	public static class Hora_mananaContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(ejercicioParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(ejercicioParser.DIGIT, i);
		}
		public Hora_mananaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hora_manana; }
	}

	public final Hora_mananaContext hora_manana() throws RecognitionException {
		Hora_mananaContext _localctx = new Hora_mananaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_hora_manana);
		try {
			setState(35);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(16);
				match(T__4);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(17);
				match(T__7);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(18);
				match(T__8);
				setState(19);
				match(DIGIT);
				setState(20);
				match(T__9);
				setState(21);
				match(DIGIT);
				setState(22);
				match(DIGIT);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 4);
				{
				setState(23);
				match(T__6);
				setState(24);
				match(T__9);
				setState(33);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(25);
					match(T__10);
					setState(26);
					match(DIGIT);
					}
					break;
				case 2:
					{
					setState(27);
					match(T__8);
					setState(28);
					match(T__10);
					}
					break;
				case 3:
					{
					setState(29);
					match(T__8);
					setState(30);
					match(T__8);
					}
					break;
				case 4:
					{
					setState(31);
					match(T__8);
					setState(32);
					match(T__11);
					}
					break;
				}
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

	public static class Hora_nocheContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(ejercicioParser.DIGIT, 0); }
		public Hora_nocheContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hora_noche; }
	}

	public final Hora_nocheContext hora_noche() throws RecognitionException {
		Hora_nocheContext _localctx = new Hora_nocheContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_hora_noche);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(38);
			match(T__9);
			setState(45);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(39);
				match(T__16);
				setState(40);
				match(T__10);
				}
				break;
			case 2:
				{
				setState(41);
				match(T__16);
				setState(42);
				match(T__8);
				}
				break;
			case 3:
				{
				setState(43);
				match(T__10);
				setState(44);
				match(DIGIT);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\25\62\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3$\n\3\5\3&\n\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\60\n\4\3\4\2\2\5\2\4\6\2\4\3\2\4\t"+
		"\3\2\17\22\2\66\2\b\3\2\2\2\4%\3\2\2\2\6\'\3\2\2\2\b\t\7\24\2\2\t\n\7"+
		"\24\2\2\n\13\7\3\2\2\13\f\t\2\2\2\f\r\7\3\2\2\r\16\7\24\2\2\16\17\7\24"+
		"\2\2\17\20\7\24\2\2\20\21\7\24\2\2\21\3\3\2\2\2\22&\7\7\2\2\23&\7\n\2"+
		"\2\24\25\7\13\2\2\25\26\7\24\2\2\26\27\7\f\2\2\27\30\7\24\2\2\30&\7\24"+
		"\2\2\31\32\7\t\2\2\32#\7\f\2\2\33\34\7\r\2\2\34$\7\24\2\2\35\36\7\13\2"+
		"\2\36$\7\r\2\2\37 \7\13\2\2 $\7\13\2\2!\"\7\13\2\2\"$\7\16\2\2#\33\3\2"+
		"\2\2#\35\3\2\2\2#\37\3\2\2\2#!\3\2\2\2$&\3\2\2\2%\22\3\2\2\2%\23\3\2\2"+
		"\2%\24\3\2\2\2%\31\3\2\2\2&\5\3\2\2\2\'(\t\3\2\2(/\7\f\2\2)*\7\23\2\2"+
		"*\60\7\r\2\2+,\7\23\2\2,\60\7\13\2\2-.\7\r\2\2.\60\7\24\2\2/)\3\2\2\2"+
		"/+\3\2\2\2/-\3\2\2\2\60\7\3\2\2\2\5#%/";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}