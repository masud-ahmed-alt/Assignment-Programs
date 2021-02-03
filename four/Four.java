package mcagimt.programs.four;


import java.util.Scanner;

/*
Q4. Write a Menu Driven Program in Java to perform multiplication of two matrices
 */


/**
 *
 * @author INZAMUL HOQUE
 */
public class Four {
    private static final String QNS = "Q4.Write a Menu Driven Program in Java to perform multiplication of two matrices";
    
    public static void main(String[] args){
        System.out.println(Four.QNS);
        System.out.println("++++++++++ MENU ++++++++++ ");
        int op,row1,row2,col1,col2;
        Scanner sc = new Scanner(System.in);
        
        int[][] mat1,mat2,mult;
        
        
        System.out.println("++++++++++ MATRIX 1 ++++++++++ ");
        System.out.println("Matrix Row: ");
        row1 = sc.nextInt();
        System.out.println("Matrix Column: ");
        col1 = sc.nextInt();
        
        
        System.out.println("++++++++++ MATRIX 2 ++++++++++ ");
        System.out.println("Matrix Row: ");
        row2 = sc.nextInt();
        System.out.println("Matrix Column: ");
        col2 = sc.nextInt();
        MXMulti mm = new MXMulti();
        mat1 = new int[row1][col1];
        mat2 = new int[row2][col2];
        mult = new int[row2][col1];
        
        do{
            if(col1!=row2 || row1!=col2){
                break;
            }
            System.out.println("++++++++++ MENU ++++++++++ ");
            System.out.print("\n 1. Insert Matrices \t2. Multiply \n");
            System.out.print("Enter Option No : ");
           
            op = sc.nextInt();
           
             switch(op){
                case 1:
//                     mat1 = new int[row1][col1];
//                     mat2 = new 
                     System.out.println("-------- Inserting Matrix 1 -----------");
                     mat1 = mm.insert(row1, col1);
                     
                     System.out.println("-------- Inserting Matrix 2 -----------");
                     mat2 = mm.insert(row2, col2);
                     
                      System.out.println("-------- Displaying Matrices -----------");
                     System.out.println("--------  Matrix 1 -----------");
                       mm.display(mat1,row1, col1);
                     
                     System.out.println("--------  Matrix 2 -----------");
                      mm.display(mat2,row2, col2);
                    break;
                    
                case 2:
                    System.out.println("--------  Multiplication -----------");
                    if(mat1.length>0 && mat2.length>0){
                        
                    }
                      mult =  mm.multiply(mat1,mat2,row1, col1,col2);
                      mm.display(mult, row2, col1);
                }
        }while(true);
        
       
    }
    
    
}

class MXMulti{
    private final Scanner sc;
    private int i, j;

    MXMulti() {
        this.sc = new Scanner(System.in);

       
    }
    
    
    public int[][] insert(int row, int col){
        int[][] mat = new int[row][col];
        for(i=0; i<row; i++){
            for(j=0; j<col; j++){
                System.out.print("Enter Element "+(i+j+1)+": ");
                mat[i][j]=sc.nextInt();
            }
        }
        return mat;
    }
    
    public void display(int[][] mat, int row, int col){
        System.out.println("Matrix is : ");
        for(i=0; i<row; i++){
            for(j=0; j<col; j++){
                System.out.print("\t"+mat[i][j]);
            }
            System.out.println();
        }
    }
    
    public int[][] multiply(int[][] mat1, int[][] mat2, int row1,int co1,int co2){
        int[][] product = new int[row1][co2];
        for(int i = 0; i < row1; i++) {
            for (int j = 0; j < co2; j++) {
                for (int k = 0; k < co1; k++) {
                    product[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }

        return product;
    }
}
