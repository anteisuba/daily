public class Elseif{
	boolean isFilled;
	double billAmount;
	String shipping;
	
	public Elseif(boolean filled,double cost,String shippingHethod) {
		if(cost > 24.00) {
			System.out.println("High value item!");
		}
		
		isFilled = filled;
		billAmount = cost;
		shipping = shippingHethod;
	}
	
	public void ship() {
		if(isFilled) {
			System.out.println("shipping");
			System.out.println("shipping cost:" + calculateShipping());
			
		}else {
			System.out.println("Order not ready");
		}
	}
	
	public double calculateShipping() {
		if(shipping.equals("Regular")){
			return 0;
		}else if(shipping.equals("Express")) {
			return 1.5;
		} else { 
			return .50;
		}
	}
	
	public static void main(String[] args) {
		Elseif book = new Elseif(true,9.99,"Express");
		Elseif chemistrySet = new Elseif(false,72.50,"Regular");
	
	book.ship();
	chemistrySet.ship();
	}
}