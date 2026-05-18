// Generated from C:/Users/James/Downloads/elpF/src/main/kotlin/Template.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TemplateParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TemplateVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TemplateParser#script}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript(TemplateParser.ScriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(TemplateParser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(TemplateParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(TemplateParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateParser#if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(TemplateParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(TemplateParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateParser#foreach}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeach(TemplateParser.ForeachContext ctx);
}