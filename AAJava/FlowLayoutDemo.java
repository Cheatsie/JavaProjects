import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Used in FlowLayoutExample
 * @author madhavi
 *
 */
public class FlowLayoutDemo extends JFrame{

	FlowLayoutDemo()
	{
		super("Demo");
		this.setSize(600,400);
		this.setLayout(new FlowLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JButton btn1 = new JButton("One");
		JButton btn2 = new  JButton("Two");

		
		//add them to the container
		this.add(btn1);
		this.add(btn2);
		this.setVisible(true);

	}
}
