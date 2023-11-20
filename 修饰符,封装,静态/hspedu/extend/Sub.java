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
//		super(); //默认调用父类的无参构造器
		super("yang",10);
		System.out.println("子类sub()构造器被调用....");
	}
	
	public Sub(String name) {
		//do nothing
		//父类没有无参构造器(无参构造器被覆盖)，需指定构造器
		super("tom",30);
		System.out.println("子类sub(String name)构造器被调用");
	}
	
	public void sayOk() {
		//私有无法直接访问
		System.out.println(n1 + " " + n2 + " " + n3 + " "); 
		test100();
		test200();
		test300();
		
		//通过间接方法访问私有属性
		System.out.println("n4 = " + f1());
		callTest400();
	}
	
	
	
	
	
	
}
