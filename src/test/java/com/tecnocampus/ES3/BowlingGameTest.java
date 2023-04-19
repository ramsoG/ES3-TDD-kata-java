package com.tecnocampus.ES3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.google.common.truth.Truth.assertThat;

public class BowlingGameTest {

    private Game g;
    @BeforeEach
    public void setUp(){
        g = new Game();
    }

    @Test
    public void gutter_game() {
        var rolls = 20;
        var pins = 0;
        rollMany(rolls, pins);
        assertThat(g.score()).isEqualTo(0);
    }

    private void rollMany(int rolls, int pins) {
        for (var i = 0; i < rolls; i += 1)
            g.roll(pins);
    }

    @Test
    public void all_ones() {
        for (var i = 0; i < 20; i += 1)
            g.roll(1);
        assertThat(g.score()).isEqualTo(20);
    }
}
