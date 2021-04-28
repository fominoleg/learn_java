class IfDemo {
	public static void main(String args[]) {
		int a, b, c;
		a = 2;
		b = 3;
		if(a < b) System.out.println("a меньше b");
		if(a == b) System.out.println("Вы не должны увидеть этот текст");

		c = a - b;
		System.out.println("c содержит " + c);
		if(c >= 0) System.out.println("c - не отрицательное число");
		if(c < 0) System.out.println("c - отрицательное число");

		c = b - a;
		if(c >= 0) System.out.println("c - не отрицательное число");
		if(c < 0) System.out.println("c - отрицательное число");
	}
}