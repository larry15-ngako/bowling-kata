package com.softeam.bowling.domaine;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class FrameTest {


    @Test
    public void frameOfRolls_1(){
        Frame frame = new Frame(new Roll(1),new Roll(1));
        assertEquals(frame.nbPinsFirstRoll(),1);
        assertEquals(frame.nbPins(),2);
        assertEquals(frame.isStrike(),false);
        assertEquals(frame.isSpare(),false);

    }

}
