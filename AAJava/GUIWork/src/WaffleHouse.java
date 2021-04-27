// import java.awt.FlowLayout;
import java.awt.GridLayout;
// import java.awt.event.ActionEvent;
/// import java.awt.event.ActionListener;
import javax.swing.*;
/* Coder: Dre foreman
 * Purpose: Create Simple Waffle House GUI
 */
public class WaffleHouse extends JFrame{
		// First Options Group
		private JRadioButton belgian;
		private JRadioButton wholeWheat; 
		private JRadioButton banana; 
		private JRadioButton strawberry; 
		
		// Topping options
		private JLabel titleToShow; // ignore error
		private JLabel waffles;
		private JLabel toppings;
		private JLabel coffeChoice;
		
		// Second Four Options Group
		private JCheckBox butter;
		private JCheckBox mapleSyrup; 
		private JCheckBox cherry; 
		private JCheckBox strawberries; 
		
		//Submit button for the bottom
		private JButton submitbutton; //ignore error
		
		//
		private JRadioButton None, Regular, DecafCoffee, Espresso;
		
		public WaffleHouse() // CONSTRUCTOR 
		{
			titleToShow = new JLabel("Welcome to Andre's coffee house", SwingConstants.CENTER);
			//this.add(titleToShow); TITLE RUINS FORMATTING FOR NOW COULDN'T INCLUDE
			
			waffles = new JLabel("Waffles");
			toppings = new JLabel("Toppings");
			coffeChoice = new JLabel("Coffee Choice");
			
			belgian = new JRadioButton("Belgian");
			wholeWheat = new JRadioButton("Whole Wheat");
			banana = new JRadioButton("Banana");
			strawberry = new JRadioButton("Strawberry");
			
			butter =  new JCheckBox("Butter");
			mapleSyrup =  new JCheckBox("Maple Syrup"); 
			cherry =  new JCheckBox("Cherry"); 
			strawberries =  new JCheckBox("strawberries");
			
			None = new JRadioButton("None"); 
			Regular = new JRadioButton("Regular"); 
			DecafCoffee = new JRadioButton("Decaf Coffee"); 
			Espresso = new JRadioButton("Espresso");
			
			//Format in order as shown 
			
			//HIGHEST ORDER
			this.add(waffles);
			this.add(toppings);
			this.add(coffeChoice);
			
			//ROW 1 
			this.add(belgian);
			this.add(butter);
			this.add(None);
			
			//ROW 2
			this.add(wholeWheat);
			this.add(mapleSyrup);
			this.add(Regular);
			
			//ROW 3
			this.add(banana);
			this.add(cherry);
			this.add(DecafCoffee);
			
			//ROW 4
			this.add(strawberry);
			this.add(strawberries);
			this.add(Espresso);
			

			ButtonGroup bg1 = new ButtonGroup();
			bg1.add(belgian);
			bg1.add(wholeWheat);
			bg1.add(banana);
			bg1.add(strawberry);
			
			ButtonGroup bg2 = new ButtonGroup();
			//COLUMN 2
			bg2.add(butter);
			bg2.add(mapleSyrup);
			bg2.add(cherry);
			bg2.add(strawberries);
			
			ButtonGroup bg3 = new ButtonGroup();
			bg3.add(None);
			bg3.add(Regular);
			bg3.add(DecafCoffee);
			bg3.add(Espresso);
			

			JButton submitbutton = new JButton("Submit Order");
			
			this.add(submitbutton);
			
			// TEMPLATE FOR FUTURE GUI PROJECTS
			// I tried to do GridButtonLayout but I didn't have time to debug so I didn't include title or move the submit button
			setLayout(new GridLayout(6,3));
			setVisible(true);
			setSize(400, 150);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
}

