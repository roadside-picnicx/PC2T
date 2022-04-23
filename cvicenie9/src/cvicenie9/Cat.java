package cvicenie9;

public class Cat extends AbstractAnimal{
    public Cat(byte age) {
        super(age);
    }
    @Override
    public void sound(){
        System.out.println("mnau mnau pls");
    }
}
