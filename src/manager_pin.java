import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class manager_pin extends JFrame{
	public manager_pin() {
		this.setName("pin");
		this.setSize(200,100);
		this.setLayout(new GridLayout(3,2));
		
		this.add(new JLabel("비밀번호 4자리"));
		JTextField idTf = new JTextField(20);
		this.add(idTf);
		JButton accept = new JButton("확인");
		this.add(accept);
		
		accept.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String pwd = idTf.getText();
				if(pwd.equals("1234")) 
					new manager();
				else 
					new manager_pin();
				setVisible(false);
			}
			
		});
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
