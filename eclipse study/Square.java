package daily;

import java.util.Iterator;

/**
 * @Author yangjian
 * @Date 2023年11月10日 下午2:31:38
 * daily daily Square.java
 * yangjian
 * 
 */
public class Square {
	public static void drawSquare(int k) {
		for (int i = 0; i < k; i++) {
			for (int j = 0; j < k; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		drawSquare(5);
	}

}
