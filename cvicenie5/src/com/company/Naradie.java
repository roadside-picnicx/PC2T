package com.company;

public class Naradie extends Zbozi {
    private int zaruka;

    Naradie (String nazov, double cena, int zaruka){
        super (nazov, cena);
        this.zaruka = zaruka;
    }

    @Override
    public String toString() {
        return "Naradie " +" "+ this.getNazov() + " "+  this.getCena() +" "+ zaruka +" "+ getJednotka();

    }

    public int getZaruka() {
        return zaruka;
    }

    public void setZaruka(int zaruka) {
        this.zaruka = zaruka;
    }

    public String getJednotka(){
        return "mesiacov";
    }
}
