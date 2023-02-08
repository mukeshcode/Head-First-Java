import javax.swing.*;
import java.awt.*;

public class Overview{
	public static void main(String[] args){
		JFrame frame = new JFrame();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setLocation(100,50);
		//frame.setSize(700, 500);
		frame.setBounds(100, 50, 700, 500);
		frame.setTitle("AttenDANZ");

		ImageIcon icon = new ImageIcon("banner.jpg");
		frame.setIconImage(icon.getImage());

		JLabel appTitle = new JLabel(":) CUSAT AttenDANZ (:");
	
		Container c = frame.getContentPane();
		c.setLayout(null);
		Color myColor = new Color(204, 255, 255);
		c.setBackground(myColor);
		appTitle.setLocation(180, 0);
		appTitle.setSize(500, 100);

		Font myFont = new Font("Century Gothic", Font.BOLD, 30);
		appTitle.setFont(myFont);
		c.add(appTitle);
		
		JLabel appLogo = new JLabel(icon);
		appLogo.setBounds(230, 100, 200, 200);
		c.add(appLogo);

		
		frame.setResizable(false);

		frame.setVisible(true);
	}
}	