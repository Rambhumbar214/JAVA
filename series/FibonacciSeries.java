package series;

public class FibonacciSeries {
    public void printFibonacci(int count) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < count; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
}