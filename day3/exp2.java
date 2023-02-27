package exercise3;


interface AreaCal 
{
    double getArea();
    double getPerimeter();
}

interface CalcVolume
{
    double getSurfacegetArea();
    double getVolume();
}

class Circle implements AreaCal 
{
    private double radius;
    private final double pi = Math.PI;
    
    Circle(double radius) {
        this.radius = radius;
    }
    
    public double getArea() {
        return pi * radius * radius;
    }
    
    public double getPerimeter() {
        return 2 * pi * radius;
    }
}

class Square implements AreaCal
{
    private double side;
    
    Square(double side) {
        this.side = side;
    }
    
    public double getArea() {
        return side * side;
    }
    
    public double getPerimeter() {
        return 4 * side;
    }
}

class Triangle implements AreaCal 
{
    private double a;
    private double b;
    private double c;
    
    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public double getArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    
    public double getPerimeter() {
        return a + b + c;
    }
}

class Sphere implements AreaCal, CalcVolume 
{
    private double radius;
    private final double pi = Math.PI;
    
    Sphere(double radius) {
        this.radius = radius;
    }
    
    public double getArea() {
        return 4 * pi * radius * radius;
    }
    
    public double getPerimeter() {
        return 2 * pi * radius;
    }
    
    public double getSurfacegetArea() {
        return 4 * pi * radius * radius;
    }
    
    public double getVolume() {
        return (4/3) * pi * radius * radius * radius;
    }

	
}

class Cuboid implements AreaCal, CalcVolume
{
    private double side;
    
    Cuboid(double side) {
        this.side = side;
    }
    
    public double getArea() {
        return side * side;
    }
    
    public double getPerimeter() {
        return 4 * side;
    }
    
    public double getSurfacegetArea() {
        return 6 * side * side;
    }
    
    public double getVolume() {
        return side * side * side;
    }
}

public class exp2 
{
    public static void main(String[] args) 
    {
        Circle c = new Circle(15.0);
        System.out.println("Circle area: " + c.getArea());
        System.out.println("Circle perimeter: " + c.getPerimeter());
        
        Square s = new Square(10.0);
        System.out.println("Square area: " + s.getArea());
        System.out.println("Square perimeter: " + s.getPerimeter());
        
        Triangle t = new Triangle(4.0, 6.0, 5.0);
        System.out.println("Triangle area: " + t.getArea());
        System.out.println("Triangle perimeter: " + t.getPerimeter());
        
        Sphere sp = new Sphere(7.0);
        System.out.println("Sphere area: " + sp.getArea());
        System.out.println("Sphere perimeter: " + sp.getPerimeter());
        System.out.println("Sphere surface area: " + sp.getSurfacegetArea());
        System.out.println("Sphere volume: " + sp.getVolume());

        Cuboid cu = new Cuboid(12.0);
        System.out.println("Cuboid area: " + cu.getArea());
        System.out.println("Cuboid perimeter: " + cu.getPerimeter());
        System.out.println("Cuboid surface area: " + cu.getSurfacegetArea());
        System.out.println("Cuboid volume: " + cu.getVolume());
    }
}