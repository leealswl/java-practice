package javalab.ch05.encapsulation;

public class Customer {
	private String name;
	private double budget;
	
	public Customer(String name, double budget) {
		this.name =name;
		this.budget=budget;
	}

	public String getName() {
		return name;
	}

	public double getBudget() {
		return budget;
	}
	
	public void buyPhone(PhoneStore store) {
		Phone phone = store.sellPhone("아이폰", budget);
		
		if(phone != null ) {
			System.out.println(name+"고객: 핸드폰구입함!");
		} else {
			System.out.println(name+"고객 : 핸드폰을 구입못함!");
		}
	}
}
