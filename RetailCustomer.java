
/** @Author:Andre Foreman
	 * @Purpose:Extend the class it's assigned to extend
	 * Date:Monday, March 15
	 * @Extends:Customer
	 */
public class RetailCustomer extends Customer // RetailCustomer is a subclass of Customer
{

	private double totalPurchases; 
	public RetailCustomer(String firstName, String lastName, String customerLevel, double totalPurchases) // 4 Args Constructor
	{
		super(firstName, lastName, customerLevel); // Invoke the superclass constructor
		// TODO Auto-generated constructor stub
	}

	@Override
	// Implement incentives by multiplying total purchases by the discount rate
	public double incentives() {
		double value1 = findDiscountRate(totalPurchases); // Change discount rate to a double
		double value2 = getTotalPurchases();
		
		double value3 = value1*value2;
		
		return value3;
		 
	} // End incentives
	
	// Private field has corresponding getters and setters
	public double getTotalPurchases() {
		return totalPurchases;
	}
	public void setTotalPurchases(double totalPurchases) {
		this.totalPurchases = totalPurchases;
	}
	
	double findDiscountRate(double totalPurchases) {
		double discountRate = 0;
		if(totalPurchases > 10000) {
			discountRate = 0.15;
		}
		else if(totalPurchases > 5000) {
			discountRate = 0.10;
		}
		else if (totalPurchases > 1000) {
			discountRate = 0.5;
		}
		
		return discountRate;
		
	} // End Method
	
	public String toString() 
	{
		// Lists the customer’s ID, first name and last name, in a formatted manner
		String custId = getCustomerID();
		String firstName = getFirstName();
		String lastName = getlastName();
		double incentiveValue = incentives();
		double foundDiscountRate = findDiscountRate(totalPurchases);
		double discountIncentive = incentives();
		
		// Override toString for this class so it will return the correct method along with company name and purchases
		
		double netPurchases = totalPurchases - incentiveValue; 
		
		String formattedString = custId + ", " + firstName + " " + lastName + "\n"
		+ "Total Purchases:      $" + totalPurchases + "\n" 
		+ "Discount Rate:        $" + foundDiscountRate +  "\n"
		+ "Discount Incentive:   $" + discountIncentive + "\n"
		+ "Net Purchases:        $" + netPurchases 
		;
		return formattedString;
		
	} // End Method
} // End Main
