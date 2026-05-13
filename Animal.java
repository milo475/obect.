public abstract class Animal implements Cloneable {
    protected String name;
    protected String color;

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public abstract void makeSound();

    public String getName()  { return name; }
    public String getColor() { return color; }
    public void setName(String name)   { this.name = name; }
    public void setColor(String color) { this.color = color; }

    @Override
    public Animal clone() {
        try {
            return (Animal) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Clone hiih bolomjgui");
        }
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "[name=" + name + ", color=" + color + "]";
    }
}