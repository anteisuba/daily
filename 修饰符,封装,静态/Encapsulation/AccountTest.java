package access.Encapsulation;
/**
 * @Author yangjian
 * @Date 2023年11月17日 下午3:55:02
 * access.Encapsulation access.Encapsulation AccountTest.java
 * yangjian
 * 
 */
public class AccountTest {
	
	public static void main(String[] args) {
		Account ac = new Account();
		ac.setName("ss");
		ac.setBalance(60);
		ac.setPassword("123456");
		System.out.println(ac.ass());
		
	}
	
	
	
}
