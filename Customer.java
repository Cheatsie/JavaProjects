import java.util.Random;

/** @Author:Andre Foreman
 * @Purpose:Extend the class it's assigned to extend
 * Date:Monday, March 15
 * 
 */
public abstract class Customer // Abstract Super Class
{
	private String firstName;
	private String lastName;
	private String customerID;
	private String customerLevel;
	
	/** Purpose: Get the first four values of a string, if they aren't available, replace with X
	 * Inputs: userString
	 * Outputs: Reduced String to 4
	 */
	public String firstFour(String userString) {
		
		char index1;
		try {
			index1 = userString.charAt(0);
		
		}catch (Exception e) {
			index1 = 'X';
		}
		
		char index2;
		try {
			index2 = userString.charAt(1);
		
		}catch (Exception e) {
			index2 = 'X';
		}
		
		char index3;
		try {
			index3 = userString.charAt(2);
		
		}catch (Exception e) {
			index3 = 'X';
		}
		char index4;
		try {
			index4 = userString.charAt(3);
		
		}catch (Exception e) {
			index4 = 'X';
		}
		
		String s1 = String.valueOf(index1);
		String s2 = String.valueOf(index2);
		String s3 = String.valueOf(index3);
		String s4 = String.valueOf(index4);
		
		String sumStrings = (s1 + s2 + s3 +s4);
		
		String upToNCharacters = sumStrings ;
		return upToNCharacters;
		
	}
	
	public Customer(String firstName, String lastName, String customerLevel) // 3 *3Args Constructor
		{
			this.firstName = firstName;
			this.lastName = lastName;
			this.customerLevel = customerLevel;
			
			this.customerID = setCustomerID(lastName); // Constructor calls setCustomerId to initialize
		}
	
	// Each of the private field has a corresponding G & S method.
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getlastName() {
		return lastName;
	}
	public void setlastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getCustomerID() {
		return customerID;
	}
	/** @Author:Andre Foreman
	 * Purpose: Take firsrFour function and add 5 random numbers after
	 * @param:customerId
	 * @return:finalCustomerId
	 */
	private String setCustomerID(String customerID) 
	{
		// Made up from first four characters of his last name
		String custIdtoFour = firstFour(customerID);
		Random Random = new Random();
		
		// Followed by 5 randomly generated integers between 0-9 
		int n1 = Random.nextInt(10);
		int n2 = Random.nextInt(10);
		int n3 = Random.nextInt(10);
		int n4 = Random.nextInt(10);
		int n5 = Random.nextInt(10);
		
		String concatValues = "-" + n1 + n2 + n3 + n4 + n5;
		
		String finalCustId = custIdtoFour + concatValues;
		return finalCustId;
	}
	
	public String getcustomerLevel() {
		return customerLevel;
	}
	public void setcustomerLevel(String customerLevel) {
		this.customerLevel = customerLevel;
	}
	
	public abstract double incentives();
	
	/** @Author:Andre Foreman
	 * Purpose: Execute the proper formatting with the input required.
	 * @return: Formatted String
	 */
	public String toString() 
	{
		// Lists the customer’s ID, first name and last name, in a formatted manner
		String custId = getCustomerID();
		String firstName = getFirstName();
		String lastName = getlastName();
		
		
		String formattedString = custId + ", "+ firstName + " " + lastName;
		return formattedString;
		
	} 
}// End class
