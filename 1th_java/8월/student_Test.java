class student_Test {
	public static void main(String ar[]) {
	student s1=new student();

	s1.name="김현우";
	s1.num=1;
	s1.addr="서울";
	s1.telephone="01011112222";

	System.out.println(s1.name);
	System.out.println(s1.num);
	System.out.println(s1.addr);
	System.out.println(s1.telephone);

	System.out.println("이름은 "+s1.name+"이고 "+s1.num+"학년이고 "+s1.addr+"에 살고 전화번호는 "+s1.telephone+"입니다.");
	}
}