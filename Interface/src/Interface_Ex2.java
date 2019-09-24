
class Interface_Ex2 {
	public static void main(String args[]) {
		SeparateVolume obj1 = new SeparateVolume("863ㅂ774개", "개미", "베르베르");
		AppCDInfo obj2 = new AppCDInfo("2005-7001", "Redhat Fedora");
//		obj1.checkOut("김영숙", "20060315");
//		obj2.checkOut("박희경", "20060317");
		checkOutIn(obj1, "김영숙", "20060315");
		checkOutIn(obj2, "박희경", "20060317");
//		obj1.checkIn();
//		obj2.checkIn();
		
	
		
	}
	//checkout checkin을 따로 메소드로 만들어, 다형성 이용
	static void checkOutIn(Lendable a, String borrower, String date) {
		a.checkOut(borrower, date);
		a.checkIn();
	}
}
