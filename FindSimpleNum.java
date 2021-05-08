class FindSimpleNum {
	public static void main(String args[]) {
		int i;
		int j;
		int cnt;

		for(i = 2; i <= 100; i++){
			cnt = 0;
			for(j = 2; j <= i; j++) {
				if((i % j) == 0) {
					cnt++;
					// System.out.println("Очередное простое число: " + i);
				}
			}
			if(cnt == 1) {
				System.out.println("Очередное простое число: " + i);
			}
		}

	}
}