class Shape {
    public void draw() {
        System.out.println("Drawing a shape...");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle!");
    }
}

class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a square!");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Square();
        Shape s3 = new Shape();

        s1.draw(); // Drawing a circle!
        s2.draw(); // Drawing a square!
        s3.draw(); // Drawing a shape...
    }
}