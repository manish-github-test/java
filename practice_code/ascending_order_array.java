import java.lang.reflect.Array;
import java.util.Arrays;

public class ascending_order_array {
    public static void main(String[] args) {
        int ascending[] = {3,-1,5,6};
    for(int i = 0 ;i<ascending.length;i++){
        System.out.print(ascending[i]+" ");
    }
    Arrays.sort(ascending);
    System.out.println();
System.out.println("after soting array(acending order): "
+ Arrays.toString(ascending)); 
 // Arrays.toString() -> print compelete sorting array 

for(int i = 0; i<ascending.length;i++){
    System.out.print(ascending[i]+" ");
}
    
    
    }
}
