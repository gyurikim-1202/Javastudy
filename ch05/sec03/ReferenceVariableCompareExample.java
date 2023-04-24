package ch05.sec03;

public class ReferenceVariableCompareExample {

	public static void main(String[] args) {
		// 1차원 배열 실습
		int[] arr1; //배열 변수 arr1 선언
		int[] arr2;
		int[] arr3;
		
		arr1 = new int[] { 1, 2, 3 };
		arr2 = new int[] { 1, 2, 3 };
		arr3 = arr2; // arr2의 '값'이 아니라 arr2의 값이 있는 '주소'를 넘겨준 것
		
		System.out.println(arr1 == arr2); // arr1과 arr2는 값은 같지만 값이 있는 주소가 다르므로 false
		System.out.println(arr2 == arr3);

	}

}
