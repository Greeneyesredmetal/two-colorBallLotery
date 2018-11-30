package gui;

import javax.swing.*;
import java.awt.*;

public class statement extends JFrame{
    public statement(){
        JLabel label = new JLabel();
        label.setFont(new Font("Serif",Font.PLAIN,25));
        label.setText("<html><body><p>developers: B17080513 jwr B17080522 sql B17080529 clf</p></br><p>time:2018-10-24</p></br><p>Contact information:824845410@qq.com</p></body></html>");

        Container container = getContentPane();
        container.setLayout(new BorderLayout());
        container.add(label,BorderLayout.CENTER);

        statement frame = this;
        JFrame.setDefaultLookAndFeelDecorated(true);//java style
        //make visible,base set
        frame.setVisible(true);
        frame.setSize(400,260);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setResizable(false);
        //need a listener to make it connect with the button named statement
        frame.setLocationRelativeTo(null);
        //传入参数null 即可让JFrame 位于屏幕中央, 这个函数若传入一个Component ,则JFrame位于该组件的中央

        ImageIcon imageIcon = new ImageIcon(this.getClass().getResource("../img/twoBallsLottery.png"));
        this.setIconImage(imageIcon.getImage());
    }
}