package javalab.ch08;

//1.자식은 인스턴스를 생성할때 부모 기본 생성자를 찾는다.
//2. 부모에 기본 생성자가 없을 경우 에러가 발생한다.
//3.만약 부모에 기본생성자가 없을 경우 자식에서 사용할 부모 생성자를 지정해야한다

public class VIPCustomer extends Customer {
	private double saleRatio;
	private int agentID; //전문상담가
	
	//회원들중에 뷮
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID,customerName); //일반등급에 대한 생성자(customer) 생성자 상속
		this.saleRatio = 0.1;
		this.agentID = agentID;
		bonusRatio = 0.05;
	}

	public double getSaleRatio() {
		return saleRatio;
	}

	public int getAgentID() {
		return agentID;
	}
	@Override //어노테이션 : 오버라이드(부모의 매서드를 재정의)
	public int calcPrice(int price) {
		this.bonusPoint+=price * this.bonusRatio;
		return price - (int)(price * this.saleRatio);
	}

	@Override
	public String toString() {
		return "VIPCustomer [saleRatio=" + saleRatio + ", agentID=" + agentID + ", bonusPoint=" + bonusPoint
				+ ", bonusRatio=" + bonusRatio + "]"+super.toString();
	}
	
	
	
}
