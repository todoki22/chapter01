package chapter01;

public class Swap {

	public static void main(String[] args) {

		int n1 = 10;
		int n2 = 30;
		int swap = 0;
		// Q1: n1���� �׻� ū ���� �ǵ���, �ʿ��� ��� n1�� n2�� ��ü�϶�.
		if (n1 > n2) {
			System.out.println("n1: " + n1);
			System.out.println("n2: " + n2);
		} else if (n1 < n2) {
			n1 = swap;
			n1 = n2;
			n2 = swap;
			System.out.println("n1 : " + n1);
			System.out.println("n2 : " + n2);

		}

		// Q2: �ִ밪�� �Ǻ��ϴ� ������ �ϼ��� ������.
		int a1 = 2;
		int a2 = 1;
		int a3 = 30;

		if (a1 >= a2) {
			if (a1 >= a3) {
				System.out.println(a1);
			} else {
				System.out.println(a3);
			}

		}
		
		
		if (a2 >= a3) {
			if (a2 >= a1) {
				System.out.println(a2);
			} else {
				System.out.println(a1);
			}
		}
		
		if (a3 >= a1) {
			if (a3 >= a2) {
				System.out.println(a3);
			} else {
				System.out.println(a2);
			}
		}
	}
}
