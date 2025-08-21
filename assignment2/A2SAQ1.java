package assignment2;

public class A2SAQ1 {

    // Base class
    class Point {
        protected int x, y;

        // Default constructor
        public Point() {
            this.x = 0;
            this.y = 0;
        }

        // Parameterized constructor
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public void display() {
            System.out.println("Point: (" + x + ", " + y + ")");
        }
    }

    // Subclass with color
    class ColorPoint extends Point {
        private String color;

        public ColorPoint(int x, int y, String color) {
            super(x, y);
            this.color = color;
        }

        @Override
        public void display() {
            System.out.println("ColorPoint: (" + x + ", " + y + "), Color: " + color);
        }
    }

    // Subclass with 3rd coordinate
    class Point3D extends Point {
        private int z;

        public Point3D(int x, int y, int z) {
            super(x, y);
            this.z = z;
        }

        @Override
        public void display() {
            System.out.println("Point3D: (" + x + ", " + y + ", " + z + ")");
        }
    }

    // Main method
    public static void main(String[] args) {
        A2SAQ1 obj = new A2SAQ1();

        Point p = obj.new Point();
        ColorPoint cp = obj.new ColorPoint(4, 5, "Red");
        Point3D p3d = obj.new Point3D(1, 2, 3);

        System.out.println("== Displaying Points ==");
        p.display();
        cp.display();
        p3d.display();
    }
}
