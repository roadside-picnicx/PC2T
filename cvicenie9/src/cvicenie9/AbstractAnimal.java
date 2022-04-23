package cvicenie9;

public abstract class AbstractAnimal {
    private byte age;

    public AbstractAnimal(byte age) {
        this.age = age;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public void sound(){

    }
}
