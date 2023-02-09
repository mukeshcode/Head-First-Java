// program for setting a label with text and image

import javax.swing.*;
import java.awt.*;

public class JLabel2{
	public static void main(String[] args){
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(0,0, 1000, 700);
		frame.setResizable(false);


		ImageIcon appImage = new ImageIcon("krishna.png");
		JLabel label = new JLabel("Hari", appImage, JLabel.LEFT);
		label.setBounds(0,100, 800, 100);
		
		Container c = frame.getContentPane();
		c.setLayout(null);
		c.add(label);

		frame.setVisible(true);
	}
}