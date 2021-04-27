import java.util.ArrayList;

/* Coder: Andre Foreman
 * Purpose: Simple Vending Machine Operations
 * Date: FINAL EXAM 2
 * 
 */
public class SoftDrink {
	public static void main(String[] args) 
	{
		AF_DrinkMachineGUI gui = new AF_DrinkMachineGUI();
		// Unfortunately I created the class but did not end up using it in the GUI.
		ArrayList<SoftDrinkClass> list = new ArrayList<SoftDrinkClass>();
		list.add( new SoftDrinkClass("Coke", 1.25, 1) );
		list.add( new SoftDrinkClass("Sprite", 2.2, 1) );
		list.add( new SoftDrinkClass("Fanta Orange", 1.2, 1) );
		list.add( new SoftDrinkClass("Mountain Dew", 2.35, 1) );
		list.add( new SoftDrinkClass("Root Beer", 1.35, 1) );
	    list.add( new SoftDrinkClass("Red Pop", 1.85, 1) );
		
	    // Uhh I probably should have gotten down this far into the instructions before I started.
	    // I have a little bit different of a solution...Apologies.
	    //call DrinkMachineGUI constructor and pass it the list
	    //DrinkMachineGUI frame = new DrinkMachineGUI(list);		
	}
}
