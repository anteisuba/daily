package loop;


/**
 * @Author yangjian
 * @Date 2023年11月10日 下午5:34:00
 * loop loop FizzBuzz.java
 * yangjian
 * 
 */
public class FizzBuzz {
	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0) {
				System.out.println("Buzz");
			} else if (i % 5 == 0) {
				System.out.println("Fizz");
			} else {
				System.out.println(i);
			}
		}
	}
}
