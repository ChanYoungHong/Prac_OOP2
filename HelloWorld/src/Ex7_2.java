class MyPoint extends Object{
	int x;
	int y;
}

//class Circle extends MyPoint {
//	int r;
//}

class Circle extends Object { // 포함
	MyPoint p //= new MyPoint();
	int r;
	
	Circle(){
		p = new MyPoint();
	}
}



public class Ex7_2 {
	public static void main(String[] args) {
		Circle c = new Circle();
		System.out.println(c.toString());
		Circle c2 = new Circle();
		System.out.println(c2.toString());
	}

}


// toString() -> 문자열을 반환해준 것 
