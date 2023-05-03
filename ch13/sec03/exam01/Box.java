package ch13.sec03.exam01;

public class Box<T> {
	//필드
	private T t;   //오브젝트로 사용한다는 의미

	//Getter 메소드
	public T get() {
		return t;
	}
	
	//Setter 메소드
	public void setT(T t) {
		this.t = t;
	}
	
	

}
