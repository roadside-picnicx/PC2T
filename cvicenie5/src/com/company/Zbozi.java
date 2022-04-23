package com.company;

public abstract class Zbozi {
    private String nazov;
    private double cena;
    public static double DPH = 1.21;

    public Zbozi (String nazov, double cena){
        this.nazov = nazov;
        this.cena = cena;

    }

    public abstract String getJednotka();

    public String getNazov (){
        return nazov;
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }

    public double getCena() {
        return cena*DPH;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

}
