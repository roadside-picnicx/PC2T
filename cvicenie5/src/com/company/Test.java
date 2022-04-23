package com.company;

public class Test {

    public static void main(String[] args) {
        Zbozi[] zoznam = new Zbozi[4];
        zoznam[0] = new Potravina("rohlik", 1.5, 1);
        zoznam[1] = new Naradie("klieste", 278.0, 24);
        zoznam[2] = new Potravina("chleba", 20.8, 6);
        zoznam[3] = new Potravina("jablko", 51.0, 20);

        for (int i = 0; i < 4; i++) {

            System.out.println(zoznam[i].toString());
        }
    }

}
