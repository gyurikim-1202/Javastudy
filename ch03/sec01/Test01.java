package ch03.sec01;

public class Test01 {

	public static void main(String[] args) {
		
		final byte Max = 127;
		final byte Min = -127;
		
		byte i = 17;
		System.out.println(i);
		
		i = 127;
		System.out.println(i);
		
		i = -128;
		System.out.println(i);
		
//		i = -129;	//언더플로우
		System.out.println(i);

	}

}
