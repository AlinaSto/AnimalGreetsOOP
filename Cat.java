package AnimalGreets;

public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }



    public void greets(){
        System.out.println(getName()+ " face  miaaau!");
    }
}
