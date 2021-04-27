import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/* Coder: Andre
 * Purpose: GUI For simple calculations of vending machine
 * Date: FINAL EXAM
 */
//Notes: I code very slowly, I may have been able to get more of the direct requirments with more time
// Errors: I put it directly on the Frame, not onto panels
public class AF_DrinkMachineGUI extends JFrame
{
	/** n/a
	 */
	private static final long serialVersionUID = 1L;
	// I don't see why we need strings here
	// I realize now this was to be used as a way to know which drink was chosen from the list
	private String cokeString = "coke"; //???????
	private String sprite = "sprite"; //???????
	private String fanta = "fanta"; //???????
	private String moutaindew = "moutaindew"; //???????
	private String rootbeer = "rootbeer"; //???????
	private String redpop = "redpop"; //???????
	
	// Prices
	private double cokePrice = 1.25;
	private double spritePrice = 2.20;
	private double fantaPrice = 1.20;
	private double mDPrice = 2.35;
	private double rootBPrice = 1.35;
	private double redPPrice = 1.85;
	
	// Quantities
	private int numOfCokes = 1;
	private int numOfSprites = 1;
	private int numOfFantas = 1;
	private int numOfMD = 1;
	private int numOfRootB = 1;
	private int numOfRedP = 1;
	
	double chosenDrink;
	double changeDue1;
	
	public String getCokeString() {
		return cokeString;
	}
	public void setCokeString(String cokeString) {
		this.cokeString = cokeString;
	}
	public String getSprite() {
		return sprite;
	}
	public void setSprite(String sprite) {
		this.sprite = sprite;
	}
	public String getFanta() {
		return fanta;
	}
	public void setFanta(String fanta) {
		this.fanta = fanta;
	}
	public String getMoutaindew() {
		return moutaindew;
	}
	public void setMoutaindew(String moutaindew) {
		this.moutaindew = moutaindew;
	}
	public String getRootbeer() {
		return rootbeer;
	}
	public void setRootbeer(String rootbeer) {
		this.rootbeer = rootbeer;
	}
	public String getRedpop() {
		return redpop;
	}
	public void setRedpop(String redpop) {
		this.redpop = redpop;
	}
	public double getCokePrice() {
		return cokePrice;
	}
	public void setCokePrice(double cokePrice) {
		this.cokePrice = cokePrice;
	}
	public double getSpritePrice() {
		return spritePrice;
	}

	public void setSpritePrice(double spritePrice) {
		this.spritePrice = spritePrice;
	}
	public double getFantaPrice() {
		return fantaPrice;
	}
	public void setFantaPrice(double fantaPrice) {
		this.fantaPrice = fantaPrice;
	}
	public double getmDPrice() {
		return mDPrice;
	}
	public void setmDPrice(double mDPrice) {
		this.mDPrice = mDPrice;
	}
	public double getRootBPrice() {
		return rootBPrice;
	}
	public void setRootBPrice(double rootBPrice) {
		this.rootBPrice = rootBPrice;
	}
	public double getRedPPrice() {
		return redPPrice;
	}
	public void setRedPPrice(double redPPrice) {
		this.redPPrice = redPPrice;
	}
	public int getNumOfCokes() {
		return numOfCokes;
	}

	public void setNumOfCokes(int numOfCokes) {
		this.numOfCokes = numOfCokes;
	}


	public int getNumOfSprites() {
		return numOfSprites;
	}


	public void setNumOfSprites(int numOfSprites) {
		this.numOfSprites = numOfSprites;
	}


	public int getNumOfFantas() {
		return numOfFantas;
	}


	public void setNumOfFantas(int numOfFantas) {
		this.numOfFantas = numOfFantas;
	}


	public int getNumOfMD() {
		return numOfMD;
	}


	public void setNumOfMD(int numOfMD) {
		this.numOfMD = numOfMD;
	}


	public int getNumOfRootB() {
		return numOfRootB;
	}


	public void setNumOfRootB(int numOfRootB) {
		this.numOfRootB = numOfRootB;
	}


	public int getNumOfRedP() {
		return numOfRedP;
	}


