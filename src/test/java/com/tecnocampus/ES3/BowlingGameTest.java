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
        rollMany(20, 0);
        assertThat(g.score()).isEqualTo(0);
    }

    private void rollMany(int rolls, int pins) {
        for (var i = 0; i < rolls; i += 1)
            g.roll(pins);
    }

    @Test
    public void all_ones() {
        rollMany(20,1);
        assertThat(g.score()).isEqualTo(20);
    }
}
