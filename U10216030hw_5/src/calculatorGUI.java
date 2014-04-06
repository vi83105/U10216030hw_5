import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.TitledBorder;

import java.util.Scanner;
public class calculatorGUI extends JFrame {
	double result=0;
	double input=0;
	private JTextField jtfScreen = new JTextField("0");
	private int oper = 0;//0:null,1:add,2:sub,3:*,4:/
	private JButton jbt0 = new JButton("0");
	private JButton jbt1 = new JButton("1");
	private JButton jbt2 = new JButton("2");
	private JButton jbt3 = new JButton("3");
	private JButton jbt4 = new JButton("4");
	private JButton jbt5 = new JButton("5");
	private JButton jbt6 = new JButton("6");
	private JButton jbt7 = new JButton("7");
	private JButton jbt8 = new JButton("8");
	private JButton jbt9 = new JButton("9");
	private JButton jbtONOFF = new JButton("ON/OFF");
	private JButton jbtC = new JButton("C");
	private JButton jbtSqrt = new JButton("กิ");
	private JButton jbtPercent = new JButton("%");
	private JButton jbtAC = new JButton("AC");
	private JButton jbtMC = new JButton("MC");
	private JButton jbtMM = new JButton("M-");
	private JButton jbtMP = new JButton("M+");
	private JButton jbtMR = new JButton("MR");
	private JButton jbtPlus = new JButton("+");
	private JButton jbtMinus = new JButton("-");
	private JButton jbtTimes = new JButton("X");
	private JButton jbtDivides = new JButton("/");
	private JButton jbtPoint = new JButton(".");
	private JButton jbtEqual = new JButton("=");
	
	
	public calculatorGUI(){
	JPanel PScreen = new JPanel(new GridLayout(1,1));
	jtfScreen.setEditable(false);
	PScreen.add(jtfScreen);
	JPanel PB1 = new JPanel(new GridLayout(2,5));
	PB1.add(jbtONOFF);
	PB1.add(jbtC);
	PB1.add(jbtSqrt);
	PB1.add(jbtPercent);
	PB1.add(jbtAC);
	PB1.add(jbtMC);
	PB1.add(jbtMM);
	PB1.add(jbtMP);
	PB1.add(jbtMR);
	PB1.add(jbtPlus);
	JPanel PB2 = new JPanel(new GridLayout(3,4));
	PB2.add(jbt7);
	PB2.add(jbt8);
	PB2.add(jbt9);
	PB2.add(jbtMinus);
	PB2.add(jbt4);
	PB2.add(jbt5);
	PB2.add(jbt6);
	PB2.add(jbtTimes);
	PB2.add(jbt1);
	PB2.add(jbt2);
	PB2.add(jbt3);
	PB2.add(jbtDivides);
	JPanel PB3 = new JPanel(new GridLayout(1,3));
	PB3.add(jbt0);
	PB3.add(jbtPoint);
	PB3.add(jbtEqual);
	
	add(PScreen,BorderLayout.NORTH);
	add(PB1,BorderLayout.EAST);
	add(PB2,BorderLayout.CENTER);
	add(PB3,BorderLayout.WEST);
	
	jbt0.addActionListener(new ButtonListener());
	jbt1.addActionListener(new ButtonListener());
	jbt2.addActionListener(new ButtonListener());
	jbt3.addActionListener(new ButtonListener());
	jbt4.addActionListener(new ButtonListener());
	jbt5.addActionListener(new ButtonListener());
	jbt6.addActionListener(new ButtonListener());
	jbt7.addActionListener(new ButtonListener());
	jbt8.addActionListener(new ButtonListener());
	jbt9.addActionListener(new ButtonListener());
	jbtSqrt.addActionListener(new ButtonListener());
	jbtPoint.addActionListener(new ButtonListener());
	jbtPercent.addActionListener(new ButtonListener());
	jbtC.addActionListener(new ButtonListener());
	jbtONOFF.addActionListener(new ButtonListener());
	jbtEqual.addActionListener(new ButtonListener());
	jbtDivides.addActionListener(new ButtonListener());
	jbtTimes.addActionListener(new ButtonListener());
	jbtMinus.addActionListener(new ButtonListener());
	jbtPlus.addActionListener(new ButtonListener());
	jbtAC.addActionListener(new ButtonListener());
	jbtMM.addActionListener(new ButtonListener());
	jbtMP.addActionListener(new ButtonListener());
	jbtMR.addActionListener(new ButtonListener());
	jbtMC.addActionListener(new ButtonListener());
	}
	
	
	public static void main(String[] args) {
	Passwords frame = new Passwords();
	frame.setTitle("calculator");
	frame.setLocationRelativeTo(null); // Center the frame
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//set the frame size
	frame.setSize(800, 400);
	//set the frame visible
	frame.setVisible(true);
	}
	public double operation(int sign, double result, double input){
		switch(sign){
		case 0 : result = result+input; break;
		case 1 : result = result+input; break;
		case 2 : result = result+input; break;
		case 3 : result = result+input; break;
		case 4 : result = result+input; break;
		}
		return result;
	};
	
