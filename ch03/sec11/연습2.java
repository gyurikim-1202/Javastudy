package ch03.sec11;

import java.util.Scanner;

public class 연습2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int score = 0;
		char grade;
		
		
		
		while(true) {
			System.out.println("점수를 입력하세요: ");
			String str = scanner.nextLine();
			
			if(str.equals('q') || str.equals('Q')) {
				break;
			}
			if(score > 90) {
				grade = 'A';
			}
			else if(score > 80) {
				grade = 'B';
			}
			else
				grade = 'F';
		}
		System.out.println("종료되었습니다.");
	}

}
