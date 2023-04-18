package ch03.sec11;

import java.util.Scanner;

public class 연습 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int score = 0;
		char grade;
		
		System.out.println("점수를 입력해주세요: ");
		String str = scanner.nextLine();
		
		while(true) {
		if(str.equals('q') || str.equals('Q')) {
			break;
		}
		int score = Integer.parseInt(str);
		if(score > 90) {
			grade = 'A';
		}
		else if(score > 80) {
			grade = 'B';
		}
		else if(score > 70) {
			grade = 'C';
		}
		else if(score >60) {
			grade = 'D';
		}
		else
			grade = 'F';

	}
		System.out.println("종료되었습니다.");
	}
}