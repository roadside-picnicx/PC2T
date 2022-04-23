package cvicenie9;
/*

abs. triedy sluyi ako predpis, poskytuje metody odvodenym tridam aj ked nezodpoveda ziadnemu konkretnemu objektu

interface obsahuje iba konstanty a metody, specifikuje operacie ktore musi trieda splnovat a nezaobera
sa tym ako to bude dosiahnute


enum je prehladnejsi a prucje sa s nim jednoduchsie nez s definovanou konstantou, naprk chyba v pomenovani enum
kompilator na nu upozorni, co by sa pri stringu nestalo

 */
public class App {

    public static void main(String[] args) {

        char[] pass = {'a' , 'b', 'c', 'd', 'e'}; //heslo
        Employee e1 = new Employee("\tPetr\t", "\t1998@email.com", pass);
        Employee e2 = new Employee("\tMarek\t", "\tcau@email.com", pass);
        Employee e3 = new Employee("\tFilip\t", "\tpes@email.com", pass);
        Employee e4 = new Employee("\tJan\t", "\tdankmemer@email.com", pass);
        Employee e5 = new Employee("\tMilos\t", "\t1998milos5@email.com", pass);
        Manager m1 = new Manager("\tJakub\t", "\tsmrek@gmail.com",pass);
        Secretarian s1 = new Secretarian("\tMarian\t", "\tmar@gmail.com",pass, 53);
        Secretarian s2 = new Secretarian("\tStefan\t", "\tbaca@gmail.com",pass, 22);

        m1.addEmployee(e1); //pridanie do listu zamestnancov
        m1.addEmployee(e2);
        m1.addEmployee(e3);
        m1.addEmployee(e4);
        m1.addEmployee(e5);
        m1.addRelation(s1);//pridanie do listu vztahu
        m1.vypis1();
        m1.vypis2();

        byte a =51;
        //instancie
        Cat c =new Cat(a);
        Dog d =new Dog(a);
        Pig p = new Pig(a);
        Cow cw = new Cow(a);
        Goat g = new Goat(a);

        //print zvuku
        c.sound();
        d.sound();
        p.sound();
        cw.sound();
        g.sound();

        //instancie
        CatImpl ca = new CatImpl(a);
        DogImpl dogg = new DogImpl(a);
        PigImpl pig = new PigImpl(a);
        GoatImpl goat = new GoatImpl(a);
        CowImlp cow = new CowImlp(a);

        //print zvuku a ulozenie do suboru
        ca.save();
        ca.sound();
        dogg.save();
        dogg.sound();
        pig.save();
        pig.sound();
        goat.save();
        goat.sound();
        cow.save();
        cow.sound();





    }
}
