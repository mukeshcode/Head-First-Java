import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ActionDemo5{
	
	public static Container c;
	
	public static void main(String[] args){
		JFrame frame = new JFrame("ActionDemo");
		frame.setBounds(100, 100, 500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		c = frame.getContentPane();
		c.setLayout(null);		

		JButton redBtn = new JButton("RED");
		JButton greenBtn = new JButton("GREEN");
		JButton blueBtn = new JButton("BLUE");

		redBtn.setBounds(10, 100, 100, 30);
		greenBtn.setBounds(110, 100, 100, 30);
		blueBtn.setBounds(210, 100, 100, 30);

		c.add(redBtn);
		c.add(greenBtn);
		c.add(blueBtn);

		redBtn.addActionListener(new RedClass());
		greenBtn.addActionListener(new GreenClass());
		blueBtn.addActionListener(new BlueClass());

		frame.setVisible(true);
	}

}

class RedClass implements ActionListener{
	public void actionPerformed(ActionEvent e){
		ActionDemo5.c.setBackground(Color.RED);
	}
}

class GreenClass implements ActionListener{
	public void actionPerformed(ActionEvent e){
		ActionDemo5.c.setBackground(Color.GREEN);
	}
}

class BlueClass implements ActionListener{
	public void actionPerformed(ActionEvent e){
		ActionDemo5.c.setBackground(Color.BLUE);
	}
}