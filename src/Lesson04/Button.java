package Lesson04;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Check");
    }
}