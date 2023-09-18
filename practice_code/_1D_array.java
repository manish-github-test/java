import java.util.Scanner;
public class _1D_array {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String name[] = new String[size];
        for(int i = 0;i<size;i++){ //input 
            name[i]= sc.nextLine();
        }
        
       // int x = sc.nextInt();
        
    
    for(int i = 0;i<name.length;i++){   // output
      //  if(number[i]==x){
   // System.out.println( " position of value x :"+i);
System.out.println(name[i]);  ///print the read value
    
}
    }

    }



