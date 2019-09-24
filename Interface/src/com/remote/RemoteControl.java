package com.remote;

public interface RemoteControl {

	//��� public final �ڵ� �߰�
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//�߻� �޼ҵ� public abstract �ڵ� �߰�
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//����Ʈ �޼ҵ� - 
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("���� ó���մϴ�");
		}else {
			System.out.println("���� �����մϴ�.");
		}
	}
	//���� �޼ҵ� - ��ü ���� ���� ��� ����
	static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}
}
