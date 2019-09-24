package com.remote;

public interface RemoteControl {

	//상수 public final 자동 추가
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상 메소드 public abstract 자동 추가
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//디폴트 메소드 - 
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다");
		}else {
			System.out.println("무음 해제합니다.");
		}
	}
	//정적 메소드 - 객체 생성 없이 사용 가능
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
