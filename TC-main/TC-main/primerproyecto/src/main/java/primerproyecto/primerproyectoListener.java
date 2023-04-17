// Generated from c:\Users\Gsu\OneDrive - UNIVERSIDAD BLAS PASCAL\UBP\,,\TC\TC-main\TC-main\primerproyecto\src\main\java\primerproyecto\primerproyecto.g4 by ANTLR 4.9.2

package primerproyecto;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link primerproyectoParser}.
 */
public interface primerproyectoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link primerproyectoParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(primerproyectoParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link primerproyectoParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(primerproyectoParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link primerproyectoParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void enterInstrucciones(primerproyectoParser.InstruccionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link primerproyectoParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void exitInstrucciones(primerproyectoParser.InstruccionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link primerproyectoParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(primerproyectoParser.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link primerproyectoParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(primerproyectoParser.InstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link primerproyectoParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(primerproyectoParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link primerproyectoParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(primerproyectoParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link primerproyectoParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(primerproyectoParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link primerproyectoParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(primerproyectoParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link primerproyectoParser#inicializacion}.
	 * @param ctx the parse tree
	 */
	void enterInicializacion(primerproyectoParser.InicializacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link primerproyectoParser#inicializacion}.
	 * @param ctx the parse tree
	 */
	void exitInicializacion(primerproyectoParser.InicializacionContext ctx);
}