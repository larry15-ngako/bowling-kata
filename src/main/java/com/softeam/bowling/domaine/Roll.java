package com.softeam.bowling.domaine;


public class Roll {

    private int nbPins;

    public Roll(int nbPins) {

        this.nbPins = nbPins;
    }

    public Roll(){

        this.nbPins = 0;
    }

    public int getNbPins() {

        return nbPins;
    }

    public void setNbPins(int nbPins) {
        this.nbPins = nbPins;
    }
}
