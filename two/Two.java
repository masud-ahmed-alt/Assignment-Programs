package mcagimt.programs.two;




/*
 Q2 . Write a Menu Driven Program in Java which performs sorting of a group of 
      integer values using bubble sort method
 */

/**
 *
 * @author INZAMUL HOQUE
 */
import java.util.Scanner;
public class Two {
    
    public static void main(String[] args){
        int[] a = null;
        int op;
        Scanner sc = new Scanner(System.in); 
        Array arr = new Array();
        BShort bshort = new BShort();
       
        
        int i = 0;
        do {
            System.out.println("1. Insert Array \t 2. Display Array ");
            System.out.println("******SHORT********");
            System.out.println("3. Accending \t 4. Decending ");
            System.out.print("\n Enter Option No : ");
            op = sc.nextInt();
            
            switch(op){
                case 1:
                    System.out.println("Inserting Array");
                    a =  arr.insert();
                    break;
                case 2:
                    if(a!=null || a.length>0){
                        arr.display(a);
                    }else{
                        System.out.println("Trying to display an empty array : ");
                    }
                    break;
                case 3:
                    if(a!=null || a.length>0){
                        bshort.acending(a);
                    }else{
                        System.out.println("Trying to short an empty array : ");
                    }
                    break;
                case 4:
                    if(a!=null || a.length>0){
                        bshort.decending(a);
                       
                    }else{
                        System.out.println("Trying to short an empty array : ");
                    }
                    break;
                default:
                    break;
                    
            }
           
            System.out.println(i);
            i++;
        }while (true);
        

        
    }
    
    
}

class BShort{
    
   private int i=0,j=0,temp;
    
    public int[] acending(int[] arr){
    for (i = 0; i < ( arr.length - 1 ); i++) {
      for (j = 0; j < arr.length - i - 1; j++) {
        if (arr[j] > arr[j+1]) 
        {
           temp = arr[j];
           arr[j] = arr[j+1];
           arr[j+1] = temp;
        }
      }
    }
    return arr;
    }
    
    public int[] decending(int[] arr){
         for (i = 0; i < ( arr.length - 1 ); i++) {
      for (j = 0; j < arr.length - i - 1; j++) {
        if (arr[j] < arr[j+1]) 
        {
          temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }
        return arr;
    }
    
    
    
   
   
}


 class Array {

    
    public int[] insert(){
        int size;
        Scanner sc = new Scanner(System.in);
       System.out.println("How Many Element : ");
       size = sc.nextInt();
       int[] arr = new int[size];
       for(int i=0; i<size; i++){
           System.out.println("Enter Element "+(i+1)+": ");
           arr[i] = sc.nextInt();
       }
       return arr;
    }
    
    public void display(int[] arr){
        System.out.print("The Array is : ");
        for(int i=0; i<arr.length; i++){
            System.out.print("\t"+arr[i]);
        }
    }
}
