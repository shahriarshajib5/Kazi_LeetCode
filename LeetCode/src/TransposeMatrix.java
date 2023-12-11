/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author S555438
 */

import java.util.Scanner;
public class TransposeMatrix {

    /**
     * @param args the command line arguments
     */
    /**
     * 867. Transpose Matrix

     * Given a 2D integer array matrix, return the transpose of matrix.

       The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.
     *
     * Example 1:

    Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
    Output: [[1,4,7],[2,5,8],[3,6,9]]
    Example 2:

    Input: matrix = [[1,2,3],[4,5,6]]
    Output: [[1,4],[2,5],[3,6]]
     */
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter intial matrix row no:");
        int r = scan.nextInt();
        System.out.println("Enter initial matrix column number");
        int c = scan.nextInt();
        
       
       int[][] myArr = new int[r][c];
               
       int[][] myArrt = new int[c][r];
       
       
       for(int i=0; i<myArr.length; i++)
       {
           
           for(int j = 0; j<myArr[i].length; j++)
           {
               System.out.println("Enter number of row "+i+"and column "+ j +": ");
             myArr[i][j]= scan.nextInt();  
           }
           
       }
       
       
     
           for(int i=0; i<r; i++)
       {
           
           for(int j = 0; j<c; j++)
           {
             myArrt[j][i]= myArr[i][j];  
           }   
       }
     
       
       for (int i = 0; i<myArrt.length; i++)
       {
           for (int j =0; j<myArrt[i].length; j++)
           {
               System.out.print(myArrt[i][j]+"  ");
             
           }
             System.out.println("");
       }
   
       
}
    
}