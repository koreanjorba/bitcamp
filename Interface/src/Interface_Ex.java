
class Interface_Ex {
	public static void main(String args[]) {
		SeparateVolume obj1 = new SeparateVolume("863¤²774°³", "°³¹Ì", "º£¸£º£¸£");
		AppCDInfo obj2 = new AppCDInfo("2005-7001", "Redhat Fedora");
//		obj1.checkOut("±è¿µ¼÷", "20060315");
//		obj2.checkOut("¹ÚÈñ°æ", "20060317");
		checkOut(obj1, "±è¿µ¼÷", "20060315");
		checkOut(obj2, "¹ÚÈñ°æ", "20060317");
//		obj1.checkIn();
//		obj2.checkIn();
		
		checkIn(obj1);
		checkIn(obj2);
		
	}
	//checkout checkinÀ» µû·Î ¸Þ¼Òµå·Î ¸¸µé¾î, ´ÙÇü¼º ÀÌ¿ë
	static void checkOut(Lendable a, String borrower, String date) {
//		a.checkOut("±è¿µ¼÷", "20060315");
//		a.checkOut("¹ÚÈñ°æ", "20060317");
		a.checkOut(borrower, date);
	}
	static void checkIn(Lendable b) {
		b.checkIn();
	
	}
	
}
