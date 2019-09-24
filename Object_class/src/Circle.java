
public class Circle {

		int radius;
		Circle(int radius){
			this.radius = radius;
		}
		
		//@Overriding
		public boolean equals(Object obj) {
			if(!(obj instanceof Circle))
				return false; //타입이 다르면 false
			Circle circle = (Circle) obj; //obj를 circle 형으로 변환
			if(radius == circle.radius)		//값 비교
				return true;				
			else
				return false;
		}
}
