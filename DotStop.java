class DotStop {
	public static void main(String args[])
		throws java.io.IOException {

		char choice, ignore;
		int space_counter = 0;

		for(;;) {
			
			choice = (char) System.in.read();

			do {
				ignore = (char) System.in.read();
			} while(ignore != '\n');

			if(choice == '.') break;
			if(choice == ' ') space_counter++;
		}

		System.out.println("Количество пробелов: " + space_counter);

	}
}