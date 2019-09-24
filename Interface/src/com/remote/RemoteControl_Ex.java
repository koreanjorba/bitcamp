package com.remote;

public class RemoteControl_Ex {
	public static void main(String[] args) {
		//변수에 구현객체 대입 
		RemoteControl rc;
		rc = new Television();
		rc = new Audio();
		RemoteControl.changeBattery();
		
	}
	
	/* 익명구현 - 클래스가 없기에 객체로 만들어서 한 번 사용 가능 (클래스가 아닌 인터페이스를 객체화해서 사용)
	 * RemoteControl rc = new RemoteControl(){
	 * 	void turnOn(){실행문};
		void turnOff(){실행문};
		void setVolume(int volume){실행문};
	 };*/
}
