package String;
/**
 * @Author yangjian
 * @Date 2023年11月11日 下午1:55:56
 * String String DNA.java
 * yangjian
 * 
 */
public class DNA {
	public static void main(String[] args) {
		String dna1 = "ATGCGATACGCTTGA";
		String dna2 = "ATGCGATACGTGA";
		String dna3 = "ATTAATATGTACTGA";

		String dna = dna3;
		int length = dna.length();
		System.out.println("length: " + length);

		int start = dna.indexOf("ATG");
		System.out.println("Start: " + start);

		int stop = dna.indexOf("TGA");
		System.out.println("Stop: " + stop);

		if (start != -1 && stop != -1 && (stop - start) % 3 == 0) {

			String protein = dna.substring(start, stop + 3);
			System.out.println("there is not a protein");

		} else {
			System.out.println("No problem");
		}

	}
}
