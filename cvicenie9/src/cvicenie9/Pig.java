package cvicenie9;

public class Pig extends AbstractAnimal{
    public Pig(byte age) {
        super(age);
    }

    @Override
    public void sound(){
        System.out.println("yoink zoink yoink yolo");
    }
}
