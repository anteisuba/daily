public class Returns{
	String productType;
	double price;
	
	public Returns(String product,double initialPrice) {
		productType = product;
		price = initialPrice;
		
	}
	
	public double getPriceWithTax() {
		double totalPrice = price + price * 0.08;
		return totalPrice;
	}
	
	public void increasePrice(double priceToAdd) {
		double newPrice = price + priceToAdd;
		price = newPrice;
	}
	
	public static void main(String[] args) {
		Returns lemonadeStand = new Returns("lemonade",3.75);
		double lemonadePrice = lemonadeStand.getPriceWithTax();
		System.out.println(lemonadePrice);
		lemonadeStand.increasePrice(1.5);
		System.out.println(lemonadeStand.price);
	}
}