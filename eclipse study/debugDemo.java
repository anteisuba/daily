package daily;

public class debugDemo {
	
	/*
	斷點：程序執行到斷點的時候會暫停
	F5是單步執行，但會進入方法，包括自定義方法和JDK源碼方法
	F6是單步執行，遇到方法會將方法當作一條輸出語句執行
	F7 跳出當前正在debug調試的方法，不能跳出main方法
	F8 執行到下一個斷點，如果沒有斷點則程序執行完畢
	
	
	
	*/
	public static void main(String[] args) {
		int a = 1;
		int b = a + 10;
		a = b++;
		System.out.println("hello debug");
		for (int i = 0; i < 3; i++) {
			System.out.println("我是第" + i);
		}
		sayGood();
		System.out.println("goodBye");
		System.out.println("goodBye2");
	}
	
	
	public static void sayGood() {
		System.out.println("good1");
		System.out.println("good2");
		System.out.println("good3");

	}
}
