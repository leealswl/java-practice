package javalab.ch09;

public class ComputerTest {

	public static void main(String[] args) {
		Notebook notebook = new Notebook();
		DeskTop deskTop = new DeskTop();
		//1  직접 객체를 통해 메서드 호출
		notebook.display();
		notebook.typing();
		
		deskTop.display();
		deskTop.typing();
		//2 추상 클래스 타입(Computer)을 매개변수로 받아서 호출 (다형성 활용)
		display(notebook);
		display(deskTop);
	}

	
	public static void display(Computer computer) {
		computer.display();
		computer.typing();
	}
}


// 궁금해서 gpt 한테 물어본 다형성을 활용해서 하나의 자식만 불러오는 방식
// 근데 위에 1번방식이 깔끔함.
//Computer computer = new Notebook(); // 업캐스팅
//computer.display();  // 실제로는 Notebook.display()
//computer.typing();   // 실제로는 Notebook.typing()
