package com.softeam.bowling.domaine;


public class Frame {
    private Roll rollOne;
    private Roll rollTwo;

    public Frame(Roll rollOne,Roll rollTwo){
        this.rollOne = rollOne;
        this.rollTwo = rollTwo;
    }


    public Frame(Roll rollOne) {
        this.rollOne = rollOne;
        this.rollTwo = new Roll();
    }

    public int nbPins() {

        return rollOne.getNbPins() + rollTwo.getNbPins();
    }

    public int nbPinsFirstRoll() {

        return rollOne.getNbPins();
    }

    public boolean isStrike(){

        return false;
    }

    public boolean isSpare(){

        return false;
    }
}
