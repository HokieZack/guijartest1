package guitest;


import javax.swing.*;

public class guitest1 {

	public static void main (String[] args) {
		
		JFrame frame = new JFrame("King Zacks Frame");
		JButton button = new JButton("King Zacks Button");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(button);
		
		frame.setSize(300, 300);
		
		frame.setVisible(true);
	}
}
