/* Coder:
 * Purpose:
 * Date:
 */

/*Coder Comments:
 * I don't know what happened to the calculations. They seemed to be working fine and then they stopped working and I have no skills for finding the logic error. 
 * I've been trying  to find the logic error for days and having no success, I hope I was able to show-case the rest of the project well enough though.
 * I Also missed the classes on Javadocs so I don't know what they are or how to use them.
 */



public class CustomerTester {
	public static void main (String []Args){
		System.out.println("Welcome to the Customer tester!");
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("This program will instantiate objects of the Customer hierarchy and test their methods");
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.print("\n");
		
		Customer[] custArray = new Customer [3];
		Customer firstCustomer = new BusinessCustomer("Mike", "Holmes", "Busness","Home Depot", 10, 3105.50);
		Customer secondCustomer = new RetailCustomer("Mike", "Gelda", "Retail", 11200.00);
		Customer thirdCustomer = new PrefferedCustomer("Wei", "Ping", "PrefferedCustomer", 11200.00, 0.05);
		
		custArray[0] = firstCustomer; 
		custArray[1] = secondCustomer;
		custArray[2] = thirdCustomer;
		
		// Using a loop, print each object in the array calling the 2 string method
		for(int i=0; i < custArray.length;i++) {
			// Print out the values in the formatted way
			System.out.println(custArray[i].toString());
			System.out.print("\n");
		}
		System.out.println("");
		
		// Use another loop that will print each customers full name and the incentives
		for(int i=0; i < custArray.length;i++) {
			System.out.println(custArray[i].getFirstName() + " " + custArray[i].getlastName()+ " earns a discount incentive of $" + custArray[i].incentives());
		}
		System.out.print("\n");
		
		// Do not use superclass reference variables this time, use the subclass	
		BusinessCustomer fourthCustomer = new BusinessCustomer("Tristan", "Lee", "Busness","Starbucks", 15, 9875.25);
		RetailCustomer fifthCustomer = new RetailCustomer("Carlos", "Beltran", "Retail", 3100.50);
		PrefferedCustomer sixthCustomer = new PrefferedCustomer("Arti", "Patel", "PrefferedCustomer", 10450, 0.10);
		
		Customer[] custArray2 = new Customer [3];
		
		custArray2[0] = fourthCustomer; 
		custArray2[1] = fifthCustomer;
		custArray2[2] = sixthCustomer;	
		
		//Print each new object with toString
		// Print
		for(int i=0; i < custArray.length;i++) {
			// Print out the values in the formatted way
			System.out.println(custArray2[i].toString());
			System.out.print("\n");
		}
		
		// Use setter and getter methods to make changes
		fourthCustomer.setTotalPurchases(8894.00);
		fourthCustomer.setDiscountRate(12);
		
		fifthCustomer.setTotalPurchases(100500.00);
		
		sixthCustomer.setTotalPurchases(14987.24);
		sixthCustomer.setlastName("Patel-Ruhil");
		sixthCustomer.setcashBackRate(13);
		
		// Print Again to show Changes
		for(int i=0; i < custArray.length;i++) {
			// Print out the values in the formatted way
			System.out.println(custArray2[i].toString());
			System.out.print("\n");
		}
		
	}// End Main
}// End Class
