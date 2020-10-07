package labsheet2;

//NumbersGUI.java
/*This GUI application displays the current largest and smallest numbers entered*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NumbersGUI {
	JLabel jLabelLargest,jLabelSmallest;
	float largest=-1e38f,smallest=1e38f;
	JTextField jTextField;
	
	public NumbersGUI()
		{	 		
			 JFrame jFrameWindow = new JFrame("Numbers Application");
			 
			 FlowLayout flowLayout = new FlowLayout();

		     jFrameWindow.setLayout(flowLayout);
		     	     		 
			 jFrameWindow.setSize(500,150);

			 jFrameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			 JLabel jLabelPrompt = new JLabel("Please enter your numbers here");
			 jLabelLargest = new JLabel("No numbers entered yet");
			 jLabelSmallest = new JLabel();
		 	 
		 	 jTextField = new JTextField(20);
		 	 
		 	 jFrameWindow.add(jLabelPrompt);	 
		 	 
 			 jFrameWindow.add(jTextField);
		 	 
 			 jFrameWindow.add(jLabelLargest);
 			 jFrameWindow.add(jLabelSmallest);
 			 
 			 jTextField.addActionListener(new TextFieldEventHandler());
 			 
			 jFrameWindow.setVisible(true);			 
		}
	
	public static void main(String args[])
		{
			NumbersGUI app = new NumbersGUI();
		}
			
	private class TextFieldEventHandler implements ActionListener {
		public void actionPerformed(ActionEvent e)
			{
				float number;
				String numberAsString;
				
				if(jTextField.getText().equals(""))
					{
						JOptionPane.showMessageDialog(null,"You must enter something!!!","Error",
						JOptionPane.ERROR_MESSAGE);
					}
				else
					{
						numberAsString = jTextField.getText();
						jTextField.setText("");
						number = Float.parseFloat(numberAsString);
						
						if(number>largest)
							largest = number;
						
						if (number<smallest)
							smallest = number;
						
						jLabelLargest.setText("Largest number so far is: " + largest);  
						jLabelSmallest.setText("Smallest number so far is: " + smallest);
						
					}
			}
	}
}





