// Generated from C:/Users/James/Downloads/elpF/src/main/kotlin/Template.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TemplateParser}.
 */
public interface TemplateListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TemplateParser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(TemplateParser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(TemplateParser.ScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(TemplateParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(TemplateParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(TemplateParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(TemplateParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(TemplateParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(TemplateParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#if}.
	 * @param ctx the parse tree
	 */
	void enterIf(TemplateParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#if}.
	 * @param ctx the parse tree
	 */
	void exitIf(TemplateParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(TemplateParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(TemplateParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#foreach}.
	 * @param ctx the parse tree
	 */
	void enterForeach(TemplateParser.ForeachContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#foreach}.
	 * @param ctx the parse tree
	 */
	void exitForeach(TemplateParser.ForeachContext ctx);
}