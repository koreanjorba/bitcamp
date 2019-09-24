package exception;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.GregorianCalendar;

public class Ex_05 {

	public static void main(String[] args) {
		PrintWriter writer = null;
		try {
			writer = new PrintWriter("output.txt");
			writer.println("    ***성적표***		");
			writer.printf("%3s : %3d %3d %3d %5.1f %n", "김지영", 92, 87, 95, 91.3f);
			writer.printf("%3s : %3d %3d %3d %5.1f %n", "박현식", 100, 90, 88, 92.7f);
			writer.printf("%3s : %3d %3d %3d %5.1f %n", "최민제", 75, 88, 85, 82.7f);
			writer.printf("작성일자: %1$tY년%1$tm일%1$td일", new GregorianCalendar()); // 1$는 데이터 위치?
	
		}
		catch (IOException ioe) {
			System.out.println(args[0] + "파일로 출력할 수 없습니다.");			
		}
		finally {
			try {
				writer.close();
			}
			catch(Exception e){				
			}
		}
	}

}
