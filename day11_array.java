package hello;

import java.util.Scanner;
import java.util.Arrays;

public class HelloWorld {
	public static void main(String[] args) {
		int[] nums = new int[5];
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 5개를 띄어쓰기로 구분하여 입력하세요:");

		for(int i=0; i<nums.length; i++) {
			nums[4-i] = sc.nextInt();
		}

		System.out.println("====== 입력 완료 ======");
		System.out.println("====== 출력 시작 ======");

		for(int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
		sc.close();

	}

}
