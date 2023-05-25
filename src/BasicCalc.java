public class BasicCalc {
	static void add(int a, int b) {
		System.out.println(a+b);
	}
	static void sub(int a, int b) {
		System.out.println(a-b);
	}
	static void mul(int a, int b) {
		System.out.println(a*b);
	}
	static void div(int a, int b) {
		System.out.println(a/b);
	}
	static void mod(int a, int b) {
		System.out.println(a%b);
	}
	public static void main(String[] args) {
		add(10,20);
		sub(10,20);
		mul(10,20);
		try {
			div(10,20);
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		mod(10,20);
	}
}
