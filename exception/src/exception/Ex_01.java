package exception;

import java.io.*;

public class Ex_01 {

	public static void main(String[] args) {
		FileReader reader  = null;
		try {
			reader = new FileReader("poem.txt");	//���� ������ notfoundexception
			while(true) {
			int data = reader.read();				//IOException
			if(data == -1)
				break;
			char ch = (char)data;
			System.out.print(ch);
			}
		}
		catch (FileNotFoundException fnfe) {		//�ڽ�(�� �������� ����ó���� �켱������ �д�)
			System.out.println("������ �������� �ʽ��ϴ�");
		}
		catch (IOException ioe) {
			System.out.println();
		}
		finally {									//��������. ������ ����. like- while�� do
			try {
				reader.close();
			}
			catch (Exception e) {
				
			}
		}
		
	}

}
