/*Coder: Andre Foreman
 * Date:FEB 5 2021
 * Purpose: Make some objects and do some operations.
 * Title: JAVA OOP IN-CLASS LAB
 *If there was something else I forget what it was.
 */

public class BoxTestER 
{
	public static void main(String[] args) 
		{
			System.out.println("Welcome to the Box tester!");
			System.out.println("----------------------------------------------------------------------------------------------------");
			System.out.println("This program will instantiate objects of Box and test all of the methods of the Box class.");
			System.out.println("");
			
			//CREATE BOX0 
			Box box0 = new Box(); 
			System.out.println("Box0");
			System.out.println("For Box0 length  is:	" + box0.getLength());
			System.out.println("For Box0 height  is:	" + box0.getHeight());
			System.out.println("For Box0 width  is:	" + box0.getWidth());
			System.out.println("");
			
			//CREATE BOX1
			Box box1 = new Box(1.5, 2.6, 5.2); 
			System.out.println("Box1");
			System.out.println("Length:	" + box1.getLength());
			System.out.println("Height:	" + box1.getHeight());
			System.out.println("Width:	" + box1.getWidth());
			System.out.println("");
			
			//CREATE BOX2
			Box box2 = new Box(6.8, 6.8, 6.8); 
			System.out.println("Length:	" + box2.getLength());
			System.out.println("Height:	" + box2.getHeight());
			System.out.println("Width:	" + box2.getWidth());
			System.out.println("");
			
			//CREATE BOX3
			Box box3 = new Box(2.0, 4.0, 6.0); 
			System.out.println("Length:	" + box1.getLength());
			System.out.println("Height:	" + box1.getHeight());
			System.out.println("Width:	" + box1.getWidth());
			System.out.println("");
			
			double volume = box1.calculateVolume();
			System.out.println("For box1 the volume is: " + volume);
			System.out.println("");
			
			double surfaceArea = box1.calculateSurfaceSarea();
			System.out.println("For box1 the surface area is: " + surfaceArea);
			System.out.println("");
			
			box1.doubleBox();
			System.out.println("The doubled version of box1 is: ");
			System.out.println("Length:	" + box1.getLength());
			System.out.println("Height:	" + box1.getHeight());
			System.out.println("Width:	" + box1.getWidth());
			System.out.println("");
			
			boolean isCube = box2.isCube();
			System.out.println("Is Box3 2 cube: " + isCube);
			System.out.println("");
			
			boolean isSame = box2.equals(box3);
			System.out.println("Is Box2 equal to Box3: " + isSame);
			System.out.println("");
			
	}
}
