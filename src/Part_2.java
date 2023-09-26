public class Part_2 {
    public static void main(String[] args) {
        int n = 9;
        printNumber(n);
    }

    public static void printNumber(int n) {
        if (n == 1) {
            System.out.print(n + " "); // Print 1    // When n becomes 1, stop the recursion
            return;
        }

            printNumber(n - 1);  // First, make a recursive call with n-1

        System.out.print(n + " "); // After the recursive call, prints the current value of n
    }
}

