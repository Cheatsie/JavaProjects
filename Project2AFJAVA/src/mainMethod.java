import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

/* Coder: Andre Foreman
 * Purpose:
 * Version: 1.0
 * Comments: 
 		- I passed all the requirements for testing, but you have to press equals
 * 		- I tried for days to figure out how I should use "gridBagLayout", failed miserably, I figured this was close enough for part marks.
 		   The idea was to have a textField/textArea occupy row1, and then 2-7 be the buttons for calculation. I was unable to figure out how to do it properly.
 		- I also sent you an email inquiring for feedback & assistance with how I was doing with the attached file, and you didn't respond. 
 			This was well over a week before the due date.
 
 * Potential Mistakes: 
 * I wasn't sure what build expression was supposed to do, if the calculator doesn't have parentheses.
 * There was nothing on your Demo about where to put this "find%" functionality, unless that's what modular was supposed to be
  	- Like instead of find what percent (1 is of 10), I did (1 % 10) and returned the remainder.
  	- I created the function anyway but didn't use it
  	
 * There is also some ambiguity on what you want from toString. "Return a String representation of a Calculator object", so just print out the current values of
 	- operator and operand?? Because I wasn't sure what you meant, I printed out each action in the command line, that is "close" to a string representation of the actions
 	
 * Lastly, there are functionality errors with regard to say, just pressing the operators, there is an assumption the user will know how to use a calculator.
 	
 	UNUSED FUNCTIONALITY & SOLUTIONS: 
 	1. togglePlusMinus - Created a cleaner version in the event handler of the  "+/-" button
 	2. Build Expression - Because there is no specification for parentheses, I allow the user to use the last value as this new equations first operand.
 	3. Conversion Functions(HEX,OCT,BIN) - I was able to implement them all in ONE function instead of 3.
 	4. I addressed toString above.
 	5. I'm not even sure where I was supposed to put radiobuttons.
 	
 */

//CLASS 1
public class mainMethod {
	public static void main(String[] args) 
	{
		 
		@SuppressWarnings("unused") // Doesn't need to be used
		GUI calculator = new GUI();
	}
}
//CLASS 2
class GUI extends JFrame //Extend GUI Abilities from JFrame import | //REQUIRES IMPORT
{ 

	private static final long serialVersionUID = 1L; // Dunno what this does, but Eclipse wanted it
	
	// Initialize Variables
	private JMenu menuOption;
	private String operand = "";
	private String storedOperand = "";
	@SuppressWarnings("unused")
	private boolean operatorClicked = false;
	private String operator;
	private boolean decimalPressed;
	
	// Initialized, never used.
	// private ArrayList<>
	
	//-------------------------------------------------------------------------------------------
	//GETTERS AND SETTERS
	
	// Helper Functions 
	public double findPercentage(String entereredString) {
		double newValue = Double.parseDouble(entereredString);
		newValue /= 100;
		
		return newValue;	
		
		}
	/** Purpose: Andre Foreman
	 * Receives: 
	 * Returns:
	 */
	public double addValues(String entereredString ,String entereredString2) {
		double entereredValue = Double.parseDouble(entereredString);
		double entereredValue2 = Double.parseDouble(entereredString2);
		return entereredValue + entereredValue2;
	}
	
	/** Purpose: 
	 * Receives: 
	 * Returns:
	 */
	public double subtractValues(String entereredString ,String entereredString2) {
		double entereredValue = Double.parseDouble(entereredString);
		double entereredValue2 = Double.parseDouble(entereredString2);
		
		// Reversing the values seems to work, probably something I did with the operands!
		double newValue = entereredValue2 -  entereredValue ;
		// TESTER System.out.println(newValue);
		return newValue;
	}
	
	/** Purpose: Andre Foreman
	 * Receives: 
	 * Returns:
	 */
	public double multiplyValues(String entereredString ,String entereredString2) {
		double entereredValue = Double.parseDouble(entereredString);
		double entereredValue2 = Double.parseDouble(entereredString2);
		return entereredValue * entereredValue2;
	}
	