	public void setNumOfRedP(int numOfRedP) {
		this.numOfRedP = numOfRedP;
	}

	
	//public DrinkMachineGUI(ArrayList <SoftDrink> list) Did not understand this was supposed to take in a drink until too late.
	public AF_DrinkMachineGUI() {
	super("Andre Foreman Soft Drink Vending Machine");
	
	// Group of Buttons
	ButtonGroup bg1 = new ButtonGroup();
	JRadioButton coke = new JRadioButton("Coke - $1.25");
	coke.addActionListener(new ActionListener() 
	{
		public void actionPerformed(ActionEvent e) 
		{
			if (e.getSource() == coke)
			{
				chosenDrink = cokePrice;
				//System.out.println(chosenDrink);
				
				//System. exit(0) 
			}
		}
			
		});
	add(coke);
	
	JRadioButton sprite = new JRadioButton("Sprite - $2.20");
	add(sprite);
	sprite.addActionListener(new ActionListener() 
	{
		public void actionPerformed(ActionEvent e) 
		{
			if (e.getSource() ==  sprite)
			{
				chosenDrink = spritePrice;
				//System.out.println(chosenDrink);
				
				//System. exit(0) 
			}
		}
			
		});

	JRadioButton fantaOrange = new JRadioButton("FantaOrange - $1.20");
	add(fantaOrange);
	fantaOrange.addActionListener(new ActionListener() 
	{
		public void actionPerformed(ActionEvent e) 
		{
			if (e.getSource() ==  fantaOrange)
			{
				chosenDrink = fantaPrice;
				//System.out.println(chosenDrink);
				
				//System. exit(0) 
			}
		}
			
		});

	JRadioButton mountainDew = new JRadioButton("MDew - $2.35");
	add(mountainDew);
	mountainDew.addActionListener(new ActionListener() 
	{
		public void actionPerformed(ActionEvent e) 
		{
			if (e.getSource() ==  mountainDew)
			{
				chosenDrink = mDPrice;
				//System.out.println(chosenDrink);
				
				//System. exit(0) 
			}
		}
			
		});

	JRadioButton rootBeer = new JRadioButton("RootBeer - $1.35");
	add(rootBeer);
	rootBeer.addActionListener(new ActionListener() 
	{
		public void actionPerformed(ActionEvent e) 
		{
			if (e.getSource() ==  rootBeer)
			{
				chosenDrink = rootBPrice;
				//System.out.println(chosenDrink);
				
				//System. exit(0) 
			}
		}
			
		});

	JRadioButton redPop = new JRadioButton("RedPop - $1.85");
	add(redPop);
	redPop.addActionListener(new ActionListener() 
	{
		public void actionPerformed(ActionEvent e) 
		{
			if (e.getSource() ==  redPop)
			{
				chosenDrink = redPPrice;
				//System.out.println(redPPrice);
				
				//System. exit(0) 
			}
		}
			
		});

	// Mutually Exclusive
	bg1.add(coke);
	bg1.add(sprite);
	bg1.add(fantaOrange);
	bg1.add(mountainDew);
	bg1.add(rootBeer);
	bg1.add(redPop);
	
	// Functionality of Payments
	JLabel enterPaymountAmount = new JLabel("Enter Pay:");
	add(enterPaymountAmount);
	JTextField entereredPayment = new JTextField();
	add(entereredPayment);
	
	JLabel changeDue = new JLabel("Change Due:");
	add( changeDue);
	JTextField changeDueField = new JTextField();
	add(changeDueField);
	
	JButton deliverSelection = new JButton("Deliver Selection:");
	add(deliverSelection);
	
	JTextField deliverdrink = new JTextField("");
	add(deliverdrink);
	
	deliverSelection.addActionListener(new ActionListener() 
	{
		public void actionPerformed(ActionEvent e) 
		{
			if (e.getSource() ==  deliverSelection)
			{
				
				String enteredValue = entereredPayment.getText();
				double enteredValueint = Double.parseDouble(enteredValue);
				// Check for whole number
				// This does not seem to work either???
				if(enteredValueint % 1 != 0) {
					deliverdrink.setText("Please Enter a whole number");
				}

				//String valueFromToString = toString(chosenDrink);
				//deliverdrink.setText(valueFromToString);
				if(numOfCokes == 0 && numOfSprites == 0 && numOfFantas == 0 && numOfMD == 0 && numOfRootB == 0 &&numOfRedP == 0) {
					deliverdrink.setText("The Entire Soda Machine out of stock");
				}
				// If none of the above has been put into the txtbox, continue
				if(deliverdrink.getText() == "") {
					
				}
				if(chosenDrink == 1.25) {
					// This does not seem to work;
					if(enteredValueint < 1.25) {
						deliverdrink.setText("You do not have enough money");
					}
					numOfCokes -= 1;
					if(numOfCokes == 0) {
						// This will never need to happen, implemented anyway
						deliverdrink.setText("This soft drink is now out of stock. Choose another.");
					}
					coke.setEnabled(false);
				}
				if(chosenDrink == 2.20) {
					
					if(enteredValueint < 2.20) {
						deliverdrink.setText("You do not have enough money");
					}numOfSprites -= 1;
					if(numOfSprites == 0) {
						// This will never need to happen, implemented anyway
						deliverdrink.setText("This soft drink is now out of stock. Choose another.");
					}
					sprite.setEnabled(false);
				}
				if(chosenDrink == 1.20) {
					if(enteredValueint < 1.20) {
						deliverdrink.setText("You do not have enough money");
					}
					numOfFantas -= 1;
					if(numOfFantas == 0) {
						// This will never need to happen, implemented anyway
						deliverdrink.setText("This soft drink is now out of stock. Choose another.");
					}
					fantaOrange.setEnabled(false);
				}
				if(chosenDrink == 2.35) {
					if(enteredValueint < 2.35) {
						deliverdrink.setText("You do not have enough money");
					}
					numOfMD -= 1;
					if(numOfMD == 0) {
						// This will never need to happen, implemented anyway
						deliverdrink.setText("This soft drink is now out of stock. Choose another.");
					}
					mountainDew.setEnabled(false);
				}
				if(chosenDrink == 1.35) {
					if(enteredValueint < 1.35) {
						deliverdrink.setText("You do not have enough money");
					}
					numOfRootB -= 1;
					if(numOfRootB == 0) {
						// This will never need to happen, implemented anyway
						deliverdrink.setText("This soft drink is now out of stock. Choose another.");
					}
					rootBeer.setEnabled(false);
				}
				if(chosenDrink == 1.85) {
					if(enteredValueint < 1.85) {
						deliverdrink.setText("You do not have enough money");
					}
					numOfRedP -= 1;
					if(numOfRedP == 0) {
						// This will never need to happen, implemented anyway
						deliverdrink.setText("This soft drink is now out  of stock. Choose another.");
					}
					redPop.setEnabled(false);
				}
				double changeDue1 = enteredValueint - chosenDrink;
				enteredValueint = (int) changeDue1; // You could keep going this way
				changeDueField.setText(changeDue1+"");
				//System. exit(0) 
			}
		}

		
			
		});

	GridLayout gb = new GridLayout(6,4);
	setLayout(gb);
	setSize(600, 365);
	setLocationRelativeTo(null);
	setResizable(false);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);
		

	}
}
