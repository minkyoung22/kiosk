import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

import Practice3Ag.Manager;

public class Kiosk_Test extends JFrame{
	public Kiosk_Test() {
		this.setTitle("Kiosk");
		this.setSize(500,500);
		JButton start = new JButton("시작하기");
		this.add(start, BorderLayout.CENTER);
		this.add(start);
		
		start.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Menu();
				setVisible(false);
			}
		});
		
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Kiosk_Test();
	}

}

