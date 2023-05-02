package ch08.sec05;

public class RemoteControlExample {

	public static void main(String[] args) {
		//인터페이스 변수 선언
		RemoteControl rc;
		
		//Television 객체를 생성하고 인터페이스 변수에 대입
		rc = new Television();
		rc.turnOn();
		rc.setVolume((5));
		rc.turnOff();
		
		//Audio 객체를 생성하고 인터페이스 변수에 대입
		rc = new Audio();
		rc.turnOn();
		rc.setVolume((5));
		rc.turnOff();
		
		default void setMute(boolean mute) {
			if(mute) {
				System.out.println("무음 처리 합니다.");
				setVolume(MIN_VOLUME);
			} else {
				System.out.println("무음 해제합니다.");
			}
		}

	}

}
