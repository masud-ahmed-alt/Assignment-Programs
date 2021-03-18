import java.util.Scanner;

// /*Write a class called “Student” with
// a) Instance variable roll_no, name, English and Hindi(English and Hindi are two variables to store marks
// of two compulsory subjects English and Hindi)

// b) A method called setdata () which does take any input parameter and returns void. This method
// contains statements to display marks of English and Hindi for each object of “Student” class

// c) A method “show_sub_marks ()” which does not take any input parameters and returns void. This
// method contain statements to display the values of roll_no and name of each object of “Student” class
// Write two subclasses “Science” and “Arts” of “Student” class to override the method “show_sub_marks ()”
// to display marks in Science and Arts subjects respectively

// Now write another class “ScienceMarks” which contains the main () method. Inside the main () method write
// statements to create and display one Science and one Arts students’ record using Menu*/
//  Program By Masud
public class Program35 {

    public static void main(String[] args) {

    }
}

class Student8 {
    int roll;
    String name;
    double eng, hindi;

    Scanner scan = new Scanner(System.in);

    public Student8() {
        System.out.println("Enter Roll Number : ");
        roll = scan.nextInt();
        System.out.println("Enter Name  : ");
        name = scan.next();

        System.out.println("Enter marks of Hindi : ");
        hindi = scan.nextByte();
        System.out.println("Enter marks of English : ");
        eng = scan.nextByte();
    }

    public void setdata() {
        System.out.println("Hindi: " + hindi);
        System.out.println("English: " + eng);
    }
}