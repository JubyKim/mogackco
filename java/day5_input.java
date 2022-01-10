package hello;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {

		System.out.println("======== 자기소개 입력하기 =========");

		Scanner sc = new Scanner(System.in);

		System.out.print("이름을 입력하세요: ");
		String name = sc.next();

		System.out.print("나이를 입력하세요: ");
		int age = sc.nextInt();

		System.out.print("혈액형을 입력하세요: ");
		String bloodType = sc.next();

		System.out.print("MBTI를 입력하세요: ");
		String mbti = sc.next();

		System.out.print("확률과 통계 기말고사 성적: ");
		float statScore = sc.nextFloat();

		System.out.print("좌우명 한 문장을 입력하세요: ");
		sc.nextLine();
		String sentence = sc.nextLine();

		System.out.println("======== 자기소개 입력 완료 =========");

		System.out.println("아이엠 그라운드 자기소개 시작! => 시작하려면 엔터를 누르세요.");
		sc.nextLine();
		sc.close();

		System.out.printf("저는 %s 입니다. 나이는 %d 살이에요", name, age);
		System.out.println();
		System.out.printf("혈액형은 %s 이구요. %s 입니다. ", bloodType, mbti);
		System.out.println();
		System.out.printf("확률과 통계 기말고사 점수는 %f 이구요.", statScore);
		System.out.println();
		System.out.printf("★★★%s★★★", sentence);

	}

}
