package com.qa;

public class Blackjack {

    public int play(int handOne, int handTwo) {

        if (handOne == handTwo) {
            return 0;
        }
        if (handOne < 2 || handTwo < 2) {
            return 0;
        } else if (handOne > 21 && handTwo > 21) {
            return 0;
        } else if (handOne > 21) {
            return handTwo;
        } else if (handTwo > 21) {
            return handOne;
        } else if (handOne > handTwo) {
            return handOne;
        } else {
            return handTwo;
        }

    }


}
