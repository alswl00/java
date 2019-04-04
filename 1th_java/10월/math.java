class math {
	public int Add(int x, int y) {
		return x+y;
	}
	public int Sub(int x, int y) {
		return x-y;
	}
	public int Mul(int x, int y) {
		return x*y;
	}
	public int Div(int x, int y) {
		return x/y;
	}

	public static void main(String ar[]) {
		math m=new math();
		System.out.println(m.Add(5,3));
		System.out.println(m.Sub(5,3));
		System.out.println(m.Mul(5,3));
		System.out.println(m.Div(5,3));
	}
}