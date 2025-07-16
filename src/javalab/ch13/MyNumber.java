package javalab.ch13;

@FunctionalInterface
public interface MyNumber {
	int getMax(int num1, int num2);
	//int add(int num1, int num2);//람다표현식은 인터페이스에 하나의 매서드만사용해야함
}


//자바가 제공하는 기본 @펑셔널인터페이스
//Consume     T-> void void accept(T t)
//Supplier    () -> T T get()
//function<T,R> T-> R R apply(T t)
//Runnable	() -> void void run()