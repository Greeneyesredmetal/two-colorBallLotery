package gui;

import javax.swing.*;
import java.awt.*;


public class PrizePrompt extends JFrame {

	private JPanel myPanel1;
	private JPanel myPanel2;

	private JLabel red_Label1 = new JLabel("红球:");

	private JLabel red_number1 = new JLabel("6");
	private JLabel red_number2 = new JLabel("6");
	private JLabel red_number3 = new JLabel("6");
	private JLabel red_number4 = new JLabel("6");
	private JLabel red_number5 = new JLabel("6");
	private JLabel red_number6 = new JLabel("6");

	private JLabel blue_Label1 = new JLabel("蓝球:");

	private JLabel blue_number1 = new JLabel("6");

	private static JLabel label1 = new JLabel("<html><head><style>p{font-feature-settings: normal;color: red;}</style></style></head><body><p style=\"text-align: center;\">恭喜您获得了一等奖！</p></body></html>");
	private static JLabel label2 = new JLabel("<html><head><style>p{font-feature-settings: normal;color: red;}</style></style></head><body><p style=\"text-align: center;\">恭喜您获得了二等奖！</p></body></html>");
	private static JLabel label3 = new JLabel("<html><head><style>p{font-feature-settings: normal;color: green;}</style></style></head><body><p style=\"text-align: center;\">恭喜您获得了三等奖！</p></body></html>");
	private static JLabel label4 = new JLabel("<html><head><style>p{font-feature-settings: normal;color: green;}</style></style></head><body><p style=\"text-align: center;\">恭喜您获得了四等奖！</p></body></html>");
	private static JLabel label5 = new JLabel("<html><head><style>p{font-feature-settings: normal;color: pink;}</style></style></head><body><p style=\"text-align: center;\">恭喜您获得了五等奖！</p></body></html>");
	private static JLabel label6 = new JLabel("<html><head><style>p{font-feature-settings: normal;color: pink;}</style></style></head><body><p style=\"text-align: center;\">恭喜您获得了六等奖！</p></body></html>");
	private static JLabel label7 = new JLabel("<html><head><style>p{font-feature-settings: normal;color: black;}</style></style></head><body><p style=\"text-align: center;\">很遗憾，没有中奖......</p></body></html>");

	private JLabel red_Label2 = new JLabel("您的红球:");

	private JLabel your_red_number1 = new JLabel("*");
	private JLabel your_red_number2 = new JLabel("*");
	private JLabel your_red_number3 = new JLabel("*");
	private JLabel your_red_number4 = new JLabel("*");
	private JLabel your_red_number5 = new JLabel("*");
	private JLabel your_red_number6 = new JLabel("*");

	private JLabel blue_Label2 = new JLabel("您的蓝球:");

	private JLabel your_blue_number1 = new JLabel("*");

