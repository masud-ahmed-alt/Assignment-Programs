


/*Q1. Write a Menu Driven Program in Java which accepts the marks of 3 students into a 1- Dimensional array and
print total marks and percentage for each of the student */



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class One {

    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
       List<STModel> list;
       list = new ArrayList<>();
       System.out.print("How Many Student : ");
       n = sc.nextInt();
       Student student = new Student(list);
       student.insert(n);
       System.out.println("Roll No \t\t Name");
       student.display();
    }
}

class Student{
    private final List<STModel> list;
    private Scanner sc;
    private int roll_no;
    private String name;


    public Student(List<STModel> list) {
        this.list = list;
    }

    public void insert(int n){
        sc = new Scanner(System.in);
        for(int i=0; i<n; i++){
            System.out.print("Generated Roll No : "+(i+1)+"\n");
            roll_no = i+1;
            System.out.print("Enter Name : ");
            name = sc.nextLine();

            STModel model = new STModel(name,roll_no);
            list.add(model);
        }

    }

    public void display(){
        for (STModel model : list) {
            System.out.println(model.getRoll_no()+"\t\t"+model.getName());
        }
    }
}

class STModel{
    private String name;
    private int roll_no;

    public STModel(String name, int roll_no) {
        this.name = name;
        this.roll_no = roll_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }
}
