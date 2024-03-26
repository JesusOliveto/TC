// Generated from c:/Users/Gsu/OneDrive - UNIVERSIDAD BLAS PASCAL/UBP/,,/TC/prueba/test/src/main/java/ejercicio/ejercicio.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ejercicioParser}.
 */
public interface ejercicioListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ejercicioParser#fecha_pares}.
	 * @param ctx the parse tree
	 */
	void enterFecha_pares(ejercicioParser.Fecha_paresContext ctx);
	/**
	 * Exit a parse tree produced by {@link ejercicioParser#fecha_pares}.
	 * @param ctx the parse tree
	 */
	void exitFecha_pares(ejercicioParser.Fecha_paresContext ctx);
	/**
	 * Enter a parse tree produced by {@link ejercicioParser#hora_manana}.
	 * @param ctx the parse tree
	 */
	void enterHora_manana(ejercicioParser.Hora_mananaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ejercicioParser#hora_manana}.
	 * @param ctx the parse tree
	 */
	void exitHora_manana(ejercicioParser.Hora_mananaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ejercicioParser#hora_noche}.
	 * @param ctx the parse tree
	 */
	void enterHora_noche(ejercicioParser.Hora_nocheContext ctx);
	/**
	 * Exit a parse tree produced by {@link ejercicioParser#hora_noche}.
	 * @param ctx the parse tree
	 */
	void exitHora_noche(ejercicioParser.Hora_nocheContext ctx);
}