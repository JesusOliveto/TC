// Generated from c:\Users\Gsu\OneDrive - UNIVERSIDAD BLAS PASCAL\UBP\,,\TC\prueba\test\src\main\java\ejercicio\ejercicio.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ejercicioParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ejercicioVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ejercicioParser#fecha_pares}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFecha_pares(ejercicioParser.Fecha_paresContext ctx);
	/**
	 * Visit a parse tree produced by {@link ejercicioParser#hora_manana}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHora_manana(ejercicioParser.Hora_mananaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ejercicioParser#hora_noche}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHora_noche(ejercicioParser.Hora_nocheContext ctx);
}