class DecDemo {
	public static void main(String args[]) {
		int x, y;

		x = 10;
		y = x++;

		System.out.println(x + " " + y); // 11 10

		x = 10;
		y = ++x;

		System.out.println(x + " " + y); // 11 11
	}
}