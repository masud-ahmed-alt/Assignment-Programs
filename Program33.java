
/*Write a class called “Student” with
        a) Instance variable roll_no, name, marks for two compulsory subjects English and Hindi
        b) A constructor “Student ()” which contains statements to take inputs from keyboard to set values of
        instance variables of each object of “Student” class
c) A method “show_stud ()” which does not take any input parameters and returns void. This method
        must contain statements to display the values of instance variable of each object of “Student” class
Write a subclass “Science” for Science student with
        i. Instance variable for the marks of two science subjects Physics and Chemistry
        ii. A constructor “Science ()” which takes statements to take inputs from keyboard to set values
        of instance variables of each object of Science class
iii. A method “show_science ()” which does not take any parameter and returns void. This
        method must contain statements to display values of instance variables of each object of
        “Science” class
Now write a subclass “Result” of “Science” class with
a) Instance variable total, percentage
        b) A constructor “Result ()” to calculate total marks and percentage of each object of “Science”
class with formula:
        Total = English + Hindi + Physics + Chemistry
        Percentage= (total/400)* 100
        c) A method called “show-result ()” which does not take any parameter and returns void. This
        method must contain statements to display the values of instance variables of each object of
        “”Result” class
Now write another class “ScienceResult” which contains the main () method. Inside the main () method write
        statements to create and display 3 different Science students’ result record*/

import java.util.Scanner;

public class Program33 {
    private static Result result1;
    private static Result result2;
    private static Result result3;

    public static void main(String[] args) {

        int choice;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println(
                    "Please Select An Option : " + "\t\n1. Add Students." + "\t\n2. Show Students." + "\t\n3. Exit");

            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    result1 = new Result();
                    result2 = new Result();
                    result3 = new Result();
                    break;
                case 2:
                    try {
                        if (result1 == null || result2 == null || result3 == null)
                            throw new CExeption("Empty Object");
                        result1.show_stud();
                        result1.show_science();
                        result1.show_result();
                        System.out.println("________________________________");

                        result2.show_stud();
                        result2.show_science();
                        result2.show_result();
                        System.out.println("________________________________");

                        result3.show_stud();
                        result3.show_science();
                        result3.show_result();
                        System.out.println("________________________________");
                    } catch (CExeption e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.exit(1);
                    break;
                default:
                    System.err.println("Invalid Option..");
                    break;
            }
        } while (true);
    }
}

class CExeption extends Exception {
    public CExeption(String s) {
        super(s);
    }
}

class Student1 {
    public int roll;
    public String name;
    public double eng, hindi;

    Scanner in = new Scanner(System.in);

    public Student1() {
        System.out.println("Enter Roll :");
        roll = in.nextInt();
        System.out.println("Enter Name :");
        name = in.next();
        System.out.println("Marks of hindi :");
        hindi = in.nextByte();
        System.out.println("Marks of English :");
        eng = in.nextByte();
    }

    public void show_stud() {
        System.out.println("Roll : " + roll);
        System.out.println("Name : " + name);
        System.out.println("Marks of Hindi : " + hindi);
        System.out.println("Marks of English : " + eng);
    }
}

class Science extends Student1 {
    public double phy, chem;

    Scanner scanner = new Scanner(System.in);

    public Science() {
        System.out.println("Enter Marks of Physics :");
        phy = scanner.nextByte();
        System.out.println("Enter Marks of Chemistry :");
        chem = scanner.nextByte();
    }

    public void show_science() {
        System.out.println("Physics : " + phy);
        System.out.println("Chemistry : " + chem);
    }
}

class Result extends Science {
    public double total, percentage;

    public Result() {
        total = eng + hindi + phy + chem;
        percentage = (total / 400) * 100;
    }

    public void show_result() {
        System.out.println("Total Marks : " + total);
        System.out.println("Percentage : " + percentage);
    }
}
