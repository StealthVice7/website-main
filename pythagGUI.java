import javax.swing.JOptionPane;

public class pythagGUI {
	public void pythag(){
	 
		String AI, BI, CI;
		double A, B, C = 0;
		String[] options = new String[] {"A", "B", "C", "Cancel"};
	    int response = JOptionPane.showOptionDialog(null, "Which variable are you trying to find?", "Pythagorean Theorem",
	        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
	        null, options, options[0]);
	    if (response == 3){
	    	return;
	    }else if(response == 0){
	    	BI = JOptionPane.showInputDialog("What is your B variable?");
	    	CI = JOptionPane.showInputDialog("What is your C variable?");
	    	B = Double.parseDouble(BI);
	    	C = Double.parseDouble(CI);
	    	A = Math.sqrt((C*C) - (B*B));
	    	JOptionPane.showMessageDialog(null, "A = " + A , "Pathagorean Theorem" , JOptionPane.PLAIN_MESSAGE);
	    }else if(response == 1){
	    	AI = JOptionPane.showInputDialog("What is your A variable?");
	    	CI = JOptionPane.showInputDialog("What is your C variable?");
	    	A = Double.parseDouble(AI);
	    	C = Double.parseDouble(CI);
	    	B = Math.sqrt((C*C) - (A*A));
	    	JOptionPane.showMessageDialog(null, "B = " + B , "Pathagorean Theorem" , JOptionPane.PLAIN_MESSAGE);
	    }else if(response == 2){
	    	AI = JOptionPane.showInputDialog("What is your A variable?");
	    	BI = JOptionPane.showInputDialog("What is your B variable?");
	    	A = Double.parseDouble(AI);
	    	B = Double.parseDouble(BI);
	    	C = Math.sqrt((A*A) + (B*B));
	    	JOptionPane.showMessageDialog(null, "C = " + C , "Pathagorean Theorem" , JOptionPane.PLAIN_MESSAGE);
	    }
  
 	}
 }