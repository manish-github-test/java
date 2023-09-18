// package recusion_code;

public class sum_natural_no {

public static void sum_num(int n, int sum){
if(n==0){
    System.out.println(sum);
    return;
}
    sum += n;
sum_num(n-1, sum);
}
    public static void main(String[] args) {
    int n = 5;
    int sum = 0;
    sum_num(n,0);
   } 
}
