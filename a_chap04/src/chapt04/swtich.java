package chapt04;

public class swtich {

	public static void main(String[] args) {
				
			int num = (int)(Math.random()*6) + 1;
			
			switch(num) {
				case 1:
					System.out.println("1���� ���Խ��ϴ�");
					break;
				case 2:
					System.out.println("2���� ���Խ��ϴ�.");
					break;
				case 3:
					System.out.println("3���� ���Խ��ϴ�.");
					break;
				case 4:
					System.out.println("4���� ���Խ��ϴ�.");
					break;
				default:
					System.out.println("5���� ���Խ��ϴ�.");
					break;
			}
			
			char grade = 'B';
			
			switch(grade) {
				case 'A':
				case 'a':
					System.out.println("��� ȸ���Դϴ�.");
					break;
					
				case 'B':	//break ���� �� �Ʒ��� ��� ����
				case 'b':
					System.out.println("�Ϲ� ȸ���Դϴ�.");
					break;
				
				default:
					System.out.println("�մ��Դϴ�.");
					break;	
			
			
			}
			
			String position = "����";
			
			switch(position) {
				case "����":
				
					System.out.println("700����");
					break;
					
				case "����":
					System.out.println("500����");
					break;
				
				default:
					System.out.println("300����");
					break;	
			}
	}

}
