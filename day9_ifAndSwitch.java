package hello;

import java.util.Scanner;
import java.util.Arrays;

public class HelloWorld {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("mbti를 입력하세요 : ");
		String mbti = sc.nextLine();


//		- INTP - 백엔드형
//		- ENFJ - 프론트엔드형
//		- INFJ - 풀스택형
//		- ISTJ - 퍼블리셔형
//		- ENTJ - 아키텍쳐형
//		- ISFJ - 보안전문가형
//		- INTJ - 데이터분석가형
//		- ENFP - AI형
//		- ENTP - iOS형
//		- ESFJ - 안드로이드형
//		- ESFP - 게임 개발자형
//		- ESTP - IoT 개발형
//		- ESTJ - QA 형
//		- INFP - 블록체인형
//		- ISTP - 임베디드 개발자형
//		- ISFP - 네트워크 개발자형

			switch (mbti) {
			case "ITNP":
			case "intp":
				System.out.println("백엔드형");
				break;
			case "ENFJ":
			case "enfj":
				System.out.println("프론트엔드형");
				break;
			case "INFJ":
			case "infj":
				System.out.println("풀스택형");
				break;
			case "ISTJ":
			case "istj":
				System.out.println("퍼블리셔형");
				break;
			case "ENTJ":
			case "entj":
				System.out.println("아키텍쳐형");
				break;
			case "ISFJ":
			case "isfj":
				System.out.println("보안전문가형");
				break;
			case "INTJ":
			case "intj":
				System.out.println("데이터분석가형");
				break;
			case "ENFP":
			case "enfp":
				System.out.println("AI형");
				break;
			case "ENTP":
			case "entp":
				System.out.println("iOS형");
				break;
			case "ESFJ":
			case "esfj":
				System.out.println("안드로이드형");
				break;
			case "ESFP":
			case "esfp":
				System.out.println("게임 개발자형");
				break;
			case "ESTP":
			case "estp":
				System.out.println("IoT 개발형");
				break;
			case "ESTJ":
			case "estj":
				System.out.println("QA 형");
				break;
			case "INFP":
			case "infp":
				System.out.println("블록체인형");
				break;
			case "ISTP":
			case "istp":
				System.out.println("임베디드 개발자형");
				break;
			case "ISFP":
			case "isfp":
				System.out.println("네트워크 개발자형");
				break;
			default:
				System.out.println("정확한 MBTI 유형이 아니에요.");
				break;
			}

		sc.close();
	}

}
