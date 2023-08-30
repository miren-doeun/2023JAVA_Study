package helloSwing;

import javax.swing.JFrame;

public class HelloSwing extends JFrame{
	HelloSwing(){
		setTitle("¾È³ç ½ºÀ®!");
		setSize(300,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		new HelloSwing();
	}

}
