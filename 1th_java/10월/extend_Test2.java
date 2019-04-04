class extend_Test2{
	public static void main(String ar[]) {
		Rabbit r=new Rabbit();
		Tiger t=new Tiger();
		r.leg=4;
		t.leg=4;
		r.color="white";
		t.color="orange";
		r.owner="Mike";
		t.owner="Alice";
		System.out.println(r.leg);
		System.out.println(t.run());
	}
}