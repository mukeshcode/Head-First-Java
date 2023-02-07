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
		Scanner mynput = new Scanner(System.in);

		switch(xc){
			case LP : System.out.println(" LP "); break;
			case PRINT : System.out.println(" PRINT \n "); break;
			case MULT : System.out.println(" MULT \n "); break;
			case DIV : System.out.println(" DIV "); break;
			case PLUS : System.out.println(" PLUS \n"); break;
			case MINUS : System.out.println(" MINUS \n "); break;
			case RP : System.out.println(" RP "); break;
			case FACT : System.out.println(" FACT \n "); break;
			case ASSIGN : System.out.println(" ASSIGN\n"); break;
			case NUM : System.out.println(" NUM " + number); break;
			case NAME : System.out.println(" NAME \n "); break;
			case END : System.out.println(" END \n"); break;
			case POW : System.out.println("POW \n"); break;
		}
		mynput.close();
	//	j = mynput.nextInt();
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
			case '0' : 
			case '1' : 
			case '2' : 
			case '3' :
			case '4' : 
			case '5' : 
			case '6' : 
			case '7' : 
			case '8' : 
			case '9' : 
			case '.' : System.out.print("unget = " + (int)ch + " \n");
						f.unread(ch);
						System.out.print("unget over ... \n");
						number = sc.nextDouble();
						System.out.print("number : " + number + "\n");
						return CurTok = TokVal.NUM;
		}
		return CurTok = TokVal.PRINT;
	}

	/*
	public static TokVal gettoken(){
		if(t == 1){
			t++;
			number = 2;	
			return CurTok = TokVal.NUM;
		}
		else if(t == 2){
			t++; return CurTok = TokVal.POW;
		}
		else if(t == 3){
			t++; number = 3;
			return CurTok = TokVal.NUM;
		}	
		else if(t == 4){
			t++;
			return CurTok = TokVal.POW;
		}
		else if(t == 5){
			t++; number = 2;
			return CurTok = TokVal.NUM;
		}
		else{
			return CurTok = TokVal.PRINT;
		}
	}
	*/

	public static double primary() throws IOException{
		double e = 0.0;
		gettoken();
		switch(CurTok){
			case NUM : 	return number;
			case NAME : return 2.0;
			case MINUS : gettoken();
 							return -expr();
			case LP : gettoken();
					   e = expr();
						if(CurTok != TokVal.RP){
							System.out.print("Error ) Expected \n");
							gettoken();
							return e;
						}
			case END : 		
						return 1;
			default :
						System.out.print("Primary Expected");
						return 0.0;
		}
	}

	public static double factor() throws IOException{
		double e, left= primary();
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
				case MULT : gettoken();
							left *= factor(); break;
				case DIV : gettoken();
							d = factor();
							if(d!=0) left /= d;
							else System.out.println("Error / by 0");
							break;
				default : 
						return left;
			}
		}
	}

	public static double expr() throws IOException{
		double left = term();
		for(;;){
			switch(CurTok){
				case PLUS : 	gettoken(); left += term(); break;
				case MINUS : 	gettoken(); left -= term(); break;
				default : return left;
			}
		}
	}

	public static void main(String [] args) throws IOException{
		for(;;){
			System.out.println("Enter the expression : Calling gettoken()...");
			gettoken();
			System.out.print("Main ... CT = "); Token(CurTok);
			e = Calc.expr();
			System.out.print("value : " + e);
			System.out.println("Enter a value ... ");
		//	i = myinput.nextInt();
		}
		//myInput.close();
	}
}