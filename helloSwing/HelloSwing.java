package helloSwing;

import javax.swing.JFrame;

public class HelloSwing extends JFrame{
	HelloSwing(){
		setTitle("�ȳ� ����!");
		setSize(300,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		new HelloSwing();
	}

}
