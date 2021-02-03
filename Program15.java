import java.util.Scanner;

class Employee {
    public int eCode, bSalary, exp;
    public String eName;

    public void setData(int eCode, String eName, int bSalary, int exp){
        this.eCode = eCode;
        this.eName = eName;
        this.bSalary = bSalary;
        this.exp = exp;
    }
    public int calculate(int bSalary){
        if(exp>2){
            bSalary +=2000;
        }
        return bSalary;
    }
    public void showData(){
        System.out.println("_______________");
        System.out.println("Employee Code : "+eCode);
        System.out.println("Employee Name : "+eName);
        System.out.println("Experience in Years : "+exp);
        System.out.println("Total Salary : "+calculate(bSalary));
    }
}

public class Program15 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();

        boolean shouldFinish = false;

        while (!shouldFinish){
            System.out.println("\n\t\t\t\t***********MENU***********"+
                    "\n\t\t1. Insert Employee"+
                    "\t2. Display Employee"+
                    "\t3. Quit..");
            int choice = in.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Employee 1 : ");
                System.out.println("Enter Employee Code :");
                int eCode1 = in.nextInt();
                System.out.println("Enter Employee Name : ");
                String eName1 = in.next();
                System.out.println("Enter Employee Basic Salary : ");
                int bSalary1 = in.nextInt();
                System.out.println("Enter Employee Experience : ");
                int exp1 = in.nextInt();
                employee1.setData(eCode1, eName1, bSalary1, exp1);
                employee1.calculate(bSalary1);
                    System.out.println("______________________");

                    System.out.println("Employee 2 : ");
                    System.out.println("Enter Employee Code :");
                    int eCode2 = in.nextInt();
                    System.out.println("Enter Employee Name : ");
                    String eName2 = in.next();
                    System.out.println("Enter Employee Basic Salary : ");
                    int bSalary2 = in.nextInt();
                    System.out.println("Enter Employee Experience : ");
                    int exp2 = in.nextInt();
                    employee2.setData(eCode2, eName2, bSalary2, exp2);
                    employee2.calculate(bSalary2);
                    System.out.println("______________________");

                    System.out.println("Employee 3 : ");
                    System.out.println("Enter Employee Code :");
                    int eCode3 = in.nextInt();
                    System.out.println("Enter Employee Name : ");
                    String eName3 = in.next();
                    System.out.println("Enter Employee Basic Salary : ");
                    int bSalary3 = in.nextInt();
                    System.out.println("Enter Employee Experience : ");
                    int exp3 = in.nextInt();
                    employee3.setData(eCode3, eName3, bSalary3, exp3);
                    employee3.calculate(bSalary3);
                    System.out.println("______________________");

                case 2:
                    employee1.showData();
                    employee2.showData();
                    employee3.showData();
                    break;

                default:
                    System.out.println("Quiting..........");
                    shouldFinish = true;
                    break;

            }
        }

    }
}
