public class different_var {
    int a = 2; //instance variable
    static int c =5; //static variable

    public static void main(String[] args) {
        different_var b = new different_var();
        System.out.println(b.a);
        System.out.println(c);
    }
}
