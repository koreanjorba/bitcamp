
class Interface_Ex3 {
	public static void main(String args[]) {
		SeparateVolume obj1 = new SeparateVolume("863ㅂ774개", "개미", "베르베르");
		AppCDInfo obj2 = new AppCDInfo("2005-7001", "Redhat Fedora");

		checkOut(obj1);
		checkOut(obj2);

		
		checkIn(obj1);
		checkIn(obj2);
		
	}
	//checkout checkin을 따로 메소드로 만들어, 다형성 이용
	static void checkOut(Lendable a) {
		a.checkOut("김영숙", "20060315");
		a.checkOut("박희경", "20060317");
	}
	static void checkIn(Lendable a) {
		a.checkIn();
		
	}
	
}
