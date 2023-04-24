package ch04;

import java.util.Scanner;

public class TestIdEzen {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String id = "";
		String pw = "";
		int count = 0;
		
	do {
		System.out.print("아이디를 입력하세요: ");
		id = scanner.nextLine();
		
		
		if(id.equals("ezen")) {
			System.out.print("비밀번호를 입력하세요: ");
			pw = scanner.nextLine();
			
			
			if(pw.equals("12345")) {
				System.out.println("OK");
				break;
			} else if(count==3){
				System.out.println("GET OUT!");
				break;
			}
		}
		
		} while( ! id.equals("ezen") || pw.equals("12345"));
		
	}

}
