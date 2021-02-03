import java.util.Scanner;
class Rectangle {
    public double length, breadth;
    public double area;

    void setData(double length, double breadth){
       this.length = length;
       this.breadth = breadth;
    }

    void calculate_area(){
        area = length*breadth;
        System.out.println("Area of Rectangle: " +area);
    }
    void  showdata(){
        System.out.println("\t\t\t"+length+"\t\t\t\t\t"+breadth+"\t\t\t\t\t"+area);
    }
}

public class Program10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean shouldFinish = false;


    Rectangle rectangle1 = new Rectangle();
    Rectangle rectangle2 = new Rectangle();
    Rectangle rectangle3 = new Rectangle();


    while (!shouldFinish){
        System.out.println("\n\t\t\t\t\t\t*********MENU**********"+
                "\n\t\t1. Set Data"+
                "\n\t\t2. Display Data"+
                "\n\t\t3. Quit");
        int choice = input.nextInt();
        switch (choice){
            case 1:
                System.out.println("For Rectangle 1");
                System.out.println("Enter Length: ");
                double length = input.nextDouble();
                System.out.println("Enter Length: ");
                double breadth = input.nextDouble();
                rectangle1.setData(length, breadth);
                rectangle1.calculate_area();


                System.out.println("For Rectangle 2");
                System.out.println("Enter Length: ");
                double length2 = input.nextDouble();
                System.out.println("Enter Length: ");
                double breadth2 = input.nextDouble();
                rectangle2.setData(length2, breadth2);
                rectangle2.calculate_area();

                System.out.println("For Rectangle 3");
                System.out.println("Enter Length: ");
                double length3 = input.nextDouble();
                System.out.println("Enter Length: ");
                double breadth3 = input.nextDouble();
                rectangle3.setData(length3, breadth3);
                rectangle3.calculate_area();
                break;

            case 2:
                System.out.println("\t\t\t____________________________________________");
                System.out.println("\t\t\t\t\t\tAreas of Rectangle");
                System.out.println("\n\t\t\tLength\t"+"\t\t\tBreadth\t"+"\t\t\tArea\t");
                rectangle1.showdata();
                rectangle2.showdata();
                rectangle3.showdata();
                System.out.println("\t\t\t____________________________________________");

                break;
            default:
                System.out.println("Quiting.......");
                shouldFinish = true;
                break;
        }
    }

    }
}

