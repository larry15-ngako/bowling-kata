package com.softeam.bowling.service;

import com.softeam.bowling.domaine.Frame;

import java.util.List;


public class ScoreService {

    public final int max = 10;
    public List<Frame> frames;
    public int result = 0;

    public ScoreService(final List<Frame> frames){

        this.frames = frames;
    }


    public int scoreResult() {
        if(frames != null){
            for(int i = 0; i < max; i++){
                if(frames.get(i).isStrike()){
                    result +=  frames.get(i).nbPins() + getStrikeBonus(i);
                }
                else if(frames.get(i).isSpare()){
                    result += frames.get(i).nbPins() + getSpareBonus(i);
                }
                else {
                    result += frames.get(i).nbPins();
                }
            }
            return result;
        }
        else{
            return 0;
        }

    }

    private int getSpareBonus(int i) {

        return getNextFrame(i).nbPinsFirstRoll();
    }

    private int getStrikeBonus(int i) {
        int bonus = 0;
        if(getNextFrame(i).isStrike()){
            bonus = getNextFrame(i).nbPins() + getNextFrame(i+1).nbPinsFirstRoll();
        }
        else{
            bonus = getNextFrame(i).nbPins();
        }

        return bonus;
    }

    private Frame getNextFrame(int i){
        return frames.get(i+1);
    }
}
