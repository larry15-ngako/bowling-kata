package com.softeam.bowling.domaine;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class StrikeTest {

    @Test
    public void frameStrikeRollFrame(){
        Frame frame = new Strike(new Roll(10));
        assertEquals(frame.nbPinsFirstRoll(),10);
        assertEquals(frame.nbPins(),10);
    }


    @Test
    public void frameStrikeRollPinsTEpectedTrue_10(){
        Frame frame = new Strike(new Roll(10));
        assertEquals(frame.isStrike(),true);
    }


    @Test
    public void frameStrikeRollPinsTEpectedFalse_10(){
        Frame frame = new Strike(new Roll(10));
        assertEquals(frame.isSpare(),false);
    }
}
