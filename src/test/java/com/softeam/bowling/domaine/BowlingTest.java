package com.softeam.bowling.domaine;

import com.softeam.bowling.utils.FrameUtil;
import com.softeam.bowling.utils.ParsingException;
import com.softeam.bowling.utils.RollUtil;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BowlingTest {

    RollUtil rollUtil;
    FrameUtil frameUtil;
    Bowling game;

    @Before
    public void setUp(){
        rollUtil = new RollUtil();
        frameUtil = new FrameUtil();
        game = new Bowling(rollUtil, frameUtil);
    }
    /**
     *    XXXXXXXXXXXX (12 strike)  expected score  300
     */

    @Test
    public void allStrikes_300() throws ParsingException {
        String input = "X X X X X X X X X X X X";
        assertEquals(300, game.getScore(input));
    }


    /**
     *   9-9-9-9-9-9-9-9-9-9-  expected score  90
     */
    @Test
    public void missExpected_90() throws ParsingException {
        String input = "9- 9- 9- 9- 9- 9- 9- 9- 9- 9-";
        assertEquals(game.getScore(input),90);
    }

    /**
     *    5/5/5/5/5/5/5/5/5/5/5  expected score 150
     */
    @Test
    public void pareWithFinalFiveExpected_150() throws ParsingException {
        String input = "5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/5";
        assertEquals(game.getScore(input),150);
    }

    /**
     *   XXXX--XXXXXXX   expected score  240
     */
    @Test
    public void SpareWithFinalFiveExpected_240() throws ParsingException {
        String input = "X X X X -- X X X X X X X";
        assertEquals(game.getScore(input),240);
    }
}
