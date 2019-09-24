package exception;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex_06 {

	public static void main(String[] args) {
		if(args.length < 1) {
			System.out.println("Usage: java FileDump < filename >");
			return;
		}
		BufferedInputStream in = null; //직접 입력받는 기능이 없어서 파일인풋스트림 LIne17 을 이용해서 입력받아 래핑해서 출력
		try {
			in = new BufferedInputStream(new FileInputStream(args[0]));
			byte arr[] = new byte[16];
			while (true) {
				int num = in.read(arr);
				if (num < 0)
					break;
				for(int cnt = 0; cnt < num; cnt++)
					System.out.printf("%02X ", arr[cnt]);
				System.out.println();
			}
		}catch (FileNotFoundException fnfe) {
			System.out.println(args[0] + "파일로 출력할 수 없습니다.");			
		}
		catch (IOException ioe) {
			System.out.println(args[0] + "파일로 출력할 수 없습니다.");			
		}
		finally {
			try {
				in.close();
			}
			catch(Exception e){				
			}
		}
	}

}
