public class Bird extends Animal {
    public Bird(String name, String color) { super(name, color); }

    @Override
    public void makeSound() { System.out.println(name + ": jivjiv!"); }
}