import java.util.Scanner;

public class RomanToDecimal{
	public static void main(String[] args){
		int M = 1000, D = 500, C = 100, L = 50, X = 10, V = 5, I = 1, num = 0;
		int strLen; 
		Scanner sc = new Scanner(System.in);
		System.out.print("Roman Number : ");
		String roman = sc.next();

		strLen = roman.length();
		for(int i = 0; i < strLen; i++){
			switch(roman.charAt(i)){
				case 'M' : case 'm' : num += M;
										break;

				case 'D' : case 'd' : num += D;
										break;

				case 'C' : case 'c' : 
										if(i < strLen-1){
											if(roman.charAt(i+1) == 'D' || roman.charAt(i) == 'd'){
												num += 400; i++; continue;
											}
											else if(roman.charAt(i+1) == 'M' || roman.charAt(i+1) == 'm'){
												num += 900; i++; continue;
											}
										}
										num += C;
										break;

				case 'L' : case 'l' : num += L;
										break;

				case 'X' : case 'x' : 
										if(i < strLen-1){
											if(roman.charAt(i+1) == 'L' || roman.charAt(i+1) == 'l'){
												num += 40; i++; continue;
											}
											else if(roman.charAt(i+1) == 'C' || roman.charAt(i+1) == 'c'){
												num += 90; i++; continue;
											}
										}/*
										XIX; num = 10;
										*/
										num += X;
										break;

				case 'V' : case 'v' : num += V;
										break;

				case 'I' : case 'i' :	
										if(i < strLen-1){
											if(roman.charAt(i+1) == 'V' || roman.charAt(i) == 'v'){
												num += 4; i++; continue;
											}
											else if(roman.charAt(i+1) == 'X' || roman.charAt(i+1) == 'x'){
												num += 9; i++; continue;
											}
										}
										num += I;
										break;

				default : System.out.print("Wrong Input!");
			}
		}
		System.out.println("Corr. Number : " + num);

	}
}