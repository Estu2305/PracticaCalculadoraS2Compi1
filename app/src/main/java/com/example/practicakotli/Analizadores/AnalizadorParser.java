
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package com.example.practicakotli.Analizadores;

import java_cup.runtime.*;
import java.util.ArrayList;
import java.util.List;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class AnalizadorParser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public AnalizadorParser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public AnalizadorParser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public AnalizadorParser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\016\000\002\002\004\000\002\002\003\000\002\003" +
    "\004\000\002\003\003\000\002\003\004\000\002\004\003" +
    "\000\002\005\004\000\002\005\005\000\002\005\005\000" +
    "\002\005\005\000\002\005\005\000\002\005\003\000\002" +
    "\005\003\000\002\005\005" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\030\000\014\003\013\004\012\007\005\012\006\013" +
    "\004\001\002\000\026\002\ufff5\003\ufff5\004\ufff5\005\ufff5" +
    "\006\ufff5\007\ufff5\010\ufff5\011\ufff5\012\ufff5\013\ufff5\001" +
    "\002\000\012\004\012\007\005\012\006\013\004\001\002" +
    "\000\026\002\ufff6\003\ufff6\004\ufff6\005\ufff6\006\ufff6\007" +
    "\ufff6\010\ufff6\011\ufff6\012\ufff6\013\ufff6\001\002\000\004" +
    "\002\000\001\002\000\016\002\ufffe\003\013\004\012\007" +
    "\005\012\006\013\004\001\002\000\024\002\ufffc\003\ufffc" +
    "\004\ufffc\006\020\007\021\010\023\011\022\012\ufffc\013" +
    "\ufffc\001\002\000\012\004\012\007\005\012\006\013\004" +
    "\001\002\000\014\003\013\004\012\007\005\012\006\013" +
    "\004\001\002\000\004\002\015\001\002\000\004\002\001" +
    "\001\002\000\004\002\ufffd\001\002\000\014\005\024\006" +
    "\020\007\021\010\023\011\022\001\002\000\012\004\012" +
    "\007\005\012\006\013\004\001\002\000\012\004\012\007" +
    "\005\012\006\013\004\001\002\000\012\004\012\007\005" +
    "\012\006\013\004\001\002\000\012\004\012\007\005\012" +
    "\006\013\004\001\002\000\026\002\ufff4\003\ufff4\004\ufff4" +
    "\005\ufff4\006\ufff4\007\ufff4\010\ufff4\011\ufff4\012\ufff4\013" +
    "\ufff4\001\002\000\026\002\ufff8\003\ufff8\004\ufff8\005\ufff8" +
    "\006\ufff8\007\ufff8\010\ufff8\011\ufff8\012\ufff8\013\ufff8\001" +
    "\002\000\026\002\ufff7\003\ufff7\004\ufff7\005\ufff7\006\ufff7" +
    "\007\ufff7\010\ufff7\011\ufff7\012\ufff7\013\ufff7\001\002\000" +
    "\026\002\ufff9\003\ufff9\004\ufff9\005\ufff9\006\ufff9\007\ufff9" +
    "\010\023\011\022\012\ufff9\013\ufff9\001\002\000\026\002" +
    "\ufffa\003\ufffa\004\ufffa\005\ufffa\006\ufffa\007\ufffa\010\023" +
    "\011\022\012\ufffa\013\ufffa\001\002\000\004\002\uffff\001" +
    "\002\000\026\002\ufffb\003\ufffb\004\ufffb\005\ufffb\006\ufffb" +
    "\007\ufffb\010\ufffb\011\ufffb\012\ufffb\013\ufffb\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\030\000\012\002\013\003\006\004\007\005\010\001" +
    "\001\000\002\001\001\000\004\005\031\001\001\000\002" +
    "\001\001\000\002\001\001\000\010\003\030\004\007\005" +
    "\010\001\001\000\002\001\001\000\004\005\016\001\001" +
    "\000\010\003\015\004\007\005\010\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\005\027\001\001\000\004\005\026\001\001\000" +
    "\004\005\025\001\001\000\004\005\024\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$AnalizadorParser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$AnalizadorParser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$AnalizadorParser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



  private List<String> resultados = new ArrayList<>();

  //Metodo Recuperable ante algun Error Sintactico
  public void syntax_error(Symbol s){
        System.out.println("Errore Sintactico en la linea " + (s.left) +
        "en la Columna " + s.right + " , No se esperaba este componente:  " + s.value + ",");
  }

  //Metodo No Recuperable ante algun Error Sintactico
  public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception{
        System.out.println("Error Sintactico Irrecuperable en la linea: " + (s.left) +
        "en la Columna: " + s.right + " , Componente es: " + s.value + " no reconocido.");
  }

  public List<String> getResultados(){
     return resultados;
  }



