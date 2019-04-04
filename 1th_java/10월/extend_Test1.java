class extend_Test1 {
	public static void main(String ar[]) {
		Student8 s=new Student8("Mike",30);
		Player8 p=new Player8("Baseball",25);
		System.out.println(s.name);
		System.out.println(p.age);
		s.eat("과자");
		p.eat("피자");
	}
}