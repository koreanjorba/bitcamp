package selfstudy;

public class Ex01 {

	static void _value(int b){
		b = 2;
    }
     
    public static void runValue(){
        int a = 1;
        _value(1);
        System.out.println("runValue, "+a);
    }
     
    public static void main(String[] args) {
        runValue(); // runValue, 1
      
        
    }

}
