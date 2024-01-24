import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Menu extends JFrame{
	
	public static int ame=0;
	public static int caf=0;
	public static int ba=0;
	public static int cho=0;
	public Menu() {
		this.setTitle("Kiosk");
		this.setSize(500,500);
		this.setLayout(new GridLayout(6,2));
		
		Font font = new Font("메뉴 선택",Font.PLAIN,24);
		JLabel menu= new JLabel("메뉴 선택");
		menu.setFont(font);
		JCheckBox menu1= new JCheckBox("아메리카노 1500원");
		JCheckBox menu2= new JCheckBox("카페라떼 2000원");
		JCheckBox menu3= new JCheckBox("바닐라라떼 3000원");
		JCheckBox menu4= new JCheckBox("초코라떼 3500원");
		this.add(menu);
		this.add(new JLabel());
		this.add(menu1);
		this.add(new JLabel());
		this.add(menu2);
		this.add(new JLabel());
		this.add(menu3);
		this.add(new JLabel());
		this.add(menu4);
		this.add(new JLabel());
		JButton pay = new JButton("결제");
		this.add(pay);
		JButton man = new JButton("매니저");
		this.add(man);
		
		man.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new manager_pin();
			}
			
		});
		pay.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				manager.price=0;
				if(menu1.isSelected()) {
					manager.menuSum(1500);
					manager.sales(1500);
					manager.menu1++;
				}
				if(menu2.isSelected()) {
					manager.menuSum(2000);
					manager.sales(2000);
					manager.menu2++;
				}
				if(menu3.isSelected()) {
					manager.menuSum(3000);
					manager.sales(3000);
					manager.menu3++;
				}
				if(menu4.isSelected()) {
					manager.menuSum(3500);
					manager.sales(3500);
					manager.menu4++;
				}
				new Paycom();
				setVisible(false);
			}
			
		});
	
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
