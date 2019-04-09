package hw0409;

import java.util.Scanner;

public class quest16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		String str[] = { "보", "가위", "바위", "보", "가위" };

		while (true) {
			System.out.print("가위 바위 보!>>");
			String rps = scanner.next();
			int num = (int) (Math.random() * 3 + 1);

			if (rps.equals("그만")) {
				System.out.println("게임을 종료합니다...");
				break;
			}
			if (str[num].equals(rps)) {
				System.out.println("사용자 =" + rps + ", 컴퓨터 = " + str[num] + ", 비겼습니다.");
				continue;
			}
			if (str[num - 1].equals(rps)) {
				System.out.println("사용자 =" + rps + ", 컴퓨터 = " + str[num] + ", 컴퓨터가 이겼습니다.");
				continue;
			}
			if (str[num + 1].equals(rps)) {
				System.out.println("사용자 =" + rps + ", 컴퓨터 = " + str[num] + ", 사용자가 이겼습니다.");
				continue;
			}
		}
		scanner.close();

	}
}
