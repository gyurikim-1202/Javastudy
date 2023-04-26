package ch08.sec2;

import ch08.sec10.RemoteControl;
import ch08.sec10.Television;

public class RemoteControlExample {

	public static void main(String[] args) {

		RemoteControl rc;
		
		//rc변수에 Television 객체를 대입
		rc = new Television();
		rc.turnOn();
		
		//rc변수에 Audio 객체를 대입
		rc = new Audio();
		rc.turnOn();

	}

}
