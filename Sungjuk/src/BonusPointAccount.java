
public class BonusPointAccount extends Account{

	int bonusPoint; //���� ����Ʈ
	BonusPointAccount(String accountNo, String ownerName, int balance, int bonusPoint)
	{
		super(accountNo, ownerName, balance);
		this.bonusPoint = bonusPoint;
	}
	//overriding
	void deposit(int amount) {
		super.deposit(amount);
		bonusPoint += (int)(amount*0.001);
	}
}
