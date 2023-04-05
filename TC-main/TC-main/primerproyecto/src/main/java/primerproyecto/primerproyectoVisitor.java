// Generated from c:\Users\Gsu\OneDrive - UNIVERSIDAD BLAS PASCAL\UBP\,,\TC\TC-main\TC-main\primerproyecto\src\main\java\primerproyecto\primerproyecto.g4 by ANTLR 4.9.2

package primerproyecto;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link primerproyectoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface primerproyectoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link primerproyectoParser#si}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSi(primerproyectoParser.SiContext ctx);
	/**
	 * Visit a parse tree produced by {@link primerproyectoParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(primerproyectoParser.SContext ctx);
}