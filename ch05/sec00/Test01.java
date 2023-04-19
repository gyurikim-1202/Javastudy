package ch05.sec00;

public class Test01 {

	public static void main(String[] args) {
		
		int result = calculate(3, 4, '+');
		
		
		
		System.out.println("연산의 결과값: " + result);
	}
	
	static int calculate(int a, int b, char c) {
		switch(c) {
		
		case '+' :
			return a+b;
		case '-' :
			return a-b;
		case '*' :
			return a*b;
		case '/' :
		 return a/b;
		default :
			return 0;
		
		}
	}
}
