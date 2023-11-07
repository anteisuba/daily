import java.util.Random;


class LuckFive {
	public static void main(String[] args) {
		Random randomGenerator = new Random();
		int dirRoll = randomGenerator.nextInt(6) + 1;
		
		while(dirRoll != 5) {
			
			System.out.println(dirRoll);
			dirRoll++;
		}
	}
}