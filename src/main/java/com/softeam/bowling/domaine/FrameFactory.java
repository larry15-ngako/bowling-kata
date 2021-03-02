package com.softeam.bowling.domaine;

import java.util.List;

public class FrameFactory {

    public Frame getFrame(final List<Roll> rolls, int i) {
        Roll rollOne = rolls.get(i);
        if(rollOne.getNbPins() == 10){
            return new Strike(rolls.get(i));
        }
        Roll rollTwo;
        if(i+1 < rolls.size()){
            rollTwo = rolls.get(i+1);
            if(rollOne.getNbPins() + rollTwo.getNbPins() == 10){
                return new Spare(rolls.get(i), rolls.get(i+1));
            }
        }
        else{
            rollTwo = new Roll();
        }

        return new Frame(rollOne, rollTwo);
    }
}
