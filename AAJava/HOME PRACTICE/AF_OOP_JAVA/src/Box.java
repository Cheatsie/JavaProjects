/*Coder: Andre Foreman
 * Date:FEB 5 2021
 * Purpose: Create box object .
 * Title: JAVA OOP IN-CLASS LAB
 *If there was something else I forget what it was.
 */
public class Box 
{
	private double length;
	private double width;
	private double height;
	
	public Box(double inputLength, double inputWidth, double inputhHight)
	{
		length = inputLength;
		width = inputWidth;
		height = inputhHight;
	}
	
	public Box()
	{
		length = 1.0;
		width = 1.0;
		height = 1.0;
	}
	
	public Box(double side) //IM GOING TO ASSUME SIDE MEANS A WALL
	{
		//NOT SURE WHAT IS MEANT BY SIDE? 
		//IDK WHAT THIS WAS FOR!!?!!
	}
	
	
	public double getLength() 
	{
		return length;
	}

	public void setLength(double length) 
	{
		this.length = length;
	}

	public double getWidth()
	{
		return width;
	}

	public void setWidth(double width) 
	{
		this.width = width;
	}

	public double getHeight() 
	{
		return height;
	}

	public void setHeight(double height) 
	{
		this.height = height;
	}
	
	/*Coder: Andre Foreman
	 * Date:FEB 5 2021
	 * Takes: values of box	
	 * Returns: surface area of box
	 */
	public double calculateSurfaceSarea() 
	{
		double surfaceArea = (2 * 
				((length * width) + (length * width) +(length * width)));
	
		return surfaceArea;
	}
	
	/*Coder: Andre Foreman
	 * Date:FEB 5 2021
	 * Takes: NUMBERS
	 * Returns: volume
	 */
	public double calculateVolume() 
	{
		double volume = length * width * height;
		return volume;
	}

	/*Coder: Andre Foreman
	 * Date:FEB 5 2021
	 * Takes: box
	 * Returns: double the box
	 */
	public void doubleBox()
	{	
		height = height * 2;
		length = length * 2;
		width = width * 2;
		
	
	}
	
	/*Coder: Andre Foreman
	 * Date:FEB 5 2021
	 * Takes: box object
	 * Returns: boolean 
	 */
	public boolean isCube() 
	{
		if (length == height && length ==width) 
		{
			return true;
		}
		else
			return true;
	}

	/*Coder: Andre Foreman
	 * Date:FEB 5 2021
	 * Takes: Values inside box object
	 * Returns: Values in string form
	 */
	public String toString() //CONVERT THE VALUES TO STRINGS
	
	{
		String newLength = String.valueOf(length);
		String newWidth = String.valueOf(height);
		String newHeight = String.valueOf(width);
		
		String newString = ("Length is"+ newLength + ", Height is" + newHeight +  ", Width is" + newWidth );
		return  newString;
	}

	/*Coder: Andre Foreman
	 * Date:FEB 5 2021
	 * Takes: 2 box objects
	 * Returns: boolean for congruence
	 */
	public boolean equals(Box inputVariable, Box inputVariable2) 
	{
		if (inputVariable == inputVariable2) 
		{
            return true;
		}
		else
			return false;
	}
}

