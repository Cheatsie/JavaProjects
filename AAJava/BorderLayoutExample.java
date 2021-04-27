/**
	 * Class Name:	BorderLayoutExample	
	 * Purpose:		This demonstrates the border layout
	 * Coder:		Madhavi Mohan
	 * Date:		Feb 26, 2019
*/
//Import the libraries
import java.awt.*;
import javax.swing.*;

public class BorderLayoutExample extends JFrame{
	
	BorderLayoutExample()
	{
		super("Border Layout Example");
		
		//boiler-plate code
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setLocationRelativeTo(null);
		this.setLayout(new BorderLayout());
		this.setVisible(true);
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.GREEN);
	
		
		JPanel p2 = new JPanel();
		p2.setBackground(Color.CYAN);
		p2.setSize(200,200);
		
		//When adding stuff to containers with a borderlayout, specify which of the five quadrants you want to add them in
		this.add(panel1, BorderLayout.CENTER);
		this.add(p2, BorderLayout.NORTH);
	}
	
	public static void main(String[] args)
	{
		new BorderLayoutExample();
	}
	
}
