// Generated from C:/Java/JavaBasics\ArithmeticEquations.g4 by ANTLR 4.12.0
package main;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ArithmeticEquationsParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ArithmeticEquationsVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ArithmeticEquationsParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(ArithmeticEquationsParser.InputContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArithmeticEquationsParser#equation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquation(ArithmeticEquationsParser.EquationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArithmeticEquationsParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(ArithmeticEquationsParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArithmeticEquationsParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(ArithmeticEquationsParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArithmeticEquationsParser#scientific}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScientific(ArithmeticEquationsParser.ScientificContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArithmeticEquationsParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(ArithmeticEquationsParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArithmeticEquationsParser#relop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelop(ArithmeticEquationsParser.RelopContext ctx);
}