package hello;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {



		Scanner sc = new Scanner(System.in);

		System.out.print("첫 번째 숫자를 입력하세요. : ");
		int first = sc.nextInt();

		System.out.print("두 번째 숫자를 입력하세요. : ");
		int second = sc.nextInt();

		sc.close();

		System.out.println("===사칙연산 출력하기===");


		System.out.printf("%d + %d = %d", first, second, first+second);
		System.out.println();
		System.out.printf("%d - %d = %d", first, second, first-second);
		System.out.println();
		System.out.printf("%d * %d = %d", first, second, first*second);
		System.out.println();
		System.out.printf("%d / %d = %d", first, second, first/second);
		System.out.println();
		System.out.printf("%d %% %d = %d", first, second, first%second);
		System.out.println();

	}

}
