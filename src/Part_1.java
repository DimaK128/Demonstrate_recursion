public class Part_1 {
    public static void main(String[] args) {
        int n = 9;
        printNumberBackward(n);
    }

    public static void printNumberBackward(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        printNumberBackward(n - 1);
    }
}
