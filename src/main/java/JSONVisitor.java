// Generated from /Users/pedrobrito/Downloads/ELP_P/src/main/kotlin/JSON.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JSONParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JSONVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JSONParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(JSONParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringVal}
	 * labeled alternative in {@link JSONParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringVal(JSONParser.StringValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberVal}
	 * labeled alternative in {@link JSONParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberVal(JSONParser.NumberValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolVal}
	 * labeled alternative in {@link JSONParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolVal(JSONParser.BoolValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayVal}
	 * labeled alternative in {@link JSONParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayVal(JSONParser.ArrayValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjVal}
	 * labeled alternative in {@link JSONParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjVal(JSONParser.ObjValContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(JSONParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONParser#obj}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObj(JSONParser.ObjContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONParser#par}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPar(JSONParser.ParContext ctx);
}