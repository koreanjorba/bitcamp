package exception;

import java.io.*;

public class Ex_02 {

	public static void main(String[] args) {
		FileWriter writer = null;
		try {
			writer = new FileWriter("output.txt");
			char arr[] = { '��', '��', ' ', '��', '��', '��', '��', ' ', 'J', 'a', 'v', 'a'};
			for(int cnt = 0; cnt < arr.length; cnt++)
				writer.write(arr[cnt]);			
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
