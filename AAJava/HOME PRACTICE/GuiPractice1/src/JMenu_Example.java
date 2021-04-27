/**
 * Program Name:	JMenu_Example.java
 * Purpose:			This shows a brief example of how to use menus in Java.
 * 					In particular, the program will output each option the user
 * 					selects from the menu.
 * Coder:			Madhavi Mohan
 * Date:			July, 2018
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JMenu_Example extends JFrame{
	
	private JMenuItem one, two, three;
	private JMenu menuOption;
	private JLabel output;
	
	public JMenu_Example()
	{
		//Stuff to set up the JFrame
		super("Titties on my face");
		this.setSize(250, 300);							
		this.setLocationRelativeTo(null);										
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);				
		this.setVisible(true);
		
		output = new JLabel();
		this.add(output);
		
		//Each JMenuBar contains JMenu objects, and JMenu objects contain JMenuItems.
		//You can set the JMenuBar for the overall JFrame using the setJMenuBar function that comes with the JFrame class
		//You can also add action listeners on JMenuItems, for when the user selects an item. 
		JMenuBar bar = new JMenuBar();
		
		menuOption = new JMenu("Menu Option");
		
		one = new JMenuItem("Item 1");
		two = new JMenuItem("Item 2");
		three = new JMenuItem("Item 3");
		
		one.addActionListener(new MenuListener());
		two.addActionListener(new MenuListener());
		three.addActionListener(new MenuListener());
		
		menuOption.add(one);
		menuOption.add(two);
		menuOption.add(three);
		
		bar.add(menuOption);
		setJMenuBar(bar);
		
		
	}
	
	private class MenuListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if (e.getSource() == one)
			{
				output.setText("The user selected option one");
			}
			else if (e.getSource() == two)
			{
				output.setText("The user selected option two");
			}
			else if (e.getSource() == three)
			{
				output.setText("The user selected option three");
			}
		}
	}
	
	public static void main(String[] args)
	{
		new JMenu_Example();
	}

}
