import java.util.Scanner;

public class who_is_greaterno {

    public static int greaterno(int a, int b) {
        if (a > b) {
            System.out.println(" a is greater than b ");
        } else if (b > a) {
            System.out.println(" b is greater than a ");
        } else if (a == b) {
            System.out.println(" b and a both are equall ");
        } else {
            System.out.println("invaild");
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        greaterno(a, b);
    }

}
