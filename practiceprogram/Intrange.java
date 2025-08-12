public class Intrange{
    public static void main(String[] args) {
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        System.out.println("int range: " + min + " to " + max);
        System.out.println("Below min: " + (int)((long)min - 1));
        System.out.println("Above max: " + (int)((long)max + 1));
    }
}