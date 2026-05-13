public class PrototypeDemo {
    public static void main(String[] args) {
        Dog originalDog = new Dog("nohoi", "har");
        Cat originalCat = new Cat("muur", "tsagaan");
        Bird originalBird = new Bird("shuvuu", "ulaan");

        Dog clonedDog = (Dog) originalDog.clone();
        clonedDog.setName("nohoi-2");

        Cat clonedCat = (Cat) originalCat.clone();
        clonedCat.setColor("har");

        Bird clonedBird = (Bird) originalBird.clone();
        System.out.println("eh obectuud");
        System.out.println(originalDog);
        System.out.println(originalCat);
        System.out.println(originalBird);

        System.out.println("\n huulbar obectuud");
        System.out.println(clonedDog);
        System.out.println(clonedCat);
        System.out.println(clonedBird);

        System.out.println("\n eh huulbar (uur obect)");
        System.out.println("originalDog  clonedDog: " + (originalDog == clonedDog));
    }
}