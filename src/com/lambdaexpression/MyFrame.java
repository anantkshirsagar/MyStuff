package com.lambdaexpression;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyFrame extends JFrame{
	
	public MyFrame() {
		setLayout(new FlowLayout());
		
		//Listener implementation without lambda expression
		JButton button1 = new JButton("Button1");
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Button1 is clicked");
			}
		});
		
		//Listener implementation using lambda expression
		JButton button2 = new JButton("Button2");
		button2.addActionListener((e) -> {
			JOptionPane.showMessageDialog(null, "Button2 is clicked");
		}); 
		
		add(button1);
		add(button2);
		
		setVisible(true);
		setBounds(100, 100, 500, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new MyFrame();
	}
}
