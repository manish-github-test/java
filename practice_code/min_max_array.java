
import java.util.Arrays;
public class min_max_array {
    public static void main(String[] args) {
        int a[] = {45,22,66,333,1};
        Arrays.sort(a);  // sorting the array in ascending order
        // min value place 0 position and max value place last postion
        System.out.println("min ="+a[0]+"  " +"max ="+a[a.length-1]);
        System.out.println(a.length);
    }
}
