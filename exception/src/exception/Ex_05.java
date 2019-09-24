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
			writer.println("    ***����ǥ***		");
			writer.printf("%3s : %3d %3d %3d %5.1f %n", "������", 92, 87, 95, 91.3f);
			writer.printf("%3s : %3d %3d %3d %5.1f %n", "������", 100, 90, 88, 92.7f);
			writer.printf("%3s : %3d %3d %3d %5.1f %n", "�ֹ���", 75, 88, 85, 82.7f);
			writer.printf("�ۼ�����: %1$tY��%1$tm��%1$td��", new GregorianCalendar()); // 1$�� ������ ��ġ?
	
		}
		catch (IOException ioe) {
			System.out.println(args[0] + "���Ϸ� ����� �� �����ϴ�.");			
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
