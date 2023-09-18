package dsa_code;

import java.util.ArrayList;
import java.util.Collections;
public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        // add the arraylist
        list.add(5);
        list.add(1);
        list.add(8);
        System.out.println(list);

        // get 
      int element =  list.get(1);
        System.out.println(element);
    
        // set
       list.set(1,2);
        System.out.println(list);

        // add element btw
        list.add(1,1);
        System.out.println(list);

        // size
       int size=  list.size();
        System.out.println(size);

        // del
list.remove(3);
System.out.println(list);
 
// sort the arraylist
Collections.sort(list);
System.out.println(list);



}


}
