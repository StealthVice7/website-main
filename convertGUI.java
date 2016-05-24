import javax.swing.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import java.awt.*;
import javax.swing.JTextField;

public class convertGUI extends JFrame implements ActionListener {
	String name[] = {"inch (in)", "foot (ft)", "yard (yd)", "mile (mi)", "millimeter (mm)", "centimeter (cm)", "decimeter (dm)", "meter (m)", "kilometer (km)"}; 
	
	JFrame convertWin = new JFrame("Conversion Program");
	
	JComboBox boxONE = new JComboBox(name);	
	JComboBox boxTWO = new JComboBox(name);	
	JLabel smallText = new JLabel();
	JLabel titleText = new JLabel("Enter a number and select your measurements; All decimals are rounded to ten thousandths");
	JTextField enterNum = new JTextField("", 8);
	JTextField resultNum = new JTextField("", 8);
	JButton closeButton = new JButton("Exit Conversion Program");
	double conversionInt;
	double input;

	JComboBox cb1;
	static String choice1 = "foot (ft)";
	
	JComboBox cb2;
	static String choice2 = "foot (ft)";
	
	DecimalFormat numberFormat = new DecimalFormat("#.####");
	public void convertGUI() {

		convertWin.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		convertWin.setDefaultCloseOperation(convertWin.DISPOSE_ON_CLOSE);
		convertWin.setSize(630, 130);
		convertWin.setResizable(false);
		
		convertWin.add(titleText);
		
		enterNum.addActionListener(this);
		convertWin.add(enterNum);
		
		boxONE.setSelectedIndex(1);
		boxONE.addActionListener(this);
		convertWin.add(boxONE);
		
		smallText.setText(" to ");
		convertWin.add(smallText);
		boxTWO.setSelectedIndex(1);
		boxTWO.addActionListener(this);
		convertWin.add(boxTWO);
		resultNum.setEditable(false);
		convertWin.add(resultNum);
		
		closeButton.addActionListener(this);
		convertWin.add(closeButton);
		
		convertWin.setLocationRelativeTo(null);
		convertWin.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(closeButton)){
			convertWin.dispose();
		}
		if (e.getSource() == boxONE) {
			cb1 = (JComboBox)e.getSource();
			choice1 = (String)cb1.getSelectedItem();
		}
		if (e.getSource() == boxTWO){
			cb2 = (JComboBox)e.getSource();
			choice2 = (String)cb2.getSelectedItem();
		}
		if (e.getSource() == boxONE || e.getSource() == boxTWO || e.getSource() == enterNum){																										
			switch (choice1) {
			case "foot (ft)": 
			if (enterNum.getText() != null && !enterNum.getText().isEmpty() && enterNum.getText().matches("[0-9]+")) {
				input = Double.parseDouble(enterNum.getText());
				box2method();
				resultNum.setText("" + numberFormat.format(input));
			}
			break;
			case "inch (in)": 
			if (enterNum.getText() != null && !enterNum.getText().isEmpty() && enterNum.getText().matches("[0-9]+")) {
				input = Double.parseDouble(enterNum.getText()) / 12;
				box2method();
				resultNum.setText("" + numberFormat.format(input));
			}
			break;
			case "yard (yd)": 
			if (enterNum.getText() != null && !enterNum.getText().isEmpty() && enterNum.getText().matches("[0-9]+")) {
				input = Double.parseDouble(enterNum.getText()) * 3;
				box2method();
				resultNum.setText("" + numberFormat.format(input));
			}
			break;
			case "mile (mi)": 
			if (enterNum.getText() != null && !enterNum.getText().isEmpty() && enterNum.getText().matches("[0-9]+")) {
				input = Double.parseDouble(enterNum.getText()) * 5280;
				box2method();
				resultNum.setText("" + numberFormat.format(input));
			}
			break;
			case "millimeter (mm)": 
			if (enterNum.getText() != null && !enterNum.getText().isEmpty() && enterNum.getText().matches("[0-9]+")) {
				input = Double.parseDouble(enterNum.getText()) / 304.8;
				box2method();
				resultNum.setText("" + numberFormat.format(input));
			}
			break;
			case "centimeter (cm)": 
			if (enterNum.getText() != null && !enterNum.getText().isEmpty() && enterNum.getText().matches("[0-9]+")) {
				input = Double.parseDouble(enterNum.getText()) / 30.48;
				box2method();
				resultNum.setText("" + numberFormat.format(input));
			}
			break;
			case "decimeter (dm)": 
			if (enterNum.getText() != null && !enterNum.getText().isEmpty() && enterNum.getText().matches("[0-9]+")) {
				input = Double.parseDouble(enterNum.getText()) / 3.048;
				box2method();
				resultNum.setText("" + numberFormat.format(input));
			}
			break;
			case "meter (m)": 
			if (enterNum.getText() != null && !enterNum.getText().isEmpty() && enterNum.getText().matches("[0-9]+")) {
				input = Double.parseDouble(enterNum.getText()) / 0.3048;
				box2method();
				resultNum.setText("" + numberFormat.format(input));
			}
			break;
			case "kilometer (km)": 
			if (enterNum.getText() != null && !enterNum.getText().isEmpty() && enterNum.getText().matches("[0-9]+")) {
				input = Double.parseDouble(enterNum.getText()) / 0.0003048;
				box2method();
				resultNum.setText("" + numberFormat.format(input));
			}
			break;
			default: System.out.println("error, wrong choice selected boxONE");
			}
			if(!enterNum.getText().matches("[0-9]+")){
				resultNum.setText("error");
			}
		}
		
	}

	public void box2method() {
			switch (choice2) {
			case "foot (ft)": 
				break;
			case "inch (in)": 
				input = input * 12;
				break;
			case "yard (yd)": 
				input = input / 3;
				break;
			case "mile (mi)": 
				input = input / 5280;
				break;
			case "millimeter (mm)": 
				input = input * 304.8;
				break;
			case "centimeter (cm)": 
				input = input * 30.48;
				break;
			case "decimeter (dm)": 
				input = input * 3.048;
				break;
			case "meter (m)": 
				input = input * 0.3048;
				break;
			case "kilometer (km)": 
				input = input * 0.0003048;
				break;
			default: System.out.println("error, wrong choice selected boxTWO");
			}
	}
		
}

