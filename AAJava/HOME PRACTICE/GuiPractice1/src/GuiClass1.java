import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GuiClass1 
{
	public static void main(String[] args) 
	{
		GUI newObject = new GUI(); //Create new
		//newObject.setVisible(true); //Allow GUI to be seen
		//newObject.setSize(400, 500);// Set Size	
	}
}

class GUI extends JFrame //Extend GUI Abilities from JFrame import | //REQUIRES IMPORT
{ 
	public GUI() 
	{
		super("Andre Title");
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.BLACK);
		add(panel1);
		
		JButton button1 = new JButton("7");
		add(button1);
		
		JRadioButton radioButton1 = new JRadioButton();
		add(radioButton1);
		
		
		JTextArea textArea1 = new JTextArea(2,3); //2 and 3 are Sizes
		add(textArea1);
		JTextArea textArea2 = new JTextArea("2nd Text Area"); //2 and 3 are Sizes
		add(textArea2);
		JTextArea textArea3 = new JTextArea("3rd Text Area", 2, 3); //2 and 3 are Sizes
		add(textArea3);
		
		JTextField textField1 = new JTextField("Text Field1"); // FINITE - TEXT AREA IS NOT
		add(textField1);

		
		JCheckBox checkbox1 = new JCheckBox("Checkbox With Text");
		add(checkbox1);
		JCheckBox checkbox2 = new JCheckBox();
		add(checkbox2);
		
		JSlider slider1 = new JSlider();
		add(slider1);
		JSlider slider2 = new JSlider(1, 20, 10); 
		add(slider2);
		
		JLabel label1 = new JLabel(); // No value means doesn't show
		add(label1);
		JLabel label2 = new JLabel("Hello");
		add(label2);
		
		JFormattedTextField fTextField =  new JFormattedTextField("Hello");
		add(fTextField);
		
		JMenuBar menuBar1 =  new JMenuBar();
		add(menuBar1);
		
		JMenuItem menuItem1 = new JMenuItem("titties");
		add(menuItem1);
		
		
		//setLocationRelativeTo(null) - Automatically Center Object
		setLayout(new GridLayout(6,3));
		setVisible(true);
		setSize(500, 500);
		//setLocation(x, y)
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}