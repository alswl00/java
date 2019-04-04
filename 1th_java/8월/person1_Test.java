class person1{
	String name;
	int age;
	public void eat(){
		System.out.println("먹다");
	}
	public void go(){
		System.out.println("가다");
	}
}
//클래스가 여러개 있을 때는 main이 있는 클래스 이름으로 저장해줘야함!!!!!!!!!!111111
class person1_Test {
	public static void main(String ar[]) {
		person1 p1=new person1();
		p1.name="Mike";
		p1.age=30;
		System.out.println(p1.name);
		System.out.println(p1.age);
		p1.eat();
		p1.go();

		person1 p2=new person1();
		p2.name="Tom";
		p2.age=25;
		System.out.println(p2.name);
		System.out.println(p2.age);
		p2.eat();
		p2.go();
		}
}