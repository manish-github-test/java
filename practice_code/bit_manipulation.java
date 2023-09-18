package practice_code;

import java.util.Scanner;

public class bit_manipulation {
    public static void main(String[] args) {
        // get bit => to check the bit position is bit either one or zero
        int a = 5; ///0101
        int position= 1;
        int bitmask = 1<<position;   //fix  (1<<i)
//         if((bitmask & a) ==0){
// System.out.println( "bit is zero");
//         }
//     else{
// System.out.println("bit is one");
//     }
        
    // set bit => to set the 01(0)1 one in position one  => 0111 
// int set_bit= a | bitmask;
// System.out.println(set_bit);
  

    //  clear bit  => 
    int not  = ~(bitmask);
    int new_number = not & a;
    System.out.println(new_number);

  // update bit  = to bit update (0,1) particular position in binary number
  Scanner  sc = new Scanner(System.in);
  int operator = sc.nextInt();
  if(operator == 1){
    int b= a | bitmask;
    System.out.println(b);

  }
else{
    int c = ~(bitmask);
    int d = a& bitmask;
    System.out.println(d);
}



    }
}
