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
			writer.write('자');
			writer.write('바');
		}
		catch (IOException ioe) {
			System.out.println("파일로 출력할 수 없습니다.");			
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
