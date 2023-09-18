

public class geater_common_divisor {
public static void main(String[] args) {
     int n1 = 75, n2 = 125;
while(n1!=n2){
    if(n1>n2){
        n1= n1-n2;
    }
        else{
            n2= n2-n1;

        }
    }
System.out.println("HCF: "+ n1);
}

   
}
