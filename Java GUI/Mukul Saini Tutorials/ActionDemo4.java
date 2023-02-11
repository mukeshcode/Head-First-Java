import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ActionDemo4{
	public static void main(String[] args){
		JFrame frame = new JFrame();
		frame.setBounds(100, 100, 500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = frame.getContentPane();
		c.setLayout(null);	
	
		JButton loginBtn = new JButton("LOGIN");
		loginBtn.setBounds(10, 10, 100, 30);
		c.add(loginBtn);

		loginBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				c.setBackground(Color.GREEN);
			}
		});

		frame.setVisible(true);
	}
}