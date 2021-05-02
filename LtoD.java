class LtoD {
	public static void main(String args[]) {
		long L;
		double D;

		L = 100123285L;
		D = L; // Автоматическое преобразование long в double

		System.out.println("L и D: " + L + " " + D);
	}
}