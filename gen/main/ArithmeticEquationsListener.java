// Generated from C:/Java/JavaBasics\ArithmeticEquations.g4 by ANTLR 4.12.0
package main;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ArithmeticEquationsParser}.
 */
public interface ArithmeticEquationsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ArithmeticEquationsParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(ArithmeticEquationsParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticEquationsParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(ArithmeticEquationsParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithmeticEquationsParser#equation}.
	 * @param ctx the parse tree
	 */
	void enterEquation(ArithmeticEquationsParser.EquationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticEquationsParser#equation}.
	 * @param ctx the parse tree
	 */
	void exitEquation(ArithmeticEquationsParser.EquationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithmeticEquationsParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ArithmeticEquationsParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticEquationsParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ArithmeticEquationsParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithmeticEquationsParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(ArithmeticEquationsParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticEquationsParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(ArithmeticEquationsParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithmeticEquationsParser#scientific}.
	 * @param ctx the parse tree
	 */
	void enterScientific(ArithmeticEquationsParser.ScientificContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticEquationsParser#scientific}.
	 * @param ctx the parse tree
	 */
	void exitScientific(ArithmeticEquationsParser.ScientificContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithmeticEquationsParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(ArithmeticEquationsParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticEquationsParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(ArithmeticEquationsParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithmeticEquationsParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterRelop(ArithmeticEquationsParser.RelopContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticEquationsParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitRelop(ArithmeticEquationsParser.RelopContext ctx);
}