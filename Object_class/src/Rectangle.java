
public class Rectangle implements Cloneable {
	int width, height;
	Rectangle(int width, int height){
		this.width = width;
		this.height = height;
	}
	//clone 오버라이딩
	public Object clone() {
		try {
			return super.clone();
		}
		catch(CloneNotSupportedException e) {
			return null;
		}
	}
}
