package functions;

import gui.Appearance;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class lotteryButton implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        TextFunctions tf = new TextFunctions();

        int i = 0;

        tf.lotteryButton(Appearance.prizeNumbers);

        int[] savePrizeNumbers = new int[8];
        for (i = 1 ; i < Appearance.prizeNumbers.length ; i++){
            savePrizeNumbers[i] = Integer.parseInt(Appearance.prizeNumbers[i]);
        }

        int[] yourNumbers = new int[8];
        for (i = 1 ; i < Appearance.times ; i++){
            yourNumbers[i] = Integer.parseInt(Appearance.ballsNumberText[i].getText());
        }

        int is = tf.judge(yourNumbers,savePrizeNumbers);
        tf.setPrizeShow(is);

    }
}
