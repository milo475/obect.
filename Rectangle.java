public class Rectangle extends Shape {
    private double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle zurj baina (" + width + "x" + height + ")");
    }

    @Override
    public double area() { return width * height; }
}