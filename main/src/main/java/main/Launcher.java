package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Launcher {
	
	public int level;
	public boolean choix = false;
	
	public Launcher() {

		JFrame frame = new JFrame("Menu Lorann");
		JLabel text = new JLabel("ACAR");
		JLabel text1 = new JLabel("ACAR");
		
		
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		
		JLabel label = new JLabel();
		JLabel label1 = new JLabel("COM :  ");
		label1.setForeground(Color.WHITE);
		
		JTextField niveau = new JTextField("");
		niveau.setPreferredSize(new Dimension(175, 30));
		niveau.setBackground(Color.WHITE);

		JButton button = new JButton();
		button.setText("Jouer");
		button.setBackground(Color.WHITE);
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (Integer.parseInt(niveau.getText()) >0 && Integer.parseInt(niveau.getText()) < 6) {
					level = Integer.parseInt(niveau.getText());
					choix = true;
					frame.setVisible(false);
				}	
			}
		});
		
		panel.add(label);
		panel.add(label1);
		panel.add(niveau);
		panel.add(button);
		panel.add(text);
		panel.add(text1);
		
		frame.add(panel);
		frame.setSize(360, 320);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.setBackground(Color.BLACK);
		frame.setVisible(true);

	}
}