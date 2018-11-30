import functions.*;
import gui.Appearance;

public class Main {
    public static void main(String [] args){
        //create a object of  class TextFunctions
        TextFunctions funcTest = new TextFunctions();

        //create a object of Appearance
        Appearance app = new Appearance();
        //listener and handler
        BallsNumberDisplay displayer = new BallsNumberDisplay();

        //show up prize mount
        funcTest.prizeShow(app.getPrizeText());

        //listen three buttons
        app.getStatementButton().addActionListener(new StatementButton());
        app.getLotteryButton().addActionListener(new lotteryButton());
        app.getBeginButton().addActionListener(new submitButton());

        //listen input text
        Appearance.getInput().addActionListener(displayer);
    }
}
