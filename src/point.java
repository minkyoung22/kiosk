import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class point extends JFrame{
	userManager u=new userManager();
	private static point instance;
	public point() {
		this.setTitle("포인트 적립");
		this.setSize(300, 200);
		this.setLayout(new GridLayout(2,2));
		
		this.add(new JLabel("전화번호"));
		JTextField number = new JTextField(20);
		this.add(number);
		JButton ok = new JButton("적립");
		this.add(ok);
		JButton join = new JButton("가입");
		this.add(join);
		String num = number.getText();
		
		join.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				u.adduser(new user(num));
				number.setText("");
				new joinOK();
			}
		});
		
		ok.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new pointShow(u.pointup(num));
				number.setText("");
			}
			
		});
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static point getInstance() {
		if(instance==null)
			instance=new point();
		return instance;
	}
}
