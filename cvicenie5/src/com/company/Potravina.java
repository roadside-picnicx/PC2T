package com.company;

public class Potravina extends Zbozi {
   private int trvanlivost;

    Potravina (String nazov, double cena, int trvanlivost){
        super (nazov, cena);
        this.trvanlivost = trvanlivost;
    }

    @Override
    public String toString() {
        return "Potravina" +" "+ this.getNazov() +" "+ this.getCena() +" "+ trvanlivost +" "+ getJednotka();

    }

    public String getJednotka(){
        return "dní";
    }

    public int getTrvanlivost() {
        return trvanlivost;
    }

    public void setTrvanlivost(int trvanlivost) {
        this.trvanlivost = trvanlivost;
    }


}

