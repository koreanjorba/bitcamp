package com.mbc;
public class Polygon {
	
	protected int x[];
	protected int y[];
	//생성자 - 다른패키지/but 상속관계이므로 protected 사용가능
	//		default 접근 불가
	protected Polygon(int vertexNum) {
		x = new int[vertexNum];
		y = new int[vertexNum];
	}
	
	protected void setPoint(int index, int x, int y) {
		this.x[index] = x;
		this.y[index] = y;
	}
}
