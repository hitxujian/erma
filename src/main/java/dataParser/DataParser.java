
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Wed Oct 10 16:56:26 EDT 2012
//----------------------------------------------------

package dataParser;

import java_cup.runtime.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import data.*;
import utils.*;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Wed Oct 10 16:56:26 EDT 2012
  */
public class DataParser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public DataParser() {super();}

  /** Constructor which sets the default scanner. */
  public DataParser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public DataParser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\026\000\002\002\003\000\002\002\004\000\002\017" +
    "\003\000\002\017\005\000\002\017\006\000\002\017\005" +
    "\000\002\017\007\000\002\017\010\000\002\003\002\000" +
    "\002\003\004\000\002\021\002\000\002\012\007\000\002" +
    "\004\002\000\002\004\004\000\002\015\007\000\002\015" +
    "\013\000\002\015\011\000\002\015\015\000\002\015\006" +
    "\000\002\013\002\000\002\013\004\000\002\014\005" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\060\000\006\002\ufff9\022\006\001\002\000\006\002" +
    "\ufff9\022\006\001\002\000\004\002\061\001\002\000\006" +
    "\006\ufff7\026\ufff7\001\002\000\004\002\001\001\002\000" +
    "\006\006\uffee\026\012\001\002\000\004\006\031\001\002" +
    "\000\004\026\016\001\002\000\006\006\uffee\026\012\001" +
    "\002\000\004\006\uffed\001\002\000\004\014\030\001\002" +
    "\000\016\004\uffff\012\017\014\uffff\016\uffff\020\uffff\023" +
    "\020\001\002\000\004\026\016\001\002\000\004\026\021" +
    "\001\002\000\016\004\ufffe\012\022\014\ufffe\016\ufffe\020" +
    "\ufffe\021\023\001\002\000\004\026\016\001\002\000\014" +
    "\004\ufffd\012\024\014\ufffd\016\ufffd\020\ufffd\001\002\000" +
    "\004\026\016\001\002\000\012\004\ufffa\014\ufffa\016\ufffa" +
    "\020\ufffa\001\002\000\012\004\ufffb\014\ufffb\016\ufffb\020" +
    "\ufffb\001\002\000\012\004\ufffc\014\ufffc\016\ufffc\020\ufffc" +
    "\001\002\000\006\006\uffec\026\uffec\001\002\000\010\002" +
    "\ufff5\022\ufff5\026\035\001\002\000\006\002\ufff6\022\ufff6" +
    "\001\002\000\010\002\ufff5\022\ufff5\026\035\001\002\000" +
    "\004\004\055\001\002\000\012\004\uffff\012\017\015\036" +
    "\023\020\001\002\000\004\026\016\001\002\000\004\016" +
    "\040\001\002\000\010\011\043\014\041\023\042\001\002" +
    "\000\010\002\ufff3\022\ufff3\026\ufff3\001\002\000\004\024" +
    "\053\001\002\000\004\017\044\001\002\000\004\026\016" +
    "\001\002\000\004\020\046\001\002\000\006\014\047\023" +
    "\050\001\002\000\010\002\ufff2\022\ufff2\026\ufff2\001\002" +
    "\000\004\024\051\001\002\000\004\014\052\001\002\000" +
    "\010\002\ufff0\022\ufff0\026\ufff0\001\002\000\004\014\054" +
    "\001\002\000\010\002\ufff1\022\ufff1\026\ufff1\001\002\000" +
    "\004\026\016\001\002\000\004\014\057\001\002\000\010" +
    "\002\uffef\022\uffef\026\uffef\001\002\000\006\002\ufff4\022" +
    "\ufff4\001\002\000\004\002\000\001\002\000\004\002\ufff8" +
    "\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\060\000\010\002\004\003\006\012\003\001\001\000" +
    "\006\003\061\012\003\001\001\000\002\001\001\000\004" +
    "\021\007\001\001\000\002\001\001\000\006\013\010\014" +
    "\012\001\001\000\002\001\001\000\004\017\014\001\001" +
    "\000\006\013\013\014\012\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\017\026\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\017\025\001" +
    "\001\000\002\001\001\000\004\017\024\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\010\004\031\015\032\017\033\001\001\000\002" +
    "\001\001\000\010\004\057\015\032\017\033\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\017\036\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\017\044\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\017\055\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$DataParser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$DataParser$actions(this);
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
    return action_obj.CUP$DataParser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



	public static void main(String args[]) throws Exception {
		SymbolFactory sf = new DefaultSymbolFactory();
		examples = new ArrayList<DataSample>();
		//curExample = new DataSample();
		if (args.length==0) new DataParser(new DataFileScanner(System.in,sf),sf).parse();
		else new DataParser(new DataFileScanner(new java.io.FileInputStream(args[0]),sf),sf).parse();
	}
	public DataParser(DataFileScanner scan, FeatureFile ff) {
      super(scan);
	  features = ff;
	}
 
	public static ArrayList<DataSample> examples;
	public static DataSample curExample;
	public static FeatureFile features;
	public static DataParser createParser(String filename, FeatureFile ff) throws Exception {
		SymbolFactory sf = new DefaultSymbolFactory();
		examples = new ArrayList<DataSample>();
		//curExample = new DataSample();
		return new DataParser(new DataFileScanner(new java.io.FileInputStream(filename),sf),ff);
	}
	
	public ArrayList<DataSample> parseFile() throws Exception {
		System.out.println("Debug parsing");
		parse();
		return examples;
	}


}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$DataParser$actions {
  private final DataParser parser;

  /** Constructor */
  CUP$DataParser$actions(DataParser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$DataParser$do_action(
    int                        CUP$DataParser$act_num,
    java_cup.runtime.lr_parser CUP$DataParser$parser,
    java.util.Stack            CUP$DataParser$stack,
    int                        CUP$DataParser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$DataParser$result;

      /* select the action based on the action number */
      switch (CUP$DataParser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // variable_declaration ::= IDENT ident_set SEMI 
            {
              Object RESULT =null;
		int in1left = ((java_cup.runtime.Symbol)CUP$DataParser$stack.elementAt(CUP$DataParser$top-2)).left;
		int in1right = ((java_cup.runtime.Symbol)CUP$DataParser$stack.elementAt(CUP$DataParser$top-2)).right;
		String in1 = (String)((java_cup.runtime.Symbol) CUP$DataParser$stack.elementAt(CUP$DataParser$top-2)).value;
		int isleft = ((java_cup.runtime.Symbol)CUP$DataParser$stack.elementAt(CUP$DataParser$top-1)).left;
		int isright = ((java_cup.runtime.Symbol)CUP$DataParser$stack.elementAt(CUP$DataParser$top-1)).right;
		LinkedHashMap<String,String> is = (LinkedHashMap<String,String>)((java_cup.runtime.Symbol) CUP$DataParser$stack.elementAt(CUP$DataParser$top-1)).value;
		 //System.out.println("Adding variable(s) of type "+in1);
							  LinkedHashMap<String,String> variables = is;
							  //System.out.println(variables.size()+" variables");
							  Type t = parser.features.getType(in1);
							  for(String k:variables.keySet()){ 
								//System.out.println(k);
								parser.curExample.addVariable(k,t,variables.get(k));  
								//cout << "cur_example: " << *(parser.curExample) << endl;
							  } 
								  
							
              CUP$DataParser$result = parser.getSymbolFactory().newSymbol("variable_declaration",10, ((java_cup.runtime.Symbol)CUP$DataParser$stack.elementAt(CUP$DataParser$top-2)), ((java_cup.runtime.Symbol)CUP$DataParser$stack.peek()), RESULT);
            }
          return CUP$DataParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // variable_d ::= variable_declaration variable_d 
            {
              Object RESULT =null;
		  
              CUP$DataParser$result = parser.getSymbolFactory().newSymbol("variable_d",9, ((java_cup.runtime.Symbol)CUP$DataParser$stack.elementAt(CUP$DataParser$top-1)), ((java_cup.runtime.Symbol)CUP$DataParser$stack.peek()), RESULT);
            }
          return CUP$DataParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // variable_d ::= 
            {
              Object RESULT =null;
		 
              CUP$DataParser$result = parser.getSymbolFactory().newSymbol("variable_d",9, ((java_cup.runtime.Symbol)CUP$DataParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$DataParser$stack.peek()), RESULT);
            }
          return CUP$DataParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // feature ::= ident_set ARROW ident_set SEMI 
            {
              Object RESULT =null;
		int is1left = ((java_cup.runtime.Symbol)CUP$DataParser$stack.elementAt(CUP$DataParser$top-3)).left;
		int is1right = ((java_cup.runtime.Symbol)CUP$DataParser$stack.elementAt(CUP$DataParser$top-3)).right;
		LinkedHashMap<String,String> is1 = (LinkedHashMap<String,String>)((java_cup.runtime.Symbol) CUP$DataParser$stack.elementAt(CUP$DataParser$top-3)).value;
		int is2left = ((java_cup.runtime.Symbol)CUP$DataParser$stack.elementAt(CUP$DataParser$top-1)).left;
		int is2right = ((java_cup.runtime.Symbol)CUP$DataParser$stack.elementAt(CUP$DataParser$top-1)).right;
		LinkedHashMap<String,String> is2 = (LinkedHashMap<String,String>)((java_cup.runtime.Symbol) CUP$DataParser$stack.elementAt(CUP$DataParser$top-1)).value;
		 //System.out.println("Adding feature ");
												LinkedHashMap<String,String> variableNames = is1; 
												LinkedHashMap<String,String> featureNames = is2;
												for(String featureName : featureNames.keySet())
													parser.curExample.addFeatureInst(variableNames,null,featureName,1.0); 
              CUP$DataParser$result = parser.getSymbolFactory().newSymbol("feature",11, ((java_cup.runtime.Symbol)CUP$DataParser$stack.elementAt(CUP$DataParser$top-3)), ((java_cup.runtime.Symbol)CUP$DataParser$stack.peek()), RESULT);
            }
          return CUP$DataParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // feature ::= IDENT LB ident_set RB ASSIGN LSB ident_set RSB EQL DOUB SEMI 
            {
              Object RESULT =null;
		int inleft = ((java_cup.runtime.Symbol)CUP$DataParser$stack.elementAt(CUP$DataParser$top-10)).left;
		int inright = ((java_cup.runtime.Symbol)CUP$DataParser$stack.elementAt(CUP$DataParser$top-10)).right;
		String in = (String)((java_cup.runtime.Symbol) CUP$DataParser$stack.elementAt(CUP$DataParser$top-10)).value;
		int isleft = ((java_cup.runtime.Symbol)CUP$DataParser$stack.elementAt(CUP$DataParser$top-8)).left;
		int isright = ((java_cup.runtime.Symbol)CUP$DataParser$stack.elementAt(CUP$DataParser$top-8)).right;
		LinkedHashMap<String,String> is = (LinkedHashMap<String,String>)((java_cup.runtime.Symbol) CUP$DataParser$stack.elementAt(CUP$DataParser$top-8)).value;
		int vsleft = ((java_cup.runtime.Symbol)CUP$DataParser$stack.elementAt(CUP$DataParser$top-4)).left;
		int vsright = ((java_cup.runtime.Symbol)CUP$DataParser$stack.elementAt(CUP$DataParser$top-4)).right;
		LinkedHashMap<String,String> vs = (LinkedHashMap<String,String>)((java_cup.runtime.Symbol) CUP$DataParser$stack.elementAt(CUP$DataParser$top-4)).value;
		int wleft = ((java_cup.runtime.Symbol)CUP$DataParser$stack.elementAt(CUP$DataParser$top-1)).left;
		int wright = ((java_cup.runtime.Symbol)CUP$DataParser$stack.elementAt(CUP$DataParser$top-1)).right;
		Double w = (Double)((java_cup.runtime.Symbol) CUP$DataParser$stack.elementAt(CUP$DataParser$top-1)).value;
		 //System.out.println("Adding feature ");
												LinkedHashMap<String,String> variable_names = is;
												LinkedHashMap<String,String> variable_values = vs;
												String feature_name = in;
												//for(String k:variable_names.keySet()){ 
												//	System.out.println(k);
												//} 
												parser.curExample.addFeatureInst(variable_names,variable_values,feature_name,w); 
              CUP$DataParser$result = parser.getSymbolFactory().newSymbol("feature",11, ((java_cup.runtime.Symbol)CUP$DataParser$stack.elementAt(CUP$DataParser$top-10)), ((java_cup.runtime.Symbol)CUP$DataParser$stack.peek()), RESULT);
            }
          return CUP$DataParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // feature ::= IDENT LB ident_set RB EQL DOUB SEMI 
            {
              Object RESULT =null;
		int inleft = ((java_cup.runtime.Symbol)CUP$DataParser$stack.elementAt(CUP$DataParser$top-6)).left;
		int inright = ((java_cup.runtime.Symbol)CUP$DataParser$stack.elementAt(CUP$DataParser$top-6)).right;
		String in = (String)((java_cup.runtime.Symbol) CUP$DataParser$stack.elementAt(CUP$DataParser$top-6)).value;
		int isleft = ((java_cup.runtime.Symbol)CUP$DataParser$stack.elementAt(CUP$DataParser$top-4)).left;
		int isright = ((java_cup.runtime.Symbol)CUP$DataParser$stack.elementAt(CUP$DataParser$top-4)).right;
		LinkedHashMap<String,String> is = (LinkedHashMap<String,String>)((java_cup.runtime.Symbol) CUP$DataParser$stack.elementAt(CUP$DataParser$top-4)).value;
		int wleft = ((java_cup.runtime.Symbol)CUP$DataParser$stack.elementAt(CUP$DataParser$top-1)).left;
		int wright = ((java_cup.runtime.Symbol)CUP$DataParser$stack.elementAt(CUP$DataParser$top-1)).right;
		Double w = (Double)((java_cup.runtime.Symbol) CUP$DataParser$stack.elementAt(CUP$DataParser$top-1)).value;
		 	//System.out.println("Adding feature "+in);
												LinkedHashMap<String,String> variable_names = is;
												String feature_name = in;
												//for(String k:variable_names.keySet()){ 
												//	System.out.println(k);
												//} 
												parser.curExample.addFeatureInst(variable_names,null,feature_name,w);
											
              CUP$DataParser$result = parser.getSymbolFactory().newSymbol("feature",11, ((java_cup.runtime.Symbol)CUP$DataParser$stack.elementAt(CUP$DataParser$top-6)), ((java_cup.runtime.Symbol)CUP$DataParser$stack.peek()), RESULT);
            }
          return CUP$DataParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // feature ::= IDENT LB ident_set RB ASSIGN LSB ident_set RSB SEMI 
            {
              Object RESULT =null;
		int inleft = ((java_cup.runtime.Symbol)CUP$DataParser$stack.elementAt(CUP$DataParser$top-8)).left;
		int inright = ((java_cup.runtime.Symbol)CUP$DataParser$stack.elementAt(CUP$DataParser$top-8)).right;
		String in = (String)((java_cup.runtime.Symbol) CUP$DataParser$stack.elementAt(CUP$DataParser$top-8)).value;
		int isleft = ((java_cup.runtime.Symbol)CUP$DataParser$stack.elementAt(CUP$DataParser$top-6)).left;
		int isright = ((java_cup.runtime.Symbol)CUP$DataParser$stack.elementAt(CUP$DataParser$top-6)).right;
		LinkedHashMap<String,String> is = (LinkedHashMap<String,String>)((java_cup.runtime.Symbol) CUP$DataParser$stack.elementAt(CUP$DataParser$top-6)).value;
		int vsleft = ((java_cup.runtime.Symbol)CUP$DataParser$stack.elementAt(CUP$DataParser$top-2)).left;
		int vsright = ((java_cup.runtime.Symbol)CUP$DataParser$stack.elementAt(CUP$DataParser$top-2)).right;
		LinkedHashMap<String,String> vs = (LinkedHashMap<String,String>)((java_cup.runtime.Symbol) CUP$DataParser$stack.elementAt(CUP$DataParser$top-2)).value;
		 //System.out.println("Adding feature ");
												LinkedHashMap<String,String> variable_names = is;
												LinkedHashMap<String,String> variable_values = vs;
												String feature_name = in;
												//for(String k:variable_names.keySet()){ 
												//	System.out.println(k);
												//} 
												parser.curExample.addFeatureInst(variable_names,variable_values,feature_name,1.0); 
              CUP$DataParser$result = parser.getSymbolFactory().newSymbol("feature",11, ((java_cup.runtime.Symbol)CUP$DataParser$stack.elementAt(CUP$DataParser$top-8)), ((java_cup.runtime.Symbol)CUP$DataParser$stack.peek()), RESULT);
            }
          return CUP$DataParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // feature ::= IDENT LB ident_set RB SEMI 
            {
              Object RESULT =null;
		int inleft = ((java_cup.runtime.Symbol)CUP$DataParser$stack.elementAt(CUP$DataParser$top-4)).left;
		int inright = ((java_cup.runtime.Symbol)CUP$DataParser$stack.elementAt(CUP$DataParser$top-4)).right;
		String in = (String)((java_cup.runtime.Symbol) CUP$DataParser$stack.elementAt(CUP$DataParser$top-4)).value;
		int isleft = ((java_cup.runtime.Symbol)CUP$DataParser$stack.elementAt(CUP$DataParser$top-2)).left;
		int isright = ((java_cup.runtime.Symbol)CUP$DataParser$stack.elementAt(CUP$DataParser$top-2)).right;
		LinkedHashMap<String,String> is = (LinkedHashMap<String,String>)((java_cup.runtime.Symbol) CUP$DataParser$stack.elementAt(CUP$DataParser$top-2)).value;
		 	//System.out.println("Adding feature "+in);
												LinkedHashMap<String,String> variable_names = is;
												String feature_name = in;
												//for(String k:variable_names.keySet()){ 
												//	System.out.println(k);
												//} 
												parser.curExample.addFeatureInst(variable_names,null,feature_name,1.0);
											
              CUP$DataParser$result = parser.getSymbolFactory().newSymbol("feature",11, ((java_cup.runtime.Symbol)CUP$DataParser$stack.elementAt(CUP$DataParser$top-4)), ((java_cup.runtime.Symbol)CUP$DataParser$stack.peek()), RESULT);
            }
          return CUP$DataParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // features_d ::= feature features_d 
            {
              Object RESULT =null;
		  
              CUP$DataParser$result = parser.getSymbolFactory().newSymbol("features_d",2, ((java_cup.runtime.Symbol)CUP$DataParser$stack.elementAt(CUP$DataParser$top-1)), ((java_cup.runtime.Symbol)CUP$DataParser$stack.peek()), RESULT);
            }
          return CUP$DataParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // features_d ::= 
            {
              Object RESULT =null;
		 
              CUP$DataParser$result = parser.getSymbolFactory().newSymbol("features_d",2, ((java_cup.runtime.Symbol)CUP$DataParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$DataParser$stack.peek()), RESULT);
            }
          return CUP$DataParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // example ::= EXAMPLE NT$0 variable_d FEATURES features_d 
            {
              Object RESULT =null;
              // propagate RESULT from NT$0
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$DataParser$stack.elementAt(CUP$DataParser$top-3)).value;
		 parser.examples.add(parser.curExample); 
              CUP$DataParser$result = parser.getSymbolFactory().newSymbol("example",8, ((java_cup.runtime.Symbol)CUP$DataParser$stack.elementAt(CUP$DataParser$top-4)), ((java_cup.runtime.Symbol)CUP$DataParser$stack.peek()), RESULT);
            }
          return CUP$DataParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // NT$0 ::= 
            {
              Object RESULT =null;
 parser.curExample = new DataSample(parser.features);
              CUP$DataParser$result = parser.getSymbolFactory().newSymbol("NT$0",15, ((java_cup.runtime.Symbol)CUP$DataParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$DataParser$stack.peek()), RESULT);
            }
          return CUP$DataParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // example_list ::= example example_list 
            {
              Object RESULT =null;
		  
              CUP$DataParser$result = parser.getSymbolFactory().newSymbol("example_list",1, ((java_cup.runtime.Symbol)CUP$DataParser$stack.elementAt(CUP$DataParser$top-1)), ((java_cup.runtime.Symbol)CUP$DataParser$stack.peek()), RESULT);
            }
          return CUP$DataParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // example_list ::= 
            {
              Object RESULT =null;
		 
              CUP$DataParser$result = parser.getSymbolFactory().newSymbol("example_list",1, ((java_cup.runtime.Symbol)CUP$DataParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$DataParser$stack.peek()), RESULT);
            }
          return CUP$DataParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // ident_set ::= IDENT EQL IDENT INPUT COMMA ident_set 
            {
              LinkedHashMap<String,String> RESULT =null;
		int in1left = ((java_cup.runtime.Symbol)CUP$DataParser$stack.elementAt(CUP$DataParser$top-5)).left;
		int in1right = ((java_cup.runtime.Symbol)CUP$DataParser$stack.elementAt(CUP$DataParser$top-5)).right;
		String in1 = (String)((java_cup.runtime.Symbol) CUP$DataParser$stack.elementAt(CUP$DataParser$top-5)).value;
		int in2left = ((java_cup.runtime.Symbol)CUP$DataParser$stack.elementAt(CUP$DataParser$top-3)).left;
		int in2right = ((java_cup.runtime.Symbol)CUP$DataParser$stack.elementAt(CUP$DataParser$top-3)).right;
		String in2 = (String)((java_cup.runtime.Symbol) CUP$DataParser$stack.elementAt(CUP$DataParser$top-3)).value;
		int isleft = ((java_cup.runtime.Symbol)CUP$DataParser$stack.peek()).left;
		int isright = ((java_cup.runtime.Symbol)CUP$DataParser$stack.peek()).right;
		LinkedHashMap<String,String> is = (LinkedHashMap<String,String>)((java_cup.runtime.Symbol) CUP$DataParser$stack.peek()).value;
		 is.put(in1,"*"+in2); RESULT=is; 
              CUP$DataParser$result = parser.getSymbolFactory().newSymbol("ident_set",13, ((java_cup.runtime.Symbol)CUP$DataParser$stack.elementAt(CUP$DataParser$top-5)), ((java_cup.runtime.Symbol)CUP$DataParser$stack.peek()), RESULT);
            }
          return CUP$DataParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // ident_set ::= IDENT EQL IDENT COMMA ident_set 
            {
              LinkedHashMap<String,String> RESULT =null;
		int in1left = ((java_cup.runtime.Symbol)CUP$DataParser$stack.elementAt(CUP$DataParser$top-4)).left;
		int in1right = ((java_cup.runtime.Symbol)CUP$DataParser$stack.elementAt(CUP$DataParser$top-4)).right;
		String in1 = (String)((java_cup.runtime.Symbol) CUP$DataParser$stack.elementAt(CUP$DataParser$top-4)).value;
		int in2left = ((java_cup.runtime.Symbol)CUP$DataParser$stack.elementAt(CUP$DataParser$top-2)).left;
		int in2right = ((java_cup.runtime.Symbol)CUP$DataParser$stack.elementAt(CUP$DataParser$top-2)).right;
		String in2 = (String)((java_cup.runtime.Symbol) CUP$DataParser$stack.elementAt(CUP$DataParser$top-2)).value;
		int isleft = ((java_cup.runtime.Symbol)CUP$DataParser$stack.peek()).left;
		int isright = ((java_cup.runtime.Symbol)CUP$DataParser$stack.peek()).right;
		LinkedHashMap<String,String> is = (LinkedHashMap<String,String>)((java_cup.runtime.Symbol) CUP$DataParser$stack.peek()).value;
		 is.put(in1,in2); RESULT=is; 
              CUP$DataParser$result = parser.getSymbolFactory().newSymbol("ident_set",13, ((java_cup.runtime.Symbol)CUP$DataParser$stack.elementAt(CUP$DataParser$top-4)), ((java_cup.runtime.Symbol)CUP$DataParser$stack.peek()), RESULT);
            }
          return CUP$DataParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // ident_set ::= IDENT COMMA ident_set 
            {
              LinkedHashMap<String,String> RESULT =null;
		int inleft = ((java_cup.runtime.Symbol)CUP$DataParser$stack.elementAt(CUP$DataParser$top-2)).left;
		int inright = ((java_cup.runtime.Symbol)CUP$DataParser$stack.elementAt(CUP$DataParser$top-2)).right;
		String in = (String)((java_cup.runtime.Symbol) CUP$DataParser$stack.elementAt(CUP$DataParser$top-2)).value;
		int isleft = ((java_cup.runtime.Symbol)CUP$DataParser$stack.peek()).left;
		int isright = ((java_cup.runtime.Symbol)CUP$DataParser$stack.peek()).right;
		LinkedHashMap<String,String> is = (LinkedHashMap<String,String>)((java_cup.runtime.Symbol) CUP$DataParser$stack.peek()).value;
		 is.put(in,"*"); RESULT=is; 
              CUP$DataParser$result = parser.getSymbolFactory().newSymbol("ident_set",13, ((java_cup.runtime.Symbol)CUP$DataParser$stack.elementAt(CUP$DataParser$top-2)), ((java_cup.runtime.Symbol)CUP$DataParser$stack.peek()), RESULT);
            }
          return CUP$DataParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // ident_set ::= IDENT EQL IDENT INPUT 
            {
              LinkedHashMap<String,String> RESULT =null;
		int in1left = ((java_cup.runtime.Symbol)CUP$DataParser$stack.elementAt(CUP$DataParser$top-3)).left;
		int in1right = ((java_cup.runtime.Symbol)CUP$DataParser$stack.elementAt(CUP$DataParser$top-3)).right;
		String in1 = (String)((java_cup.runtime.Symbol) CUP$DataParser$stack.elementAt(CUP$DataParser$top-3)).value;
		int in2left = ((java_cup.runtime.Symbol)CUP$DataParser$stack.elementAt(CUP$DataParser$top-1)).left;
		int in2right = ((java_cup.runtime.Symbol)CUP$DataParser$stack.elementAt(CUP$DataParser$top-1)).right;
		String in2 = (String)((java_cup.runtime.Symbol) CUP$DataParser$stack.elementAt(CUP$DataParser$top-1)).value;
		 RESULT = new LinkedHashMap<String,String>(); RESULT.put(in1,"*"+in2); 
              CUP$DataParser$result = parser.getSymbolFactory().newSymbol("ident_set",13, ((java_cup.runtime.Symbol)CUP$DataParser$stack.elementAt(CUP$DataParser$top-3)), ((java_cup.runtime.Symbol)CUP$DataParser$stack.peek()), RESULT);
            }
          return CUP$DataParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // ident_set ::= IDENT EQL IDENT 
            {
              LinkedHashMap<String,String> RESULT =null;
		int in1left = ((java_cup.runtime.Symbol)CUP$DataParser$stack.elementAt(CUP$DataParser$top-2)).left;
		int in1right = ((java_cup.runtime.Symbol)CUP$DataParser$stack.elementAt(CUP$DataParser$top-2)).right;
		String in1 = (String)((java_cup.runtime.Symbol) CUP$DataParser$stack.elementAt(CUP$DataParser$top-2)).value;
		int in2left = ((java_cup.runtime.Symbol)CUP$DataParser$stack.peek()).left;
		int in2right = ((java_cup.runtime.Symbol)CUP$DataParser$stack.peek()).right;
		String in2 = (String)((java_cup.runtime.Symbol) CUP$DataParser$stack.peek()).value;
		 RESULT = new LinkedHashMap<String,String>(); RESULT.put(in1,in2); 
              CUP$DataParser$result = parser.getSymbolFactory().newSymbol("ident_set",13, ((java_cup.runtime.Symbol)CUP$DataParser$stack.elementAt(CUP$DataParser$top-2)), ((java_cup.runtime.Symbol)CUP$DataParser$stack.peek()), RESULT);
            }
          return CUP$DataParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // ident_set ::= IDENT 
            {
              LinkedHashMap<String,String> RESULT =null;
		int inleft = ((java_cup.runtime.Symbol)CUP$DataParser$stack.peek()).left;
		int inright = ((java_cup.runtime.Symbol)CUP$DataParser$stack.peek()).right;
		String in = (String)((java_cup.runtime.Symbol) CUP$DataParser$stack.peek()).value;
		 RESULT = new LinkedHashMap<String,String>(); RESULT.put(in,"*"); 
              CUP$DataParser$result = parser.getSymbolFactory().newSymbol("ident_set",13, ((java_cup.runtime.Symbol)CUP$DataParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$DataParser$stack.peek()), RESULT);
            }
          return CUP$DataParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= program EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$DataParser$stack.elementAt(CUP$DataParser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$DataParser$stack.elementAt(CUP$DataParser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$DataParser$stack.elementAt(CUP$DataParser$top-1)).value;
		RESULT = start_val;
              CUP$DataParser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$DataParser$stack.elementAt(CUP$DataParser$top-1)), ((java_cup.runtime.Symbol)CUP$DataParser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$DataParser$parser.done_parsing();
          return CUP$DataParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // program ::= example_list 
            {
              Object RESULT =null;
		 
              CUP$DataParser$result = parser.getSymbolFactory().newSymbol("program",0, ((java_cup.runtime.Symbol)CUP$DataParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$DataParser$stack.peek()), RESULT);
            }
          return CUP$DataParser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}
