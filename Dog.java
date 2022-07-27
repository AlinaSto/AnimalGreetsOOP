package AnimalGreets;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }
    public void greets(){
        System.out.println(getName()+ " wooof");
    }
    public void greets(Dog anotherDog) {
        System.out.println(anotherDog.getName()+ " face woof woof");
    }
}