/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$AnalizadorParser$actions {
  private final AnalizadorParser parser;

  /** Constructor */
  CUP$AnalizadorParser$actions(AnalizadorParser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$AnalizadorParser$do_action_part00000000(
    int                        CUP$AnalizadorParser$act_num,
    java_cup.runtime.lr_parser CUP$AnalizadorParser$parser,
    java.util.Stack            CUP$AnalizadorParser$stack,
    int                        CUP$AnalizadorParser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$AnalizadorParser$result;

      /* select the action based on the action number */
      switch (CUP$AnalizadorParser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= ini EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$AnalizadorParser$stack.elementAt(CUP$AnalizadorParser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$AnalizadorParser$stack.elementAt(CUP$AnalizadorParser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$AnalizadorParser$stack.elementAt(CUP$AnalizadorParser$top-1)).value;
		RESULT = start_val;
              CUP$AnalizadorParser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$AnalizadorParser$stack.elementAt(CUP$AnalizadorParser$top-1)), ((java_cup.runtime.Symbol)CUP$AnalizadorParser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$AnalizadorParser$parser.done_parsing();
          return CUP$AnalizadorParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // ini ::= instrucciones 
            {
              Object RESULT =null;

              CUP$AnalizadorParser$result = parser.getSymbolFactory().newSymbol("ini",0, ((java_cup.runtime.Symbol)CUP$AnalizadorParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalizadorParser$stack.peek()), RESULT);
            }
          return CUP$AnalizadorParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // instrucciones ::= instruccion instrucciones 
            {
              Object RESULT =null;

              CUP$AnalizadorParser$result = parser.getSymbolFactory().newSymbol("instrucciones",1, ((java_cup.runtime.Symbol)CUP$AnalizadorParser$stack.elementAt(CUP$AnalizadorParser$top-1)), ((java_cup.runtime.Symbol)CUP$AnalizadorParser$stack.peek()), RESULT);
            }
          return CUP$AnalizadorParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // instrucciones ::= instruccion 
            {
              Object RESULT =null;

              CUP$AnalizadorParser$result = parser.getSymbolFactory().newSymbol("instrucciones",1, ((java_cup.runtime.Symbol)CUP$AnalizadorParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalizadorParser$stack.peek()), RESULT);
            }
          return CUP$AnalizadorParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // instrucciones ::= error instrucciones 
            {
              Object RESULT =null;

              CUP$AnalizadorParser$result = parser.getSymbolFactory().newSymbol("instrucciones",1, ((java_cup.runtime.Symbol)CUP$AnalizadorParser$stack.elementAt(CUP$AnalizadorParser$top-1)), ((java_cup.runtime.Symbol)CUP$AnalizadorParser$stack.peek()), RESULT);
            }
          return CUP$AnalizadorParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // instruccion ::= expresion 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$AnalizadorParser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$AnalizadorParser$stack.peek()).right;
		Double a = (Double)((java_cup.runtime.Symbol) CUP$AnalizadorParser$stack.peek()).value;
		System.out.println("El valor de la expresión es: " + a);
                                         resultados.add(a.toString());
                                        
              CUP$AnalizadorParser$result = parser.getSymbolFactory().newSymbol("instruccion",2, ((java_cup.runtime.Symbol)CUP$AnalizadorParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalizadorParser$stack.peek()), RESULT);
            }
          return CUP$AnalizadorParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // expresion ::= MENOS expresion 
            {
              Double RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$AnalizadorParser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$AnalizadorParser$stack.peek()).right;
		Double a = (Double)((java_cup.runtime.Symbol) CUP$AnalizadorParser$stack.peek()).value;
		 RESULT = a*-1; 
              CUP$AnalizadorParser$result = parser.getSymbolFactory().newSymbol("expresion",3, ((java_cup.runtime.Symbol)CUP$AnalizadorParser$stack.elementAt(CUP$AnalizadorParser$top-1)), ((java_cup.runtime.Symbol)CUP$AnalizadorParser$stack.peek()), RESULT);
            }
          return CUP$AnalizadorParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // expresion ::= expresion MAS expresion 
            {
              Double RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$AnalizadorParser$stack.elementAt(CUP$AnalizadorParser$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$AnalizadorParser$stack.elementAt(CUP$AnalizadorParser$top-2)).right;
		Double a = (Double)((java_cup.runtime.Symbol) CUP$AnalizadorParser$stack.elementAt(CUP$AnalizadorParser$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$AnalizadorParser$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$AnalizadorParser$stack.peek()).right;
		Double b = (Double)((java_cup.runtime.Symbol) CUP$AnalizadorParser$stack.peek()).value;
		 RESULT = a+b; 
              CUP$AnalizadorParser$result = parser.getSymbolFactory().newSymbol("expresion",3, ((java_cup.runtime.Symbol)CUP$AnalizadorParser$stack.elementAt(CUP$AnalizadorParser$top-2)), ((java_cup.runtime.Symbol)CUP$AnalizadorParser$stack.peek()), RESULT);
            }
          return CUP$AnalizadorParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // expresion ::= expresion MENOS expresion 
            {
              Double RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$AnalizadorParser$stack.elementAt(CUP$AnalizadorParser$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$AnalizadorParser$stack.elementAt(CUP$AnalizadorParser$top-2)).right;
		Double a = (Double)((java_cup.runtime.Symbol) CUP$AnalizadorParser$stack.elementAt(CUP$AnalizadorParser$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$AnalizadorParser$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$AnalizadorParser$stack.peek()).right;
		Double b = (Double)((java_cup.runtime.Symbol) CUP$AnalizadorParser$stack.peek()).value;
		 RESULT = a-b; 
              CUP$AnalizadorParser$result = parser.getSymbolFactory().newSymbol("expresion",3, ((java_cup.runtime.Symbol)CUP$AnalizadorParser$stack.elementAt(CUP$AnalizadorParser$top-2)), ((java_cup.runtime.Symbol)CUP$AnalizadorParser$stack.peek()), RESULT);
            }
          return CUP$AnalizadorParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // expresion ::= expresion POR expresion 
            {
              Double RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$AnalizadorParser$stack.elementAt(CUP$AnalizadorParser$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$AnalizadorParser$stack.elementAt(CUP$AnalizadorParser$top-2)).right;
		Double a = (Double)((java_cup.runtime.Symbol) CUP$AnalizadorParser$stack.elementAt(CUP$AnalizadorParser$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$AnalizadorParser$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$AnalizadorParser$stack.peek()).right;
		Double b = (Double)((java_cup.runtime.Symbol) CUP$AnalizadorParser$stack.peek()).value;
		 RESULT = a*b; 
              CUP$AnalizadorParser$result = parser.getSymbolFactory().newSymbol("expresion",3, ((java_cup.runtime.Symbol)CUP$AnalizadorParser$stack.elementAt(CUP$AnalizadorParser$top-2)), ((java_cup.runtime.Symbol)CUP$AnalizadorParser$stack.peek()), RESULT);
            }
          return CUP$AnalizadorParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // expresion ::= expresion DIVISION expresion 
            {
              Double RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$AnalizadorParser$stack.elementAt(CUP$AnalizadorParser$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$AnalizadorParser$stack.elementAt(CUP$AnalizadorParser$top-2)).right;
		Double a = (Double)((java_cup.runtime.Symbol) CUP$AnalizadorParser$stack.elementAt(CUP$AnalizadorParser$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$AnalizadorParser$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$AnalizadorParser$stack.peek()).right;
		Double b = (Double)((java_cup.runtime.Symbol) CUP$AnalizadorParser$stack.peek()).value;
		 RESULT = a/b; 
              CUP$AnalizadorParser$result = parser.getSymbolFactory().newSymbol("expresion",3, ((java_cup.runtime.Symbol)CUP$AnalizadorParser$stack.elementAt(CUP$AnalizadorParser$top-2)), ((java_cup.runtime.Symbol)CUP$AnalizadorParser$stack.peek()), RESULT);
            }
          return CUP$AnalizadorParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // expresion ::= ENTERO 
            {
              Double RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$AnalizadorParser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$AnalizadorParser$stack.peek()).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$AnalizadorParser$stack.peek()).value;
		 RESULT = new Double(a); 
              CUP$AnalizadorParser$result = parser.getSymbolFactory().newSymbol("expresion",3, ((java_cup.runtime.Symbol)CUP$AnalizadorParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalizadorParser$stack.peek()), RESULT);
            }
          return CUP$AnalizadorParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // expresion ::= DECIMAL 
            {
              Double RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$AnalizadorParser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$AnalizadorParser$stack.peek()).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$AnalizadorParser$stack.peek()).value;
		 RESULT = new Double(a); 
              CUP$AnalizadorParser$result = parser.getSymbolFactory().newSymbol("expresion",3, ((java_cup.runtime.Symbol)CUP$AnalizadorParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalizadorParser$stack.peek()), RESULT);
            }
          return CUP$AnalizadorParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // expresion ::= PAR1 expresion PAR2 
            {
              Double RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$AnalizadorParser$stack.elementAt(CUP$AnalizadorParser$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$AnalizadorParser$stack.elementAt(CUP$AnalizadorParser$top-1)).right;
		Double a = (Double)((java_cup.runtime.Symbol) CUP$AnalizadorParser$stack.elementAt(CUP$AnalizadorParser$top-1)).value;
		 RESULT = a; 
              CUP$AnalizadorParser$result = parser.getSymbolFactory().newSymbol("expresion",3, ((java_cup.runtime.Symbol)CUP$AnalizadorParser$stack.elementAt(CUP$AnalizadorParser$top-2)), ((java_cup.runtime.Symbol)CUP$AnalizadorParser$stack.peek()), RESULT);
            }
          return CUP$AnalizadorParser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$AnalizadorParser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$AnalizadorParser$do_action(
    int                        CUP$AnalizadorParser$act_num,
    java_cup.runtime.lr_parser CUP$AnalizadorParser$parser,
    java.util.Stack            CUP$AnalizadorParser$stack,
    int                        CUP$AnalizadorParser$top)
    throws java.lang.Exception
    {
              return CUP$AnalizadorParser$do_action_part00000000(
                               CUP$AnalizadorParser$act_num,
                               CUP$AnalizadorParser$parser,
                               CUP$AnalizadorParser$stack,
                               CUP$AnalizadorParser$top);
    }
}

}
