package javalab.ch08;


public class CustomerTest {

	public static void main(String[] args) {
		Customer cust1 = new Customer();
		cust1.calcPrice(1000);
		System.out.println(cust1.toString());
		
		Customer cust2 =new Customer(10002,"고객2"); //id 10002, 고객명:고객2
		cust2.calcPrice(100000);
		System.out.println(cust2.toString());
		
		VIPCustomer vip1 = new VIPCustomer(10003, "vip1", 1);
		vip1.calcPrice(1000000);
		System.out.println(vip1.toString());
	
	
		//down casting :부모 클래스 타입으로 참조된 객체를 다시 자식 클래스 타입으로 변환하는 것.
		//VIPCustomer 클래스가 Customer클래스의 구조 만족하는지 확인
		// - Customer의 기능만 사용가능
		Customer vip3 = new VIPCustomer(10004, "vip2",2);
		vip3.calcPrice(1000000);
		System.out.println(vip3.toString());
		//vip3.getAgentID(); -> 사용불가
		
		//up casting  : 자식 클래스의 객체를 부모 클래스 타입으로 참조하는 것.
		VIPCustomer vip4 =(VIPCustomer)vip3;
		System.out.println(vip4.getAgentID());
	}

	
	
}
