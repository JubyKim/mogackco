package hello;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 두 개를 입력하세요. : ");

		int a[] = {1,2};


		String s[]= sc.nextLine().split(" ");
		for(int i =0 ;i < s.length;i++){
		    a[i]= Integer.parseInt(s[i]);
		}

		sc.close();


		String res = "같음";

		if (a[0]> a[1]) {
			res = Integer.toString(a[0]);
		} else if (a[1]> a[0]) {
			res = Integer.toString(a[1]);
		}

		System.out.println("둘 중에 큰 수 : " + res);


	}

}
