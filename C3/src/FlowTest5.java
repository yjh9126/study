
public class FlowTest5 {
	public static void main(String[]args) {
		int kor = Integer.parseInt(args[0]);
		int mat = Integer.parseInt(args[1]);
		int eng = Integer.parseInt(args[2]);
		int total = 0;
		
		
		//total ���
		total = kor + mat + eng;
		
		//�ܺ� if ���� 
		if(total >= 180) {
			//���� if ��
			if(kor<40||mat<40||eng<40) {
				System.out.println("����");
			}
			else {
				System.out.println("�հ�");
			}
		}
		else {
			System.out.println("����");
		}
	}
}
