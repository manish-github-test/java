public class print_num_1to5 {
    public static void print_num(int n){    // 5 to 1 number 
        if(n==0){
            return;
        }

        System.out.println(n);
        print_num(n-1);
    }
    public static void main(String[] args) {
        int n = 5;
         print_num(n);

    }    
}