	class ButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e){
			try{
			if(e.getSource() == jbt0){
				jtfScreen.setText(jtfScreen.getText()+"0");{}
			}
		else if(e.getSource() == jbt1){
			jtfScreen.setText(jtfScreen.getText()+"1");{}
		}
		else if(e.getSource() == jbt2){
			jtfScreen.setText(jtfScreen.getText()+"2");{}
		}
		else if(e.getSource() == jbt3){
			jtfScreen.setText(jtfScreen.getText()+"3");{}
		}
		else if(e.getSource() == jbt4){
			jtfScreen.setText(jtfScreen.getText()+"4");{}
		}
		else if(e.getSource() == jbt5){
			jtfScreen.setText(jtfScreen.getText()+"5");{}
		}
		else if(e.getSource() == jbt6){
			jtfScreen.setText(jtfScreen.getText()+"6");{}
		}
		else if(e.getSource() == jbt7){
			jtfScreen.setText(jtfScreen.getText()+"7");{}
		}
		else if(e.getSource() == jbt8){
			jtfScreen.setText(jtfScreen.getText()+"8");{}
		}
		else if(e.getSource() == jbt9){
			jtfScreen.setText(jtfScreen.getText()+"9");{}
		}
		else if(e.getSource() == jbtSqrt){
			jtfScreen.setText(jtfScreen.getText()+"5");{}
		}
		else if(e.getSource() == jbtPoint){
			jtfScreen.setText(jtfScreen.getText()+".");{}
		}
		else if(e.getSource() == jbtC){
			jtfScreen.setText(jtfScreen.getText()+result);{}
		}
		else if(e.getSource()==jbtPlus){ oper = 1;result=Double.parseDouble(jtfScreen.getText());jtfScreen.setText("");}
		else if(e.getSource()==jbtMinus){ oper = 2;result=Double.parseDouble(jtfScreen.getText());jtfScreen.setText("");}
		else if(e.getSource()==jbtTimes){ oper = 3;result=Double.parseDouble(jtfScreen.getText());jtfScreen.setText("");}
		else if(e.getSource()==jbtDivides){ oper = 4;result=Double.parseDouble(jtfScreen.getText());jtfScreen.setText("");}
		else if(e.getSource()==jbtEqual){ if(oper==1){jtfScreen.setText(result+Double.parseDouble(jtfScreen.getText())+"");}else if(oper==2){jtfScreen.setText(result-Double.parseDouble(jtfScreen.getText())+"");}else if(oper==3){jtfScreen.setText(result*Double.parseDouble(jtfScreen.getText())+"");}else if(oper==4){jtfScreen.setText(result/Double.parseDouble(jtfScreen.getText())+"");}
			
		}}catch(Exception ex){}			
	}
}
}
//Create the password class
class Passwords extends JFrame{
	calculatorGUI frame = new calculatorGUI();
	
	//Create text field and button
	private JTextField jtfPassword = new JTextField();
	private JTextField jtfWrong = new JTextField();
	private JButton jbtOk = new JButton("OK");
	
	public Passwords(){
		// Panel p1 to hold label, text fields and button
		JPanel p1 = new JPanel(new GridLayout(4, 1));
		p1.add(new JLabel("Enter the password:"));
		p1.add(jtfPassword);
		p1.add(jtfWrong);
		jtfWrong.setEditable(false);
		p1.add(jbtOk);
		
		// Add the panel to the frame
		add(p1, BorderLayout.CENTER);
		
		 // Register listener
	    jbtOk.addActionListener(new ButtonListener());
	}
	
	String password = "0000";
	
	/** Handle the OK button */
	private class ButtonListener implements ActionListener{
		@Override/**Implement actionPerformed*/
		public void actionPerformed(ActionEvent e){
			//The action after you type the password
			if(jtfPassword.getText().equals(password)){
				setVisible(false);
				frame.setSize(800, 400);
				frame.setTitle("calculator");
				frame.setLocationRelativeTo(null); // Center the frame
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			    frame.setVisible(true);
			}
			//Type wrong password
			else
				jtfWrong.setText("Please enter again!");
		}
	}
}