package ch03.sec01;
// 비트 이동 연산자
public class BitShiftExample2 {

	public static void main(String[] args) {
		int value = 772;	//[00000000] [00000000] [00000011] [00000100]
		
		//우측으로 3byte(16bit) 이동하고 끝 1바이트만 읽음: [00000000]
		byte byte1 = (byte) (value >>> 24);

	}

}
