package com.softeam.bowling.domaine;


import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class FrameFactoryTest {

    FrameFactory factory;

    @Before
    public void setUp(){

        factory = new FrameFactory();
    }


    @Test
    public void rollOfPins_2(){
        List<Roll> rolls = new ArrayList<Roll>();
        rolls.add(new Roll(1));
        rolls.add(new Roll(1));
        Frame frame = factory.getFrame(rolls,0);
        assertEquals(frame.isSpare(),false);
        assertEquals(frame.isStrike(),false);
        assertEquals(frame.nbPins(),2);

    }


    @Test
    public void rollsOfSpare_10(){
        List<Roll> rolls = new ArrayList<Roll>();
        rolls.add(new Roll(1));
        rolls.add(new Roll(9));
        Frame frame = factory.getFrame(rolls,0);
        assertEquals(frame.isSpare(),true);
        assertEquals(frame.nbPins(),10);
    }
}
