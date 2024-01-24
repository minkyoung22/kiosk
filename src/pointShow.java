import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class pointShow extends JFrame{
	public pointShow(int point) {
		this.setTitle("포인트");
		this.setSize(200, 100);
		this.setLayout(new GridLayout(2,1));
		this.add(new JLabel("현재 포인트: "+point+"p"));
		JButton ok = new JButton("확인");
		this.add(ok);
		ok.addActionListener(new ActionListener() {

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
}
