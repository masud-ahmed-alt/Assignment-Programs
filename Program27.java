import java.util.Scanner;

class Circle {
    final double pi = 3.14;
    double rad;

    public void setData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Radius of Circle :");
        rad = scanner.nextDouble();
    }

    public void area(){
        System.out.println("Area of Circe A = " + pi*rad);
    }
}


public class Program27 {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle();
        Circle circle3 = new Circle();

        circle1.setData();
        circle2.setData();
        circle3.setData();


        circle1.area();
        circle2.area();
        circle3.area();
    }
}
