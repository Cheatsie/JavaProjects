
public class ClassDemo // SUPER CLASS
{
	// VARIABELS PRIVATE
	// METHODS PUBLIC 
	
	public String stringVariable; //
	// UNUSED private int intVariable;
	
	//----------------------------------------------------------
	// POLYMORPHISM = Same function but different
	// WITH PARAMETER
	public void firstMethod(String parameter) 
	{
		System.out.println("My name is: " + parameter);
	}
	
	// WITHOUT PARAMETER
	public void firstMethod() 
	{
		System.out.println("My name!");
	}
	//--------------------------------------------------------------------
	
	//--------------------------------------------------------------------
	//GETTERS AND SETTERS
	// Getter
	public String getName()
	{
		return stringVariable;
	}
	 
	// Setter
	public void setName( String stringVariable) 
	{
		this.stringVariable = stringVariable;
	}
	
	//NEW Setter
	public void newName(String newVariable) {
		stringVariable = newVariable;	
	}
	
	//--------------------------------------------------------------------
}	 