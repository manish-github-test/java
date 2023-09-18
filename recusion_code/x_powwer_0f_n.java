public class x_powwer_0f_n {
    
    public static int power(int x,int n){
if(n== 0){
return 1;
    }
if(x==0){
    return 0;
}
int power_num = x*power(x, n-1);
return power_num;
}
    public static void main(String[] args) {
        int  x = 2;   //base 
        int n = 5;  ///power
int ans= power(x,n);
System.out.println(ans);
    }
}
