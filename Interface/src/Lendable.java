//인터페이스
interface Lendable {
	final byte STATE_BORROWED = 1;	//대출 중
	final static byte STATE_NORMAL = 0;	//대출 안됨
	abstract void checkOut(String borrower, String date);
	abstract void checkIn();
}
