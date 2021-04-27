/**
 * Program Name:	JOptionPaneEXample.java
 * Purpose:			This demonstrates how to create a popup window (JOptionPane). 
 * 					It creates a popup window with whatever's in the textbox, when the user hits the enter key
 * Coder:			Madhavi Mohan
 * Date:			March 2019
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class JOptionPaneExample extends JFrame implements ActionListener{
	
	private JPanel panel;
	private JTextField input;
	
	JOptionPaneExample()
	{
		super("JOptionPane Example");
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setLocationRelativeTo(null);
		this.setLayout(new GridLayout(2,3));
		this.setVisible(true);
		
		//Helper method that creates the panel with the textbox
		buildPanel();
		this.add(panel);
	}
	
	private void buildPanel()
	{
		panel = new JPanel();
		panel.setLayout(new GridLayout());
		input = new JTextField();
		panel.add(input);
		
		//Note that if you add an actionlistener to a textbox, when you hit the enter key it will execute actionPerformed
		input.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		//the first parameter denotes the frame that shows up as the pop-up. if you don't have a predefined one
		//setting it to null creates a default jframe
		//the final option denotes the type of message to be displayed
		JOptionPane.showMessageDialog(null, input.getText(),
				"Input Error", JOptionPane.OK_OPTION);
		
	}
	
	public static void main(String[] args)
	{
		new JOptionPaneExample();
	}
}
