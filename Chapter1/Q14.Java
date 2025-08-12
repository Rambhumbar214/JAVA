package chapter1;

public class Q14 {




        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            
            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();

            
            int[] array = new int[size];

            
            System.out.println("Enter " + size + " elements:");
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }

            
            System.out.println("The array elements are:");
            for (int i = 0; i < size; i++) {
                System.out.print(array[i] + " ");
            }

            scanner.close();
        }
    }