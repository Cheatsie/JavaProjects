/** @Author:Andre Foreman
	 * @Purpose:Extend the class it's assigned to extend
	 * Date:Monday, March 15
	 * @Extends:Customer
	 */
public class BusinessCustomer extends Customer // Business Customer is a subclass of Customer 
{
	private String companyName;
	private int discountRate;
	private double totalPurchases;
	
	// 6 *Args Constructor
	public BusinessCustomer(String firstName, String lastName, String customerLevel,
			String companyName, int discountRate, double totalPurchaes) {
		// Remember to invoke superclass
		super(firstName, lastName, customerLevel);
		// TODO Auto-generated constructor stub
	}

	@Override
	// Implement incentives by multiplying total purchases by discount rate
	/** @Author:
	 * Purpose:
	 * Date:
	 * @param:
	 * @return:
	 */
	public double incentives() {
		// Convert discount rate to a double worth .10
		double value1 = 0.10 * getDiscountRate();
		double value2 = getTotalPurchases();
		
		double value3 = value1*value2;
		
		return value3;
	}

	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}

	public double getTotalPurchases() {
		return totalPurchases;
	}
	public void setTotalPurchases(double totalPurchases) {
		this.totalPurchases = totalPurchases;
	}

	/** @Author:Andre Foreman
	 * @Purpose:
	 * @return:
	 */
	public String toString() 
	{
		// Lists the customer’s ID, first name and last name, in a formatted manner
		String custId = getCustomerID();
		String firstName = getFirstName();
		String lastName = getlastName();
		String companyName = getCompanyName();
		double discountIncentive = incentives();
		
		// Override toString for this class so it will return the correct method along with company name and purchases
		
		double netPurchases = totalPurchases - discountIncentive; 
		
		String formattedString = custId + ", " + firstName + " " + lastName + "\n"
		+ "Buisness Customer for " + companyName + "\n" 
		+ "Total Purchases:      $" + totalPurchases + "\n" 
		+ "Discount Rate:        $" + discountRate +  "\n"
		+ "Discount Incentive:   $" + discountIncentive + "\n"
		+ "Net Purchases:        $" + netPurchases 
		;
		return formattedString;
		
	} // End to String
	
}// End class


