package com;

import java.awt.event.ActionListener;

import javax.swing.*;

public class Hello extends JFrame{


	public Hello()
	{
	   super();
	}



	public static void main(String[] args)
	{
	   Hello w = new Hello();
	   w.setSize(300, 200);
	   w.setLayout(null);
	   JLabel jLabel = new JLabel();
	   jLabel.setBounds(34, 49, 53, 18); 
	   jLabel.setText("Name:"); 
	   JTextField jTextField = new JTextField();
	   jTextField.setBounds(96, 49, 160, 20);
	   JButton jButton = new JButton();
	   jButton.setBounds(103, 110, 71, 27); 
	   jButton.setText("ok");
	   jButton.addActionListener(new ActionListener(new action(){System.out.println("ok");}));
	   w.add(jLabel);
	   w.add(jTextField);
	   w.add(jButton);
	   w.setVisible(true);
	}

}


