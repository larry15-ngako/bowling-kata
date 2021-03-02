package com.softeam.bowling.domaine;

import com.softeam.bowling.service.ScoreService;
import com.softeam.bowling.utils.ParsingException;
import com.softeam.bowling.utils.FrameUtil;
import com.softeam.bowling.utils.RollUtil;


public class Bowling {

    private final RollUtil rollUti;
    private final FrameUtil frameUtil;

    public Bowling(RollUtil rollUti, FrameUtil frameUtil) {
        this.rollUti = rollUti;
        this.frameUtil = frameUtil;
    }

    public int getScore(String input) throws ParsingException {
        return new ScoreService(
                    this.frameUtil.parse(
                        this.rollUti.parse(input)
                        )
                    ).scoreResult();
    }

}
