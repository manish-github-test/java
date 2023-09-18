import java.util.Arrays;
import java.util.Scanner;
// import java.lang.System;
public class _2D_array {
    
    
    public static void main(Arrays[]  args) {
         
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int cols = sc.nextInt();
        int matrix[][]= new int[row][cols];
       for(int i = 0;i<row;i++){
        for(int j = 0 ;j<cols;j++){
insertelement(row,cols);
            matrix[i][j] = sc.nextInt();
        }
    }
    int greater= sc.nextInt();
    for(int i =0 ;i<row;i++ ){
        for(int j = 0 ;j<cols;j++){
           
            if(greater == (matrix[i][j]) ){
                System.out.println("positon of a :"+i +""+j);
            }
           // System.out.print(matrix[i][j] +" ");
        }
//System.out.println();
    
    }
    }
}
