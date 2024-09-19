package org.example;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

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

        // create panel
        panel = new JPanel();

        // add buttons
        for (int i = 1; i < 10; i++) {
            JButton button = new JButton();

            // set the button name so that we can recognize it
            button.setName(Integer.toString(i));

            // set number buttons size and font
            button.setPreferredSize(DEFAULT_BUTTON_SIZE);
            button.setFont(DEFAULT_FONT);

            // add button action listeners
            button.addActionListener(this);

            panel.add(button);
            buttons.add(button);
        }

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(320, 355);

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
