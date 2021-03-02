package com.softeam.bowling.service;

import com.softeam.bowling.domaine.Frame;
import com.softeam.bowling.domaine.Roll;
import com.softeam.bowling.utils.FrameUtil;
import com.softeam.bowling.utils.ParsingException;
import com.softeam.bowling.utils.RollUtil;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;


public class FrameUtilTest {

    List<Roll> rolls;
    RollUtil rollUtil;

    @Before
    public void setUp(){
        rollUtil = new RollUtil();
        rolls = null;
    }


    @Test
    public void CreateFramesStrike(){
        String input = "XXXXXXXXXXXX";
        try {
            rolls = rollUtil.parse(input);
        } catch (ParsingException e) {
            Assert.fail();
        }
        FrameUtil frameUtil = new FrameUtil();
        List<Frame> allFrames = frameUtil.parse(rolls);
        assertEquals(allFrames.size(),12);
        for(Frame frame : allFrames){
            assertEquals(frame.nbPins(),10);
        }
    }


    @Test
    public void CreateFramesSpare(){
        String input = "1/1/1/1/1/1/1/1/1/1/2";
        try {
            rolls = rollUtil.parse(input);
        } catch (ParsingException e) {
            Assert.fail();
        }
        FrameUtil frameUtil = new FrameUtil();
        List<Frame> allFrames = frameUtil.parse(rolls);
        assertEquals(allFrames.size(),11);
        for(int i=0;i<allFrames.size()-1;i++)
            assertEquals(allFrames.get(i).nbPins(),10);
        assertEquals(allFrames.get(allFrames.size()-1).nbPins(),2);
    }



}