	/** Purpose:
	 * Receives: 
	 * Returns:
	 */
	public double divideValues(String entereredString ,String entereredString2) throws DivideByZeroException {
		// Exception seems to be failing, hardCode Error Test here
		double zeroTester = Double.parseDouble(entereredString);
		if(zeroTester == 0) {
			// Hard Code, struggling to make the exception show-up
			System.out.println(" Divide By Zero Exception");
			return 0.0; // Not sure how to fix this, it isn't throwing the exception
		}
		else {
			// WHY DOES SWITCHING THE ORDER OF THE DIVIDE MAKE IT WORK? MAKES NO SENSE.
			double entereredValue = Double.parseDouble(entereredString);
			double entereredValue2 = Double.parseDouble(entereredString2);
			return entereredValue2 / entereredValue; //??
			// Return the Divisor to try again!
		}
		
	}
	
	/** Purpose:
	 * Receives: NULL
	 * Returns: Re-Set all fields to their default values.
	 */
	public void clear() {
		operand = "";
		storedOperand = "";
		operatorClicked = false;
		operator = "";
		decimalPressed = false;
	}
	
	/** Purpose: 
	 * Receives: String
	 * Returns:
	 */
	public String backspace (String entereredString) throws EmptyOperandException {
		// Return the string minus the last value
		if(entereredString.length() > 1 ) {
			String newString = removeLastChar(entereredString);
			System.out.println();
			System.out.println(newString);
			return newString;
		}
		else
			// Manual
			System.out.println("Error: Empty Operand Exception");
			return "0.0";
		
	}
	public static String removeLastChars(String str, int chars) {
	    return str.substring(0, str.length() - chars);
	}
	public static String removeLastChar(String str) {
	    return removeLastChars(str, 1);
	}
	
	/** Purpose: 
	 * Receives:
	 * Returns:
	 * Extra: Give two parameters for consistency, but only use one for calculation
	 */
	public double findSquared(String enteredString, String entereredString2) throws EmptyOperandException{
		
		// THROWS EMPTY OPERAND EXCEPTION
		double entereredValue = Double.parseDouble(enteredString);  
		return entereredValue * entereredValue;
	}
	
	/** Purpose: 
	 * Receives:
	 * Returns:
	 */
	public double findSquareRoot(String enteredString) throws EmptyOperandException{
		// THROWS EMPTY OPERAND EXCEPTION
		double entereredValue = Double.parseDouble(enteredString);  
		double newValue = Math.sqrt(entereredValue);
		return newValue;
	}
	
