import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.TitledBorder;

public class calculatorGUI extends JFrame {
	private JTextField jtfScreen = new JTextField();
	
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
	
	}
public static void main(String[] args) {
	calculatorGUI frame = new calculatorGUI();
	frame.setTitle("calculator");
	frame.setLocationRelativeTo(null); // Center the frame
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//set the frame size
	frame.setSize(800, 400);
	//set the frame visible
	frame.setVisible(true);
}
}
