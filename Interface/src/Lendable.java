//�������̽�
interface Lendable {
	final byte STATE_BORROWED = 1;	//���� ��
	final static byte STATE_NORMAL = 0;	//���� �ȵ�
	abstract void checkOut(String borrower, String date);
	abstract void checkIn();
}
