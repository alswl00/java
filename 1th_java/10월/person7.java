class person7 {
	private String name;
	private int age;
	private int height;

	person7(String n, int h) {
		this(h);
		this.name=n;
	}

	person7(String name, int age, int height) {
		this(name, height); 
		this.age=age;
	}

	person7(int x) {
		this();
		this.name="Tom";
	}

	person7() {	}

	public static void main(String ar[]) {
		person7 p=new person7("Mike",30,180);
		System.out.println(p.name+" "+p.age+" "+p.height);
	}
}

//23-24-11-12-6-7-16-17-21-18-19-8-9-13-14-25-26-27