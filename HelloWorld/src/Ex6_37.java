class MyMath2 {
	long a, b; // this.a, this.b -> 진짜 이름 (this.생략가능)
	
	MyMath2(int a, int b){ // 생성자 - this 사용가능
		this.a = a;
		this.b = b;
	}
	
	long add() { // 인스턴스 메서드 - this 사용가능
		return a + b; // return this.a + this.b;
	}
	
	static long add(long a, long b) { // 클래스 메서드(static 메서드) - this 사용불가
		return a + b;
	}
}


public class Ex6_37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
