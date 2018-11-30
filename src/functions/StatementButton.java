package functions;

import gui.statement;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StatementButton implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        new statement();
    }
}
