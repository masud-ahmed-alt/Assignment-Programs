import java.util.Scanner;

class Student {
    public int rollno, totalMarks;
    public String name, semester, branch;

    public void setData(int rollno, int totalMarks, String name, String semester, String branch) {
        this.rollno = rollno;
        this.totalMarks = totalMarks;
        this.name = name;
        this.semester = semester;
        this.branch = branch;
    }

    public double calculate(int totalMarks) {
        return (double) totalMarks / 500 * 100;
    }

    public void showData() {
        String div;
        if (calculate(totalMarks) >= 60) {
            div = "First Division";
        } else if (calculate(totalMarks) >= 45 && calculate(totalMarks) < 60) {
            div = "Second Division";
        } else {
            div = "Third Division";
        }
        System.out.println("Roll No : " + rollno);
        System.out.println("Name : " + name);
        System.out.println("Semester : " + semester);
        System.out.println("Branch : " + branch);
        System.out.println("Percentage : " + calculate(totalMarks));
        System.out.println("Division : " + div);
        System.out.println("_____________");
    }
}

public class Program16 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean shouldFinish = false;

        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        while (!shouldFinish) {
            System.out.println(
                    "\n\t\t\t********MENU*******" + 
                    "\n\t1. Insert Data" + 
                    "\n\t2. Display Data" + 
                    "\n\t3. QUIT");
            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("For Student 1 :");
                    System.out.println("Enter Roll No : ");
                    int roll1 = in.nextInt();
                    System.out.println("Enter name :");
                    String name1 = in.next();
                    System.out.println("Enter Semester : ");
                    String sem1 = in.next();
                    System.out.println("Enter Branch :");
                    String branch1 = in.next();
                    System.out.println("Enter Total mark :");
                    int mark1 = in.nextInt();
                    student1.setData(roll1, mark1, name1, sem1, branch1);
                    System.out.println("_____________");

                    System.out.println("For Student 2 :");
                    System.out.println("Enter Roll No : ");
                    int roll2 = in.nextInt();
                    System.out.println("Enter name :");
                    String name2 = in.next();
                    System.out.println("Enter Semester : ");
                    String sem2 = in.next();
                    System.out.println("Enter Branch :");
                    String branch2 = in.next();
                    System.out.println("Enter Total mark :");
                    int mark2 = in.nextInt();
                    student2.setData(roll2, mark2, name2, sem2, branch2);
                    System.out.println("_____________");

                    System.out.println("For Student 3 :");
                    System.out.println("Enter Roll No : ");
                    int roll3 = in.nextInt();
                    System.out.println("Enter name :");
                    String name3 = in.next();
                    System.out.println("Enter Semester : ");
                    String sem3 = in.next();
                    System.out.println("Enter Branch :");
                    String branch3 = in.next();
                    System.out.println("Enter Total mark :");
                    int mark3 = in.nextInt();
                    student3.setData(roll3, mark3, name3, sem3, branch3);
                    System.out.println("_____________");
                    break;
                case 2:
                    System.out.println("Details of Student 1");
                    student1.showData();
                    System.out.println("Details of Student 2");
                    student2.showData();
                    System.out.println("Details of Student 3");
                    student3.showData();
                    break;
                default:
                    System.out.println("Quiting......");
                    shouldFinish = true;
                    break;
            }
        }
    }
}
