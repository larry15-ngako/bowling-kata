package com.softeam.bowling.service;

import com.softeam.bowling.domaine.Roll;
import com.softeam.bowling.utils.ParsingException;
import com.softeam.bowling.utils.RollUtil;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


import java.util.List;

import static org.junit.Assert.assertEquals;

public class RollUtilTest {

    RollUtil parser;

    @Before
    public void setUp(){
        parser = new RollUtil();
    }


    @Test
    public void ExpectedNbrPins(){
        String input = "-";
        int result = parser.knockedPinsOf(0,input);
        assertEquals(result,0);
    }
    @Test
    public void ParseExpected_10(){
        String input = "XXXXXXXXXXXX";
        List<Roll> rolls = null;
        try {
            rolls = parser.parse(input);
        } catch (ParsingException e) {
            Assert.fail();
        }
        assertEquals(rolls.size(),12);
        for(Roll r : rolls)
            assertEquals(r.getNbPins(),10);
    }

    @Test
    public void ExpectedNmberPins_10(){
        String input = "X";
        int result = parser.knockedPinsOf(0,input);
        assertEquals(result,10);
    }


    @Test
    public void ParseFailStrikeA(){
        String input = "XXXXXXXXXXX//";
        List<Roll> rolls = null;
        try {
            rolls = parser.parse(input);
            Assert.fail();
        } catch (ParsingException e) {
            assertEquals(e.getMessage(),"Invalid roll !");
        }
    }
}
