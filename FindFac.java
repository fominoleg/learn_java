class FindFac {
	public static void main(String args[]) {
		int iterations = 0;

		for(int i=2; i<100; i++) {
			System.out.print("Делители числа " + i + ": ");


			// Вторая версия
			// for (int j=2; j<i; j++) {
			// 	iterations++;
			// 	if(j > i/2) break;
			// 	if((i%j) == 0) System.out.print(j + " ");
			// }

			for (int j=2; j<=i/2; j++) {
				iterations++;
				if((i%j) == 0) System.out.print(j + " ");
			}



			System.out.println();
		}

		System.out.println("Количество итераций: " + iterations);
	}
}