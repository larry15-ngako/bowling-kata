package com.softeam.bowling;

import com.softeam.bowling.domaine.Bowling;
import com.softeam.bowling.utils.FrameUtil;
import com.softeam.bowling.utils.RollUtil;
import com.softeam.bowling.utils.ParsingException;

import java.util.Scanner;

public class Main {

    public static void main (String[] args){

        RollUtil rollUtil = new RollUtil();
        FrameUtil frameUtil = new FrameUtil();
        Bowling game = new Bowling(rollUtil, frameUtil);
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println(game.getScore(sc.nextLine()));
        } catch (ParsingException e) {
            System.out.println(e.getMessage());
        }


    }
}
