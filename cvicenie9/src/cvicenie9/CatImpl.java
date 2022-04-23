package cvicenie9;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CatImpl implements Animal{

    private byte age;
    public CatImpl (byte age){
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
        System.out.println("mnau mnau pls");
    }

    @Override
    public void save() {
        try {
            FileWriter fileWriter = new FileWriter("animals.txt",true);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println("mnau mnau pls");
            printWriter.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public String toString(){ //prevedenie na string
        return "CatImpl [age= "+ age +"]";

    }
}
