package javalab.ch05.encapsulation;

public class PhoneStore {
	private String storeName;
	private Phone phone;
	private Customer customer;
	
	public PhoneStore(String storeName, Phone phone) {
		this.storeName =storeName;
		this.phone =phone;
	}

	public String getStoreName() {
		return storeName;
	}
	
	//대리점이 할수있는 여러가지 메서드
	private void registerPayment() {
		System.out.println(storeName +": 요금제를 등록합니다. 약정을 등록합니다.");
	}
	private void discountPromotion() {
		System.out.println(storeName +": 프로모션으로 할인합니다.");
	}
	private void saveData() {
		System.out.println(storeName +": 데이터를 저장하고 새로운 폰으로 이동합니다.");
	}
	
	
//	현재 메서드는 고객 정보 전체가 아닌,
//	"모델명"과 "예산"만 매개변수로 받아 처리하므로
//	Customer 객체 없이 Phone 클래스의 정보를 getter로 가져오는 구조
	public Phone sellPhone(String model, double budget) {
		String phoneModel = phone.getModel();
		
		if(model.equals(phoneModel) && budget >=phone.getPrice()) {
			registerPayment();
			discountPromotion();
			saveData();
			
			return phone;
		} else 
			return null;
	}
}
