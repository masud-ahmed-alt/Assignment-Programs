/*Write a class called “Worker” with
        a) Instance variable code, name, Basic salary
        b) A constructor “Worker ()”which contains statements
        to take inputs from keyboard to set values of
        instance variables of each object of “Worker” class
        c) A method called “showdata ()” which does not takes any parameter
        and returns void. This method contains statements to display the
        values of instance variables of each object of “Worker” class

        Write a subclass “Officer”of “Worker” class with
        a) Instance variable DA,HRA,Gross Salary
        b)A method “calculate” which does not contain any input parameter
        and returns void. This method contains statements to calculate and display DA of each Officer object using formula:
        DA=98% of Basic salary
        HRA=60% of Basic salary
        Gross Salary=Basic salary+DA+HRA;

        c)A method called “showdata ()” which does not takes any parameter and returns void.
        This method contains statements to display the values of instance variables of each object of “Officer” class
        Now write another class called “WorkerRecord” which
        contains main () method. Inside the main () method write
        statements to create and display records of Worker and Officer using menu.*/

import java.util.Scanner;

public class Program32 {
    private static Officer officer1;
    private static Officer officer2;
    private static Officer officer3;

    public static void main(String[] args) {

        int choice;
        Scanner in = new Scanner(System.in);

        do {
            System.out.println(
                    "Please Select an Option : " + "\t\n1. Add Workers" + "\t\n2. Show Workers" + "\t\n3. Exit");
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    officer1 = new Officer();
                    officer2 = new Officer();
                    officer3 = new Officer();
                    officer1.calculate();
                    officer2.calculate();
                    officer3.calculate();
                    break;
                case 2:
                    officer1.showData();
                    officer2.showData();
                    officer3.showData();
                    break;
                default:
                    System.out.println("Exit");
            }
        } while (choice < 3);

    }
}

class Worker1 {
    public int wCode, bSalary;
    public String wName;

    Scanner in = new Scanner(System.in);

    public Worker1() {
        System.out.println("\nEnter worker Code: ");
        wCode = in.nextInt();
        System.out.println("Enter worker Name: ");
        wName = in.next();
        System.out.println("Enter worker Basic Salary: ");
        bSalary = in.nextInt();
    }

}

class Officer extends Worker1 {
    public double DA, HRA, gSallary;

    public void calculate() {
        DA = (0.98 * bSalary);
        HRA = 0.60 + bSalary;
        gSallary = bSalary + DA + HRA;
    }

    public void showData() {
        System.out.println("________________");
        System.out.println("Code of worker : " + wCode);
        System.out.println("Name of worker : " + wName);
        System.out.println("Basic Salary of worker : " + bSalary);
        System.out.println("DA : " + DA);
        System.out.println("HRA : " + HRA);
        System.out.println("Gross Salary : " + gSallary);
        System.out.println("________________");
    }
}
