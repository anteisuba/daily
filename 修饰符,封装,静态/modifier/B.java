package access.modifier;
/**
 * @Author yangjian
 * @Date 2023年11月12日 下午11:23:47
 * access.modifier access.modifier B.java
 * yangjian
 * 
 */
public class B {
	public void say() {
		A a = new A();
		//在同一个包下可以访问public,protected,默认 不能方位private
		System.out.println("n1 = " + a.n1 + "n2 = " + a.n2 + "n3 = " + a.n3);
	}
}
