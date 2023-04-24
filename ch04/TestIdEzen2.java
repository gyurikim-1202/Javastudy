package ch04;

import java.util.Scanner;

public class TestIdEzen2 {

	public static void main(String[] args) {
	
		
	// 비밀번호 체크
		int count = 0;
		String id = "ezen";
		String pw = "12345";
		
		// 아이디 비밀번호 입력
		Scanner scanner = new Scanner(System.in);
		System.out.print("아이디: ");
		String put_id = scanner.nextLine();
		
		// 정보 일치 확인
		
		if (!put_id.equals(id)) {
			System.out.println("땡");
		}
		
		else {
			while(true) {
				System.out.print("비밀번호: ");
				String put_pw = scanner.nextLine();
				
				if (!put_pw.equals(pw)) {
					System.out.println("땡");
					count++;
				}
				
				else {
					System.out.print("OK");
					break;
				}
				
				if (count == 3) {
					System.out.println("GET OUT!");
					break;
				}
			}
			}
	}

}
