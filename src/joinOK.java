import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class joinOK extends JFrame{
	public joinOK() {
		this.setTitle("가입 완료");
		this.setSize(200,100);
		this.setLayout(new GridLayout(2,1));
		this.add(new JLabel("가입 완료"));
		JButton yes = new JButton("확인");
		this.add(yes);
		yes.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setVisible(false);
			}
			
		});
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
