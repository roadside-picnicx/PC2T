package cvicenie9;

public class Goat extends AbstractAnimal{
    public Goat(byte age) {
        super(age);
    }

    @Override
    public void sound(){
        System.out.println("bee beee B");
    }
}
