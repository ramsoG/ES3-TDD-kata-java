package com.tecnocampus.ES3;

import org.junit.jupiter.api.Test;

public class BowlingGameTest {

    @Test
    public void create_game() {
        var g = new Game();
    }

    @Test
    public void roll_a_ball(){
        var g = new Game();
        g.roll(0);
    }
}
