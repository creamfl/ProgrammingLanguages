package exercise1;

interface Two_D_Shape {
    double PI = 3.14;
    void parameters();
    double area();
    double perimeter();
}

interface Three_D_Shape {
    double volume();
}

class Triangle implements Two_D_Shape {
    double sideA, sideB, sideC, height;

    public Triangle(double sideA, double sideB, double sideC, double height) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.height = height;
        System.out.println("A new triangle is created");
    }

    public boolean rectangular() {
        double a2 = sideA * sideA;
        double b2 = sideB * sideB;
        double c2 = sideC * sideC;
        return (a2 + b2 == c2 || b2 + c2 == a2 || a2 + c2 == b2);
    }

    @Override
    public void parameters() {
        System.out.println("Triangle parameters: sideA = " + sideA + ", sideB = " + sideB + ", sideC = " + sideC + ", height = " + height);
    }

    @Override
    public double area() {
        return 0.5 * sideB * height;
    }

    @Override
    public double perimeter() {
        return sideA + sideB + sideC;
    }
}

class Sphere implements Two_D_Shape, Three_D_Shape {

    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
        System.out.println("A new sphere has been created");
    }

    @Override
    public void parameters() {
        System.out.println("Sphere parameters: radius = " + radius);
    }

    @Override
    public double area() {
        return 4 * PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 0;
    }

    @Override
    public double volume() {
        return (4.0 / 3.0) * PI * radius * radius * radius;
    }
}

public class exerciseeeeee1 {

    public static void main(String[] args) {
        Triangle T1 = new Triangle(3, 5, 6, 3);
        Sphere B1 = new Sphere(4);
        Two_D_Shape T2 = new Triangle(8, 2, 10, 16);
        Two_D_Shape B2 = new Sphere(3);
        Three_D_Shape B3 = new Sphere(7);

        T1.parameters();
        System.out.println("Area: " + T1.area());
        System.out.println("Perimeter: " + T1.perimeter());
        System.out.println("Is rectangular: " + T1.rectangular());

        B1.parameters();
        System.out.println("Area: " + B1.area());
        System.out.println("Volume: " + B1.volume());

        T2.parameters();
        System.out.println("Area: " + T2.area());
        System.out.println("Perimeter: " + T2.perimeter());

        B2.parameters();
        System.out.println("Area: " + B2.area());

        B3.volume();

        int countTwoDShapeInstances = 0;

        if (T2 instanceof Two_D_Shape) {
            countTwoDShapeInstances++;
        }

        if (B2 instanceof Two_D_Shape) {
            countTwoDShapeInstances++;
        }

        System.out.println("Number of Two_D_Shape instances: " + countTwoDShapeInstances);
    }
}
