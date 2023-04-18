package ch02.sec13;

import java.util.Scanner;

//키보드 입력 데이터를 변수에 저장
public class ScannerExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("x 값 입력: ");
		String strX = scanner.nextLine();
		int x = Integer.parseInt(strX);	// String 타입 값을 int로 변환
		
		System.out.print("y 값 입력: ");
		String strY = scanner.nextLine();
		int y = Integer.parseInt(strY);
		
		int result = x + y;
		System.out.println("x + y: " + result);
		System.out.println();
		
		while(true) { // while(true) 대신 for(;;) 사용해도 됨
			System.out.print("입력 문자열: ");
			String data = scanner.nextLine();
			if(data.equals("q") ) {
				break;
			}
			System.out.println("출력 문자열: " + data);
			System.out.println();
		}
		System.out.println("종료");
	}

}
