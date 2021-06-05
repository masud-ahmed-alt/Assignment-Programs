import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author INZAMUL HOQUE
 */
public class Seven {
    private static final String QNS  ="Write a class called Employee with\n" +
            "a) Instance variables Employee code, Employee name and Basic salary.\n" +
            "b) A method called setdata () which takes 3 parameters and returns void. This method must contain\n" +
            "statements to set the values of instance variable of each object of Employee class\n" +
            "c) A method called calculate () which does not have input parameter and it returns a double value.\n" +
            "This method contain statements to calculate the gross salary of an Employee object using the formula\n" +
            " HRA= 60% of Basic salary\n" +
            " DA= 98% Basic salary\n" +
            " Gross Salary= Basic Salary + HRA + DA\n" +
            "This method must contain a return statement to return the calculated value of Gross salary\n" +
            "d) A method called showdata () which does not take any parameter and return void. This method must\n" +
            "contain statements to display the values of instance variables and calculated gross salary of each\n" +
            "object of Employee class\n" +
            "Write another class EmployeeRecord which contains the main () method. Inside the main() method write\n" +
            "statements to create 3 different object of Employee class and display the values of their instance variable\n" +
            "with the calculated gross salary for each of them using Menu";

    public static void main(String[] args){
        System.out.println(Seven.QNS);
        String empName1, empCode1;
        String empName2, empCode2;
        String empName3, empCode3;
        double basicSalary1,basicSalary2,basicSalary3;

        Scanner sc = new Scanner(System.in);
        int op;
        Employe emp1 = new Employe(),emp2 = new Employe(),emp3 = new Employe();

        do {
            System.out.print("\n\n\n\n ******** MENU ******** \n\n\n");
            System.out.println("1. Set Data \t\t 2. Show Data");
            System.out.print("\n Enter Option ID : ");
            op = sc.nextInt();
            sc.nextLine();
            switch (op){
                case 1:
                    System.out.print("Enter Employee 1 Name : ");
                    empName1 = sc.nextLine();

                    System.out.print("Enter Employee 1 Code : ");
                    empCode1 = sc.nextLine();

                    System.out.print("Enter Employee 1 Basic Salary : ");
                    basicSalary1 = sc.nextDouble();
                    sc.nextLine();


                    System.out.print("Enter Employee 2 Name : ");
                    empName2 = sc.nextLine();

                    System.out.print("Enter Employee 2 Code : ");
                    empCode2 = sc.nextLine();

                    System.out.print("Enter Employee 2  Basic Salary : ");
                    basicSalary2 = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Enter Employee 3 Name : ");
                    empName3 = sc.nextLine();

                    System.out.print("Enter Employee 3 Code : ");
                    empCode3 = sc.nextLine();

                    System.out.print("Enter Employee 3  Basic  Salary : ");
                    basicSalary3 = sc.nextDouble();
                    sc.nextLine();

                    emp1.setdata(empCode1,empName1,basicSalary1);
                    emp2.setdata(empCode2,empName2,basicSalary2);
                    emp3.setdata(empCode3,empName3,basicSalary3);
                    break;
                case 2:
                    System.out.println("******* Details *******");
                    System.out.println("Name  \t\t Code \t\t\t Gross Salary");
                    System.out.println();
                    emp1.showdata();
                    emp2.showdata();
                    emp3.showdata();
                    break;
                default:
                    System.out.println("Invalid Option");
            }

        }while (true);


    }



}

class Employe{
    String empCode,empName;
    double basicSalary;


    public void setdata(String empCode, String empName, double basicSalary){
        this.empName = empName;
        this.empCode = empCode;
        this.basicSalary = basicSalary;
    }

    public double calculate(){
        double hra = (basicSalary/60)*100;
        double da = (basicSalary/98)*100;
        double ga = basicSalary+hra+da;
        return ga;
    }


    public void showdata(){
        System.out.println(empName+" \t2"+empCode+" \t"+this.calculate());

    }



}
