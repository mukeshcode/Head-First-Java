import javax.swing.*;
import java.awt.*;

public class JLabel1{
	public static void main(String[] args){
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setBounds(100, 100, 700, 500);
		frame.setTitle("AttenDANZ");
		
		Container c = frame.getContentPane();
		c.setLayout(null);		

		JLabel username = new JLabel("Username");
		username.setBounds(100, 50, 200, 50);

		// Creating a font
		Font font = new Font("Monotype Corsiva", Font.BOLD, 30);
		username.setFont(font);

		c.add(username);

		ImageIcon icon = new ImageIcon("banner.jpg");
		frame.setIconImage(icon.getImage());
		JLabel imageIcon = new JLabel(icon);
		imageIcon.setBounds(50, 100, icon.getIconWidth(), icon.getIconHeight());	
		c.add(imageIcon);
		frame.setVisible(true);
	}
}