package AnimalGreets;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Papucel");
        cat.greets();
        Dog dog = new Dog("Sony");
        dog.greets();
        Dog anotherDog = new Dog("mimu");
        anotherDog.greets(dog);
        Dog securityDog = new SecurityDog("Gogu");

    }
}
