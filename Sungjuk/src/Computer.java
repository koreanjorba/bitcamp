
public class Computer extends Calculator {

	@Override
	double areaCircle(double r) {
		super.areaCircle(r);
		System.out.println("컴퓨터 객체의 areaCircle() 실행");
		return Math.PI*r*r;
	}
}
