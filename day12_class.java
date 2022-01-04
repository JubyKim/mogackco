package hello;

import java.util.Scanner;
import java.util.Arrays;

class Calculator {
	int x;
	int y;

	public void printResult() {
		System.out.printf("%d + %d = %d\n", x, y, x+y);
		System.out.printf("%d - %d = %d\n", x, y, x-y);
		System.out.printf("%d / %d = %d\n", x, y, x/y);
		System.out.printf("%d * %d = %d\n", x, y, x*y);
	}
}

public class HelloWorld {
	public static void main(String[] args) {

		Calculator calculator = new Calculator();
		calculator.x = 30;
		calculator.y = 50;

		calculator.printResult();
	}

}
