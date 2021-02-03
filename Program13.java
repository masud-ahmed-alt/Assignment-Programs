
import java.util.Scanner;

class Students {
    int roll;
    String sName, semester, branch;

    Students() {
        roll = 1;
        sName = "ABC";
        semester = "3rd";
        branch = "MCA";
    }

    Students(int rno) {
        roll = rno;
        sName = "Paul";
        semester = "5th";
        branch = "Mechanical";
    }

    Students(int rno, String name) {
        roll = rno;
        sName = name;
        semester = "4th";
        branch = "Electric";
    }

    Students(int rno, String name, String sSem) {
        roll = rno;
        sName = name;
        semester = sSem;
        branch = "Civil";
    }

    Students(int rno, String name, String sSem, String dept) {
        roll = rno;
        sName = name;
        semester = sSem;
        branch = dept;
    }

    public double calculate() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Mark of Physics :");
        int mark1 = scan.nextInt();
        System.out.println("Enter the Mark of Chemistry :");
        int mark2 = scan.nextInt();
        System.out.println("Enter the Mark of Mathematics :");
        int mark3 = scan.nextInt();
        System.out.println("Enter the Mark of English :");
        int mark4 = scan.nextInt();
        System.out.println("Enter the Mark of Hindi :");
        int mark5 = scan.nextInt();
        System.out.println("------------------------------");
        int total = mark1 + mark2 + mark3 + mark3 + mark4 + mark5;
        double per = (double) total / 500 * 100;
        return per;
    }

    public void showData() {
        System.out.println("Roll : " + roll);
        System.out.println("Name : " + sName);
        System.out.println("Semester : " + semester);
        System.out.println("Branch : " + branch);
    }
}

public class Program13 {

    public static void main(String[] args) {
        double p1 = 0, p2 = 0, p3 = 0, p4 = 0, p5 = 0;

        Students students = new Students();
        Students students1 = new Students(2);
        Students students2 = new Students(3, "Arbaz");
        Students students3 = new Students(4, "Shaw", "3rd");
        Students students4 = new Students(5, "Maxwell", "4th", "MCA");

        Scanner scanner = new Scanner(System.in);
        boolean shouldFinish = false;
        while (!shouldFinish) {
            System.out.println("\n\t\t\t\t\t\t *********MENU*********" + "\n\t\t1. Enter Marks."
                    + "\t\t2. Display Details " + "\t\t.3. Quit.");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("For Student 1");
                    p1 = students.calculate();
                    System.out.println("For Student 2");
                    p2 = students1.calculate();
                    System.out.println("For Student 3");
                    p3 = students2.calculate();
                    System.out.println("For Student 4");
                    p4 = students3.calculate();
                    System.out.println("For Student 5");
                    p5 = students4.calculate();
                }
                case 2 -> {
                    System.out.println("___________________");
                    students.showData();
                    System.out.println("Percentage = " + p1);
                    System.out.println("___________________");
                    students1.showData();
                    System.out.println("Percentage = " + p2);
                    System.out.println("___________________");
                    students2.showData();
                    System.out.println("Percentage = " + p3);
                    System.out.println("___________________");
                    students3.showData();
                    System.out.println("Percentage = " + p4);
                    System.out.println("___________________");
                    students4.showData();
                    System.out.println("Percentage = " + p5);
                }
                default -> {
                    System.out.println("Quiting.......");
                    shouldFinish = true;
                }
            }
        }
    }
}
