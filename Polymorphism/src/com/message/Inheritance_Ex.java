package com.message;

public class Inheritance_Ex {

	 public static void main(String[] args) {
		 EmailSender obj1 = new EmailSender("������ �����մϴ�", "������",
				 "admin@dukkeshop.co.kr", "10% ���������� ����Ǿ����ϴ�.");
		 SMSSender obj2 = new SMSSender("������ �����մϴ�", "������", 
				 "02-000-0000", "10%���������� ����Ǿ����ϴ�");
		 send(obj1, "hatman@yeyeye.com");
		 send(obj2, "010-000-0000");
		 
	 }
	 static void send(MessageSender obj, String recipient) {
		 obj.sendMessage(recipient);
	 }
}
