/**
 * Program Name:	MouseExample.java
 * Purpose:			To demonstrate the differences among mouse events
 * Coder:			
 * Date:			July, 2018
 */

import javax.swing.*;
import java.awt.event.*;	//for the mouse events
import java.awt.*; 			

public class MouseExample extends JFrame
{
	//Declare class scope variables here	
	private JLabel lblClicked;
	private JLabel lblEntered;
	private JLabel lblExited;
	private JLabel lblPressed;	
	private JLabel lblDragged;
	private JLabel lblMoved;	
	private JLabel lblDisplay;	
	
	//No-arg constructor
	public MouseExample()
	{
		//Calls JFrame superclass constructor
		super("Mouse Listener Example");
		
		//Set layout
		this.setLayout(new GridLayout(3,2,10,10));
		
		//Create labels	
		lblClicked = new JLabel("Mouse Clicked", SwingConstants.CENTER);
		lblEntered = new JLabel("Mouse Entered", SwingConstants.CENTER);
		lblExited = new JLabel("Mouse Exited", SwingConstants.CENTER);
		lblPressed = new JLabel("Mouse Pressed", SwingConstants.CENTER);		
		lblDragged = new JLabel("Mouse Dragged", SwingConstants.CENTER);
		lblMoved = new JLabel("Mouse Moved", SwingConstants.CENTER);		
		lblDisplay = new JLabel("Mouse Coordinates Display Here", SwingConstants.CENTER);
		
		//Add labels to the frame
		add(lblClicked);
		add(lblEntered);
		add(lblExited);
		add(lblPressed);				
		add(lblDragged);
		add(lblMoved);
		add(lblDisplay);
		
		//register listeners for the mouse movements
		addMouseListener(new MouseHandler());
		addMouseMotionListener(new MouseHandler());
		
		//Set-up methods
		this.setSize(400,350);		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);		
	}//end constructor
	
	/**
	 * Class Name:	MouseHandler 
	 * Purpose:		Private inner class, provides functionality for mouse actions
	 * Implements:  seven abstract methods
	 * Interface:	MouseListener, MouseMotionListener
	 */
	private class MouseHandler implements MouseListener, MouseMotionListener
	{
		public void mouseClicked(MouseEvent e)
		{
			restoreColour();
			lblClicked.setForeground(Color.GREEN);
			
			//print out the x,y coordinates of where the event took			
			lblDisplay.setText("[" + e.getX() + ", " + e.getY() + "]");			
		}//End of mouseClicked method
		
		public void mouseEntered(MouseEvent e)
		{
			restoreColour();
			lblEntered.setForeground(Color.RED);
			
			//print out the x,y coordinates of where the event took			
			lblDisplay.setText("[" + e.getX() + ", " + e.getY() + "]");
		}//End of mouseEntered method
		
		public void mouseExited(MouseEvent e)
		{
			restoreColour();
			lblExited.setForeground(Color.ORANGE);
						
			//print out the x,y coordinates of where the event took
			lblDisplay.setText("[" + e.getX() + ", " + e.getY() + "]");
		}//End of mouseExited method
		
		public void mousePressed(MouseEvent e)
		{			
			restoreColour();
			lblPressed.setForeground(Color.BLUE);
		
			//print out the x,y coordinates of where the event took
			lblDisplay.setText("[" + e.getX() + ", " + e.getY() + "]");
		}//End of mousePressed method		
		
		public void mouseReleased(MouseEvent e){}		
		
		public void mouseDragged(MouseEvent e)
		{
			restoreColour();
			lblDragged.setForeground(Color.YELLOW);
		
			//print out the x,y coordinates of where the event took
			lblDisplay.setText("[" + e.getX() + ", " + e.getY() + "]");
		}//End of mouseDragged method
		
		public void mouseMoved(MouseEvent e)
		{
//NOTE: you should comment this method body out if you want to see the "mouse entered" part work
			restoreColour();
			lblMoved.setForeground(Color.PINK);
//		
//			//print out the x,y coordinates of where the event took
			lblDisplay.setText("[" + e.getX() + ", " + e.getY() + "]");			
		}//End of mouseMoved method
		
		private void restoreColour()
		{
			lblClicked.setForeground(Color.black);
			lblEntered.setForeground(Color.black);
			lblExited.setForeground(Color.black);
			lblPressed.setForeground(Color.black);
			lblDragged.setForeground(Color.black);
			lblMoved.setForeground(Color.black);			
		}
	}//End of private inner class	
	
	public static void main(String[] args)
	{
		MouseExample frame = new MouseExample();	
	}	//end main
}//end class
 
