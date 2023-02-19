import java.util.Scanner;

class Rectangle{
    private int length, breadth;

    Rectangle(int x1, int y1, int x2, int y2){
        this.length = Math.abs(y2-y1);
        this.breadth = Math.abs(x2-x1);
        System.out.println("Length  : " + this.length);
        System.out.println("Breadth : " + this.breadth);
    }

    public void printArea(){
        System.out.println("AREA : " + this.length * this.breadth);
    }
}

class RectTest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("--Enter the coordinates of the diagonal--");
        System.out.println("Enter the points(x1, y1) : ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.println("Enter the points(x2, y2) : ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        Rectangle rect = new Rectangle(x1, y1, x2, y2);
        rect.printArea();
    }
}