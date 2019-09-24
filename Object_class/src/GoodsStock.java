
public class GoodsStock {
	String goodsCode; 	//코드
	int stockNum;		//수량
	GoodsStock(String goodsCode, int stockNum){
		this.goodsCode = goodsCode;
		this.stockNum = stockNum;
	}
	//Overriding
	public String toString() {
		String str = "상품코드:" + goodsCode + "재고수량:" + stockNum;
		return str;
	}
}
