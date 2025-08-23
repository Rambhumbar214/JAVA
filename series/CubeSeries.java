package series;

public class CubeSeries {
    public void printCubes(int limit) {
        System.out.print("Cube Series: ");
        for (int i = 1; i <= limit; i++) {
            System.out.print((i * i * i) + " ");
        }
        System.out.println();
    }
}