package com.softeam.bowling.utils;

import com.softeam.bowling.domaine.Roll;

import java.util.ArrayList;
import java.util.List;


public class RollUtil {


    public List<Roll> parse(final String stringRolls) throws ParsingException {
        String inputToParse = stringRolls.replaceAll("\\s+","");
        boolean valid = validateInput(inputToParse);
        if(valid == false)
            throw new ParsingException("Invalid roll !");
        List<Roll> rolls = new ArrayList<Roll>();
        for (int i = 0; i < inputToParse.length(); i++) {
            rolls.add(createRoll(inputToParse, i));
        }
        return rolls;
    }

    private boolean validateInput(String inputToParse){
        int length = inputToParse.length();
        String temp = inputToParse;
        int nbStrike = length - temp.replace("X", "").length();
        int nbChar = length + nbStrike;
        if(inputToParse.charAt(length - 3) == 'X'){
            if(inputToParse.charAt(length - 2) == 'X' && inputToParse.charAt(length - 1) == 'X'){
                return (nbChar == 24);
            }
            else if(inputToParse.charAt(length - 2) == 'X' || inputToParse.charAt(length - 1) == 'X'){
                return (nbChar == 23);
            }
            else {
                return (nbChar == 22);
            }
        }else if(inputToParse.charAt(length - 2) == '/'){
            return (nbChar == 21);
        }else {
            return (nbChar == 20);
        }
    }

    public Roll createRoll(String stringRolls, int i) {
        int numberOfKnockedPins = knockedPinsOf(i, stringRolls);
        return new Roll(numberOfKnockedPins);
    }

    public int knockedPinsOf(int numberOfRoll, String stringRolls) {
        char charToParse = stringRolls.charAt(numberOfRoll);
        if (charToParse == '-') {
            return 0;
        }
        if (charToParse == '/') {
            return 10 - knockedPinsOf(numberOfRoll - 1, stringRolls);
        }
        if (charToParse == 'X') {
            return 10;
        }
        return Character.getNumericValue(charToParse);
    }
}
