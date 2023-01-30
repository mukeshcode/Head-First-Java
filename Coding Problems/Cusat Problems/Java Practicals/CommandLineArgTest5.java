public class CommandLineArgTest5{
	public static void main(String[] args){
		if(args.length != 2)
			System.out.println("2 arguments required!");
		else{
			double x = Double.parseDouble(args[0]);
			double y = Double.parseDouble(args[1]);

			System.out.println("Sum of 2 args : " + (x+y));
		}
	}
}