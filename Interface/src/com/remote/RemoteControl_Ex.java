package com.remote;

public class RemoteControl_Ex {
	public static void main(String[] args) {
		//������ ������ü ���� 
		RemoteControl rc;
		rc = new Television();
		rc = new Audio();
		RemoteControl.changeBattery();
		
	}
	
	/* �͸��� - Ŭ������ ���⿡ ��ü�� ���� �� �� ��� ���� (Ŭ������ �ƴ� �������̽��� ��üȭ�ؼ� ���)
	 * RemoteControl rc = new RemoteControl(){
	 * 	void turnOn(){���๮};
		void turnOff(){���๮};
		void setVolume(int volume){���๮};
	 };*/
}
