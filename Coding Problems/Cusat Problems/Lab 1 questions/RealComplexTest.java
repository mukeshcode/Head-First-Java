import java.util.*;

class ComplexNo{
    private double realPart, imagPart;

    ComplexNo(String str){
        int i;
        for(i = 0; i<str.length(); i++)
            if(str.charAt(i) == '+') break;
        this.realPart = Double.parseDouble(str.substring(0, i));
        this.imagPart = Double.parseDouble(str.substring(i+1, str.length()-1));
    }
    ComplexNo(double num){
        this.realPart = num;
    }

    public void add(ComplexNo num2){
        double real, imag;
        real = this.realPart + num2.realPart;
        imag = this.imagPart + num2.imagPart;

        if(imag == 0.)
            System.out.println("Sum : " + real);
        else
            System.out.println("Sum : " + real + " + " + imag + "i");
    }
}

public class RealComplexTest {
    public static void main(String[] args){
        ComplexNo num1;
        ComplexNo num2;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("1. Real Number\n2. Complex Number\n Choose : ");
        switch(sc.nextInt()){
            case 1 :
                System.out.print("Enter first number : ");
                num1 = new ComplexNo(sc.nextDouble());
                System.out.print("Enter second number : ");
                num2 = new ComplexNo(sc.nextDouble());
                num1.add(num2);
                break;

            case 2 : 
                System.out.print("Enter first complex number : ");
                num1 = new ComplexNo(sc.next());
                System.out.print("Enter second complex number : ");
                num2 = new ComplexNo(sc.next());
                num1.add(num2);
                break;

            default : 
                System.out.println("Invalid Choice ! ");
        }
    }
}
