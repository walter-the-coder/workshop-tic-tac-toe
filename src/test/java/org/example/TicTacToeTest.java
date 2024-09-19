package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TicTacToeTest {
    TicTacToe ticTacToe = new TicTacToe();

    @Test
    @DisplayName("What should this test cover?")
    public void addition() {
        ticTacToe.buttons.get(0).doClick();
    }
}
