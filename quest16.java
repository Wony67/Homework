package hw0409;

import java.util.Scanner;

public class quest16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		String str[] = { "��", "����", "����", "��", "����" };

		while (true) {
			System.out.print("���� ���� ��!>>");
			String rps = scanner.next();
			int num = (int) (Math.random() * 3 + 1);

			if (rps.equals("�׸�")) {
				System.out.println("������ �����մϴ�...");
				break;
			}
			if (str[num].equals(rps)) {
				System.out.println("����� =" + rps + ", ��ǻ�� = " + str[num] + ", �����ϴ�.");
				continue;
			}
			if (str[num - 1].equals(rps)) {
				System.out.println("����� =" + rps + ", ��ǻ�� = " + str[num] + ", ��ǻ�Ͱ� �̰���ϴ�.");
				continue;
			}
			if (str[num + 1].equals(rps)) {
				System.out.println("����� =" + rps + ", ��ǻ�� = " + str[num] + ", ����ڰ� �̰���ϴ�.");
				continue;
			}
		}
		scanner.close();

	}
}
