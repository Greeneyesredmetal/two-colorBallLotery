package functions;

import gui.Appearance;
import gui.PrizePrompt;

import javax.swing.*;
import java.awt.*;

public class TextFunctions {


	public void prizeShow(JLabel myJtext) {
		// TODO Auto-generated method stub
		//here use "Double" class, to make it more humanize
		Double prize = Math.random() *1e10;
		myJtext.setText("<html><head><style>p{color: orange;font-feature-settings: normal;font-size: 25px}</style></style></head><body>" + "当前奖金 " +"<p>" + "￥" + prize.longValue() + "</p></body></html>");
	}

	public void lotteryButton(String[] prizeNumbers) {
		// TODO Auto-generated method stub
		int i =0;

		//this for loop to get numbers user input
		String[] yourNumbers = new String[8];
		for (i = 1 ; i < Appearance.times ; i++){
			yourNumbers[i] = Appearance.ballsNumberText[i].getText();
		}

		//create a windows
		new PrizePrompt(prizeNumbers,yourNumbers);

	}


	public void setRedInput(JTextField myJtext,String input) {
		// TODO Auto-generated method stub
		Font f = new Font("宋体",Font.PLAIN,35);
		myJtext.setText(input);
		myJtext.setFont(f);
		myJtext.setForeground(Color.red);
	}

	public void setBlueInput(JTextField myJtext,String input) {
		// TODO Auto-generated method stub
		Font f = new Font("宋体",Font.PLAIN,35);
		myJtext.setText(input);
		myJtext.setFont(f);
		myJtext.setForeground(Color.blue);
	}
	
	public void resetInput(JTextField myJtext) {
		myJtext.setText("");
	}

	public static void setInputLocked(JTextField myJtext){
		myJtext.setEnabled(false);
		myJtext.setText("输入完毕");
	}

	public void setLotteryUnlocked(JButton myJbutton){
		myJbutton.setEnabled(true);
	}

	public void setSubmitUnlocked(JButton myJbutton){
		myJbutton.setEnabled(true);
	}

	public static void changePrompt(JLabel prompt) {
		prompt.setText("从1到16中选出一个蓝色球:");
	}

	//get random number between min and max
	public static int randomBetween(int min, int max){
		int randomNumber = 0;
		randomNumber = min + (int)(Math.random() * (max - min + 1));
		return randomNumber;
	}

	public  void setPrizeShow(int denpendent){

		switch(denpendent){
			case 7:
				PrizePrompt.getLabel1().setVisible(true);
				break;
			case 6:
				PrizePrompt.getLabel2().setVisible(true);
				break;
			case 5:
				PrizePrompt.getLabel3().setVisible(true);
				break;
			case 4:
				PrizePrompt.getLabel4().setVisible(true);
				break;
			case 3:
				PrizePrompt.getLabel5().setVisible(true);
				break;
			case 2:
				PrizePrompt.getLabel6().setVisible(true);
				break;
			default:
				PrizePrompt.getLabel7().setVisible(true);
				break;
		}
	}

	public int judge(int[] userInput,int[] prizeNumbers) {

		//index
		int i = 0;
		//the String to return

		//times to judge
		int redTimes = 0;
		int blueTimes = 0;
		int fina = 0;

		int[] redPrize = new int[7];
		for (i = 1 ; i < prizeNumbers.length - 1 ; i++){
			redPrize[i] = prizeNumbers[i];
		}
		// numbers that can prize
		for(i = 1 ; i < userInput.length ; i++) {
			if(i < userInput.length - 1) {
				if (isExist(userInput[i], redPrize)) {
					redTimes++;
				}
			}else {
				if (userInput[userInput.length - 1] == prizeNumbers[prizeNumbers.length - 1]) {
					blueTimes++;
				}
			}
		}

		fina = redTimes + blueTimes;
		return fina;

	}

	public boolean isExist(int input,int[] prizeNumbers) {

		// value to return
		boolean is = false;

		//index
		int i;
		for(i = 0 ;i < prizeNumbers.length ; i++) {
				if (input == prizeNumbers[i]) {
					//change the value
					is = true;
					//in case to same numbers
					prizeNumbers[i] = -1;
					//beak loop
					break;
			}
		}

		return is;
	}
/*	public void setOrder(int[] prizeNumbers) {
		int i,j = 0;

		for(i = 0 ; i < prizeNumbers.length ; i++) {
			for(j = i + 1 ; j < prizeNumbers.length ; j++ ) {
				if(prizeNumbers[i] > prizeNumbers[j]) {
					int temp = prizeNumbers[i];
					prizeNumbers[i] = prizeNumbers[j];
					prizeNumbers[j] = temp;
				}
			}
		}
	}

	public void printOrder(int[] prizeNumbers) {
		int i = 0;
		for(i = 0 ; i < prizeNumbers.length ; i++) {
			System.out.println(prizeNumbers[i]);
		}
	}

	public int checkSame(int[] prizeNumbers) {

		int sameElementNumber = 0;

		return sameElementNumber;
	}
*/

}
