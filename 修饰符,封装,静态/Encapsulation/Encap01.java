package access.Encapsulation;
/**
 * @Author yangjian
 * @Date 2023年11月13日 下午2:48:41
 * access.Encapsulation access.Encapsulation Encap01.java
 * yangjian
 * 
 */
public class Encap01 {
	public static void main(String[] args) {
		Person person = new Person();
		person.setName("jackyangjian");
		person.setAge(3000);
		person.setSalary(30000);
		System.out.println(person.info());
		
		
		//自己使用构造器指定属性
		Person smith = new Person("smith",2000,50000);
		System.out.println("===smith的信息===");
		System.out.println(smith.info());
		
		
	}
}

class Person {
	public String name; //名字公开
	private int age;    //年龄私有化
	private double salary;  //收入私有化
	//加入构造器
	//无参构造器
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//构造器
	public Person(String name, int age, double salary) {
//		super();
//		this.name = name;
//		this.age = age;
//		this.salary = salary;
		//将set方法卸载构造器中，这样仍然可以验证数据
		this.setName(name);
		this.setAge(age);
		this.setSalary(salary);
		
	}
	
	
	
	//set get 快捷键
	//alt shift + S
	//getters and setters
	//然后根据要求完善代码
	public String getName() {
		return name;
	}
	
	

	public void setName(String name) {
		//加入对数据的校验,相当于增加了业务逻辑
		if(name.length() >= 2 && name.length() <= 6) {
			this.name = name;
			
		} else {
			System.out.println("名字的长度不对，需要2-6个字符，默认名字：");
			this.name = "yangjian";
		}
		
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		//判断age范围
		if(age >= 1 && age <= 120) {
			this.age = age;
		} else {
			System.out.println("年龄需要在1-120");
			this.age = 18;
		}
		
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		if(salary >= 1 && salary <= 2000) {
			this.salary = salary;
			
		} else {
			System.out.println("薪水不可查看");
			this.salary = 100;
		}
	}
	
	
	//写一个方法返回信息属性
	public String info() {
		return "信息为 name=" + name + " age=" + age + "薪水=" + salary;
		
		
	}
	
	
	
	 
	
}
