
class Interface_Ex {
	public static void main(String args[]) {
		SeparateVolume obj1 = new SeparateVolume("863��774��", "����", "��������");
		AppCDInfo obj2 = new AppCDInfo("2005-7001", "Redhat Fedora");
//		obj1.checkOut("�迵��", "20060315");
//		obj2.checkOut("�����", "20060317");
		checkOut(obj1, "�迵��", "20060315");
		checkOut(obj2, "�����", "20060317");
//		obj1.checkIn();
//		obj2.checkIn();
		
		checkIn(obj1);
		checkIn(obj2);
		
	}
	//checkout checkin�� ���� �޼ҵ�� �����, ������ �̿�
	static void checkOut(Lendable a, String borrower, String date) {
//		a.checkOut("�迵��", "20060315");
//		a.checkOut("�����", "20060317");
		a.checkOut(borrower, date);
	}
	static void checkIn(Lendable b) {
		b.checkIn();
	
	}
	
}
