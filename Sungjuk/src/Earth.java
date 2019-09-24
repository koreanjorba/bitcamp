
public class Earth {
	//static 필드는 별도 객체 생성없어 클래스이름을 통해 접근 가능
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA;
	
	static {
		EARTH_SURFACE_AREA = 4*Math.PI*EARTH_RADIUS*EARTH_RADIUS;
		
	}
}
