package AnimalGreets;

public class SecurityDog extends Dog{
    public SecurityDog(String name) {
        super(name);
    }
    public void greets(){
        System.out.println(getName()+" spune wow");
    }
    public void greets(Dog anotherDog){
        System.out.println(anotherDog.getName()+ " woow wooow");
    }
}
