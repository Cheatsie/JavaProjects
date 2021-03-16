
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


class GuiFirst extends JFrame{

	public static void main(String[] args) {
		@SuppressWarnings("unused")// Don't show warning
		Gui graphicInterface = new Gui();
		@SuppressWarnings("unused") // Don't show warning
		addition additionInterface = new addition();
	}
}

class addition extends JFrame implements ActionListener //ACTION LISTENER REQUIRED IMPORT
//Need Action perform with action listner
//NewFrame For Addition
{
	//INITIALIZE OUTSIDE OF SCOPE SO I CAN INFLENCE NUMBERS
	JTextField input1, input2;
	JButton button1;
	JLabel Result;
	
	public addition() {
		
		// WANT OUTSIDE SCOPE
		input1 = new JTextField(20); //20 is SIZE
		input2 = new JTextField(20);
		button1 = new JButton("Compute"); // Needs listening
		
		//CAN CREATE ACTION LISTENER WITHOUT IMPLEMENTING INFERFACE
		//You can directly pass in the action as will instead of this
		button1.addActionListener(this); // Action Listener is an Interface
		//"THIS" IS RELEVANT 
		
		Result = new JLabel("Hello");
		
		add(Result); //Add Value to the screen
		add(button1); 
		add(input1);
		add(input2);
		
		setLayout(new FlowLayout());
		setVisible(true); //Allow GUI to be seen FROM CONSTRUCTOR
		setSize(200, 200);// Set Size FROM CONSTRUCTOR
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}


	public void actionPerformed(ActionEvent e) //E OR AE
	{
		int num1 = Integer.parseInt(input1.getText());
		int num2 = Integer.parseInt(input2.getText());
		
		int value = num1 + num2;
		
		Result.setText(value+""); //Plus "" to cast to a string
		
	}

	
}

class Gui extends JFrame //Extend GUI Abilities from JFrame import | //REQUIRES IMPORT
{ 


	public Gui()
	{
		//LAYOUT CHANGES HOW WE SEE THE INFORMATION, CARD LAYOUT IS DEFAULT
		setLayout(new FlowLayout());//REQUIRES IMPORT
		
		JButton button1 = new JButton("OK"); // Create new button object
		
		add(button1); //Add Value to the screen
		
		setLayout(new FlowLayout());
		setVisible(true); //Allow GUI to be seen FROM CONSTRUCTOR
		setSize(400, 500);// Set Size FROM CONSTRUCTOR
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 3 Works as well instead //LET THE WINDOW ACTUALLY CLOSE
	}
}