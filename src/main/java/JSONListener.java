// Generated from /Users/pedrobrito/Downloads/ELP_P/src/main/kotlin/JSON.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JSONParser}.
 */
public interface JSONListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JSONParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(JSONParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(JSONParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringVal}
	 * labeled alternative in {@link JSONParser#value}.
	 * @param ctx the parse tree
	 */
	void enterStringVal(JSONParser.StringValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringVal}
	 * labeled alternative in {@link JSONParser#value}.
	 * @param ctx the parse tree
	 */
	void exitStringVal(JSONParser.StringValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberVal}
	 * labeled alternative in {@link JSONParser#value}.
	 * @param ctx the parse tree
	 */
	void enterNumberVal(JSONParser.NumberValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberVal}
	 * labeled alternative in {@link JSONParser#value}.
	 * @param ctx the parse tree
	 */
	void exitNumberVal(JSONParser.NumberValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolVal}
	 * labeled alternative in {@link JSONParser#value}.
	 * @param ctx the parse tree
	 */
	void enterBoolVal(JSONParser.BoolValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolVal}
	 * labeled alternative in {@link JSONParser#value}.
	 * @param ctx the parse tree
	 */
	void exitBoolVal(JSONParser.BoolValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayVal}
	 * labeled alternative in {@link JSONParser#value}.
	 * @param ctx the parse tree
	 */
	void enterArrayVal(JSONParser.ArrayValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayVal}
	 * labeled alternative in {@link JSONParser#value}.
	 * @param ctx the parse tree
	 */
	void exitArrayVal(JSONParser.ArrayValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjVal}
	 * labeled alternative in {@link JSONParser#value}.
	 * @param ctx the parse tree
	 */
	void enterObjVal(JSONParser.ObjValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjVal}
	 * labeled alternative in {@link JSONParser#value}.
	 * @param ctx the parse tree
	 */
	void exitObjVal(JSONParser.ObjValContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(JSONParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(JSONParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#obj}.
	 * @param ctx the parse tree
	 */
	void enterObj(JSONParser.ObjContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#obj}.
	 * @param ctx the parse tree
	 */
	void exitObj(JSONParser.ObjContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#par}.
	 * @param ctx the parse tree
	 */
	void enterPar(JSONParser.ParContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#par}.
	 * @param ctx the parse tree
	 */
	void exitPar(JSONParser.ParContext ctx);
}