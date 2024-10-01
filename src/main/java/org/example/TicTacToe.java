package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class TicTacToe extends JFrame implements ActionListener {
    JFrame frame;
    JPanel panel;

    List<JButton> buttons = new ArrayList<>();

    static Font DEFAULT_FONT = new Font(Font.SANS_SERIF, Font.PLAIN, 30);
    static Dimension DEFAULT_BUTTON_SIZE = new Dimension(100, 100);

    // default constructor
    TicTacToe() {
        // create frame
        frame = new JFrame("Tic-Tac-Toe");
        frame.setFont(DEFAULT_FONT);

        // create panel
        panel = new JPanel();
        panel.setFont(DEFAULT_FONT);

        // add buttons
        for (int i = 0; i < 3; i++) {
            for (int y = 0; y < 3; y++) {
                JButton button = new JButton();

                // set the button name so that we can recognize it
                button.setName(i + ":" + y);

                // set number buttons size and font
                button.setPreferredSize(DEFAULT_BUTTON_SIZE);
                button.setFont(DEFAULT_FONT);

                // add button action listeners
                button.addActionListener(this);

                panel.add(button);
                buttons.add(button);
            }
        }

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 385);

        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        System.out.println(button.getName());

        button.setText("O");
    }
}
