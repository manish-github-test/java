import java.util.Scanner;
public class srting_question1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
    //    int size = sc.nextInt();
    //     String array[] = new String[size];
    //     int tolength = 0;
    //     for (int i = 0; i <size; i++) {
    //             array[i] = sc.nextLine();
    //         tolength = tolength + array[i].length();
    
    //         }
    // System.out.println(tolength);
    
    // question 2
    
    String username =" ";
        String email = sc.nextLine();
        for(int i =0 ;i<email.length();i++){
            if(email.charAt(i) == '@'){
                // method 1
  //  String username = email.substring(0, email.length()-10);  // remove the @gmail.com
  // System.out.println(username);
  break;
}
else {     ///method 2
    username += email.charAt(i);
}
}
  System.out.println(username);
System.out.println(email);


}
    }
  
