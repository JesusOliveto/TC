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
	 * Visit a parse tree produced by {@link primerproyectoParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(primerproyectoParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link primerproyectoParser#instrucciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucciones(primerproyectoParser.InstruccionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link primerproyectoParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccion(primerproyectoParser.InstruccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link primerproyectoParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(primerproyectoParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link primerproyectoParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(primerproyectoParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link primerproyectoParser#inicializacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInicializacion(primerproyectoParser.InicializacionContext ctx);
}