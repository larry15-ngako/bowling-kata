package com.softeam.bowling.domaine;


public class Spare extends Frame{

    public Spare(Roll rollOne, Roll rollTwo) {

        super(rollOne, rollTwo);
    }

    public boolean isSpare(){
        return true;
    }
}
