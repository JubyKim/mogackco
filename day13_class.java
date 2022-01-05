package hello;

import java.util.Scanner;

class Student {
	String name;
	int score1;
	int score2;
	int score3;

	Student(String name, int score1, int score2, int score3){
		this.name = name;
		this.score1 = score1;
		this.score2 = score2;
		this.score3 = score3;
	}

	public void getAverage() {
		System.out.println((float)(score1 + score2 + score3)/3);
	}
}

public class HelloWorld {
	public static void main(String[] args) {

		Student student1 = new Student("코뮤", 100, 80, 75);
		Student student2 = new Student("김변수", 96, 58, 90);

		student1.getAverage();
		student2.getAverage();

	}
}
