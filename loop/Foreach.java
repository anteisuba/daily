import java.util.ArrayList;

class Foreach {
	public static void main(String[] args) {
		ArrayList<Double> expenses = new ArrayList<Double>();
		expenses.add(74.46);
		expenses.add(63.69);
		expenses.add(10.57);
		expenses.add(23.36);
		expenses.add(46.36);
		
		double mostExpensive = 0;
		
		for(double expense : expenses) {
			if(expense > mostExpensive) {
				mostExpensive = expense;
			}
			
			System.out.println(expense);
		}
		
		System.out.println(mostExpensive);
	}
}