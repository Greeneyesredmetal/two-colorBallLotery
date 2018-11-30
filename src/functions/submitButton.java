package functions;

import gui.Appearance;
import gui.submitSuccess;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class submitButton implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {

        TextFunctions tf = new TextFunctions();
        new submitSuccess();

        //make users can click lottery button
        tf.setLotteryUnlocked(Appearance.getLotteryButton());
    }
}
