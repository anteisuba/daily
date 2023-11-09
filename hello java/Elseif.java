public class Elseif{
	boolean isFilled;
	double billAmount;
	String shipping;
	String couponCode;
	
	public Elseif(boolean filled,double cost,String shippingHethod,String coupon) {
		if(cost > 24.00) {
			System.out.println("High value item!");
		}
		
		isFilled = filled;
		billAmount = cost;
		shipping = shippingHethod;
		couponCode = coupon;
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
//			嵌套一层elseif语句
			if(couponCode.equals("ship50")) {
				return .85;
			}else {
				return 1.75;
			}
		} else { 
			return .50;
		}
	}
	
	public static void main(String[] args) {
		Elseif book = new Elseif(true,9.99,"Express","ship50");
		Elseif chemistrySet = new Elseif(false,72.50,"Regular","freeshipping");
	
	book.ship();
	chemistrySet.ship();
	}
}