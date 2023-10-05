public class Part_2 {
    public static void main(String[] args) {
        int n = 9;
        printNumber(n);
    }

    public static void printNumber(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
            printNumber(n - 1);
        System.out.print(n + " ");
    }
}

