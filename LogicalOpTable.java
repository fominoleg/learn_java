class LogicalOpTable {
	public static void main(String args[]) {
		System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

		boolean p, q;

		int _p, _q, _and, _or, _xor, _not;

		p = true; q = true;

		_p = p ? 1 : 0;
		_q = q ? 1 : 0;
		_and = (p&q) ? 1 : 0;
		_or = (p|q) ? 1 : 0;
		_xor = (p^q) ? 1 : 0;
		_not = (!p) ? 1 : 0;

		System.out.print(_p + "\t" + _q +"\t");
		System.out.print(_and + "\t" + _or + "\t");
		System.out.println(_xor + "\t" + _not);

		p = true; q = false;
		_p = p ? 1 : 0;
		_q = q ? 1 : 0;
		_and = (p&q) ? 1 : 0;
		_or = (p|q) ? 1 : 0;
		_xor = (p^q) ? 1 : 0;
		_not = (!p) ? 1 : 0;

		System.out.print(_p + "\t" + _q +"\t");
		System.out.print(_and + "\t" + _or + "\t");
		System.out.println(_xor + "\t" + _not);

		p = false; q = true;
		_p = p ? 1 : 0;
		_q = q ? 1 : 0;
		_and = (p&q) ? 1 : 0;
		_or = (p|q) ? 1 : 0;
		_xor = (p^q) ? 1 : 0;
		_not = (!p) ? 1 : 0;

		System.out.print(_p + "\t" + _q +"\t");
		System.out.print(_and + "\t" + _or + "\t");
		System.out.println(_xor + "\t" + _not);

		p = false; q = false;
		_p = p ? 1 : 0;
		_q = q ? 1 : 0;
		_and = (p&q) ? 1 : 0;
		_or = (p|q) ? 1 : 0;
		_xor = (p^q) ? 1 : 0;
		_not = (!p) ? 1 : 0;

		System.out.print(_p + "\t" + _q +"\t");
		System.out.print(_and + "\t" + _or + "\t");
		System.out.println(_xor + "\t" + _not);


	}
}