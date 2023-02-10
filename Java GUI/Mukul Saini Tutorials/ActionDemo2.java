import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame implements ActionListener{
    Container c;
    JButton myButton;

    MyFrame(){
        c = this.getContentPane();
        myButton = new JButton("Login");
        myButton.setBounds(10, 10, 100, 30);
        myButton.addActionListener(this);
        c.setLayout(null);
        c.add(myButton);
    }
    public void actionPerformed(ActionEvent e){
        c.setBackground(Color.YELLOW);
    }
}

public class ActionDemo2{
    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame();
        myFrame.setBounds(0, 0, 500, 300);
        myFrame.setDefaultCloseOperation(myFrame.EXIT_ON_CLOSE);



        myFrame.setVisible(true);
    }
}