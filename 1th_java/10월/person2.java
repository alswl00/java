class person2{
	private String name;
	private int age;
	
	person2(String name,int age){
		this.name=name;
		this.age=age;
	}

	person2(int age) {
		this.age=age;
	}

	person2(String name) {
		this.name=name;
	}

	person2(){}

	private String eat(String n) {
		return n;
	}

	public static void main(String ar[]) {
		person2 p1=new person2("Mike",30);
		person2 p2=new person2("Alice",25);
		person2 p3=new person2(35);
		person2 p4=new person2("Tom");
		person2 p5=new person2();

		System.out.println(p3.name+" "+p3.age);
		System.out.println(p4.eat("ธิดู"));
	}
}