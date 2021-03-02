package com.softeam.bowling.utils;

import com.softeam.bowling.domaine.Frame;
import com.softeam.bowling.domaine.Roll;
import com.softeam.bowling.domaine.FrameFactory;

import java.util.ArrayList;
import java.util.List;


public class FrameUtil {

    public List<Frame> parse(final List<Roll> rolls) {

        List<Frame> frames = new ArrayList<Frame>();
        int nbrOfRoll=0;
        FrameFactory frameFactory = new FrameFactory();
        while (nbrOfRoll < rolls.size()){
            Frame currentFrame =frameFactory.getFrame(rolls, nbrOfRoll);
            if(currentFrame.isStrike()){
                nbrOfRoll++;
            }
            else{
                nbrOfRoll = nbrOfRoll + 2;
            }
            frames.add(currentFrame);
        }

        return frames;
    }

}
