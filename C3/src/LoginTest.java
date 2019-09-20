
public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id = args[0];
		String passwd = args[1];
		
		if(!id.equals("JAVA")) {
			System.out.println("당신은 우리 회원이 아닙니다.");
		}
		else if(!passwd.equals("JAVA")) {
			System.out.println("패스워드가 다릅니다");
		}
		else {
			System.out.println("환영합니다");
		}
	}

}
