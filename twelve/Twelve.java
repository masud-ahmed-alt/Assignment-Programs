
import java.util.Scanner;

/*
Q12. Write a menu driven program in Java to calculate average of 3 variables using constructor overloading(Create
as many overloaded version as possible)
 */

/**
 *
 * @author INZAMUL HOQUE
 */
public class Twelve {
    private static String QNS = "Q12. Write a menu driven program in Java to calculate average of 3 variables using constructor overloading\n (Create" +
"as many overloaded version as possible)";
    
    
    public static void main(String[] args){
        System.out.println(Twelve.QNS);
        Scanner sc = new Scanner(System.in);
        int n1=0, n2=0, n3=0, i=0;
        do{
            System.out.println("********** Chose Option ********** ");
            System.out.print("\n Insert Number 1 : ");
             n1 = sc.nextInt();
             
             System.out.print("\n Insert Number 2 : ");
             n2 = sc.nextInt();
             
             System.out.print("\n Insert Number 3 : ");
             n3 = sc.nextInt();
             Average average = null;
             
             int[] arr = new int[3];
             int[] finalArray = new int[3];
             arr[0] = n1;
             arr[1] = n2;
             arr[2] = n3;
             
             while(i<arr.length){
                 if(arr[i]!=0){
                   finalArray[i] = arr[i];  
                 }
                 i++;
             }
             
            switch (finalArray.length) {
                case 3:
                    average = new Average(n1, n2, n3);
                    break;
                case 2:
                    average = new Average(finalArray[0],finalArray[1]);
                    break;
                case 1:
                    average = new Average(finalArray[0]);
                    break;
                default:
                    System.out.println("At least insert a number");
                    break;
            }
             int count = average.count;
             double total = average.total;
             
             Average a = new Average(total,count);
             System.out.print("\n Ther Avrage of is : "+a.avrg);
             
        }while(true);
    }
    
    
     
    
}

class Average{
    int n1=0, n2=0, n3=0, count=0;
    double total=0;
    double avrg = 0;

    public Average(double total, int count) {
        this.avrg = total/count;
    }
    
  
    public Average(int n1, int n2, int n3) {
        this.n1=n1;
        this.n2=n2;
        this.n3=n3;
        this.count = 3;
        this.total = n1+n2+n3;
    }
    
    public Average(int n1, int n2) {
         this.n1=n1;
        this.n2=n2;
        this.count = 2;
        this.total = n1+n2;
    } 
      
    public Average(int n1) {
        this.n1=n1;
        this.count = 1;
        this.total = n1;
    }
}



