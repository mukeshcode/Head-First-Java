import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame implements ActionListener{
	Container c;
	JButton login;

	MyFrame(){
		c = this.getContentPane();
		c.setLayout(null);
		login = new JButton("LOGIN");
		login.setBounds(10, 10, 100, 30);	
		login.addActionListener(this);
		c.add(login);	
	}

	public void actionPerformed(ActionEvent e){
		c.setBackground(Color.GREEN);
	}
}

public class ActionDemo1{
	public static void main(String[] args){
		MyFrame frame = new MyFrame();
		frame.setTitle("Action Demo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(20, 20, 500, 300);
		
		frame.setVisible(true);
	}
}