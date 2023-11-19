package access.hspedu.extend;
/**
 * @Author yangjian
 * @Date 2023年11月19日 下午4:46:42
 * access.hspedu.extend access.hspedu.extend Pupil.java
 * yangjian
 * 
 */
//小学生类-> 模拟小学生考试的情况
//继承：解决代码的复用性

public class Pupil {
	public String name;
	public int age;
	private double score;
	
	public void setScore(double score) {
		this.score = score;
	}
	
	public void testing() {
		System.out.println("小学生 " + name + "正在考小学数学" );
	 	
	}
	
	public void showInfo() {
		System.out.println("学生的名字是 " + name + "年龄 " + age + "成绩" + score);
		
	}
	
	
}
