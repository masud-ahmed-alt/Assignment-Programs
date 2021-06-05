package mcagimt.programs.three;

/*
 Q3. Write a Menu Driven Program in Java to perform addition of two n x n matrices
 */


import java.util.Scanner;

/**
 *
 * @author INZAMUL HOQUE
 */
public class Three {
    private static final String QNS = "Q3. Write a Menu Driven Program in Java to perform addition of two n x n matrices";
    public static void main(String[] args){
        System.out.println(Three.QNS);
        System.out.println("++++++++++ MENU ++++++++++ ");
        int op,row,size;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Matrix Size (n x n) : ");
        size = sc.nextInt();
        
        
        Matrix m = new Matrix(size);
        do{
            System.out.println("\n 1. Adddtion  \t 2. Display ");
            op = sc.nextInt();
            switch(op){
                case 1:
                   System.out.println("For Addition Insert Matrices ");
                   int[][] mat1,mat2,add;
                   System.out.println("***** Matrix 1 ******");
                   mat1 = m.insert();
                   System.out.println("***** Matrix 1 View ******");
                   m.display(mat1);
                   System.out.println("***** Matrix 2 ******");
                   mat2 = m.insert();
                   System.out.println("***** Matrix 2 View ******");
                   m.display(mat2);
                   System.out.println("***** Matrix After Addition ******");
                   add =  m.additon(mat1, mat2);
                   m.display(add);
            }
           
        }while(true);
        
    }
    
}


class Matrix{
    private Scanner sc;
    private final int size;
    private int i, j;

    Matrix(int size) {
        this.sc = new Scanner(System.in);
        this.size = size;
       
    }
    
    
    
    public int[][] insert(){
        int[][] mat = new int[size][size];
        for(i=0; i<size; i++){
            for(j=0; j<size; j++){
                System.out.print("Enter Element "+(i+j+1)+": ");
                mat[i][j]=sc.nextInt();
            }
        }
        return mat;
    }
    
    public void display(int[][] mat){
        System.out.println("Matrix is : ");
        for(i=0; i<size; i++){
            for(j=0; j<size; j++){
                System.out.print("\t"+mat[i][j]);
            }
            System.out.println();
        }
    }
    
    public int[][] additon(int[][] mat1, int[][] mat2){
        int[][] mat3 = new int[size][size];
        
           for(i=0; i<size; i++){
            for(j=0; j<size; j++){
             mat3[i][j] = mat1[i][j]+mat2[i][j];   
            }
           } 
       
        return mat3;
    }
}
