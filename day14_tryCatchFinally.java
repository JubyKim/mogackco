package hello;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] value = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		while (true) {
			System.out.print("숫자를 입력하세요: ");
			int i = sc.nextInt();

			try {
				System.out.println(value[i]);
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("0에서 9사이의 숫자를 입력하세요");
				continue;
			}
			System.out.println("프로그램 종료");
			break;
		}

	}
}
