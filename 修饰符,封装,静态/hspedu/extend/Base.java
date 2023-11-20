package access.hspedu.extend;
/**
 * @Author yangjian
 * @Date 2023年11月20日 下午3:23:37
 * access.hspedu.extend access.hspedu.extend Base.java
 * yangjian
 * 
 */
public class Base { //父类
	//4个属性
	public int n1 = 100;
	protected int n2 = 200;
	int n3 = 300;
	private int n4 = 400;
	public Base() { //无参构造器
		System.out.println("base()...");
		
	}
	//在父类提供一个public的方法,返回了n4
	public int f1() {
		return n4;
	}
	
	
	public void test100() {
		System.out.println("test100");
		
	}
	protected void test200() {
		System.out.println("test200");
	}
	
	void test300() {
		System.out.println("test300");
	}
	
	private void test400() {
		System.out.println("test400");
	}
	
	public void callTest400() {
		test400();
	}
	
	
	
	
	
	
}
