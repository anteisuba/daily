package access;
/**
 * @Author yangjian
 * @Date 2023年11月12日 下午4:54:29
 * access access Constructor.java
 * yangjian
 * 
 */
public class Constructor {
	public static void main(String[] args) {
		Person p1 = new Person();
		System.out.println("P1的信息" + p1.name + " " + p1.age);
		
		Person p2 = new Person("yangjian",24);
		System.out.println("p2的信息：" + p2.name + p2.age);
	}
}

class Person {
	String name;
	int age;
	//第一个无参构造器
	public Person() {
		age = 18;
	}
	
	public Person(String Pname,int Page) {
		name = Pname;
		age = Page;
	}

}

