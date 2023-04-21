package ch05;

import java.util.Calendar;

import ch05.sec12.Week;

public class WeekExample {

	public static void main(String[] args) {
		//Week 표시
		
		Week today = null; //Week 첫 글자가 대문자라고 해서 class인 것은 아님(값임)
		//Calendar 얻기
		Calendar cal = Calendar.getInstance();
		//오늘의 요일 얻기(1~7)
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		//숫자를 열거 상수로 변환해서 변수에 대입
		switch(week) {
			case 1: today = Week.SUNDAY ; break; //week 옆에 점 찍으면 week 안에 있는 값만 넣을 수 있음 
			case 2: today = Week.MONDAY; break;
			case 3: today = Week.TUESDAY ; break;
			case 4: today = Week.WEDNESDAY ; break;
			case 5: today = Week.THURSDAY ; break;
			case 6: today = Week.FRIDAY ; break;
			case 7: today = Week.SATURDAY ; break;
		}
		
		//열거 타입 변수를 사용
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다.");
		} else {
			System.out.println("열심히 자바를 공부합니다.");
		}

	}

}
