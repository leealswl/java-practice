package javalab.ch05.encapsulation;

public class PhoneStoreTest {

	public static void main(String[] args) {
		Phone phone = new Phone("아이폰", 12500000);
		Phone phone1 = new Phone("갤럭시", 13000000);
		Customer customer = new Customer("밍밍이", 20000000);
		PhoneStore store = new PhoneStore("밍대리점", phone);

		
		customer.buyPhone(store);
	}
}
