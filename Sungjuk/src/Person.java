
public class Person {
//final 
//final class 는 상속 불가를 위해
//final필드는 값 변경 막기 위해 (1-필드 선언 시 2-생성자 경우 값 지정)
//method는 재정의(riding)를 막기 위해
	
	final String nation = "korea";
	final String ssn;
	String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
	
	
	
}
