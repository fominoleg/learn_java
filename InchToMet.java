class InchToMet {
	public static void main(String args[]) {
		double inch, meter;
		int counter;

		counter = 0;
		// 1 Фут = 12 дюймам
		for(inch = 1; inch <= 144; inch++) {
			meter = inch * (1 / 39.37);
			System.out.println(inch + " дюймам соответствует " + 
							   meter + " метра.");

			counter++;
			if(counter == 12) {
				System.out.println();
				counter = 0;
			}
		}
	}
}