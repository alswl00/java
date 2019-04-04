import java.util.*;
class student {
	Scanner sc=new Scanner(System.in);
	private String name;
	private int age;
	private String tel;
	private String skill;
	private String addr;

	public void setName(String n) {
		name=n;
	}
	public void setAge(int a) {
		age=a;
	}
	public void setTel(String t) {
		tel=t;
	}
	public void setSkill(String s) {
		skill=s;
	}
	public void setAddr(String ad) {
		addr=ad;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getTel() {
		return tel;
	}
	public String getSkill() {
		return skill;
	}
	public String getAddr() {
		return addr;
	}
	
	public void pr() {
		System.out.println("===============");
		System.out.println("이름>>"+getName());
		System.out.println("나이>>"+getAge());
		System.out.println("전화번호>>"+getTel());
		System.out.println("주특기>>"+getSkill());
		System.out.println("주소>>"+getAddr());
	}
}

class student_addr {
	public static void main(String ar[]) {
	Scanner sc=new Scanner(System.in);
		int num;
		System.out.print("입력인원>>");
		num=sc.nextInt();
		System.out.println("==학생정보입력==");
		System.out.println("===============");

		student s[]=new student[num];
		for(int i=0;i<num;i++) s[i]=new student();

		for(int i=0;i<num;i++) {
			System.out.print("이름>>");
			s[i].setName(sc.next());
			System.out.print("나이>>");
			s[i].setAge(sc.nextInt());
			System.out.print("주소>");
			s[i].setTel(sc.next());
			System.out.print("주특기>>");
			s[i].setSkill(sc.next());
			System.out.print("전화번호>>");
			s[i].setAddr(sc.next());
			System.out.println();
		}
		for(int i=0;i<num;i++) 
			s[i].pr();
	}
}