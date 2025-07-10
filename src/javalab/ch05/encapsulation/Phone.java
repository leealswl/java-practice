package javalab.ch05.encapsulation;

public class Phone {
	private String model;
	private double price;
	
	public Phone(String model, double price) {
		this.model =model; //멤버변수가 객체별로 관리할경우 this 지정.
		this.price =price;
	}

	//get 만
	public String getModel() {
		return model;
	}

	public double getPrice() {
		return price;
	}
		
	
}
