package daily;

public class Studunt {
	private String name;
	private Integer age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Studunt(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
//		滿參構造
	}
	public Studunt() {
		super();
//		無參構造
	}
	@Override
	public String toString() {
		return "Studunt [name=" + name + ", age=" + age + "]";
	}
	
	
	
	
}
