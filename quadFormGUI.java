import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class quadFormGUI extends JFrame implements ActionListener {
	
	
	//NOT FINISHED 
	
	
	DecimalFormat numberFormat = new DecimalFormat("#.####");
	
	JFrame quadformWin = new JFrame("Quadratic Formula");
	
	JLabel titleText = new JLabel("Enter your A, B, and C into the boxes, press ENTER once done");
	
	JLabel aText = new JLabel("  A: ");
	JTextField aEnter = new JTextField("", 7);
	JLabel bText = new JLabel("  B: ");
	JTextField bEnter = new JTextField("", 7);
	JLabel cText = new JLabel("  C: ");
	JTextField cEnter = new JTextField("", 7);
	
	JLabel resultText = new JLabel(" Result: ");
	JLabel equationText = new JLabel(" Equation: ");
	JTextField result = new JTextField("", 23);
	JTextField equation = new JTextField("", 23	);
	double oneAns, aNum, bNum, cNum;
	
	public void quadForm(){

		quadformWin.setLayout(new FlowLayout(FlowLayout.CENTER));
		quadformWin.setLocationRelativeTo(null);
		quadformWin.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		quadformWin.setSize(380, 130);
		quadformWin.setResizable(false);
		
		aEnter.addActionListener(this);
		bEnter.addActionListener(this);
		cEnter.addActionListener(this);
		
		quadformWin.add(titleText);
		quadformWin.add(aText);
		quadformWin.add(aEnter);
		quadformWin.add(bText);
		quadformWin.add(bEnter);
		quadformWin.add(cText);
		quadformWin.add(cEnter);
		
		result.setEditable(false);
		equation.setEditable(false);
		quadformWin.add(resultText);
		quadformWin.add(result);
		quadformWin.add(equationText);
		quadformWin.add(equation);
		
		quadformWin.setVisible(true);
		
	}

	public void actionPerformed(ActionEvent e) {
		if((e.getSource() == aEnter || e.getSource() == bEnter || e.getSource() == cEnter)
				&& (aEnter.getText() != null && !aEnter.getText().isEmpty() && aEnter.getText().matches("[+-]?\\d{1,10}+"))
				&& (bEnter.getText() != null && !bEnter.getText().isEmpty() && bEnter.getText().matches("[+-]?\\d{1,10}+"))
				&& (cEnter.getText() != null && !cEnter.getText().isEmpty() && cEnter.getText().matches("[+-]?\\d{1,10}+"))){
		
			aNum = Double.parseDouble(aEnter.getText());
			bNum = Double.parseDouble(bEnter.getText());
			cNum = Double.parseDouble(cEnter.getText());
			
			double oneAns = (bNum * bNum) + (-aNum * cNum * 4);
			
			if(oneAns == 0){
				result.setText("no equation");
			}else{
				double twoAns = (double) Math.sqrt(oneAns);
				double threeAns = -bNum + twoAns;
				double xOne = threeAns/(2*aNum);
		
				double fourAns = (bNum * bNum) + (-aNum * cNum * 4);
				double fiveAns = (double) Math.sqrt(fourAns);
				double sixAns = -bNum - fiveAns;
				double xTwo = sixAns/(2*aNum);
			
			
				result.setText("X1 is " + numberFormat.format(xOne) + " & X2 is " + numberFormat.format(xTwo));
				xOne = xOne * -1;
				xTwo = xTwo * -1;
					if (xOne < 0 && xTwo < 0){
						equation.setText(aNum +"(X " + numberFormat.format(xOne) + ") (X " + numberFormat.format(xTwo) + ")");
				}else{
					if (xOne < 0 && xTwo > 0){
						equation.setText(aNum +"(X " + numberFormat.format(xOne) + ") (X + " + numberFormat.format(xTwo) + ")");
				}else{
					if (xOne > 0 && xTwo < 0){
						equation.setText(aNum +"(X + " + numberFormat.format(xOne) + ") (X " + numberFormat.format(xTwo) + ")");
				}else{
					if (xOne > 0 && xTwo > 0){
						equation.setText(aNum +"(X + " + numberFormat.format(xOne) + ") (X + " + numberFormat.format(xTwo) + ")");
				}else{
					equation.setText("unknown error");
				}
				}
				}
				}
			}
		}
	}
}
	
	
		
			
