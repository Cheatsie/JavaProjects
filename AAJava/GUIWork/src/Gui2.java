import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Gui2 extends JFrame { //implements ActionListener NOT NECESSARY IF I CREATE OBJECTS TO USE{
	//Define Variables outside constructor for action listener
	private JTextField textField1;
	private JTextField textField2;
	private JButton button1;
	private JButton button2;
	private JLabel labelTextField1;
	private JRadioButton newRadioButton, newRadioButton2;
	
	public Gui2() // CONSTRUCTOR 
	{
		textField1 = new JTextField(20); // Take 20 Spaces
		textField2 = new JTextField(20);
		button1 = new JButton("Addition");
		button2 = new JButton("Subtraction");
		labelTextField1 = new JLabel("Result");
		newRadioButton = new JRadioButton("Male");
		newRadioButton2 = new JRadioButton("Female");
		 
		this.add(textField1);
		this.add(textField2);
		this.add(button1);
		this.add(button2);
		this.add(labelTextField1);
		this.add(newRadioButton);
		this.add(newRadioButton2);
		
		//Now I Cannot Click them at the same time
		ButtonGroup bg = new ButtonGroup();
		bg.add(newRadioButton);
		bg.add(newRadioButton2);
		
		
		ActionListener alisten = new ActionListener() //COULD PASS THE ENTIRE METHOD AS PARAMETER TO BUTTON 
		{

			//MANDATORY FROM INTERFACE ActionListener | Not outside constructor

			public void actionPerformed(ActionEvent ae) {
				// TODO Auto-generated method stub
				// Get value from text field with get text method, parse int to turn to integer
				int num1 = Integer.parseInt(textField1.getText());
				int num2 = Integer.parseInt(textField2.getText());
				int value = num1 + num2;
				labelTextField1.setText(value + ""); // Add int to string for string in java
				
			}
			
		};
		button1.addActionListener(alisten);
		
		//LAMBDA EXPRESSION VERSION
		button2.addActionListener( ae -> 
		{
			int num1 = Integer.parseInt(textField1.getText());
			int num2 = Integer.parseInt(textField2.getText());
			int value = num1 - num2;
			labelTextField1.setText(value + "");
		});
		
		
		ActionListener alistenRadio = new ActionListener() 
		{
			//MANDATORY FROM INTERFACE ActionListener | Not outside constructor
			public void actionPerformed(ActionEvent ae) {
				String name = labelTextField1.getText();
				labelTextField1.setText("Mr." + name); 
				
			}
		};
		
		newRadioButton.addActionListener(alistenRadio);
		
		ActionListener alistenRadio2 = new ActionListener() 
		{
			//MANDATORY FROM INTERFACE ActionListener | Not outside constructor
			public void actionPerformed(ActionEvent ae) {
				// Get name from text input
				String name = labelTextField1.getText();
				labelTextField1.setText("Mrs " + name); 
				
			}
		};
		newRadioButton2.addActionListener(alistenRadio2);
		
		// TEMPLATE FOR ALL FUTURE GUI PROJECTS
		//This resizes the frame's components so they all fit on the frame (that way you don't have to resize it to see everything)
		this.pack();
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
