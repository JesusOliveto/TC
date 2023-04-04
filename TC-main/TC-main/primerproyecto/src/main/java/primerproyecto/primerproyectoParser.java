// Generated from c:\Users\frang\OneDrive\Escritorio\Facu\5to\TC\Repos\TC\primerproyecto\src\main\java\primerproyecto\primerproyecto.g4 by ANTLR 4.9.2

package primerproyecto;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class primerproyectoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FECHAPAR=1, FECHA=2, HORA813=3, HORA183213=4, HORA=5, OTRO=6;
	public static final int
		RULE_s = 0;
	private static String[] makeRuleNames() {
		return new String[] {
			"s"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FECHAPAR", "FECHA", "HORA813", "HORA183213", "HORA", "OTRO"
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
	public String getGrammarFileName() { return "primerproyecto.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public primerproyectoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SContext extends ParserRuleContext {
		public Token FECHAPAR;
		public Token FECHA;
		public Token HORA813;
		public Token HORA183213;
		public Token HORA;
		public TerminalNode FECHAPAR() { return getToken(primerproyectoParser.FECHAPAR, 0); }
		public SContext s() {
			return getRuleContext(SContext.class,0);
		}
		public TerminalNode FECHA() { return getToken(primerproyectoParser.FECHA, 0); }
		public TerminalNode HORA813() { return getToken(primerproyectoParser.HORA813, 0); }
		public TerminalNode HORA183213() { return getToken(primerproyectoParser.HORA183213, 0); }
		public TerminalNode HORA() { return getToken(primerproyectoParser.HORA, 0); }
		public TerminalNode OTRO() { return getToken(primerproyectoParser.OTRO, 0); }
		public TerminalNode EOF() { return getToken(primerproyectoParser.EOF, 0); }
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof primerproyectoListener ) ((primerproyectoListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof primerproyectoListener ) ((primerproyectoListener)listener).exitS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof primerproyectoVisitor ) return ((primerproyectoVisitor<? extends T>)visitor).visitS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		try {
			setState(21);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FECHAPAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(2);
				((SContext)_localctx).FECHAPAR = match(FECHAPAR);
				 System.out.println("Linea : " + ((SContext)_localctx).FECHAPAR.getLine() + " - Fecha con mes PAR ->" + ((SContext)_localctx).FECHAPAR.getText() + "<-"); 
				setState(4);
				s();
				}
				break;
			case FECHA:
				enterOuterAlt(_localctx, 2);
				{
				setState(5);
				((SContext)_localctx).FECHA = match(FECHA);
				 System.out.println("Linea : " + ((SContext)_localctx).FECHA.getLine() + " - Fecha ->" + ((SContext)_localctx).FECHA.getText() + "<-"); 
				setState(7);
				s();
				}
				break;
			case HORA813:
				enterOuterAlt(_localctx, 3);
				{
				setState(8);
				((SContext)_localctx).HORA813 = match(HORA813);
				 System.out.println("Linea : " + ((SContext)_localctx).HORA813.getLine() + " - Hora 8 a 13 ->" + ((SContext)_localctx).HORA813.getText() + "<-"); 
				setState(10);
				s();
				}
				break;
			case HORA183213:
				enterOuterAlt(_localctx, 4);
				{
				setState(11);
				((SContext)_localctx).HORA183213 = match(HORA183213);
				 System.out.println("Linea : " + ((SContext)_localctx).HORA183213.getLine() + " - Hora 18:30 a 21:30 ->" + ((SContext)_localctx).HORA183213.getText() + "<-"); 
				setState(13);
				s();
				}
				break;
			case HORA:
				enterOuterAlt(_localctx, 5);
				{
				setState(14);
				((SContext)_localctx).HORA = match(HORA);
				 System.out.println("Linea : " + ((SContext)_localctx).HORA.getLine() + " - Hora ->" + ((SContext)_localctx).HORA.getText() + "<-"); 
				setState(16);
				s();
				}
				break;
			case OTRO:
				enterOuterAlt(_localctx, 6);
				{
				setState(17);
				match(OTRO);
				 System.out.println(""); 
				setState(19);
				s();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 7);
				{
				setState(20);
				match(EOF);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\b\32\4\2\t\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\5\2\30\n\2\3\2\2\2\3\2\2\2\2\36\2\27\3\2\2\2\4\5\7\3\2\2\5\6\b\2\1"+
		"\2\6\30\5\2\2\2\7\b\7\4\2\2\b\t\b\2\1\2\t\30\5\2\2\2\n\13\7\5\2\2\13\f"+
		"\b\2\1\2\f\30\5\2\2\2\r\16\7\6\2\2\16\17\b\2\1\2\17\30\5\2\2\2\20\21\7"+
		"\7\2\2\21\22\b\2\1\2\22\30\5\2\2\2\23\24\7\b\2\2\24\25\b\2\1\2\25\30\5"+
		"\2\2\2\26\30\7\2\2\3\27\4\3\2\2\2\27\7\3\2\2\2\27\n\3\2\2\2\27\r\3\2\2"+
		"\2\27\20\3\2\2\2\27\23\3\2\2\2\27\26\3\2\2\2\30\3\3\2\2\2\3\27";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}