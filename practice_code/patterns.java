
import java.util.*;

public class patterns {
    public static void main(String[] args) {
        int m, n;
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();  //row
        n = sc.nextInt();  //col

        // // question = 1
        for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
        System.out.print("*");
        }
        System.out.println(" ");
        }
        System.out.println("\n");

        // // question = 2
        for (int i = 1; i <= m; i++) {
        for (int j = 1; j <= n; j++) {
        if (i == 1 || j == 1 || i == m || j == n) {
        System.out.print("*");
        } else {
        System.out.print(" ");
        }

        }
        System.out.println(" ");
        }
        System.out.println("\n");

        // // question 3
        for(int i=1; i<=m ;i++){
        for(int j = 1; j<=i ;j++){
        System.out.print("*");
        }
        System.out.println();
        }
        System.out.println("\n");

        // // question = 4\
        for(int i=m; i>=1;i--){
        for(int j = 1; j<=i ;j++){
        System.out.print("*");
        }
        System.out.println();
        }
        System.out.println("\n");

    }
}
