public class Tostring {
	String productType;
	double price;


	public Tostring(String product,double initialPrice) {
		productType = product;
		price = initialPrice;
	}
	public void increasePrice(double priceToAdd) {
		double newPrice = price + priceToAdd;
		price = newPrice;			
	}
	public double getPriceWithTax() {
		double tax = 0.88;
		double totalPrice = price + price*tax;
		return totalPrice;
	}
	
	public String toString(){
		return "this store sells " + productType + "at a price of " + price;
	}
	public static void main(String[] args) {
		Tostring lemonadeStand = new Tostring("lemonade",3.75);
		Tostring cookieShop = new Tostring("Cookies",5);
		System.out.println(lemonadeStand);
		System.out.println(cookieShop);
	}
}