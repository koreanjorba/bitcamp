
public class GoodsStock {
	String goodsCode; 	//�ڵ�
	int stockNum;		//����
	GoodsStock(String goodsCode, int stockNum){
		this.goodsCode = goodsCode;
		this.stockNum = stockNum;
	}
	//Overriding
	public String toString() {
		String str = "��ǰ�ڵ�:" + goodsCode + "������:" + stockNum;
		return str;
	}
}
