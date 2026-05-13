public class ShapeFactory {
    public static Shape createShape(String type) {
        switch (type.toLowerCase()) {
            case "circle":    return new Circle(5);
            case "rectangle": return new Rectangle(4, 6);
            case "triangle":  return new Triangle(3, 8);
            default: throw new IllegalArgumentException("todorhoiguu helber: " + type);
        }
    }

    public static void main(String[] args) {
        String[] types = {"circle", "rectangle", "triangle"};

        for (String type : types) {
            Shape shape = ShapeFactory.createShape(type);
            shape.draw();
            System.out.println("  talbai: " + shape.area());
        }
    }
}