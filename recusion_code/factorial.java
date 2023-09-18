public class factorial {
    public static int factorial(int n){
        if(n==0){
            
            return 1;
        }
        // factorial(n-1);
        int factorial_num1 = n*factorial(n-1);
    
      return factorial_num1;
    }
    public static void main(String[] args) {
        int n = 5;
        
        int ans= factorial(n);
System.out.println(ans);
    }

}
