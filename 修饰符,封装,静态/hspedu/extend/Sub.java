package access.hspedu.extend;
/**
 * @Author yangjian
 * @Date 2023年11月20日 下午3:28:57
 * access.hspedu.extend access.hspedu.extend Sub.java
 * yangjian
 * 
 */
public class Sub extends Base{ //子类
	public Sub() { //子类的构造器
		System.out.println("sub()....");
	}
	
	public void sayOk() {
		//私有无法直接访问
		System.out.println(n1 + " " + n2 + " " + n3 + " "); 
		test100();
		test200();
		test300();
		System.out.println("n4 = " + f1());
		callTest400();
	}
	
	
	
	
	
	
}
