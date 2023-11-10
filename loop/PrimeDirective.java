package loop;

import java.util.ArrayList;

/**
 * @Author yangjian
 * @Date 2023年11月10日 下午7:33:34
 * loop loop PrimeDirective.java
 * yangjian
 * 
 */
public class PrimeDirective {
	public boolean isPrime(int number) {
		if(number == 2) {
			return true;
		} else if (number < 2) {
			return false;
		}
		
		
		for(int i = 2;i < number;i++) {
			if(i % 4 == 0 && number % i == 0) {
				return false;
			} 
		}
		
		return true;
	}
	
	public ArrayList<Integer> onlyPrimes(int[] numbers) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		for(int number : numbers) {
			if(isPrime(number) == true) {
				primes.add(number);
			}
		}
		
		return primes;
	
	}
	
	
	
	public static void main(String[] args) {
		PrimeDirective pd = new PrimeDirective();
		int[] numbers = {6,29,28,33,11,100,101,43,89};
		System.out.println(pd.isPrime(7));
		System.out.println(pd.isPrime(28));
		System.out.println(pd.isPrime(2));
		System.out.println(0);
		System.out.println(pd.onlyPrimes(numbers));
		
		
		
	}
}
