class extend_Test3 {
	public static void main(String ar[]) {
		Leader l=new Leader();
		l.name="Mike";
		l.id="1111";
		l.tel="010-1234-1234";
		l.add="OO시OO구";
		l.sub="소프트웨어과";
		l.president=true;
		System.out.println(l.name+" "+l.id+" "+l.tel+" "+l.add+" "+l.sub+" "+l.president);
		l.study();
		l.eat();
		l.test();
		l.act();
		l.hello();
	}
}