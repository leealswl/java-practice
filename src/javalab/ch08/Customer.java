package javalab.ch08;

public class Customer {
	private int customerID;
	private String customerName;
	private String customerGrade;
	
	protected int bonusPoint; //상속 받은 클래스에서 접근 가능. 다른패키지에서도 접근가능
	protected double bonusRatio;
	
	//기본생성자 
	public Customer() {
		this.customerGrade ="SILVER";
		this.bonusRatio =0.01;
		this.bonusPoint=0;
		
		System.out.println("customer()생성자호출");
	}
// 일반등급에 대한 생성자
	public Customer(int customerID, String customerName) {
		this(); //Customer()호출, this 생성자는 제일 처음에 사용.
		this.customerID = customerID;
		this.customerName = customerName;
		
		System.out.println("Customer(int customerID,String customerName)생성자호출");
	}

//값 읽기 get
	public int getCustomerID() {
		return customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public double getBonusRatio() {
		return bonusRatio;
	}

	//보너스포인트의 상태를 변화시키는 메서드
	public int calcPrice(int price) {
		this.bonusPoint+=price * this.bonusRatio;
		return price;
	}

	// 오버라이드 자식클래스에서 부모클래스 메서드를 재정의하는것
	//보통 object클래스에 기본적으로 tostring()메서드가 정의되어있다
	// 보통 toString()을 정의하지 않으면 객체를 출력했을 때 이런 식 -> Customer@7dc36524
	//리턴값을 바꿔서 원하는형식으로 출력되게 바꾸는거임!!
	@Override
	public String toString() {
		return "Customer [customerID=" + customerID + ", customerName=" + customerName + ", customerGrade="
				+ customerGrade + ", bonusPoint=" + bonusPoint + ", bonusRatio=" + bonusRatio + "]";
	}
	
}



	