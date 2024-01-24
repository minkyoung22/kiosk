import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class manager extends JFrame{
	public static int price=0;
	public static int sales=0;
	public static int menu1=0;
	public static int menu2=0;
	public static int menu3=0;
	public static int menu4=0;
	public manager() {
		this.setName("manager");
		this.setSize(500,500);

		
		this.setLayout(new GridLayout(6,2));
		this.add(new JLabel("아메리카노"));
		this.add(new JLabel(menu1+"개"));
		this.add(new JLabel("카페라떼"));
		this.add(new JLabel(menu2+"개"));
		this.add(new JLabel("바닐라라떼"));
		this.add(new JLabel(menu3+"개"));
		this.add(new JLabel("초코라떼"));
		this.add(new JLabel(menu4+"개"));
		this.add(new JLabel("총 매출: "));
		this.add(new JLabel(sales+"원"));
		JButton home = new JButton("주문화면");
		this.add(home);
		home.addActionListener(new ActionListener(){

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
	public static void menuSum(int cost) {
		price+=cost;
	}
	public static void sales(int cost) {
		sales+=cost;
	}
}
