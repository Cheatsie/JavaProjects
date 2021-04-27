
import javax.swing.JFrame;

import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.*;


public class WorkingwithGuiPractice extends JFrame {
	
	private static final long serialVersionUID = 1L;


			JFrame frame1 = new JFrame("Working with Swing"); // Title of Window
			
			//boilerplate
			frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame1.setSize(500, 500);// Size of Window
			frame1.setLocationRelativeTo(null); //Center the Frame I think
			frame1.setLayout(new GridLayout(2,2,10,10) );//Note that the last two parameters indicate the spaces between columns and rows respectively - revise to desired layout manager
			
			//create 4 JPanels
			JPanel panel1 = new JPanel();
			JPanel panel2 = new JPanel();
			JPanel panel3 = new JPanel();
			JPanel panel4 = new JPanel();
			
			// Label the Panels
			JLabel jlabel1 = new JLabel("This is Panel 1");
			jlabel1.setFont(new Font("Verdana",1,20));
		    panel1.add(jlabel1);
		    
			//Label the Panels
			JLabel jlabel2 = new JLabel("This is Panel 2");
			jlabel2.setFont(new Font("Verdana",1,20));
		    panel2.add(jlabel2);
			
			//Label the Panels
			JLabel jlabel3 = new JLabel("This is Panel 3");
			jlabel3.setFont(new Font("Verdana",1,20));
		    panel3.add(jlabel3);
			
		    
		    // Add a button
			JButton button = new JButton("Press");
			
			//set the colors of the panels to different shades 
			panel1.setBackground(Color.BLACK);
			panel2.setBackground(Color.BLUE);
			panel3.setBackground(Color.CYAN);
			panel4.setBackground(Color.GREEN);
			
			panel1.setBorder(new LineBorder(Color.BLACK)); // make it easy to see
			panel2.setBorder(new LineBorder(Color.BLACK)); // make it easy to see
			panel3.setBorder(new LineBorder(Color.BLACK)); // make it easy to see
			panel4.setBorder(new LineBorder(Color.BLACK)); // make it easy to see
			
			//add them to frame
			frame1.add(panel1);
			frame1.add(panel2);
			frame1.add(panel3);
			frame1.add(panel4);
			// frame1.add(button); // Button Changes full behavior of GUI
			
			//LAST LINE!
			frame1.setVisible(true); //sets the visibility of the component. It is by default false.
		}//end main

	}//end class
}
*/