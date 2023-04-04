// Generated from c:\Users\frang\OneDrive\Escritorio\Facu\5to\TC\Repos\TC\primerproyecto\src\main\java\primerproyecto\primerproyecto.g4 by ANTLR 4.9.2

package primerproyecto;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class primerproyectoLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FECHAPAR=1, FECHA=2, HORA813=3, HORA183213=4, HORA=5, OTRO=6;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LETRA", "DIGITOPAR", "DIGITO", "FECHAPAR", "FECHA", "HORA813", "HORA183213", 
			"HORA", "OTRO"
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


	public primerproyectoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "primerproyecto.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\by\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5\"\n\5\3\5\3\5\3\5\3\5\3\5"+
		"\5\5)\n\5\3\5\3\5\6\5-\n\5\r\5\16\5.\3\6\3\6\3\6\3\6\3\6\3\6\5\6\67\n"+
		"\6\3\6\3\6\3\6\3\6\3\6\5\6>\n\6\3\6\3\6\6\6B\n\6\r\6\16\6C\3\7\3\7\3\7"+
		"\3\7\5\7J\n\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\5\bZ\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bg\n\b\5\bi\n"+
		"\b\3\t\3\t\3\t\3\t\5\to\n\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\5\nx\n\n\2\2\13"+
		"\3\2\5\2\7\2\t\3\13\4\r\5\17\6\21\7\23\b\3\2\16\4\2C\\c|\7\2\62\62\64"+
		"\64\66\6688::\3\2\62;\3\2\63;\3\2\63\64\3\2\62\63\4\2\62\62\64\64\3\2"+
		"\62\64\3\2:;\3\2\62\67\3\2\65\67\3\2\62\66\2\u0084\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\3\25\3\2\2\2"+
		"\5\27\3\2\2\2\7\31\3\2\2\2\t!\3\2\2\2\13\66\3\2\2\2\rI\3\2\2\2\17h\3\2"+
		"\2\2\21n\3\2\2\2\23w\3\2\2\2\25\26\t\2\2\2\26\4\3\2\2\2\27\30\t\3\2\2"+
		"\30\6\3\2\2\2\31\32\t\4\2\2\32\b\3\2\2\2\33\34\7\62\2\2\34\"\t\5\2\2\35"+
		"\36\t\6\2\2\36\"\5\7\4\2\37 \7\65\2\2 \"\t\7\2\2!\33\3\2\2\2!\35\3\2\2"+
		"\2!\37\3\2\2\2\"#\3\2\2\2#(\7\61\2\2$%\7\62\2\2%)\5\5\3\2&\'\7\63\2\2"+
		"\')\t\b\2\2($\3\2\2\2(&\3\2\2\2)*\3\2\2\2*,\7\61\2\2+-\5\7\4\2,+\3\2\2"+
		"\2-.\3\2\2\2.,\3\2\2\2./\3\2\2\2/\n\3\2\2\2\60\61\7\62\2\2\61\67\t\5\2"+
		"\2\62\63\t\6\2\2\63\67\5\7\4\2\64\65\7\65\2\2\65\67\t\7\2\2\66\60\3\2"+
		"\2\2\66\62\3\2\2\2\66\64\3\2\2\2\678\3\2\2\28=\7\61\2\29:\7\62\2\2:>\5"+
		"\7\4\2;<\7\63\2\2<>\t\t\2\2=9\3\2\2\2=;\3\2\2\2>?\3\2\2\2?A\7\61\2\2@"+
		"B\5\7\4\2A@\3\2\2\2BC\3\2\2\2CA\3\2\2\2CD\3\2\2\2D\f\3\2\2\2EF\7\62\2"+
		"\2FJ\t\n\2\2GH\7\63\2\2HJ\t\t\2\2IE\3\2\2\2IG\3\2\2\2JK\3\2\2\2KL\7<\2"+
		"\2LM\t\13\2\2MN\5\7\4\2N\16\3\2\2\2OP\7\63\2\2PQ\7:\2\2QR\3\2\2\2RS\7"+
		"<\2\2ST\t\f\2\2Ti\5\7\4\2UV\7\63\2\2VZ\7;\2\2WX\7\64\2\2XZ\7\62\2\2YU"+
		"\3\2\2\2YW\3\2\2\2Z[\3\2\2\2[\\\7<\2\2\\]\t\13\2\2]i\5\7\4\2^_\7\64\2"+
		"\2_`\7\63\2\2`a\3\2\2\2af\7<\2\2bc\t\t\2\2cg\5\7\4\2de\7\65\2\2eg\7\62"+
		"\2\2fb\3\2\2\2fd\3\2\2\2gi\3\2\2\2hO\3\2\2\2hY\3\2\2\2h^\3\2\2\2i\20\3"+
		"\2\2\2jk\t\7\2\2ko\5\7\4\2lm\7\64\2\2mo\t\r\2\2nj\3\2\2\2nl\3\2\2\2op"+
		"\3\2\2\2pq\7<\2\2qr\t\13\2\2rs\5\7\4\2s\22\3\2\2\2tx\7\13\2\2uv\7\17\2"+
		"\2vx\7\f\2\2wt\3\2\2\2wu\3\2\2\2x\24\3\2\2\2\17\2!(.\66=CIYfhnw\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}