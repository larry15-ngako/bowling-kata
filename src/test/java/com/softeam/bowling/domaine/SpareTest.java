package com.softeam.bowling.domaine;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class SpareTest {

    @Test
    public void frameSpareRoll(){
        Frame frame = new Spare(new Roll(1),new Roll(9));
        assertEquals(frame.nbPinsFirstRoll(),1);
        assertEquals(frame.nbPins(),10);
    }

    @Test
    public void frameSpareTrue(){
        Frame frame = new Spare(new Roll(1),new Roll(9));
        assertEquals(frame.isSpare(),true);
    }


    @Test
    public void frameSpareFalse(){
        Frame frame = new Spare(new Roll(1),new Roll(9));
        assertEquals(frame.isStrike(),false);
    }
}
