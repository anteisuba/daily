package access.hspedu.extend;
/**
 * @Author yangjian
 * @Date 2023年11月20日 下午3:18:13
 * access.hspedu.extend access.hspedu.extend ExtendsDetail.java
 * yangjian
 * 
 */

//子类可以继承所有的属性的方法，但是私有属性需要间接方法去访问
public class ExtendsDetail {
	public static void main(String[] args) {
		
		Sub sub = new Sub(); //创建了子类对象 sub
//		sub.sayOk();
		Sub sub2 = new Sub("yang");
		
	}
}
