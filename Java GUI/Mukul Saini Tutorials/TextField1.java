import javax.swing.*;
import java.awt.*;

public class TextField1{
	public static void main(String[] a){
		JFrame frame = new JFrame();
		frame.setBounds(200, 100, 500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Testing JTextField");

		Container c = frame.getContentPane();
		c.setLayout(null);

		JTextField nameText = new JTextField();
		nameText.setBounds(100, 100, 100, 30);
		c.add(nameText);
		
		nameText.setText("Hare Krishna");
		Font myFont = new Font("Monotype Corsiva", Font.ITALIC, 20);
		nameText.setFont(myFont);		

		Color myColor = new Color(230, 140, 230);
		nameText.setForeground(Color.DARKBLUE);

		frame.setVisible(true);
	}
}