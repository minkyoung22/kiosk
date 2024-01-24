import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Paycom extends JFrame{
	public Paycom() {
		//결제완료 페이지
		this.setTitle("결제 완료");
		this.setSize(300,200);
		this.setLayout(new GridLayout(2,2));
		
		this.add(new JLabel(manager.price+"원 결제 완료"));
		JButton accept = new JButton("확인");
		this.add(new JLabel(""));
		this.add(accept);
		JButton pt = new JButton("포인트 적립");
		this.add(pt);
		accept.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Menu();
				manager.price=0;
				setVisible(false);
			}
		});
		pt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				point.getInstance();
				setVisible(false);
			}
			
		});
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
