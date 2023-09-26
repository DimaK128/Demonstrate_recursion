public class Part_3 {
    public static void main(String[] args) {
        recursiveMethod();
    }

    public static void recursiveMethod() {
        recursiveMethod();
    }
}
// This code does not work because it is not correct.
// recursiveMethod just calls itself without any return condition.
// It is also called infinite recursion
