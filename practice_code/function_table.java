import java.util.Scanner;

public class function_table {
    public static int table(int n){
        for(int i = 1;i<=10; i++){
            System.out.println(i*n); 
        }
        
        return 0;
    }
public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
int n = sc.nextInt();


 table(n);
}

}

