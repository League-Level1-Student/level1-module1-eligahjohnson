package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryCode implements ActionListener{ 
	JFrame code1 = new JFrame ("Covert 8 bits of binary to Asc11");
	JPanel code2 = new JPanel ();
	JTextField code3 = new JTextField(20);
	JButton code4 = new JButton () ;
	
	BinaryCode(){
		code1.setVisible(true);
		code1.add(code2);
		
		code2.add(code3);
		
		code2.add(code4);
		code1.pack();
		code4.addActionListener(this);
		
		
		
		
	}
	
	
    String convert(String input) {
        if(input.length() != 8){
             JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
             return "-";
        }
        String binary = "[0-1]+";    //must contain numbers in the given range
        if (!input.matches(binary)) {
             JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
             return "-";
        }
        try {
             int asciiValue = Integer.parseInt(input, 2);
             char theLetter = (char) asciiValue;
             return "" + theLetter;
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
             return "-";
        }
   }
	public static void main(String[] args) {
	BinaryCode coder = new BinaryCode();
	
	
	
	
		
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	

}