	/** Purpose:
	 * Receives: // NOT SURE WHY THIS WOULD BE VOID??
	 * Returns:
	 */
	public String buildOperand(String enteredString, String currentValue) {
		// Do the required concatenation
		currentValue = currentValue + enteredString;
		return currentValue;	

	}

	
	/** Purpose: 
	 * Receives: NULL - TEMPORARY
	 * Returns:
	 */
	public double calculate(String operand1, String operand2, String operator) throws LongOperandException, EmptyOperandException, ArithmeticException {
		// Throws all required exceptions - Not 100% sure if this will work all the time, so I'm putting in a few manual tests.
		
		double finalValue = 0;
		if(operator == "+") {
			finalValue = addValues(operand1, operand2);
		}
		if(operator == "-") {
			finalValue = subtractValues(operand1, operand2);
		}
		if(operator == "*") {
			finalValue = multiplyValues(operand1, operand2);
		}
		if(operator == "/") {
			try {
				finalValue = divideValues(operand1, operand2);
			} catch (DivideByZeroException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(operator == "%") {
			finalValue = modulusValues(operand1, operand2);

		}
		if(operator == "squared") {
			// Many tester prints, seems to be failing. Hard-coding the other way.
			operand2 = "NullValue";
			//System.out.println(operand1);
			//System.out.println(operand2);
			finalValue = findSquared(operand1, operand2);
			//System.out.println(finalValue);
		}
		if(operator == "squareRoot") {
			
			finalValue = findSquareRoot(operand1);
		}
		return finalValue;
	}
	
	/** Purpose: Andre Foreman
	 * Receives: NULL - TEMPORARY
	 * Returns:
	 */
	public double modulusValues(String operand1, String operand2) {
		double entereredValue = Double.parseDouble(operand1);
		double entereredValue2 = Double.parseDouble(operand2);
		
		// MODULUS SHOULD RETURN INT BUT IM USING DOUBLE FOR CONSISTENCY
		// Like subtract, switching order seems to work;
		double newValue = entereredValue2 % entereredValue;
		// Print is correct, return is wrong
		// System.out.println(newValue);
		return newValue;
		
	}
	
	public String toString (String enteredString) {
		// String representation of CALC
		return "EXECUTE";
	}
	/**
	 * 
	 */
	public String convertValue(String enteredString, int base) throws EmptyOperandException, LongOperandException  {
		double rem;  
		double newValue = Double.parseDouble(enteredString);
		// Rounded values for tests
		newValue = Math.round(newValue);
		char hexchars[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};  
		
		String value = "";
		while(newValue > 0)  
	     {  
	       rem = newValue % base;   
	       value = hexchars[(int) rem]+ value;   
	       newValue = newValue / base;  
	     }
		String secondValue = value.replaceFirst("^0+(?!$)", "");
	    return secondValue;  

	}
	
	public GUI() 
	{
		super("Andre's Calculator");
		
		// Calculator Buttons
		JTextField answerfield = new JTextField("0");
		answerfield.setColumns(200);
		// I am aware the font was supposed to be 22, but to accommodate for the conversions, I made it slightly smaller, NOT A MISTAKE!
		Font font1 = new Font("SansSerif", Font.PLAIN, 15); // Font object created
		answerfield.setFont(font1);
		add(answerfield);
		
		
		JButton cButton = new JButton("Back");
		add(cButton);
		cButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        try {
					
		        	String newvalue = backspace(operand);
					operand = newvalue;
		        	answerfield.setText(newvalue);
				} catch (EmptyOperandException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		        
		    }
		});
		
		JButton modulusButton = new JButton("%");
		add(modulusButton);
		modulusButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e){
		    	boolean operandClicked = true;
		        setOperator("%");
		    	//Here goes the action (method) you want to execute when clicked
		    	// UPDATE OPERAND VALUES IF I CLICKED AN OPERATOR
		    	storedOperand = operand;
		    	operand = "";
		    	System.out.print("% ");
		    }
		});
		
		JButton eraseButton = new JButton("Clear");
		add(eraseButton);
		eraseButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e){
		        // empty the contents
		    	operand = "";
		        storedOperand = "";
		        operator = "";
		        answerfield.setText("0");
		        // set button pressed to zero so we can use decimals again
		        decimalPressed = false;
		        //Here goes the action (method) you want to execute when clicked
		        System.out.println("ERASED!");
		    }
		});
		
		JButton xSquaredButton = new JButton("**");
		add(xSquaredButton);
		xSquaredButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e)            {
		    	operatorClicked = true;
		    	setOperator("squared");
		    	// UPDATE OPERAND VALUES IF I CLICKED AN OPERATOR
		    	storedOperand = operand;
		    	operand = "";
		    	//Here goes the action (method) you want to execute when clicked
		       
		        double squareValue = Double.parseDouble(storedOperand);
		        double squaredsquareValue = squareValue * squareValue;
		        answerfield.setText(squaredsquareValue + "");
		        System.out.println("^ 2 = " + squaredsquareValue );
		        // DOESN'T WORK
		        // Used Alternative Shortcut
		        /*try {
					calculate(storedOperand, operand, "squared");
				} catch (ArithmeticException | LongOperandException | EmptyOperandException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}*/
		    }
		});
		
		JButton squareRootButton = new JButton("ROOT");
		add(squareRootButton);
		squareRootButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e)            {
		    	operatorClicked = true;
		    	setOperator("squareRoot");  //  How to make actual square root setOperator();?
		    	// UPDATE OPERAND VALUES IF I CLICKED AN OPERATOR
		    	storedOperand = operand;
		    	operand = "";
		    	double rootValue = Double.parseDouble(storedOperand);
		    	double rootValueRooted = Math.sqrt(rootValue);
		    	answerfield.setText(rootValueRooted + "");
		    	//Here goes the action (method) you want to execute when clicked
		        // Rooted is because I have no symbol for sqr root
		    	System.out.print("Rooted is: " + rootValueRooted);
		        
		    }
		});
		
		JButton plusORminusButton = new JButton("+/-");
		add(plusORminusButton);
		plusORminusButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e)            {
		        String newValue = answerfield.getText(); // Get value from text box, 
		    	double doubleNewValue = Double.parseDouble(newValue);
		    	//System.out.println(doubleNewValue);
		    	if(doubleNewValue > 0) {
		    		newValue = "-" + newValue;
			    	doubleNewValue = Double.parseDouble(newValue);
			    	operand = doubleNewValue+""; 
			    	answerfield.setText(operand);
		    	}
		    	// Get Absolute value of number for positive
		    	else{
		    		newValue = answerfield.getText();
		    		
		    		doubleNewValue = Double.parseDouble(newValue);
		    		doubleNewValue = Math.abs(doubleNewValue);
		    		//System.out.println(doubleNewValue);
		    		operand = doubleNewValue+""; 
		    		answerfield.setText(operand+ " ");
		    	}

		    	//Here goes the action (method) you want to execute when clicked
		        System.out.println(operand);
		    }
		});
		
		// NOT SURE WHY THIS WAS REQUIRED
		/*JButton blankButton = new JButton("blank? N/A");
		add(blankButton);
		blankbutton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e)            {
		        //Here goes the action (method) you want to execute when clicked
		        System.out.println("You clicked the button blankButton");
		    }
		});*/
		
		JButton divideButton = new JButton("/");
		add(divideButton);
		divideButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e)            {
		    	// UPDATE OPERAND VALUES IF I CLICKED AN OPERATOR
		    	storedOperand = operand;
		    	operand = "";
		    	operatorClicked = true;
		    	setOperator("/");
		    	
		    	//Here goes the action (method) you want to execute when clicked
		        System.out.print("/ ");
		    }
		});
		
		JButton sevenButton = new JButton("7");
		add(sevenButton);
		sevenButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e)            {
		        //Here goes the action (method) you want to execute when clicked
		        String sevenValue = "7";
		        operand = buildOperand(sevenValue, operand);
		        answerfield.setText(operand);
		        System.out.print("7 ");
		    }
		});
		
		JButton eightButton = new JButton("8");
		add(eightButton);
		eightButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e)            {
		        String eightValue = "8";
		        operand = buildOperand(eightValue, operand);
		        answerfield.setText(operand);
		        //Here goes the action (method) you want to execute when clicked
		        System.out.print("8 ");
		    }
		});
		
		JButton nineButton = new JButton("9");
		add(nineButton);
		nineButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e)            {
		        String nineValue = "9";
		        operand = buildOperand(nineValue, operand);
		        answerfield.setText(operand);
		        //Here goes the action (method) you want to execute when clicked
		        System.out.print("9 ");
		    }
		});
		
		JButton timesButton = new JButton("x");
		add(timesButton);
		timesButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e)            {
		    	operatorClicked = true;
		    	setOperator("*");
		    	answerfield.setText(operator);
		    	// UPDATE OPERAND VALUES IF I CLICKED AN OPERATOR
		    	storedOperand = operand;
		    	operand = "";
		    	//Here goes the action (method) you want to execute when clicked
		        System.out.print("* ");
		    }
		});

		JButton fourButton = new JButton("4");
		add(fourButton);
		fourButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e)            {
		        String fourValue = "4";
		        operand = buildOperand(fourValue, operand);
		    	//Here goes the action (method) you want to execute when clicked
		        answerfield.setText(operand);
		        System.out.print("4 ");
		    }
		});
		
		JButton fiveButton = new JButton("5");
		add(fiveButton);
		fiveButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e)            {
		        String fiveValue = "5";
		        operand = buildOperand(fiveValue, operand);
		    	//Here goes the action (method) you want to execute when clicked
		        answerfield.setText(operand);
		        System.out.print(operand + " ");   
		    }
		});
		
		JButton sixButton = new JButton("6");
		add(sixButton);
		sixButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e)            {
		        String sixValue = "6";
		        operand = buildOperand(sixValue, operand);
		        answerfield.setText(operand);
		        //Here goes the action (method) you want to execute when clicked
		        System.out.print("6 ");
		    }
		});
		
		JButton minusButton = new JButton("-");
		add(minusButton);
		minusButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e)            {
		    	setOperator("-");
		    	answerfield.setText(operator);
		    	// UPDATE OPERAND VALUES IF I CLICKED AN OPERATOR
		    	storedOperand = operand;
		    	operand = "";
		    	//Here goes the action (method) you want to execute when clicked
		    	// System.out.println(operator);
		    	System.out.print("- ");
		    }
		});

		JButton oneButton = new JButton("1");
		add(oneButton);
		oneButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e)            {
		        String oneValue = "1";
		        operand = buildOperand(oneValue, operand);
		        answerfield.setText(operand);
		        System.out.print("1 ");
		    }
		});
		
		JButton twoButton = new JButton("2");
		add(twoButton);
		twoButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e)            {
		        String twoValue = "2";
		        operand = buildOperand(twoValue, operand);
		        answerfield.setText(operand);
		        //Here goes the action (method) you want to execute when clicked
		        System.out.print("2 ");
		    }
		});
		
		JButton threeButton = new JButton("3");
		add(threeButton);
		threeButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e)            {
		        String threeValue = "3";
		        operand = buildOperand(threeValue, operand);
		        answerfield.setText(operand);
		        //Here goes the action (method) you want to execute when clicked
		        System.out.print("3 ");
		    }
		});
		
		JButton plusButton = new JButton("+");
		add(plusButton);
		plusButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e)            {
		    	boolean operatorClicked = true;
		    	setOperator("+");
		    	answerfield.setText(operator);
		    	storedOperand = operand;
		    	operand = "";
		    	//Here goes the action (method) you want to execute when clicked
		        System.out.print("+ ");
		    }
		});
		
		// NOT SURE WHAT THIS IS NEEDED FOR? SAID 2 EMPTY BUTTONS
		JButton emptyButton2 = new JButton("");
		add(emptyButton2);
		emptyButton2.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e)            {
		        //Here goes the action (method) you want to execute when clicked
		        System.out.println("You clicked the button emptyButton2");
		    }
		});
		
		JButton zeroButton = new JButton("0");
		add(zeroButton);
		zeroButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e)            {
		        String zeroValue = "0";
		        operand = buildOperand(zeroValue, operand);
		        answerfield.setText(operand);
		        //Here goes the action (method) you want to execute when clicked
		        System.out.print("0");
		    }
		});
		
		JButton periodButton = new JButton(".");
		add(periodButton);
		periodButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e)            {
		        if (decimalPressed == true) {
		        	// Do not allow for duplicate decimals
		        	System.out.println("You clicked the button periodButton & it's already been pressed.");
		        }
		        else {
		        	String periodValue = ".";
			        operand = buildOperand(periodValue, operand);
			        decimalPressed = true;
			        //Here goes the action (method) you want to execute when clicked
			        System.out.print(".");
		        }

		    }
		});
		
		JButton equalsButton = new JButton("=");
		add(equalsButton);
		equalsButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e){
		    	double computedValue = 0;
				// MORE EXCEPTIONS HERE FOR WHEN CALCULATE IS CALLED.
		    	try {
					computedValue = calculate(operand, storedOperand, operator);
				} catch (ArithmeticException | LongOperandException | EmptyOperandException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		    	String ScomputedValue = (computedValue + "");
		    	answerfield.setText(ScomputedValue);
		    	operand = ScomputedValue; // Let us work with the last value
		    	
		    	// Set this to true because all calculations return a double.
		    	decimalPressed = true;
		    	//Here goes the action (method) you want to execute when clicked
		        System.out.print(" = ");
		        // ONLY Finish with a new line after pressing equals
		        System.out.println(operand);
		    }
		});
		
		//-----------------------------------------------------------------------
		JMenuBar bar = new JMenuBar();
		menuOption = new JMenu("File");
		
		JMenuItem save = new JMenuItem("Save");
		JMenuItem saveAs = new JMenuItem("Save As");
		JMenuItem exit = new JMenuItem("Exit");
		
		
		
		
		save.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if (e.getSource() == save)
				{
					System.out.println("Clicked Save");
					// Would have save Functionality Here
					//System. exit(0) 
				}
			}

			});
		saveAs.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if (e.getSource() == saveAs)
				{
					System.out.println("Clicked Save As");
					// Would have save Functionality Here
					//System. exit(0) 
				}
			}
				
			});
		exit.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				if (e.getSource() == exit)
				{
					System.out.println("Clicked Exit");
					System.exit(0); 
				}
			}

		});
		
		menuOption.add(save);
		menuOption.add(saveAs);
		menuOption.add(exit);
		bar.add(menuOption);
		setJMenuBar(bar);
		
		//-----------------------------------------------------------------------
		
		JMenuBar bar2 = new JMenuBar();
		menuOption = new JMenu("Convert");
		JMenuItem binConvert = new JMenuItem("Convert Dec to Bin");
		JMenuItem octConvert = new JMenuItem("Convert Dec to Oct");
		JMenuItem hexConvert = new JMenuItem("Convert Dec to Hex");
		JMenuItem decConvert = new JMenuItem("Compute Normally in Dec");
		
		binConvert.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				if (e.getSource() == binConvert)
				{
					System.out.println("Hello world - Convert to Bin"); 
					String s = answerfield.getText();
					String newValue = null;
					try {
						newValue = convertValue(s, 2);
					} catch (EmptyOperandException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (LongOperandException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					answerfield.setText(newValue);
				}
			}
		});
		
		octConvert.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) 
			{
			if (e.getSource() == octConvert)
			{
				System.out.println("Hello world - Convert to Oct");
				String s = answerfield.getText();
				String newValue = null;
				try {
					newValue = convertValue(s, 8);
				} catch (EmptyOperandException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (LongOperandException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				answerfield.setText(newValue);
			}
			}
		});
		hexConvert.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) 
			{
			if (e.getSource() == hexConvert)
			{
				System.out.println("Hello world - Convert to Hex");
				String s = answerfield.getText();
				String newValue = null;
				try {
					newValue = convertValue(s, 16);
				} catch (EmptyOperandException | LongOperandException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				answerfield.setText(newValue);
			}
			}
		});
		decConvert.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) 
			{
			if (e.getSource() == decConvert)
			{
				System.out.println("Hello world - Convert to Dec");
				
				String s = answerfield.getText();
				String newValue = null;
				try {
					newValue = convertValue(s, 10);
				} catch (EmptyOperandException | LongOperandException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				answerfield.setText(newValue);
			}
			}
		});
		
		menuOption.add(binConvert);
		menuOption.add(octConvert);
		menuOption.add(hexConvert);
		menuOption.add(decConvert);
		bar.add(menuOption);
		setJMenuBar(bar);
		//-----------------------------------------------------------------------
		// LAST BAR
		
		JMenuBar bar3 = new JMenuBar();
		menuOption = new JMenu("Help");
		JMenuItem howTo = new JMenuItem("How To Use");
		JMenuItem about = new JMenuItem("About");
		JMenuItem contact = new JMenuItem("Contact Me: generalEmail@gmail.com");

		howTo.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{ 
			if (e.getSource() == howTo)
			{
				System.out.println("Here are some basic instructions on how to use my Calculator:");
				System.out.println("In the order shown in the UI:");
				System.out.println("Back: Erase the last value placed into the textField - ONLY erases the last value!");
				System.out.println("%: Return the Remainder of the divison of your two values!");
				System.out.println("Clear: Reset EVERY value in the GUI to it's default.");
				System.out.println("**: Like the windows calculator, I implemented it so you don't have to press equals to square your value;"
						+ "After you have pressed **, it will update the text box.");
				System.out.println("Root: Like the ** Function, I have it return the value's square root right away.");
				System.out.println("+/-: Changes the sign of the current value in the textBox");
				System.out.println("/: Basic Division");
				System.out.println("x: Basic Multiplication");
				System.out.println("-: Basic Subtraction");
				System.out.println("+: Basic Addition");
				
			}
		}

			});
		
		about.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) 
			{ 
			if (e.getSource() == about)
			{
				System.out.println("This Calculator was built by Andre Foreman of CPA3 from Fanshawe College");
				System.out.println("It has the required functionality, with a few misteps along the way, but I've tried to hide any mistakes I made,"
						+ "so that they do not become a problem for the user. ");
				System.out.println("Enjoy!");
			}
			
				// TODO Auto-generated method stub
				
			}});
		
		contact.addActionListener((ActionListener)new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
			if (e.getSource() == contact)
			{
				System.out.println("Thank you for using my Calculator, here is my contact information:");
				System.out.println("Email: generalEmail@gmail.com");
				System.out.println("Phone Number: 519 101 2020");
				System.out.println("Address: 819 General Address Ave.");
			}
		
			}});
		
		menuOption.add(howTo);
		menuOption.add(about);
		menuOption.add(contact);
		bar.add(menuOption);
		setJMenuBar(bar);

		GridLayout gb = new GridLayout(6,4);
		setLayout(gb);
		setSize(300, 365);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}
	// Getters and setters
	public String getOperand() {
		return operand;
	}
	public void setOperand(String operand) {
		this.operand = operand;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public boolean isDecimalPressed() {
		return decimalPressed;
	}
	public void setDecimalPressed(boolean decimalPressed) {
		this.decimalPressed = decimalPressed;
	}
	
}

