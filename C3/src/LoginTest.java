
public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id = args[0];
		String passwd = args[1];
		
		if(!id.equals("JAVA")) {
			System.out.println("����� �츮 ȸ���� �ƴմϴ�.");
		}
		else if(!passwd.equals("JAVA")) {
			System.out.println("�н����尡 �ٸ��ϴ�");
		}
		else {
			System.out.println("ȯ���մϴ�");
		}
	}

}
