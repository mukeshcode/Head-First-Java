import javax.swing.*;
import java.awt.*;

class MyFrame extends JFrame{
	public static Container c;
	JLabel title_label;
	JTextField panel_text;
	Font titleFont;
	ActionButtons myActionButtons;
	NumericButtons myNumericButtons;
	OperatorButtons myOperatorButtons;
	Color bodyColor;

	MyFrame(){
		this.setTitle("CASIO Calculator");
		this.setSize(450, 600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		c = this.getContentPane();
		c.setLayout(null);


		//setting body color
		bodyColor = new Color(204, 255, 255);
		c.setBackground(bodyColor);

		// setting the title label
		title_label = new JLabel("CASIO");
		title_label.setSize(100,30);
		title_label.setLocation(this.getSize().width/2 - title_label.getSize().width/2, 0);
		titleFont = new Font("Lucida Sans Typewriter", Font.BOLD, 30);
		title_label.setFont(titleFont);
		title_label.setForeground(Color.BLUE);

		panel_text = new JTextField();
		panel_text.setBounds(0, 40, this.getSize().width, 100);
		panel_text.setBackground(new Color(240, 240, 240));
		//panel_text.setEditable(false);

		myActionButtons = new ActionButtons();
		myNumericButtons = new NumericButtons();
		myOperatorButtons = new OperatorButtons();
		c.add(title_label);
		c.add(panel_text);
		this.setVisible(true);
	}
}

class ActionButtons{
	JButton clear_btn, start_btn, stop_btn, equals_btn;
	ActionButtons(){
		int btn_width = 110, btn_height = 50;
		clear_btn = new JButton("AC");
		clear_btn.setBounds(0, 150, btn_width, btn_height);

		start_btn = new JButton("START");
		start_btn.setBounds(btn_width, 150, btn_width, btn_height);

		stop_btn = new JButton("STOP");
		stop_btn.setBounds(2*btn_width, 150, btn_width, btn_height);
		
		equals_btn = new JButton("=");
		equals_btn.setBounds(3*btn_width, 150, btn_width, btn_height);

		

		MyFrame.c.add(clear_btn);
		MyFrame.c.add(start_btn);
		MyFrame.c.add(stop_btn);
		MyFrame.c.add(equals_btn);
	}
}

class NumericButtons{
	JButton zero, one, two, three, four, five, six, seven, eight, nine, lp, rp;

	NumericButtons(){
		int width = 110, height = 80;
		int top = 210;
		lp = createNumericBtn(0, top, width, height, "(");
		zero = createNumericBtn(width, top, width, height, "0");
		rp = createNumericBtn(2*width, top, width, height, ")");
		one = createNumericBtn(0, top+height, width, height, "1");
		two = createNumericBtn(width, top+height, width, height, "2");
		three = createNumericBtn(2*width, top+height, width, height, "3");
		four = createNumericBtn(0, top+2*height, width, height, "4");
		five = createNumericBtn(width, top+2*height, width, height, "5");
		six = createNumericBtn(2*width, top+2*height, width, height, "6");
		seven = createNumericBtn(0, top+3*height, width, height, "7");
		eight = createNumericBtn(width, top + 3*height, width, height, "8");
		nine = createNumericBtn(2*width, top + 3*height, width, height, "9");
		
		MyFrame.c.add(lp); MyFrame.c.add(zero); MyFrame.c.add(rp); MyFrame.c.add(one); MyFrame.c.add(two); 				MyFrame.c.add(three); MyFrame.c.add(four); MyFrame.c.add(five); MyFrame.c.add(six);
		MyFrame.c.add(seven); MyFrame.c.add(eight); MyFrame.c.add(nine);
	}

	JButton createNumericBtn(int x, int y, int width, int height, String symbol){
		JButton btn = new JButton(symbol);
		btn.setBounds(x, y, width, height);
		return btn;
	}
}

class OperatorButtons{
	JButton plus, minus, prod, div;
	OperatorButtons(){
		int width = 110, height = 80;
		int top = 210;
		plus = createOperatorBtn(3*width, top, width, height, "+");
		minus = createOperatorBtn(3*width, top+height, width, height, "-");
		prod = createOperatorBtn(3*width, top+2*height, width, height, "*");
		div = createOperatorBtn(3*width, top+3*height, width, height, "/");

		MyFrame.c.add(plus); MyFrame.c.add(minus); MyFrame.c.add(prod); MyFrame.c.add(div);
	}
	JButton createOperatorBtn(int x, int y, int width, int height, String symbol){
		JButton btn = new JButton(symbol);
		btn.setBounds(x, y, width, height);
		btn.setBackground(new Color(254, 230, 230));
		return btn;
	}
}

public class CalculatorTest{
	public static void main(String[] args){
		MyFrame CalcFrame = new MyFrame();
		
	}

}