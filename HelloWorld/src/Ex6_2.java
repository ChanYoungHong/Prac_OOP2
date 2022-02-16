
class MyMath{
	void printGugudan(int dan) {
		for(int i=1; i<=9; i++) {
			System.out.printf("%d * %d = %d%n", dan, i, dan * i);
		}
	}
}


public class Ex6_2 {

	public static void main(String[] args) {
		MyMath mm = new MyMath();
		
		mm.printGugudan(12);

	}

}
