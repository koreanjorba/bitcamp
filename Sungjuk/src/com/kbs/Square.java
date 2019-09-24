package com.kbs;

import com.mbc.Polygon;

public class Square extends Polygon{

	public Square(int x, int y, int sideLength) {
		super(0); //�� x�� �ǰ� vertexNum�� �ȵǴ���?
		setPoint(0, x, y);
	}
	public int getX(int index) {
		return x[index];
	}
	public int getY(int index) {
		return y[index];
	}
}
