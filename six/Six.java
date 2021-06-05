import java.util.Scanner;

/*
Q6. Write a class called Student with
a) Instance variable roll_no, name, semester and branch
b) A method called setdata ()which takes 4 parameters and returns void. This method must contain
statements to set the values of instance variables of each object of Student class
c) A method called calculate () which does not have any input parameter and returns a double value.
This method must contain statements to take input for marks of 5 subjects (Physics, Chemistry,
Mathematics, English and Hindi) and calculate the percentage of marks using formula:
 Percentage marks=(Total marks/500)*100
The method must also contain a return statement to return the calculated percentage value
d) A method called showdata () which does not take any parameter and returns void. This method
must contain statement to display the values of roll no, name, semester, branch and percentage of
mark of each object of Student class
Write another class StudentRecord which contains the main () method. Inside the main() method write
statements to create 3 different object of Student class and display the values of their instance variable with
the calculated percentage of marks for each of them using Menu
 */


/**
 *
 * @author INZAMUL HOQUE
 */
public class Six {

    
    
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int op;
        double p1=0,p2=0,p3=0;
        SIXStudent s1 = new SIXStudent();
        SIXStudent s2 = new SIXStudent();
        SIXStudent s3 = new SIXStudent();
        //System.out.println(Six.QNS);
        do{
          System.out.println("\n\n\n\n ********** MENU ********** \n\n");  
          System.out.print("\n 1. Set Data   \t 2. Show Data ");
          op = sc.nextInt();
          switch(op){
              case 1:
               
                    System.out.print("\n Enter Roll No : ");
                    int roll_no = sc.nextInt();
                    System.out.print("\n Enter Semester : ");
                    int sem = sc.nextInt();
                    sc.nextLine();
                    System.out.print("\n Enter Name : ");
                    String name = sc.nextLine();                
                    System.out.print("\n Enter Branch : ");
                    String branch = sc.nextLine();
                    s1.setData(roll_no, sem, name, branch);
                    p1= s1.calculate();
                    
                     System.out.print("\n Enter Roll No : ");
                    int r2 = sc.nextInt();
                    System.out.print("\n Enter Semester : ");
                    int sem2 = sc.nextInt();
                    sc.nextLine();
                    System.out.print("\n Enter Name : ");
                    String n2 = sc.nextLine();                
                    System.out.print("\n Enter Branch : ");
                    String b2 = sc.nextLine();
                    s2.setData(r2, sem2, n2, b2);
                    p2 = s2.calculate();
                    
                     System.out.print("\n Enter Roll No : ");
                    int r3 = sc.nextInt();
                    System.out.print("\n Enter Semester : ");
                    int sem3 = sc.nextInt();
                    sc.nextLine();
                    System.out.print("\n Enter Name : ");
                    String n3 = sc.nextLine();                
                    System.out.print("\n Enter Branch : ");
                    String b3 = sc.nextLine();
                    s3.setData(r3, sem3, n3, b3);
                    p3 = s3.calculate();
                 
                  break;
              case 2:
                  System.out.print("\n  Marks of Student 1 : ----\n");
                  s1.showData();
                    System.out.print("\n  Percentage : "+p1+" %");
                   
                    System.out.print("\n  Marks of Student 2 : ----\n");
                    
                    s2.showData();
                    System.out.print("\n  Percentage : "+p2+" %");
                   
                    System.out.print("\n  Marks of Student 3 : ----\n");
                
                    s3.showData();
                    System.out.print("\n  Percentage : "+p3+" %");
                   
                
                  break;
              case 3:
                  break;
              default:
                  break;
          }
        }while(true);
        
    }
    
}

class SIXStudent{
    private int roll_no, sem, phy, chem, math, eng, hindi;
    private String name, branch;
    
   
    
    public void setData(int roll_no, int sem, String name, String branch){
        this.roll_no=roll_no;
        this.name=name;
        this.sem=sem;
        this.branch=branch;
    }
    
    public double calculate(){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("\n Enter Mark of Physics : ");
        phy = sc.nextInt();
        
        System.out.print("\n Enter Mark of Chemistry : ");
        chem = sc.nextInt();
        
        System.out.print("\n Enter Mark of Mathematics : ");
        math = sc.nextInt();
        
        System.out.print("\n Enter Mark of English : ");
        eng = sc.nextInt();
        
        System.out.print("\n Enter Mark of Hindi : ");
        hindi = sc.nextInt();
        
     return ((double)(phy+chem+math+eng+hindi)/500) * 100;  
    }
    
    public void showData(){
        System.out.println("Branch : "+this.branch);
        System.out.println("Student Name : "+this.name);
        System.out.println("Roll No : "+this.roll_no);
        System.out.println("Semester : "+this.sem);
        System.out.println("Marks :--- ");
        System.out.print("\n Physics \t Chemistry \t Mathematics \t English \t Hindi");
        System.out.print("\n "+phy+" \t\t "+chem+" \t\t "+math+"\t \t "+eng+" \t\t "+hindi);
        
    }
}
