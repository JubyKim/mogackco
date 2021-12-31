

import java.util.Scanner;
import java.util.Arrays;

public class HelloWorld {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int reNum = sc.nextInt();
		sc.close();
		//---------for문-------------//
		int sum1 = 0;
		for (int i = 0 ; i <= reNum ; i++) {
			sum1 += i;
		}

		System.out.println("1부터 " + Integer.toString(reNum) + "까지의 합은 " + Integer.toString(sum1) + "입니다. : for");

		//----------while문-------------//
		int a = 0;
		int sum2 = 0;
		while ( a <= reNum ) {
			sum2 += a;
			a++;
			}

		System.out.println("1부터 " + Integer.toString(reNum) + "까지의 합은 " + Integer.toString(sum2) + "입니다. : while");

	}

}
