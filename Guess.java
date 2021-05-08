class Guess {
	public static void main(String args[]) 
		throws java.io.IOException {

		char ch, answer = 'K';

		System.out.print("Задумана буква из диапазона A-Z.\nПопытайтесь ее угадать: ");

		ch = (char) System.in.read();

		if(ch == answer) System.out.println("** Правильно! **");
		// else System.out.println("...Извините, вы не угадали.");
		else {
			System.out.print("...Извините, нужная буква находится ");
			if(ch < answer) System.out.println("ближе к концу алфавита");
			else System.out.println("ближе к началу алфавита");
		}
	}
}