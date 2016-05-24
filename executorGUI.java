import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class executorGUI extends JFrame implements ActionListener {
	JButton quadButton = new JButton("Quadratic");
	JButton pythagButton = new JButton("Pythagorean");
	JButton dismdptButton = new JButton("Distance/Midpoint");
	JButton convertButton = new JButton("Conversion");
	JButton stopButton = new JButton("Cancel");
	
	JLabel titleText = new JLabel("Click on any of the following buttons to go to a program; Please report any problems you experience");
	
	JLabel creditText = new JLabel("<html><br>[Version 1]   Created by </html>");
	JLabel vasilText = new JLabel("<html><br>Vasil</html>");
	JLabel creditText2 = new JLabel("<html><br>, Elijah, and Lee</html>");
	
	public executorGUI(){
		
		setLayout(new FlowLayout(FlowLayout.CENTER));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(630, 122);
		setTitle("Utility Program");
		setResizable(false);
		
		add(titleText);
		quadButton.addActionListener(this);
		add(quadButton);
		pythagButton.addActionListener(this);
		add(pythagButton);
		dismdptButton.addActionListener(this);
		add(dismdptButton);
		convertButton.addActionListener(this);
		add(convertButton);
		stopButton.addActionListener(this);
		add(stopButton);
		add(creditText);
		vasilText.setForeground(Color.GREEN);
		add(vasilText);
		add(creditText2);
		
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	
	
	
	public static void main(String[] args) {
		new executorGUI();
	}	

	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(quadButton)){
			quadFormGUI quadFormGUIObject = new quadFormGUI();
			quadFormGUIObject.quadForm();
		}else if(e.getSource().equals(pythagButton)){
			pythagGUI pythagGUIObject = new pythagGUI();
			pythagGUIObject.pythag();
		}else if(e.getSource().equals(dismdptButton)){
			disMdptGUI disMdptGUIObject = new disMdptGUI();
			disMdptGUIObject.disMdpt();
		}else if(e.getSource().equals(convertButton)){
			convertGUI convertGUIObject = new convertGUI();
			convertGUIObject.convertGUI();
		}else if(e.getSource().equals(stopButton)){
			dispose();
		}
	}
}

