package chapter01;

public class MonthDays02 {
	public static void main(String[] args) {
		int month = 2;
		int days = -1;

		if(month == 1 || month == 3 || month == 5 || month == 7 || month == 9){
			days = 31;
		} else if(month == 2){
			days = 28;
		} else if(month == 4 || month == 6 || month == 8){
			days = 30;
		}
		System.out.println(month +"���� " + days + "�� ���� �ֽ��ϴ�.");

}
}
