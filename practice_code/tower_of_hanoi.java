public class tower_of_hanoi {
    public static void tower_of_hanoi(int n, String source, String helper, String destination) {
        if (n == 1) {
            System.out.println("transfer disk  " + n + "  form  " + source +
                    " to " + helper);

            return;
        }
        /// transfer top n-1 from src to help using des as "helper"
        tower_of_hanoi(n - 1, source, destination, helper);
        // transfer nth from scr to des
        System.out.println("transfer disk  " + n + "  form " + source +
                " to " + helper);
        // transfer n-1 from help to des using scr to " helper"
        tower_of_hanoi(n - 1, helper, source, destination);

    }

    public static void main(String[] args) {
        int n = 2;
        String source;
        String helper;
        String destination;

        tower_of_hanoi(n, "source", "helper", "destination");
    }
}
