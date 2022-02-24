class MyPoint4 extends Object {
	int x;
	int y;
}

class Circle4 extends Object {
	MyPoint4 p;
	int r;
	
	Circle4 (){
		p = new MyPoint4();
	}
}


public class InheritanceTest {
	public static void main(String[] args) {
		Circle4 c = new Circle4();
		System.out.println(c.toString());
		System.out.println(c);

	}

}
