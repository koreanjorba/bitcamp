package exception;

import java.io.*;

public class Ex_01 {

	public static void main(String[] args) {
		FileReader reader  = null;
		try {
			reader = new FileReader("poem.txt");	//파일 없으면 notfoundexception
			while(true) {
			int data = reader.read();				//IOException
			if(data == -1)
				break;
			char ch = (char)data;
			System.out.print(ch);
			}
		}
		catch (FileNotFoundException fnfe) {		//자식(더 지엽적인 예외처리를 우선순위에 둔다)
			System.out.println("파일이 존재하지 않습니다");
		}
		catch (IOException ioe) {
			System.out.println();
		}
		finally {									//생략가능. 무조건 수행. like- while의 do
			try {
				reader.close();
			}
			catch (Exception e) {
				
			}
		}
		
	}

}
