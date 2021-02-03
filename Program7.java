import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {

    	double gs1 = 0, gs2 = 0, gs3 = 0;
		Employee employee1 = new Employee();
		Employee employee2 = new Employee();
		Employee employee3 = new Employee();
		Scanner scanner = new Scanner(System.in);
		boolean shouldFinish = false;
		while (!shouldFinish){
			System.out.println("Please Select an Option"+
					"\n\t1. Insert Data"+
					"\n\t2. Display Data"+
					"\n\t3. Quit");
			int choice = scanner.nextInt();
			switch (choice){
				case 1:
					System.out.println("****For Employee 1****");
					System.out.println("Enter Employee Code : ");
					int eCode1 = scanner.nextInt();
					System.out.println("Enter Employee Name : ");
					String eName1 = scanner.next();
					System.out.println("Enter Employee Basic Salary :");
					int bSalary1 = scanner.nextInt();
					employee1.setData(eCode1, eName1, bSalary1);
					gs1 = employee1.calculate();

					System.out.println("****For Employee 2****");
					System.out.println("Enter Employee Code : ");
					int eCode2 = scanner.nextInt();
					System.out.println("Enter Employee Name : ");
					String eName2 = scanner.next();
					System.out.println("Enter Employee Basic Salary :");
					int bSalary2 = scanner.nextInt();
					employee2.setData(eCode2, eName2, bSalary2);
					gs2 = employee2.calculate();

					System.out.println("****For Employee 3****");
					System.out.println("Enter Employee Code : ");
					int eCode3 = scanner.nextInt();
					System.out.println("Enter Employee Name : ");
					String eName3= scanner.next();
					System.out.println("Enter Employee Basic Salary :");
					int bSalary3 = scanner.nextInt();
					employee3.setData(eCode3, eName3, bSalary3);
					gs3 = employee3.calculate();
					break;
				case 2:
					employee1.showdata();
					System.out.println("Gross Salary : "+gs1);
					System.out.println("__________________");
					employee2.showdata();
					System.out.println("Gross Salary : "+gs2);
					System.out.println("__________________");
					employee3.showdata();
					System.out.println("Gross Salary : "+gs3);
					System.out.println("__________________");
				break;
				default:
					System.out.println("Quit.......");
					shouldFinish = true;
					break;

			}
		}
    }
}
class Employee {
    public int eCode;
    public String eName;
    public int bSalary;


    void setData(int eCode, String eName, int bSalary){
        this.eCode = eCode;
        this.eName = eName;
        this.bSalary = bSalary;
    }

    public double calculate(){
        double HRA , DA , gSalary;
        HRA = (double)60/100*bSalary;
        DA = (double)98/100 *bSalary;
        gSalary = bSalary+HRA+DA;
        return gSalary;
    }
    void showdata(){
        System.out.println("Employee Code : "+eCode+
                "\nEmployee Name : "+eName+
                "\nEmployee Basic Salary : "+bSalary);
    }
}