// Неожиданный результат повышения типов!
class PromDemo {
	public static void main(String args[]) {
		byte b;
		int i;

		b = 10;
		i = b * b;
		b = 10;
		b = (byte) (b * b);

		System.out.println("i и b: " + i + " " + b);

		char c1 = 'a', c2 = 'b';
		c1 = (char) (c1 + c2);

		System.out.println("c1: " + c1);

	}
}