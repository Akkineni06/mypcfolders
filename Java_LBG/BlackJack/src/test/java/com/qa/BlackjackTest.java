package com.qa;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BlackjackTest {

    @BeforeAll
    public void setup(){

    }
    @BeforeEach
            public void


    Blackjack blackjack = new Blackjack();

    @Test
    @DisplayName("Invalid hand")
    public void handOneTwoHandTwoTwo(){
        int handOne = 1;
        int handTwo = 0;
        int expected = 0;
        assertEquals(expected, blackjack.play(handOne, handTwo));
        assertEquals(0, blackjack.play(0, 1));
    }

    @Test
    public void handOneHandTwoSame(){
        int handOne = 13;
        int handTwo = 13;
        int expected = 0;
        assertEquals(expected, blackjack.play(handOne, handTwo));
    }

    @Test
    public void handOneHandTwoGreater21(){
        int handOne = 22;
        int handTwo = 22;
        int expected = 0;
        assertEquals(expected, blackjack.play(handOne, handTwo));
    }
    @Test
    public void handOneBustHandTwoWin(){
        int handOne = 23;
        int handTwo = 17;
        int expected = 17;
        assertEquals(expected, blackjack.play(handOne, handTwo));
    }
    @Test
    public void handTwoBustHandOneWin(){
        int handOne = 21;
        int handTwo = 23;
        int expected = 21;
        assertEquals(expected, blackjack.play(handOne, handTwo));
    }
    @Test
    public void handOneGreaterHandTwo(){
        int handOne = 21;
        int handTwo = 20;
        int expected = 21;
        assertEquals(expected, blackjack.play(handOne, handTwo));
    }
    @Test
    public void handTwoGreaterHandOne(){
        int handOne = 15;
        int handTwo = 19;
        int expected = 19;
        assertEquals(expected, blackjack.play(handOne, handTwo));
    }


}
