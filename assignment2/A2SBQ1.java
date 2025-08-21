package assignment2;

interface Operation {
    double PI = 3.142;

    void area();
    void volume();
}

class Circle implements Operation {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void area() {
        double area = PI * radius * radius;
        System.out.println("Circle Area: " + area);
    }

    public void volume() {
        System.out.println("Circle Volume: Not Applicable");
    }
}

class Cylinder implements Operation {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public void area() {
        double area = 2 * PI * radius * (radius + height);
        System.out.println("Cylinder Surface Area: " + area);
    }

    public void volume() {
        double volume = PI * radius * radius * height;
        System.out.println("Cylinder Volume: " + volume);
    }
}

public class A2SBQ1 {
	public static void main(String[] args) {
        Circle c = new Circle(5);
        System.out.println("== Circle ==");
        c.area();
        c.volume();

        System.out.println("\n== Cylinder ==");
        Cylinder cy = new Cylinder(3, 7);
        cy.area();
        cy.volume();
    }
}
