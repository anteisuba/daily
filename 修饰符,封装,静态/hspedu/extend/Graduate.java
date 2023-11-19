package access.hspedu.extend;
/**
 * @Author yangjian
 * @Date 2023年11月19日 下午4:51:09
 * access.hspedu.extend access.hspedu.extend Graduate.java
 * yangjian
 * 
 */
//大学生类-> 模拟大学生考试的简单情况

public class Graduate {
	public String name;
	public int age;
	private double score;
	
	public void setScore(double score) {
		this.score = score;
	}
	
	public void testing() {//和pupil不一样
		System.out.println("大学生 " + name + "正在考大学数学" );
	 	
	}
	
	public void showInfo() {
		System.out.println("学生的名字是 " + name + "年龄 " + age + "成绩" + score);
		
	}

}
