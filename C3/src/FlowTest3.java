//���� ���ϱ�
public class FlowTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year = Integer.parseInt(args[0]);
		boolean isLeap = false;
		isLeap = (year%4==0 && year % 100!= 0 ||year%400==0);
		if(isLeap) {
			System.out.println(year+"���� �����Դϴ�");
		}
		else {
			System.out.println(year+"���� ������ �ƴմϴ�");
		}
			
	}

}
