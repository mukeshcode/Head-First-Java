import javax.swing.*;
import java.awt.*;

class JFrame1{
	public static void main(String[] args){
		JFrame frame = new JFrame();
		frame.setVisible(true);	// for making the java frame visible
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setSize(700, 500);
		//frame.setLocation(-1000, -50);
		frame.setBounds(100, 50, 700, 500);
		frame.setTitle("HariBol !");

		ImageIcon image = new ImageIcon("banner.jpg");
		frame.setIconImage(image.getImage());

		//frame.setBackground(Color.RED);	// doesn't works
		
		Container c = frame.getContentPane();
		c.setBackground(Color.RED);
		frame.setResizable(false);

	}
}