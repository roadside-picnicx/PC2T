package cvicenie9;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PigImpl implements Animal{
    private byte age;
    public PigImpl(byte age){
        this.age =age;

    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    @Override
    public void sound() {
        System.out.println("yoink zoink yoink yolo");
    }

    @Override
    public void save() {
        try {
            FileWriter fileWriter = new FileWriter("animals.txt",true);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println("yoink zoink yoink yolo");
            printWriter.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public String toString(){ //prevedenie na string
        return "PigImpl [age= "+ age +"]";

    }
}
