package com.remote;

public class Label_Ex {
	public static void main(String[] args) {
		Label obj = new Label("�ȳ��ϼ���", 100 , 30, "yellow", "green", "����ü");
		
		printLabel(obj);
		obj.resize(200, 70);
		obj.setForeground("black");
		obj.setBackground("white");
		obj.setFont("�ü�ü");
		printLabel(obj);
	}
	
	static void printLabel(Label obj) {
		System.out.printf( "%s %d x %d ����(%s) �����(%s) ��Ʈ(%s) %n", 
				obj.text, obj.width, obj.height, obj.background, obj.foreground, obj.font);
	}
//	static void printLabel(Resizable obj) {
//		System.out.printf( "%s %d x %d ����(%s) �����(%s) ��Ʈ(%s) %n", 
//				obj.text, obj.width, obj.height, obj.background, obj.foreground, obj.font);
//	}
}