	public PrizePrompt(String[] prizeNumbers, String[] yourNumbers) {
    JFrame frame = new JFrame();
    frame.setTitle("开奖啦！！！");
    frame.setSize(1000, 400);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    ImageIcon imageIcon = new ImageIcon(this.getClass().getResource("../img/twoBallsLottery.png"));
    this.setIconImage(imageIcon.getImage());

    label1.setFont(new Font("Serif",Font.PLAIN,50));
    label2.setFont(new Font("Serif",Font.PLAIN,50));
    label3.setFont(new Font("Serif",Font.PLAIN,50));
    label4.setFont(new Font("Serif",Font.PLAIN,50));
    label5.setFont(new Font("Serif",Font.PLAIN,50));
    label6.setFont(new Font("Serif",Font.PLAIN,50));
    label7.setFont(new Font("Serif",Font.PLAIN,50));

    red_Label1.setFont(new Font("Serif",Font.PLAIN,20));
    red_Label1.setForeground(Color.red);

    red_number1.setFont(new Font("Serif",Font.PLAIN,20));
    red_number1.setForeground(Color.red);
    
    red_number2.setFont(new Font("Serif",Font.PLAIN,20));
    red_number2.setForeground(Color.red);
    
    red_number3.setFont(new Font("Serif",Font.PLAIN,20));
    red_number3.setForeground(Color.red);
    
    red_number4.setFont(new Font("Serif",Font.PLAIN,20));
    red_number4.setForeground(Color.red);
    
    red_number5.setFont(new Font("Serif",Font.PLAIN,20));
    red_number5.setForeground(Color.red);
    
    red_number6.setFont(new Font("Serif",Font.PLAIN,20));
    red_number6.setForeground(Color.red);

    blue_Label1.setFont(new Font("Serif",Font.PLAIN,20));
    blue_Label1.setForeground(Color.blue);

    blue_number1.setFont(new Font("Serif",Font.PLAIN,20));
    blue_number1.setForeground(Color.blue);

    red_Label2.setFont(new Font("Serif",Font.PLAIN,20));
    red_Label2.setForeground(Color.red);

    your_red_number1.setFont(new Font("Serif",Font.PLAIN,20));
    your_red_number1.setForeground(Color.red);
    
    your_red_number2.setFont(new Font("Serif",Font.PLAIN,20));
    your_red_number2.setForeground(Color.red);
    
    your_red_number3.setFont(new Font("Serif",Font.PLAIN,20));
    your_red_number3.setForeground(Color.red);
    
    your_red_number4.setFont(new Font("Serif",Font.PLAIN,20));
    your_red_number4.setForeground(Color.red);
    
    your_red_number5.setFont(new Font("Serif",Font.PLAIN,20));
    your_red_number5.setForeground(Color.red);
    
    your_red_number6.setFont(new Font("Serif",Font.PLAIN,20));
    your_red_number6.setForeground(Color.red);

    blue_Label2.setFont(new Font("Serif",Font.PLAIN,20));
    blue_Label2.setForeground(Color.blue);

    your_blue_number1.setFont(new Font("Serif",Font.PLAIN,20));
    your_blue_number1.setForeground(Color.blue);

    label1.setVisible(false);
    label2.setVisible(false);
    label3.setVisible(false);
    label4.setVisible(false);
    label5.setVisible(false);
    label6.setVisible(false);
    label7.setVisible(false);

    myPanel1 = new JPanel();
    myPanel2 = new JPanel();

    myPanel1.setLayout(new GridLayout(2,9));
    myPanel2.setLayout(new FlowLayout(1,50,100));

	Container container = frame.getContentPane();
	container.setLayout(new BorderLayout());

	container.add(myPanel1,BorderLayout.CENTER);

	container.add(myPanel2,BorderLayout.NORTH);

	myPanel1.add(red_Label1);

	myPanel1.add(red_number1);
	myPanel1.add(red_number2);
	myPanel1.add(red_number3);
	myPanel1.add(red_number4);
	myPanel1.add(red_number5);
	myPanel1.add(red_number6);

	myPanel1.add(blue_Label1);

	myPanel1.add(blue_number1);

	myPanel1.add(red_Label2);

	myPanel1.add(your_red_number1);
	myPanel1.add(your_red_number2);
	myPanel1.add(your_red_number3);
	myPanel1.add(your_red_number4);
	myPanel1.add(your_red_number5);
	myPanel1.add(your_red_number6);

	myPanel1.add(blue_Label2);

	myPanel1.add(your_blue_number1);

	myPanel2.add(label1);
	myPanel2.add(label2);
	myPanel2.add(label3);
	myPanel2.add(label4);
	myPanel2.add(label5);
	myPanel2.add(label6);
	myPanel2.add(label7);

	    //show the prize numbers
        setRed_number1(prizeNumbers[1]);
        setRed_number2(prizeNumbers[2]);
        setRed_number3(prizeNumbers[3]);
        setRed_number4(prizeNumbers[4]);
        setRed_number5(prizeNumbers[5]);
        setRed_number6(prizeNumbers[6]);
        setBlue_number1(prizeNumbers[7]);

        //show the numbers user input
        setYourRed_number1(yourNumbers[1]);
        setYourRed_number2(yourNumbers[2]);
        setYourRed_number3(yourNumbers[3]);
        setYourRed_number4(yourNumbers[4]);
        setYourRed_number5(yourNumbers[5]);
        setYourRed_number6(yourNumbers[6]);
        setYourBlue_number1(yourNumbers[7]);


	}

	//these set method directly set the label's text
	public void setRed_number1(String str){
	    red_number1.setText(str);
    }
    public void setRed_number2(String str){
        red_number2.setText(str);
    }
    public void setRed_number3(String str){
        red_number3.setText(str);
    }
    public void setRed_number4(String str){
        red_number4.setText(str);
    }
    public void setRed_number5(String str){
        red_number5.setText(str);
    }
    public void setRed_number6(String str){
        red_number6.setText(str);
    }
    public void setBlue_number1(String str){
        blue_number1.setText(str);
    }

    public void setYourRed_number1(String str){
        your_red_number1.setText(str);
    }
    public void setYourRed_number2(String str){
        your_red_number2.setText(str);
    }
    public void setYourRed_number3(String str){
        your_red_number3.setText(str);
    }
    public void setYourRed_number4(String str){
        your_red_number4.setText(str);
    }
    public void setYourRed_number5(String str){
        your_red_number5.setText(str);
    }
    public void setYourRed_number6(String str){
        your_red_number6.setText(str);
    }
    public void setYourBlue_number1(String str){
        your_blue_number1.setText(str);
    }

    public static JLabel getLabel1(){
	    return label1;
    }
    public static JLabel getLabel2(){
        return label2;
    }
    public static JLabel getLabel3(){
        return label3;
    }
    public static JLabel getLabel4(){
        return label4;
    }
    public static JLabel getLabel5(){
        return label5;
    }
    public static JLabel getLabel6(){
        return label6;
    }
    public static JLabel getLabel7(){
        return label7;
    }

}


