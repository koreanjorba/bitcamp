
public class Circle {

		int radius;
		Circle(int radius){
			this.radius = radius;
		}
		
		//@Overriding
		public boolean equals(Object obj) {
			if(!(obj instanceof Circle))
				return false; //Ÿ���� �ٸ��� false
			Circle circle = (Circle) obj; //obj�� circle ������ ��ȯ
			if(radius == circle.radius)		//�� ��
				return true;				
			else
				return false;
		}
}
