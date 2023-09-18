import java.lang.Math;
import java.util.Scanner;

public class number_of_power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();  // power
       int x = sc.nextInt();  //base
       
    //    method 1 
    //    double power = Math.pow(n,x); 
// System.out.println(power);
    

// method 2
int result = 1;
for (int i = 1 ;i<=n;i++){
    result = result*x;

}
System.out.println(result);  
}
}
