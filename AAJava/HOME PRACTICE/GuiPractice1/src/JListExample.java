/**
 * This class demonstrates how to create and populate JLists. In particular, it demonstrates two JLists
 * And outputs the selections from each list to the output list, once the user clicks the submit button.
 * @author madhavi
 *
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class JListExample extends JFrame{

	//This will store the data to be displayed on the list
	private DefaultListModel<String> dataLetters;
    private DefaultListModel<Integer> dataNumbers;
    private DefaultListModel<Object> dataOutput;
    
    //These will display the data
    private JList listOutput, listLetters, listNumbers;
	JListExample()
	{
		//courtesy call to super class
		super("JList Example");
				
		//boilerplate
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new GridLayout(3,2,10,10) );
		this.setSize(400,400);
		this.setLocationRelativeTo(null);
		
		//SelectionMode allows you to select either only one item at a time, multiple items within the same interval, or multiple items in general
		//listLetters, for example, will only allow you to select one at a time
		//layoutOrientation allows you to display items either vertically or horizontally. counterintuitively, HORIZONTAL_WRAP displays them vertically
		//VisibleRowCount sets the initial selected item. if you set it to -1, it won't have any initial selected item
		listLetters = new JList();
        listLetters.setSelectionMode(ListSelectionModel.DOUBLE_SELECTION);
		listLetters.setLayoutOrientation(JList.HORIZONTAL_WRAP);
		listLetters.setVisibleRowCount(-1);

        //listNumbers will allow you to select any number of items. Hold shift to select multiple items.
		//It also starts off with the first element initially selected and displays the elements horizontally.
        listNumbers = new JList(); 
		listNumbers.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		listNumbers.setLayoutOrientation(JList.VERTICAL_WRAP);
		listNumbers.setVisibleRowCount(0);
		
        //Instantiate the models
		dataLetters = new DefaultListModel<String>();
        dataNumbers = new DefaultListModel<Integer>();
        dataOutput = new DefaultListModel<Object>();
		
        dataLetters.addElement("A");
		dataLetters.addElement("B");
		dataLetters.addElement("C");

        dataNumbers.addElement(1);
        dataNumbers.addElement(2);
        dataNumbers.addElement(3);
		
		//Add the models to the lists
		listLetters.setModel(dataLetters);
        listNumbers.setModel(dataNumbers);
		
        JButton submit = new JButton("Submit");

        listOutput = new JList();

        submit.addActionListener(new ButtonListener());
		//Add the list to the JFrame
		this.add(listLetters);
        this.add(listNumbers);
        this.add(listOutput);
        this.add(submit);
		this.setVisible(true);
	
				
	}

    private class ButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            //Get the indices of the selected items
            int selectedLettersIndices[] = listLetters.getSelectedIndices();
            int selectedNumbersIndices[] = listNumbers.getSelectedIndices();

            //Add the selected items to the output model
            for (int i = 0; i < selectedLettersIndices.length; i++)
            {
                dataOutput.addElement(dataLetters.getElementAt(i));
            }
            for (int i = 0; i < selectedNumbersIndices.length; i++)
            {
                dataOutput.addElement(dataNumbers.getElementAt(i));
            }

            //Connect the output model to the list in order to display the data
            listOutput.setModel(dataOutput);
        }
    }
	
	public static void main(String[] args)
	{
		new JListExample();
	}
}
