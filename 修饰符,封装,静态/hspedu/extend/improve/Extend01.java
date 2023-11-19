package access.hspedu.extend.improve;

import access.hspedu.extend.Graduate;
import access.hspedu.extend.Pupil;

/**
 * @Author yangjian
 * @Date 2023年11月19日 下午6:53:45
 * access.hspedu.extend.improve access.hspedu.extend.improve Extend01.java
 * yangjian
 * 
 */
public class Extend01 extends Student {
	public static void main(String[] args) {
		Pupil pupil = new Pupil();
		pupil.name = "ximing";
		pupil.age = 20;
		pupil.testing();
		pupil.setScore(640);
		pupil.showInfo();
		
		System.out.println("======");
		Graduate graduate = new Graduate();
		graduate.name = "ng";
		graduate.age = 30;
		graduate.testing();
		graduate.setScore(500);
		graduate.showInfo();
	}
}
