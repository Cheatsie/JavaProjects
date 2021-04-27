import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


class addGui extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		
	}
}

class Addition extends JFrame //Extend GUI Abilities from JFrame import | //REQUIRES IMPORT
{ 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Addition() 
	{
		JTextField input1 = new JTextField();
		JTextField input2 = new JTextField();
		
		JButton button1 = new JButton("OK"); // Create new button object
		
		JLabel Result = new JLabel();
		
		setLayout(new FlowLayout());
		setVisible(true); //Allow GUI to be seen FROM CONSTRUCTOR
		setSize(400, 500);// Set Size FROM CONSTRUCTOR
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 3 Works as well instead //LET THE WINDOW ACTUALLY CLOSE
	}
}