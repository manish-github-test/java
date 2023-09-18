import java.util.Scanner;

public class function_primeno {
    public static int prime(int n){
      int count = 0;
        for(int i = 1; i<=n ; i++){
        if(n%i==0){
count++;
}
        
        }
        if(count==2){
            System.out.println("it is a prime no: "+n);
          }  else{
                System.out.println("it is not a prime no: "+n);

          }
        return 0;
      }
    
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
int n = sc.nextInt();
 prime(n);

    }
}
