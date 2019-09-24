package com.kbs;

import com.mbc.Polygon;

public class Square extends Polygon{

	public Square(int x, int y, int sideLength) {
		super(0); //왜 x는 되고 vertexNum은 안되는지?
		setPoint(0, x, y);
	}
	public int getX(int index) {
		return x[index];
	}
	public int getY(int index) {
		return y[index];
	}
}
