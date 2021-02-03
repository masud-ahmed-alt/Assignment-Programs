
import java.util.Scanner;

public class Program14 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        boolean shouldFinish = false;

        Students students1 = new Students();
        Students students2 = new Students();
        Students students3 = new Students();

        while (!shouldFinish){
            System.out.println("\n\t\t\t\t\t*****MENU******"+
                    "\n\t\t1. Enter Data"+
                    "\t\t2. Display Data"+
                    "\t\t3. Quit");
            int choice = in.nextInt();
            switch (choice){
                case 1:
                    System.out.println("For Student 1");
                    System.out.println("Enter Roll : ");
                    int roll = in.nextInt();
                    System.out.println("Enter Name: ");
                    String name = in.next();
                    System.out.println("Enter Semester :");
                    String sem = in.next();
                    System.out.println("Enter Branch :");
                    String branch = in.next();
                    System.out.println("Enter Total Marks ");
                    int mark = in.nextInt();
                    students1.setData(roll, name,sem, branch, mark);
                    students1.calculate(mark);
                    System.out.println("________________________");

                    System.out.println("For Student 2");
                    System.out.println("Enter Roll : ");
                    int roll1 = in.nextInt();
                    System.out.println("Enter Name: ");
                    String name1 = in.next();
                    System.out.println("Enter Semester :");
                    String sem1 = in.next();
                    System.out.println("Enter Branch :");
                    String branch1 = in.next();
                    System.out.println("Enter Total Marks ");
                    int mark1 = in.nextInt();
                    students2.setData(roll1, name1,sem1, branch1, mark1);
                    students2.calculate(mark);
                    System.out.println("________________________");

                    System.out.println("For Student 3");
                    System.out.println("Enter Roll : ");
                    int roll2= in.nextInt();
                    System.out.println("Enter Name: ");
                    String name2= in.next();
                    System.out.println("Enter Semester :");
                    String sem2= in.next();
                    System.out.println("Enter Branch :");
                    String branch2= in.next();
                    System.out.println("Enter Total Marks ");
                    int mark2= in.nextInt();
                    students3.setData(roll2 ,name,sem2, branch2, mark2);
                    students3.calculate(mark);
                    System.out.println("________________________");
                    break;
                case 2:
                    students1.showData();
                    students2.showData();
                    students3.showData();
                    break;
                default:
                    System.out.println("Quiting......");
                    shouldFinish = true;
                    break;
            }
        }

    }
}

class Students {
    public int rollNo, totalMarks;
    public  String name, semester, branch;

    public void setData(int roll, String name, String semester, String branch, int totalMarks){
        this.rollNo = roll;
        this.name = name;
        this.semester = semester;
        this.branch = branch;
        this.totalMarks = totalMarks;
    }
    public double calculate(int totalMarks){
        return (double)totalMarks/500*100;
    }
    public void showData(){
        System.out.println("Roll No : "+rollNo+
        "\nName : "+name+
        "\nSemester : "+semester+
        "\nBranch : "+branch+
        "\nTotal Marks : "+totalMarks+
        "\nPercentage : "+calculate(totalMarks));
        System.out.println("__________________");
    }
}
