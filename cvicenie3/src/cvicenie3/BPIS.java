package cvicenie3;

import cvicenie3.Predmet;

public class BPIS implements Predmet {

    private int points = 0;
    private boolean zapocet = false;

    @Override
    public String getName() {
        return "BPIS";
    }

    @Override
    public int getPoints() {
        return this.points;
    }

    @Override
    public boolean getZapocetStatus() {
        return this.zapocet;
    }

    public boolean giveZapocet(String choice) { // uznanie zapoctu
        if (choice.equals("ano")) {
            this.zapocet = true;
            return true;
        }
        if(choice.equals("nie"))
            return true;
        else {
            System.out.println("Nespravna volba");
            return false;
        }

    }
}