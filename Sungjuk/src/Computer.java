
public class Computer extends Calculator {

	@Override
	double areaCircle(double r) {
		super.areaCircle(r);
		System.out.println("��ǻ�� ��ü�� areaCircle() ����");
		return Math.PI*r*r;
	}
}
