
public class SoftDrinkClass {
	private String name;
	private double price;
	private int quantity;
	
	public SoftDrinkClass(String name, double price, int quantity) {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	
	// Simple ToString method
	private String toString(double chosenDrink) {
		String returnString = "";
		if(chosenDrink == 1.85) {
			returnString +="Coke $1.25";
		}
		if(chosenDrink == 2.20) {
			returnString +="Sprite $2.20";
		}
		if(chosenDrink == 1.20) {
			returnString +="Fanta Orange $1.20";
		}
		if(chosenDrink == 2.35) {
			returnString +="Mountain Dew $2.35";
		}
		if(chosenDrink == 1.35) {
			returnString +="Root Beer $1.35";
		}
		if(chosenDrink == 1.85) {
			returnString +="Red Pop $1.85";
		}
		return returnString;
	}
}
