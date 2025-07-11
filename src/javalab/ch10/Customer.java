package javalab.ch10;

public class Customer implements Buy, Sell {

	@Override
	public void sell() {
		System.out.println("판매ㄱ");

	}

	@Override
	public void buy() {
		System.out.println("구매ㄱ");

	}
	//인터페이스의 서로같은 디폴트 메서드가 있는 경우 오류가 발생되며,오버라이딩을 통해 해결한다.
	@Override
	public void order() {
		System.out.println("고객판매주문");
	}

}
