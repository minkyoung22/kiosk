import java.util.ArrayList;

public class userManager {
	public ArrayList<user> user;
	public userManager() {
		user=new ArrayList<user>();
	}
	public void adduser(user u) {
		user.add(u);
	}
	public int pointup(String num) {
		int p=0;
		for(user u:user) {
			if(u.number==num) {
				u.point=u.point+10*manager.price/100;
				p=u.point;
			}
		}
		return p;
	} 
}
