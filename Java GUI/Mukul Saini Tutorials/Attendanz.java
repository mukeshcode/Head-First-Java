import javax.swing.*;
import java.awt.*;

public class Attendanz{
	public static void main(String[] args){
		JFrame frame = new JFrame();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		//frame.setLocation(dim.width - frame.getSize().width/2, dim.height - frame.getSize().height/2);

		
		frame.setSize(700, 500);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		//frame.setBounds(100, 50, 700, 500);
		frame.setTitle("AttenDANZ");

		ImageIcon icon = new ImageIcon("krishna.png");
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
		appLogo.setSize(200, 200);
		appLogo.setLocation((frame.getSize().width/2) - (appLogo.getSize().width/2), 100);
		c.add(appLogo);


		JTextField usernameEditText = new JTextField("Username");
		usernameEditText.setSize(200, 30);
		usernameEditText.setLocation(frame.getSize().width/2 - usernameEditText.getSize().width/2, 310);
		usernameEditText.setForeground(new Color(51, 51, 255));
		c.add(usernameEditText);

		JPasswordField passText = new JPasswordField("Password");
		passText.setSize(200, 30);
		passText.setLocation(frame.getSize().width/2 - usernameEditText.getSize().width/2, 345);
		passText.setForeground(new Color(51, 51, 255));
		//passText.setEchoChar('*');
		c.add(passText); 

		JButton signupButton = new JButton("SIGN UP");
		signupButton.setSize(100, 40);
		JButton loginButton = new JButton("LOG IN");
		loginButton.setSize(100, 40);

		signupButton.setLocation(passText.getX(), 400);
		signupButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		c.add(signupButton);

		
		loginButton.setLocation(signupButton.getX()+ signupButton.getSize().width, 400);
		loginButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		c.add(loginButton);

		
		
		frame.setVisible(true);
	}
}	