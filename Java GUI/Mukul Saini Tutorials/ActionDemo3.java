import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame implements ActionListener{
    Container c;
    JButton a_Button, b_Button, c_Button;

    MyFrame(){
        c = this.getContentPane();
        c.setLayout(null);

        a_Button = new JButton("RED");
        b_Button = new JButton("GREEN");
        c_Button = new JButton("BLUE");
    
        a_Button.setBounds(10, 10, 100, 30);
        b_Button.setBounds(200, 10, 100, 30);
        c_Button.setBounds(390, 10, 100, 30);

        c.add(a_Button);
        c.add(b_Button);
        c.add(c_Button);

        a_Button.addActionListener(this);
        b_Button.addActionListener(this);
        c_Button.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == a_Button)
            c.setBackground(Color.RED);
        else if(e.getSource() == b_Button)
            c.setBackground(Color.GREEN);
        else if(e.getSource() == c_Button)
            c.setBackground(Color.BLUE);
    }
}

public class ActionDemo3{
    public static void main(String[] args){
        MyFrame frame = new MyFrame();
        frame.setBounds(100, 50, 700, 500);
        frame.setDefaultCloseOperation(MyFrame.EXIT_ON_CLOSE);
        
        


        frame.setVisible(true);
    }
}