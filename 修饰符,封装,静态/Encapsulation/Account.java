package access.Encapsulation;
/**
 * @Author yangjian
 * @Date 2023年11月17日 下午3:54:49
 * access.Encapsulation access.Encapsulation Account.java
 * yangjian
 * 
 */
public class Account {
	//为了封装，将三个属性设置为private
	private String name;
	private double balance;
	private String password;
	
	//提供两个构造器
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Account(String name, double balance, String password) {
		super();
		this.setName(name);
		this.setBalance(balance);
		this.setPassword(password);
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		int na = name.length();
		if(na >= 2 && na <= 4) {
			this.name = name;
		} else {
			System.out.println("名字长度不符合");
			this.name = "yangjian";
		}
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		if(balance > 20) {
			this.balance = balance;
		} else {
			System.out.println("余额应该大于20");
			this.balance = 30;
		}
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		int ps = password.length();
		if(ps == 6) {
			this.password = password;
		}else {
			System.out.println("密码应该是6位数");
			this.password = "123456"; 
		}
	}
	
	public String ass() {
		return "信息为： " + name + " " + balance+ " " + password;
	}
	
	
	
}
