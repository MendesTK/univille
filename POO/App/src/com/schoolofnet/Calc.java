package com.schoolofnet;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Calc {
	
	private static JFrame mainFrame;
	private static JButton btnCalc;
	private static JTextField txtNum1;
	private static JTextField txtNum2;
	private static JComboBox op;
	
	public Calc(){
		prepareGUI();
	}
	
	
	
	public static void main(String[] args){
		Calc main = new Calc();
		
	}
	
	private void prepareGUI(){
		mainFrame = new JFrame();
		mainFrame.setBounds(100, 100, 400, 250);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setLayout(new GridLayout(4, 0));
	

		btnCalc = new JButton("Calculete");
		btnCalc.setActionCommand("Calc");
		txtNum1 = new JTextField(30);
		txtNum2 = new JTextField(30);
		
		op = new JComboBox<>();
		op.addItem("+");
		op.addItem("-");
		op.addItem("*");
		op.addItem("/");
		
		
		
		btnCalc.addActionListener(new BtnHandler());
		mainFrame.add(txtNum1);
		mainFrame.add(op);
		mainFrame.add(txtNum2);
		mainFrame.add(btnCalc);
		mainFrame.setVisible(true);
		
	}

	
	
	
	private class BtnHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String command = e.getActionCommand();
			
			switch (command){
				case "Calc" :
					if (txtNum1.getText() != null && txtNum2.getText() != null && op.getSelectedItem() != null){
						Float num1 = Float.parseFloat(txtNum1.getText());
						Float num2 = Float.parseFloat(txtNum2.getText());
						
						Float result = (float) 0;
						String opSelected = op.getSelectedItem().toString();
						
						if (opSelected == "+"){
							result = num1 + num2;
						}else if(opSelected == "-"){
							result = num1 - num2;
						}else if(opSelected == "*"){
							result = num1 * num2;
						}else if(opSelected == "/"){
							result = num1 / num2;
						}
						
						JOptionPane.showMessageDialog(null, num1.toString() + " " + opSelected + " " + num2.toString() + " = " + result.toString());
						
					}
					break;
				default:
					System.out.println("Invalid Action");
					
			}
		}
		
	}

}

