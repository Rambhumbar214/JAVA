package series;

public class SquareSeries {
    public void printSquares(int limit) {
        System.out.print("Square Series: ");
        for (int i = 1; i <= limit; i++) {
            System.out.print((i * i) + " ");
        }
        System.out.println();
    }
}