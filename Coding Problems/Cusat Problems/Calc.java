import java.io.*;
import java.util.Scanner;
import java.util.Formatter;
import java.util.*;

class Calc{
	enum TokVal{
		NAME, NUM, END, PLUS, MINUS, MULT, DIV, POW, FACT, PRINT, ASSIGN, LP, RP;
	};

	static TokVal CurTok = TokVal.PRINT;
	static double number, e = 0.0;
	static int t = 1, i = 0, j = 0;
	static byte ch;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PushbackInputStream f = new PushbackInputStream(System.in);
	static Scanner sc = new Scanner(f);

	public static void Token(TokVal xc) throws IOException{
		//Scanner mynput = new Scanner(System.in);
		
		switch(xc){
			case LP : System.out.println(" LP "); break;
			case PRINT : System.out.println(" PRINT "); break;
			case MULT : System.out.println(" MULT "); break;
			case DIV : System.out.println(" DIV "); break;
			case PLUS : System.out.println(" PLUS "); break;
			case MINUS : System.out.println(" MINUS "); break;
			case RP : System.out.println(" RP "); break;
			case FACT : System.out.println(" FACT "); break;
			case ASSIGN : System.out.println(" ASSIGN "); break;
			case NUM : System.out.println(" NUM "); break;	
			case NAME : System.out.println(" NAME "); break;
			case END : System.out.println(" END "); break;
			case POW : System.out.println(" POW "); break;
		}
		//mynput.close();
	//  j = mynput.nextInt();
	}

	public static boolean IsSpace(byte x){
		return (x == '\t') || (x == ' ');
	}

	public static TokVal gettoken() throws IOException{
		System.out.println("Runs gettoken ...");
		while(IsSpace(ch = (byte)f.read()));
		System.out.println(ch);

		switch(ch){
			case ';' : 
			case '\n': return CurTok = TokVal.PRINT;
			case '^' : return CurTok = TokVal.POW;
			case '*' : return CurTok = TokVal.MULT;
			case '/' : return CurTok = TokVal.DIV;
			case '+' : return CurTok = TokVal.PLUS;
			case '-' : return CurTok = TokVal.MINUS;
			case '(' : return CurTok = TokVal.LP;
			case ')' : return CurTok = TokVal.RP;
			case '!' : return CurTok = TokVal.FACT;
			case '=' : return CurTok = TokVal.ASSIGN;
			case '0' : case '1' : case '2' : case '3' : case '4' : case '5' : case '6' : case '7' : 
			case '8' : case '9' :
			case '.' : System.out.println("unget = " + (int)ch);
						f.unread(ch);
						System.out.println("Unget over ... ");
						number = sc.nextDouble();
						System.out.println("number = " + number);
						return CurTok = TokVal.NUM;
		}
		return CurTok = TokVal.PRINT;
	}

	public static double primary() throws IOException{
		double e = 0.0;
		gettoken();
		switch(CurTok){
			case NUM : return number;
			case NAME : return 2.0;
			case MINUS : gettoken();
						  return -expr();
			case LP : gettoken();
						e = expr();
						if(CurTok != TokVal.RP){
							System.out.println("ERROR ) Expected");
							gettoken();
							return e;
						}
			case END : return 1;
			default : System.out.println("PRIMARY EXPECTED"); return 0.0; 
					
		}
	}

	public static double factor() throws IOException{
		double e, left = primary();
		while(CurTok == TokVal.POW){
			gettoken();
			e = factor();
			left = Math.pow(left, e);
		}
		return left;
	}

	public static double term() throws IOException{
		double d = 1.0, left = factor();
		for(;;){
			switch(CurTok){
				case MULT : gettoken(); left *= factor(); break;
				case DIV : d = factor();
							if(d != 0) left /= d;
							else System.out.print("ERROR / by 0\n");
							break;
				default : return left;
			}
		}
	}

	public static double expr() throws IOException{
		double left = term();
		for(;;){
			switch(CurTok){
				case PLUS : gettoken(); left += term(); break;
				case MINUS : gettoken(); left -= term(); break;
				default : return left;
			}
		}
	}

	public static void main(String[] args) throws IOException {
		for(;;){
			System.out.print("Enter the expression : Calling gettoken()...\n");
			gettoken();
			System.out.print("Main ... CT = "); Token(CurTok);
			e = Calc.expr();
			System.out.print("value : " + e);
			System.out.println("Enter a value ... ");
			
		}
	}
}	