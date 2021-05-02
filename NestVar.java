class NestVar {
	public static void main(String args[]) {
		int count;


		for(count = 0; count < 10; count++) {
			int count; // Будет ошибка
			for(count = 0; count < 2; count++)
				System.out.println("В этой программе есть ошибка!");
		}
	}
}