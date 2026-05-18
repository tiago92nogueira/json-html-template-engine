// Generated from C:/Users/James/Downloads/elpF/src/main/kotlin/Template.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class TemplateParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ENDIF=2, ELSE=3, THEN=4, PRINT=5, BOOLEAN=6, FOREACH=7, ENDFOREACH=8, 
		IN=9, STRING=10, INT=11, ID=12, OPEN=13, CLOSE=14, OPERATORMUL=15, OPERATORREL=16, 
		ADD=17, MINUS=18, EQUAL=19, TERM=20, OPENBLOCK=21, CLOSEBLOCK=22, COMMENT=23, 
		SPACE=24;
	public static final int
		RULE_script = 0, RULE_instruction = 1, RULE_assign = 2, RULE_print = 3, 
		RULE_if = 4, RULE_expression = 5, RULE_foreach = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"script", "instruction", "assign", "print", "if", "expression", "foreach"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'endif'", "'else'", "'then'", "'print'", null, "'foreach'", 
			"'endforeach'", "'in'", null, null, null, "'('", "')'", null, null, "'+'", 
			"'-'", "'='", null, "'{{'", "'}}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "ENDIF", "ELSE", "THEN", "PRINT", "BOOLEAN", "FOREACH", "ENDFOREACH", 
			"IN", "STRING", "INT", "ID", "OPEN", "CLOSE", "OPERATORMUL", "OPERATORREL", 
			"ADD", "MINUS", "EQUAL", "TERM", "OPENBLOCK", "CLOSEBLOCK", "COMMENT", 
			"SPACE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Template.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TemplateParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ScriptContext extends ParserRuleContext {
		public InstructionContext instruction;
		public List<InstructionContext> sequence = new ArrayList<InstructionContext>();
		public TerminalNode OPENBLOCK() { return getToken(TemplateParser.OPENBLOCK, 0); }
		public TerminalNode CLOSEBLOCK() { return getToken(TemplateParser.CLOSEBLOCK, 0); }
		public TerminalNode EOF() { return getToken(TemplateParser.EOF, 0); }
		public TerminalNode TERM() { return getToken(TemplateParser.TERM, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public ScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).enterScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).exitScript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateVisitor ) return ((TemplateVisitor<? extends T>)visitor).visitScript(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_script);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			match(OPENBLOCK);
			setState(16);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TERM) {
				{
				setState(15);
				match(TERM);
				}
			}

			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8392866L) != 0)) {
				{
				{
				setState(18);
				((ScriptContext)_localctx).instruction = instruction();
				((ScriptContext)_localctx).sequence.add(((ScriptContext)_localctx).instruction);
				}
				}
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(24);
			match(CLOSEBLOCK);
			setState(25);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InstructionContext extends ParserRuleContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public IfContext if_() {
			return getRuleContext(IfContext.class,0);
		}
		public ForeachContext foreach() {
			return getRuleContext(ForeachContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(TemplateParser.COMMENT, 0); }
		public List<TerminalNode> TERM() { return getTokens(TemplateParser.TERM); }
		public TerminalNode TERM(int i) {
			return getToken(TemplateParser.TERM, i);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).exitInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateVisitor ) return ((TemplateVisitor<? extends T>)visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instruction);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(27);
				assign();
				}
				break;
			case PRINT:
				{
				setState(28);
				print();
				}
				break;
			case IF:
				{
				setState(29);
				if_();
				}
				break;
			case FOREACH:
				{
				setState(30);
				foreach();
				}
				break;
			case COMMENT:
				{
				setState(31);
				match(COMMENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(37);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(34);
					match(TERM);
					}
					} 
				}
				setState(39);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TemplateParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(TemplateParser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateVisitor ) return ((TemplateVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(ID);
			setState(41);
			match(EQUAL);
			setState(42);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(TemplateParser.PRINT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateVisitor ) return ((TemplateVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(PRINT);
			setState(45);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfContext extends ParserRuleContext {
		public ExpressionContext guard;
		public InstructionContext instruction;
		public List<InstructionContext> sequence = new ArrayList<InstructionContext>();
		public List<InstructionContext> alternative = new ArrayList<InstructionContext>();
		public TerminalNode IF() { return getToken(TemplateParser.IF, 0); }
		public TerminalNode OPEN() { return getToken(TemplateParser.OPEN, 0); }
		public TerminalNode CLOSE() { return getToken(TemplateParser.CLOSE, 0); }
		public TerminalNode THEN() { return getToken(TemplateParser.THEN, 0); }
		public TerminalNode ENDIF() { return getToken(TemplateParser.ENDIF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> TERM() { return getTokens(TemplateParser.TERM); }
		public TerminalNode TERM(int i) {
			return getToken(TemplateParser.TERM, i);
		}
		public TerminalNode ELSE() { return getToken(TemplateParser.ELSE, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public IfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateVisitor ) return ((TemplateVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfContext if_() throws RecognitionException {
		IfContext _localctx = new IfContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_if);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(IF);
			setState(48);
			match(OPEN);
			setState(49);
			((IfContext)_localctx).guard = expression(0);
			setState(50);
			match(CLOSE);
			setState(51);
			match(THEN);
			setState(53); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(52);
					match(TERM);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(55); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8392866L) != 0)) {
				{
				{
				setState(57);
				((IfContext)_localctx).instruction = instruction();
				((IfContext)_localctx).sequence.add(((IfContext)_localctx).instruction);
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TERM) {
				{
				{
				setState(63);
				match(TERM);
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(69);
				match(ELSE);
				setState(71); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(70);
					match(TERM);
					}
					}
					setState(73); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TERM );
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8392866L) != 0)) {
					{
					{
					setState(75);
					((IfContext)_localctx).instruction = instruction();
					((IfContext)_localctx).alternative.add(((IfContext)_localctx).instruction);
					}
					}
					setState(80);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(83);
			match(ENDIF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext left;
		public ExpressionContext inner;
		public Token id;
		public Token value;
		public Token b;
		public Token s;
		public Token operator;
		public ExpressionContext right;
		public TerminalNode OPEN() { return getToken(TemplateParser.OPEN, 0); }
		public TerminalNode CLOSE() { return getToken(TemplateParser.CLOSE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ID() { return getToken(TemplateParser.ID, 0); }
		public TerminalNode INT() { return getToken(TemplateParser.INT, 0); }
		public TerminalNode BOOLEAN() { return getToken(TemplateParser.BOOLEAN, 0); }
		public TerminalNode STRING() { return getToken(TemplateParser.STRING, 0); }
		public TerminalNode OPERATORMUL() { return getToken(TemplateParser.OPERATORMUL, 0); }
		public TerminalNode ADD() { return getToken(TemplateParser.ADD, 0); }
		public TerminalNode MINUS() { return getToken(TemplateParser.MINUS, 0); }
		public TerminalNode OPERATORREL() { return getToken(TemplateParser.OPERATORREL, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateVisitor ) return ((TemplateVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN:
				{
				setState(86);
				match(OPEN);
				setState(87);
				((ExpressionContext)_localctx).inner = expression(0);
				setState(88);
				match(CLOSE);
				}
				break;
			case ID:
				{
				setState(90);
				((ExpressionContext)_localctx).id = match(ID);
				}
				break;
			case INT:
				{
				setState(91);
				((ExpressionContext)_localctx).value = match(INT);
				}
				break;
			case BOOLEAN:
				{
				setState(92);
				((ExpressionContext)_localctx).b = match(BOOLEAN);
				}
				break;
			case STRING:
				{
				setState(93);
				((ExpressionContext)_localctx).s = match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(107);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(105);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(96);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(97);
						((ExpressionContext)_localctx).operator = match(OPERATORMUL);
						setState(98);
						((ExpressionContext)_localctx).right = expression(8);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(99);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(100);
						((ExpressionContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==MINUS) ) {
							((ExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(101);
						((ExpressionContext)_localctx).right = expression(7);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(102);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(103);
						((ExpressionContext)_localctx).operator = match(OPERATORREL);
						setState(104);
						((ExpressionContext)_localctx).right = expression(6);
						}
						break;
					}
					} 
				}
				setState(109);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForeachContext extends ParserRuleContext {
		public InstructionContext instruction;
		public List<InstructionContext> sequence = new ArrayList<InstructionContext>();
		public TerminalNode FOREACH() { return getToken(TemplateParser.FOREACH, 0); }
		public List<TerminalNode> ID() { return getTokens(TemplateParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TemplateParser.ID, i);
		}
		public TerminalNode IN() { return getToken(TemplateParser.IN, 0); }
		public TerminalNode ENDFOREACH() { return getToken(TemplateParser.ENDFOREACH, 0); }
		public List<TerminalNode> TERM() { return getTokens(TemplateParser.TERM); }
		public TerminalNode TERM(int i) {
			return getToken(TemplateParser.TERM, i);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public ForeachContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreach; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).enterForeach(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).exitForeach(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateVisitor ) return ((TemplateVisitor<? extends T>)visitor).visitForeach(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForeachContext foreach() throws RecognitionException {
		ForeachContext _localctx = new ForeachContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_foreach);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(FOREACH);
			setState(111);
			match(ID);
			setState(112);
			match(IN);
			setState(113);
			match(ID);
			setState(115); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(114);
				match(TERM);
				}
				}
				setState(117); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TERM );
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8392866L) != 0)) {
				{
				{
				setState(119);
				((ForeachContext)_localctx).instruction = instruction();
				((ForeachContext)_localctx).sequence.add(((ForeachContext)_localctx).instruction);
				}
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(125);
			match(ENDFOREACH);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0018\u0080\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0001\u0000"+
		"\u0003\u0000\u0011\b\u0000\u0001\u0000\u0005\u0000\u0014\b\u0000\n\u0000"+
		"\f\u0000\u0017\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001!\b\u0001"+
		"\u0001\u0001\u0005\u0001$\b\u0001\n\u0001\f\u0001\'\t\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0004\u00046\b\u0004\u000b\u0004\f\u00047\u0001\u0004\u0005\u0004;\b"+
		"\u0004\n\u0004\f\u0004>\t\u0004\u0001\u0004\u0005\u0004A\b\u0004\n\u0004"+
		"\f\u0004D\t\u0004\u0001\u0004\u0001\u0004\u0004\u0004H\b\u0004\u000b\u0004"+
		"\f\u0004I\u0001\u0004\u0005\u0004M\b\u0004\n\u0004\f\u0004P\t\u0004\u0003"+
		"\u0004R\b\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005_\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005"+
		"\u0005j\b\u0005\n\u0005\f\u0005m\t\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0004\u0006t\b\u0006\u000b\u0006\f\u0006"+
		"u\u0001\u0006\u0005\u0006y\b\u0006\n\u0006\f\u0006|\t\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0000\u0001\n\u0007\u0000\u0002\u0004\u0006\b"+
		"\n\f\u0000\u0001\u0001\u0000\u0011\u0012\u008e\u0000\u000e\u0001\u0000"+
		"\u0000\u0000\u0002 \u0001\u0000\u0000\u0000\u0004(\u0001\u0000\u0000\u0000"+
		"\u0006,\u0001\u0000\u0000\u0000\b/\u0001\u0000\u0000\u0000\n^\u0001\u0000"+
		"\u0000\u0000\fn\u0001\u0000\u0000\u0000\u000e\u0010\u0005\u0015\u0000"+
		"\u0000\u000f\u0011\u0005\u0014\u0000\u0000\u0010\u000f\u0001\u0000\u0000"+
		"\u0000\u0010\u0011\u0001\u0000\u0000\u0000\u0011\u0015\u0001\u0000\u0000"+
		"\u0000\u0012\u0014\u0003\u0002\u0001\u0000\u0013\u0012\u0001\u0000\u0000"+
		"\u0000\u0014\u0017\u0001\u0000\u0000\u0000\u0015\u0013\u0001\u0000\u0000"+
		"\u0000\u0015\u0016\u0001\u0000\u0000\u0000\u0016\u0018\u0001\u0000\u0000"+
		"\u0000\u0017\u0015\u0001\u0000\u0000\u0000\u0018\u0019\u0005\u0016\u0000"+
		"\u0000\u0019\u001a\u0005\u0000\u0000\u0001\u001a\u0001\u0001\u0000\u0000"+
		"\u0000\u001b!\u0003\u0004\u0002\u0000\u001c!\u0003\u0006\u0003\u0000\u001d"+
		"!\u0003\b\u0004\u0000\u001e!\u0003\f\u0006\u0000\u001f!\u0005\u0017\u0000"+
		"\u0000 \u001b\u0001\u0000\u0000\u0000 \u001c\u0001\u0000\u0000\u0000 "+
		"\u001d\u0001\u0000\u0000\u0000 \u001e\u0001\u0000\u0000\u0000 \u001f\u0001"+
		"\u0000\u0000\u0000!%\u0001\u0000\u0000\u0000\"$\u0005\u0014\u0000\u0000"+
		"#\"\u0001\u0000\u0000\u0000$\'\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000"+
		"\u0000%&\u0001\u0000\u0000\u0000&\u0003\u0001\u0000\u0000\u0000\'%\u0001"+
		"\u0000\u0000\u0000()\u0005\f\u0000\u0000)*\u0005\u0013\u0000\u0000*+\u0003"+
		"\n\u0005\u0000+\u0005\u0001\u0000\u0000\u0000,-\u0005\u0005\u0000\u0000"+
		"-.\u0003\n\u0005\u0000.\u0007\u0001\u0000\u0000\u0000/0\u0005\u0001\u0000"+
		"\u000001\u0005\r\u0000\u000012\u0003\n\u0005\u000023\u0005\u000e\u0000"+
		"\u000035\u0005\u0004\u0000\u000046\u0005\u0014\u0000\u000054\u0001\u0000"+
		"\u0000\u000067\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u000078\u0001"+
		"\u0000\u0000\u00008<\u0001\u0000\u0000\u00009;\u0003\u0002\u0001\u0000"+
		":9\u0001\u0000\u0000\u0000;>\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000"+
		"\u0000<=\u0001\u0000\u0000\u0000=B\u0001\u0000\u0000\u0000><\u0001\u0000"+
		"\u0000\u0000?A\u0005\u0014\u0000\u0000@?\u0001\u0000\u0000\u0000AD\u0001"+
		"\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000"+
		"CQ\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000EG\u0005\u0003\u0000"+
		"\u0000FH\u0005\u0014\u0000\u0000GF\u0001\u0000\u0000\u0000HI\u0001\u0000"+
		"\u0000\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JN\u0001"+
		"\u0000\u0000\u0000KM\u0003\u0002\u0001\u0000LK\u0001\u0000\u0000\u0000"+
		"MP\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000"+
		"\u0000OR\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000QE\u0001\u0000"+
		"\u0000\u0000QR\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000ST\u0005"+
		"\u0002\u0000\u0000T\t\u0001\u0000\u0000\u0000UV\u0006\u0005\uffff\uffff"+
		"\u0000VW\u0005\r\u0000\u0000WX\u0003\n\u0005\u0000XY\u0005\u000e\u0000"+
		"\u0000Y_\u0001\u0000\u0000\u0000Z_\u0005\f\u0000\u0000[_\u0005\u000b\u0000"+
		"\u0000\\_\u0005\u0006\u0000\u0000]_\u0005\n\u0000\u0000^U\u0001\u0000"+
		"\u0000\u0000^Z\u0001\u0000\u0000\u0000^[\u0001\u0000\u0000\u0000^\\\u0001"+
		"\u0000\u0000\u0000^]\u0001\u0000\u0000\u0000_k\u0001\u0000\u0000\u0000"+
		"`a\n\u0007\u0000\u0000ab\u0005\u000f\u0000\u0000bj\u0003\n\u0005\bcd\n"+
		"\u0006\u0000\u0000de\u0007\u0000\u0000\u0000ej\u0003\n\u0005\u0007fg\n"+
		"\u0005\u0000\u0000gh\u0005\u0010\u0000\u0000hj\u0003\n\u0005\u0006i`\u0001"+
		"\u0000\u0000\u0000ic\u0001\u0000\u0000\u0000if\u0001\u0000\u0000\u0000"+
		"jm\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000"+
		"\u0000l\u000b\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000no\u0005"+
		"\u0007\u0000\u0000op\u0005\f\u0000\u0000pq\u0005\t\u0000\u0000qs\u0005"+
		"\f\u0000\u0000rt\u0005\u0014\u0000\u0000sr\u0001\u0000\u0000\u0000tu\u0001"+
		"\u0000\u0000\u0000us\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000"+
		"vz\u0001\u0000\u0000\u0000wy\u0003\u0002\u0001\u0000xw\u0001\u0000\u0000"+
		"\u0000y|\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000z{\u0001\u0000"+
		"\u0000\u0000{}\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000}~\u0005"+
		"\b\u0000\u0000~\r\u0001\u0000\u0000\u0000\u000f\u0010\u0015 %7<BINQ^i"+
		"kuz";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}