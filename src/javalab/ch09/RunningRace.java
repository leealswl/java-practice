package javalab.ch09;

public abstract class RunningRace {
	private void ready() {
		System.out.println("준비");
	}
	
	protected abstract void run();
	
	private void finish() {
		System.out.println("결승선");
	}
	//템플릿 메서드(dp)
	//파이널 메서드 : 오버라이딩 불가 -실행순서 변경금지
	final public void race() {
		ready();
		run();
		finish();
	}
}
