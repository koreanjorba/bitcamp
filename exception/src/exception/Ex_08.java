package exception;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex_08 {

	public static void main(String[] args) {
		
		FileWriter writer = null;
		try {
			File file = File.createTempFile("tmp", ".txt", new File("C:\\tmp"));
			writer = new FileWriter(file);
			writer.write('��');
			writer.write('��');
		}
		catch (IOException ioe) {
			System.out.println("���Ϸ� ����� �� �����ϴ�.");			
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
