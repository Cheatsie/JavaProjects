/** @Author:Andre Foreman
	 * Purpose: Extend the class it's assigned to extend
	 * Date:Monday, March 15
	 * @Extends:RetailCustomer
	 */
public class PrefferedCustomer extends RetailCustomer // Subclass of retail customer
{
	private int cashBackRate;
	public PrefferedCustomer(String firstName, String lastName, String customerLevel, double totalPurchases, double cashBackRate) //5 Args Constructor
	{
		super(firstName, lastName, customerLevel, totalPurchases); // Remember to invoke the superclass
		// TODO Auto-generated constructor stub
	}

	public double getCashBackRate() {
		return cashBackRate;
	}
	public void setcashBackRate(int cashBackRate) {
		this.cashBackRate = cashBackRate;
	}
	
	/** @Author: Andre Foreman
	 * Purpose:// Implement incentives by multiplying cash back by the incentive earned by a retail customer.
	 * @return: finalValue
	 */
	@Override
	public double incentives() // Implement incentives by multiplying cash back by the ?incentive? earned by a retail customer. I DO NOT UNDERSTAND
	{
		// TODO Auto-generated method stub
		int value1 = cashBackRate;
		double value2 = findDiscountRate(getTotalPurchases()); // Convert find discount rate to double
		double value3 = value1 * value2; //Multiply cash back to incentive earner by retail customer 
		double finalValue = value3 + value2; // Add that amount to incentive earned by retail customer
		
		return finalValue;
	} // End Method
	
	/** @Author:Andre Foreman
	 * @Purpose: Execute the proper formatting with the input required.
	 * @return:Proper formatting with the input required.
	 */
	public String toString() 
	{
		
		// Lists the customer’s ID, first name and last name, in a formatted manner
		String custId = getCustomerID();
		String firstName = getFirstName();
		String lastName = getlastName();
		double incentiveValue = incentives();
		double totalPurchases = getTotalPurchases();
		double foundDiscountRate = findDiscountRate(totalPurchases);
		double discountIncentive = incentives();
		
		// Override toString for this class so it will return the correct method along with company name and purchases
		
		double netPurchases = totalPurchases - incentiveValue; 
		
		String formattedString = custId + ", " + firstName + " " + lastName + "\n"
		+ "Total Purchases:      $" + totalPurchases + "\n" 
		+ "Discount Rate:        $" + foundDiscountRate +  "\n"
		+ "Discount Incentive:   $" + discountIncentive + "\n"
		+ "Net Purchases:        $" + netPurchases + "\n"
		+ "CashBack Rate:        $" + cashBackRate + "%"
		;
		return formattedString;	
	} // End Method
}// End Main
