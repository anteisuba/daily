public class Reservation{
	int guestCount;
	int restaurantCapacity;
	boolean isRestaurantOpen;
	boolean isConfirmed;
	
	public Reservation(int count,int capacity,boolean open) {
		if(guestCount < 1 || guestCount > 8) {
			System.out.println("Invalid reservatrion");
		}
		guestCount = count;
		restaurantCapacity = capacity;
		isRestaurantOpen = open;
	}
	public void confirmReservation() {
		if(restaurantCapacity >= guestCount && isRestaurantOpen) {
			System.out.println("Reservation confirmed");
			isConfirmed = true;
		}else {
			System.out.println("Reservation denid");
			isConfirmed = false;
		}
		
	}
	public void informUser() {
		System.out.println("Please enjoy your meal!");
	}
	
	public static void main(String[] args) {
		Reservation partOfThree = new Reservation(3,12,true);
		Reservation partOfFour = new Reservation(4,3,true);
		partOfThree.confirmReservation();
		partOfThree.informUser();
		partOfFour.confirmReservation();
		partOfFour.informUser();
	}
}