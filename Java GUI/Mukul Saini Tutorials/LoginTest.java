import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class LoginWindow extends JFrame{
	JLabel username_label;
	JLabel password_label;
	JTextField username_text;
	JPasswordField password_pass;
	JButton loginBtn;
	Container c;
	Font font;
	boolean flag;

	LoginWindow(){
		this.setTitle("Attendanz Login");
		this.setSize(500, 200);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(LoginWindow.EXIT_ON_CLOSE);
		font = new Font("Arial", Font.PLAIN, 16);
		username_label = new JLabel("Username");
		username_label.setBounds(20, 20, 150, 30);
		username_label.setFont(font);

		username_text = new JTextField();
		username_text.setBounds(150, 20, 300, 30);


		password_label = new JLabel("Password");
		password_label.setBounds(20, 60, 150, 30);
		password_label.setFont(font);

		password_pass = new JPasswordField();
		password_pass.setBounds(150, 60, 300, 30);

		loginBtn = new JButton("LOGIN");
		loginBtn.setSize(150, 40);
		loginBtn.setLocation(this.getSize().width/2 - loginBtn.getSize().width/2, 120);

		c = this.getContentPane();
		c.setLayout(null);

		c.add(username_label);
		c.add(username_text);
		c.add(password_label);
		c.add(password_pass);
		c.add(loginBtn);

		flag = false;

		loginBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				loginBtn.setBackground(Color.GREEN);
				/*
				if(flag == false){
					c.setBackground(Color.GREEN);
					flag = true;
				}
				else{
					c.setBackground(Color.WHITE);
					flag = false;
				}
				*/
				System.out.println("Username : " + username_text.getText());
				System.out.println("Password : " + password_pass.getText());
				username_text.setText("");
				password_pass.setText("");
			}
		});

		this.setVisible(true);
	}
}

public class LoginTest{
	public static void main(String[] args){
		LoginWindow loginWin = new LoginWindow();
		
	}
}