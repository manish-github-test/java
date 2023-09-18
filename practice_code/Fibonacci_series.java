import java.util.Scanner;

public class Fibonacci_series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=0 ,b=1 ,temp;
System.out.println(a);
System.out.println(b);
        if(n>2)
        {
            for(int i =3;i<=n;i++){
                temp = a;
                a=a+b;
                b= temp;
System.out.println(a);
            }
        }
    }
}
