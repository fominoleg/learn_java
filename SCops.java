class SCops {
	public static void main(String args[]) {
		int n, d, q;

		n = 10;
		d = 2;
		if(d != 0 && (n % d) == 0)
			System.out.println(d + " является делителем " + n);

		d = 0;

		// Второй операнд не вычисляется (из за &&)
		if(d != 0 && (n % d) == 0)
			System.out.println(d + " является делителем " + n);

		// Ошибка деления на ноль
		if(d != 0 & (n % d) == 0)
			System.out.println(d + " является делителем " + n);
	}
}