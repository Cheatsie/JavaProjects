/**
 * This was the first demo from class - it shows how to use panels
 */
import javax.swing.*;
import java.awt.*;

public class JPanel_Example1
{

	public static void main(String[] args)
	{
		// create the JFrame
		JFrame frame1 = new JFrame("Some JPanels inside a JFrame..."); // Title of Window
		
		//boilerplate
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setSize(500, 500);//change values as required.
		frame1.setLocationRelativeTo(null);//centres the frame
		frame1.setLayout(new GridLayout(2,2,10,10) );//Note that the last two parameters indicate the spaces between columns and rows respectively - revise to desired layout manager
		
		//create 4 JPanels
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		
		//set the colors of the panels to different shades 
		panel1.setBackground(Color.BLACK);
		panel2.setBackground(Color.BLUE);
		panel3.setBackground(Color.CYAN);
		panel4.setBackground(Color.GREEN);
		
		//add them to frame
		frame1.add(panel1);
		frame1.add(panel2);
		frame1.add(panel3);
		frame1.add(panel4);
		
		//LAST LINE!
		frame1.setVisible(true);
		

	}//end main

}//end class
