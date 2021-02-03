import java.util.Scanner;
class Student {
    private int roll_no;
    private String name;
    private  String semester;
    private String branch;

    public void setData(int roll_no, String name, String semester, String branch) {
        this.roll_no = roll_no;
        this.name = name;
        this.semester = semester;
        this.branch = branch;
    }

    public double calculate(){
        Scanner scanner = new Scanner(System.in);
        int mark1, mark2, mark3, mark4, mark5;
        System.out.println("Enter the marks of Physics :");
        mark1 = scanner.nextInt();
        System.out.println("Enter the marks of Chemistry :");
        mark2 = scanner.nextInt();
        System.out.println("Enter the marks of Mathematics :");
        mark3 = scanner.nextInt();
        System.out.println("Enter the marks of English :");
        mark4 = scanner.nextInt();
        System.out.println("Enter the marks of Hindi :");
        mark5 = scanner.nextInt();
        System.out.println("_____________________");
        return (double)(mark1+mark2+mark3+mark4+mark5)/500*100;
    }

    void showData(){
        System.out.println("____________________");
        System.out.println("Roll no : "+this.roll_no);
        System.out.println("Name : "+ this.name);
        System.out.println("Semester : "+this.semester);
        System.out.println("Branch : " +this.branch);
    }
}
public class Program6 {

    public static void main(String[] args) {
        double per1 =0, per2 = 0, per3 = 0;
        int choice;
        boolean shouldFinish = false;

        Scanner input = new Scanner(System.in);

        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        while (!shouldFinish){
            System.out.println("\n\t\t\t\t*******Menu*******"+
                    "\n\t1. Set Data."+
                    "\n\t2. Show Data"+
                    "\n\t3. Quit.");
            choice = input.nextInt();
            switch (choice){
                case 1:
                    System.out.println("For Student 1");
                    System.out.println("Enter Roll number :");
                    int r1 = input.nextInt();
                    System.out.println("Enter Semester");
                    String s1= input.next();
                    System.out.println("Enter name");
                    String n1 = input.next();
                    System.out.println("Enter Branch");
                    String b1 = input.next();
                    student1.setData(r1, n1, s1, b1);
                    per1 = student1.calculate();

                    System.out.println("For Student 2");
                    System.out.println("Enter Roll number :");
                    int r2 = input.nextInt();
                    System.out.println("Enter Semester");
                    String s2= input.next();
                    System.out.println("Enter name");
                    String n2 = input.next();
                    System.out.println("Enter Branch");
                    String b2 = input.next();
                    student2.setData(r2, n2, s2, b2);
                    per2 = student2.calculate();

                    System.out.println("For Student 3");
                    System.out.println("Enter Roll number :");
                    int r3 = input.nextInt();
                    System.out.println("Enter Semester");
                    String s3= input.next();
                    System.out.println("Enter name");
                    String n3 = input.next();
                    System.out.println("Enter Branch");
                    String b3 = input.next();
                    student3.setData(r3, n3, s3, b3);
                    per3 = student3.calculate();
                    break;
                case 2:
                    student1.showData();
                    System.out.println("Percentage : "+per1);

                    student2.showData();
                    System.out.println("Percentage : "+per2);

                    student2.showData();
                    System.out.println("Percentage : "+per3);
                    break;
                case 3:
                    System.out.println("Quiting........");
                    shouldFinish = true;
            }
        }
    }
}

