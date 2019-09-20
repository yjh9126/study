
public class FlowTest5 {
	public static void main(String[]args) {
		int kor = Integer.parseInt(args[0]);
		int mat = Integer.parseInt(args[1]);
		int eng = Integer.parseInt(args[2]);
		int total = 0;
		
		
		//total 계산
		total = kor + mat + eng;
		
		//외부 if 문장 
		if(total >= 180) {
			//내부 if 문
			if(kor<40||mat<40||eng<40) {
				System.out.println("과락");
			}
			else {
				System.out.println("합격");
			}
		}
		else {
			System.out.println("불합");
		}
	}
}
