import java.util.Scanner;

class Student{
    public int roll_no;
    public String name;
    public String semester;
    public String branch;

    void setdata(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Roll :");
        roll_no = scanner.nextInt();
        System.out.println("Name : ");
        name = scanner.next();
        System.out.println("Semester : ");
        semester = scanner.next();
        System.out.println("Branch :");
        branch = scanner.next();
    }
    public double calculate(){
        Scanner scanner = new Scanner(System.in);
        double percent;
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

        int total = mark1+mark2+mark3+mark4+mark5;
        percent = (double)total/500*100;
        return percent;
    }
    void showData(){
        System.out.println("Roll no : "+roll_no);
        System.out.println("Name : "+ name);
        System.out.println("Semester : "+semester);
        System.out.println("Branch : " +branch);
    }
}

public class Program8 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
	    Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        double per1 = 0, per2 = 0,per3 =0 ;
        boolean shouldFinish = false;
        while (!shouldFinish){
            System.out.println("Please Select Option :"+
                    "\n\t1. Add Data"+
                    "\n\t2. Display Data"+
                    "\n\t3. Quit");
            int choice = scan.nextInt();
            switch (choice){
                case 1:
                    System.out.println("For 1st Student");
                    student1.setdata();
                    per1=student1.calculate();
                    System.out.println();

                    System.out.println("For Student 2");

                    student2.setdata();
                    per2= student2.calculate();
                    System.out.println();

                    System.out.println("For Student 3");
                    student3.setdata();
                    per3 = student3.calculate();
                    System.out.println();
                    break;
                case 2:
                    student1.showData();
                    System.out.println("Percentage : "+per1);
                    System.out.println("_________________");
                    student2.showData();
                    System.out.println("Percentage : "+per2);
                    System.out.println("_________________");
                    student3.showData();
                    System.out.println("Percentage : "+per3);
                    System.out.println("_________________");
                    break;
                default:
                    System.out.println("Program Exit");
                    shouldFinish = true;
            }
        }
    }
}
