
class Interface_Ex3 {
	public static void main(String args[]) {
		SeparateVolume obj1 = new SeparateVolume("863��774��", "����", "��������");
		AppCDInfo obj2 = new AppCDInfo("2005-7001", "Redhat Fedora");

		checkOut(obj1);
		checkOut(obj2);

		
		checkIn(obj1);
		checkIn(obj2);
		
	}
	//checkout checkin�� ���� �޼ҵ�� �����, ������ �̿�
	static void checkOut(Lendable a) {
		a.checkOut("�迵��", "20060315");
		a.checkOut("�����", "20060317");
	}
	static void checkIn(Lendable a) {
		a.checkIn();
		
	}
	
}
