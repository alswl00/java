class Test9 {
	int a;
	int b;

	public Test9(int a,int b) {
		this(a);
	}

	public Test9(int x) {
		this();
		this.b=x;
	}

	public Test9() {
		this.a=20;
	}

	public static void main(String ar[]) {
		Test9 t=new Test9(10,20);

		System.out.println("this() È£Ãâ");
	}
}
//18-19-5-6-9-10-14-15-16-11-12-7-21-22-23