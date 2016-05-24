import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class disMdptGUI extends JFrame implements ActionListener {
	
	DecimalFormat numberFormat = new DecimalFormat("#.####");
	
	JFrame dismdptWin = new JFrame("Distance/Midpoint Program");
	JLabel titleText = new JLabel("Enter your two point variables of the line to get the distance and midpoint");
	
	JLabel disText = new JLabel(" Distance: ");
	JTextField disResult = new JTextField("", 7);
	JLabel mdptText = new JLabel(" Midpoint: ");
	JTextField mdptResult = new JTextField("", 7);
	
	JLabel fxText = new JLabel(" X1: ");
	JTextField fXEnter = new JTextField("", 5);
	JLabel fyText = new JLabel(" Y1: ");
	JTextField fYEnter = new JTextField("", 5);
	JLabel sxText = new JLabel(" X2: ");
	JTextField sXEnter = new JTextField("", 5);
	JLabel syText = new JLabel(" Y2: ");
	JTextField sYEnter = new JTextField("", 5);

	double fX;
	double fY;
	double sX;
	double sY;
	public void disMdpt(){
		
		dismdptWin.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		dismdptWin.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		dismdptWin.setSize(430, 130);
		dismdptWin.setResizable(false);
		
		dismdptWin.add(titleText);
		dismdptWin.add(fxText);
		fXEnter.addActionListener(this);
		dismdptWin.add(fXEnter);
		dismdptWin.add(fyText);
		fYEnter.addActionListener(this);
		dismdptWin.add(fYEnter);
		dismdptWin.add(sxText);
		sXEnter.addActionListener(this);
		dismdptWin.add(sXEnter);
		dismdptWin.add(syText);
		sYEnter.addActionListener(this);
		dismdptWin.add(sYEnter);
		
		disResult.setEditable(false);
		mdptResult.setEditable(false);
		dismdptWin.add(disText);
		dismdptWin.add(disResult);
		dismdptWin.add(mdptText);
		dismdptWin.add(mdptResult);
		
		dismdptWin.setLocationRelativeTo(null);
		dismdptWin.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if((e.getSource() == fXEnter || e.getSource() == fYEnter || e.getSource() == sXEnter || e.getSource() == sYEnter)
				&& (fXEnter.getText() != null && !fXEnter.getText().isEmpty() && fXEnter.getText().matches("[+-]?\\d{1,10}+"))
				&& (fYEnter.getText() != null && !fYEnter.getText().isEmpty() && fYEnter.getText().matches("[+-]?\\d{1,10}+"))
				&& (sXEnter.getText() != null && !sXEnter.getText().isEmpty() && sXEnter.getText().matches("[+-]?\\d{1,10}+"))
				&& (sYEnter.getText() != null && !sYEnter.getText().isEmpty() && sYEnter.getText().matches("[+-]?\\d{1,10}+"))){
			
			fX = Double.parseDouble(fXEnter.getText());
			fY = Double.parseDouble(fYEnter.getText());
			sX = Double.parseDouble(sXEnter.getText());
			sY = Double.parseDouble(sYEnter.getText());
			
			disResult.setText("" + numberFormat.format(Math.sqrt((sX - fX)*(sX - fX)+(sY - fY)*(sY - fY))));
			mdptResult.setText("( " + numberFormat.format((fX + sX)/2) + " , " + numberFormat.format((fY + sY)/2) + " )");
			
		}
		
		
		
	}
}