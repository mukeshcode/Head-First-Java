import java.util.Scanner;

class RealNo{
    private double value;

    RealNo(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter real number : ");
        this.value = sc.nextDouble();
    }
    public double getValue(){return this.value;}

    public void addRealNo(RealNo n2){
        double n2_value = n2.getValue();
        System.out.print(this.value + " + " + n2_value + " = " + (this.value + n2_value));
    }
}

class ComplexNo{
    private double realValue, imagValue;

    ComplexNo(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter complex number : ");
        String str = sc.next();

        int p_loc = 0;
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) == '+'){
                p_loc = i; break;
            }
        }

        this.realValue = Double.parseDouble(str.substring(0, p_loc));
        this.imagValue = Double.parseDouble(str.substring(p_loc, str.length() - 1));
    }

    public double getRealValue(){return this.realValue;}
    public double getImagValue(){return this.imagValue;}

    public void addComplexNo(ComplexNo n2){
        double res_realValue, res_imagValue;
        res_realValue = this.realValue + n2.getRealValue();
        res_imagValue = this.imagValue + n2.getImagValue();

        this.printCompNo(this);
        System.out.print(" + ");
        this.printCompNo(n2);
        System.out.print(" = " + res_realValue + " + " + res_imagValue + "i");

    }

    public void printCompNo(ComplexNo n){
        System.out.print(n.getRealValue() + " + " + n.getImagValue() + "i");
    }
}

public class RealComplexTest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("1. Real Numbers\n2. Complex Numbers\nChoose : ");
        switch(sc.nextInt()){
            case 1 : 
                RealNo r1 = new RealNo();
                RealNo r2 = new RealNo();
                r1.addRealNo(r2);
                break;

            case 2 : 
                ComplexNo c1 = new ComplexNo();
                ComplexNo c2 = new ComplexNo();
                c1.addComplexNo(c2);
                break;

            default : 
                System.out.println("INVALID CHOICE ! ");
        }
    }
}