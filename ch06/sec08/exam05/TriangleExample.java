package ch06.sec08.exam05;
//삼각형 넓이 구하기
import ch06.sec08.exam05.Triangle;

public class TriangleExample {

	public static void main(String[] args) {
		// 객체 생성
		Triangle myCalcu = new Triangle();
		
		//삼각형의 넓이 구하기
		double result = myCalcu.areaTriangle(10, 20);
		
		
		System.out.println("삼각형의 넓이= " + result);


	}

}
