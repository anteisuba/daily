package access.hspedu.extend.improve;
/**
 * @Author yangjian
 * @Date 2023年11月19日 下午6:43:20
 * access.hspedu.extend.improve access.hspedu.extend.improve Student.java
 * yangjian
 * 
 */

//父类，是pupil和graduate的父类
public class Student {
	//共有的属性
	public String name;
	public int age;
	private double score;
	//共有的方法
	
	public void setScore(double score) {
		this.score = score;
	}
	
	
	
	public void showInfo() {
		System.out.println("学生的名字是 " + name + "年龄 " + age + "成绩" + score);
		
	}
}
