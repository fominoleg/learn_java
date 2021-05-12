class Guess {
	public static void main(String args[]) 
		throws java.io.IOException {

		char ch, ignore, answer = 'K';

		do {
			System.out.print("Задумана буква из диапазона A-Z.\nПопытайтесь ее угадать: ");

			ch = (char) System.in.read();

			// Отбрасывание всех остальных символов во входном буфере
			do {
				ignore = (char) System.in.read();
			} while(ignore != '\n');


			if(ch == answer) System.out.println("** Правильно! **");
			// else System.out.println("...Извините, вы не угадали.");
			else {
				System.out.print("...Извините, нужная буква находится ");
				if(ch < answer) System.out.println("ближе к концу алфавита");
				else System.out.println("ближе к началу алфавита");
				System.out.println("Повторите попытку!\n");
			}
		} while(answer != ch);
	}
}