package access.hspedu.extend;
/**
 * @Author yangjian
 * @Date 2023年11月19日 下午4:46:20
 * access.hspedu.extend access.hspedu.extend Extends01.java
 * yangjian
 * 
 */

public class Extends01 {
	public static void main(String[] args) {
		Pupil pupil = new Pupil();
		pupil.name = "xiaoming";
		pupil.age = 10;
		pupil.testing();
		pupil.setScore(60);
		pupil.showInfo();
		
		System.out.println("======");
		Graduate graduate = new Graduate();
		graduate.name = "ming";
		graduate.age = 20;
		graduate.testing();
		graduate.setScore(100);
		graduate.showInfo();
		
		
	}
}
