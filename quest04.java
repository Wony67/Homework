package homeWork;

import java.util.Scanner;

public class quest04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.print("소문자 알파벳 하나를 입력하시오>>");
		String alpha=scanner.next();
		char ch=alpha.charAt(0);
		int num=ch-'a';
		
		for(int i=num; i>=0; i--) {
			for(int j=0; j<=i; j++) {
				System.out.print((char)(j+'a')+" ");
			}
			System.out.println();
		}
	}

}
