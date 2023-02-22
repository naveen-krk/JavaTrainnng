package exercise3;


interface AreaCal {
    double getarea();
    double getperimeter();
}

interface CalcVolume {
    double getsurfacegetarea();
    double getvolume();
}

class Circle implements AreaCal {
    private double radius;
    private final double pi = Math.PI;
    
    Circle(double radius) {
        this.radius = radius;
    }
    
    public double getarea() {
        return pi * radius * radius;
    }
    
    public double getperimeter() {
        return 2 * pi * radius;
    }
}

class Square implements AreaCal {
    private double side;
    
    Square(double side) {
        this.side = side;
    }
    
    public double getarea() {
        return side * side;
    }
    
    public double getperimeter() {
        return 4 * side;
    }
}

class Triangle implements AreaCal {
    private double a;
    private double b;
    private double c;
    
    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public double getarea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    
    public double getperimeter() {
        return a + b + c;
    }
}

class Sphere implements AreaCal, CalcVolume {
    private double radius;
    private final double pi = Math.PI;
    
    Sphere(double radius) {
        this.radius = radius;
    }
    
    public double getarea() {
        return 4 * pi * radius * radius;
    }
    
    public double getperimeter() {
        return 2 * pi * radius;
    }
    
    public double getsurfacegetarea() {
        return 4 * pi * radius * radius;
    }
    
    public double getvolume() {
        return (4/3) * pi * radius * radius * radius;
    }

	
}

class Cuboid implements AreaCal, CalcVolume {
    private double side;
    
    Cuboid(double side) {
        this.side = side;
    }
    
    public double getarea() {
        return side * side;
    }
    
    public double getperimeter() {
        return 4 * side;
    }
    
    public double getsurfacegetarea() {
        return 6 * side * side;
    }
    
    public double getvolume() {
        return side * side * side;
    }
}

public class exp2 {
    public static void main(String[] args) {
        Circle c = new Circle(15.0);
        System.out.println("Circle area: " + c.getarea());
        System.out.println("Circle perimeter: " + c.getperimeter());
        
        Square s = new Square(10.0);
        System.out.println("Square area: " + s.getarea());
        System.out.println("Square perimeter: " + s.getperimeter());
        
        Triangle t = new Triangle(4.0, 6.0, 5.0);
        System.out.println("Triangle area: " + t.getarea());
        System.out.println("Triangle perimeter: " + t.getperimeter());
        
        Sphere sp = new Sphere(7.0);
        System.out.println("Sphere area: " + sp.getarea());
        System.out.println("Sphere perimeter: " + sp.getperimeter());
        System.out.println("Sphere surface area: " + sp.getsurfacegetarea());
        System.out.println("Sphere volume: " + sp.getvolume());

        Cuboid cu = new Cuboid(12.0);
        System.out.println("Cuboid area: " + cu.getarea());
        System.out.println("Cuboid perimeter: " + cu.getperimeter());
        System.out.println("Cuboid surface area: " + cu.getsurfacegetarea());
        System.out.println("Cuboid volume: " + cu.getvolume());
    }
}