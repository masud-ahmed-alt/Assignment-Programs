import java.util.Scanner;

public class Program11 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Worker worker1 = new Worker();
        Worker worker2 = new Worker();
        Worker worker3 = new Worker();

        double g1 = 0, g2 = 0, g3 = 0;
        boolean shouldFinish = false;
        while (!shouldFinish) {
            System.out.println("Please Select Option :" + 
            "\n\t1. Add Data" + 
            "\n\t2. Display Data" + 
            "\n\t3. Quit");
            int choice = scan.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("For worker 1");
                    System.out.println("Enter Worker Code :");
                    int wCode = scan.nextInt();
                    System.out.println("Enter Worker Name : ");
                    String wName = scan.next();
                    System.out.println("Enter Worker Basic Salary :");
                    int bSalary = scan.nextInt();
                    worker1.setData(wCode, wName, bSalary);
                    g1 = worker1.calculate();

                    System.out.println("For worker 2");
                    System.out.println("Enter Worker Code :");
                    int wCode2 = scan.nextInt();
                    System.out.println("Enter Worker Name : ");
                    String wName2 = scan.next();
                    System.out.println("Enter Worker Basic Salary :");
                    int bSalary2 = scan.nextInt();
                    worker2.setData(wCode2, wName2, bSalary2);
                    g2 = worker2.calculate();

                    System.out.println("For worker 3");
                    System.out.println("Enter Worker Code :");
                    int wCode3 = scan.nextInt();
                    System.out.println("Enter Worker Name : ");
                    String wName3 = scan.next();
                    System.out.println("Enter Worker Basic Salary :");
                    int bSalary3 = scan.nextInt();
                    worker3.setData(wCode3, wName3, bSalary3);
                    g3 = worker3.calculate();
                    break;
                }
                case 2: {
                    System.out.println("__________________");
                    worker1.showData();
                    System.out.println("Gross Salary : " + g1);
                    System.out.println("__________________");
                    worker2.showData();
                    System.out.println("Gross Salary : " + g2);
                    System.out.println("__________________");
                    worker3.showData();
                    System.out.println("Gross Salary : " + g3);
                    System.out.println("__________________");
                    break;
                }
                default: {
                    System.out.println("Quit......");
                    shouldFinish = true;
                    break;
                }
            }
        }
    }
}

class Worker {
    public int wCode;
    public String wName;
    public int bSalary;

    public void setData(int wCode, String wName, int bSalary) {
        this.wCode = wCode;
        this.wName = wName;
        this.bSalary = bSalary;
    }

    public double calculate() {
        double HRA, DA, gSalary;
        HRA = (double) 60 / 100 * bSalary;
        DA = (double) 98 / 100 * bSalary;
        gSalary = HRA + DA + bSalary;
        return gSalary;
    }

    void showData() {
        System.out.println("Worker Code : " + wCode);
        System.out.println("Worker Name : " + wName);
        System.out.println("Worker Basic Salary : " + bSalary);
    }
}
