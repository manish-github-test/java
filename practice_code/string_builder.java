import java.util.Scanner;

public class string_builder {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        String name = sc.nextLine();
       String s = "programing";
       System.out.println(s.length());  //length of string 
       
       for(int i = 0 ;i<s.length();i++){
           
           System.out.println(s.charAt(i));   ///access character the string
        }
        
        if(s.equals(name)){  //compare string
            System.out.println("s and name are both equal string ");
        }
        else{
            System.out.println("s and name are not  equal string ");
        }
        System.out.println(s.substring(0,7 ));  ///substring   
        
        String str = "002";
        int convert_number = Integer.parseInt(str);  // string connvert into integer
        System.out.println(convert_number);
         
            int constant = 2323;
            String convert_int = Integer.toString(constant);  // integer convert into String
            System.out.println(convert_int);   
           

            System.out.println(s.replace("r", "d"));  // replace the string letter   
            System.out.println(s.startsWith("pro"));  // check the string start this letter
    
    
        }
}
