package javalab.ch08;

//부모클래스는 자식들의 공통클래스
class Animal {
	public void move() {
		System.out.println("움직인다");
	}
}

	class Human extends Animal{
		@Override
		public void move() {
			System.out.println("사람은 두발로 움직인다");
		}
		public void readBook() {
			System.out.println("사람이 책을 읽습니다.");
		}
	}
	
	class Tiger extends Animal{
		@Override
		public void move() {
			System.out.println("호랑이는 네발로 움직인다");
		}
		public void hunting() {
			System.out.println("호랑이는 사냥을 합니다.");
		}
	}
	
	class Eagle extends Animal{
		@Override
		public void move() {
			System.out.println("독수리는 날아다님");
		}
		public void flying() {
			System.out.println("독수리는 날개로 날아다닌다.");
		}
	}

public class AnimalTest {
	
	public static void main(String[] args) {
		AnimalTest test=new AnimalTest();
		test.moveAnimal(new Human());
		test.moveAnimal(new Tiger());
		test.moveAnimal(new Eagle());

	}
	
	//down casting 이용한 유연성 확보
	public void moveAnimal(Animal animal) {
		animal.move();
	}

}
