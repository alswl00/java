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
		System.out.println("�̸�>>"+getName());
		System.out.println("����>>"+getAge());
		System.out.println("��ȭ��ȣ>>"+getTel());
		System.out.println("��Ư��>>"+getSkill());
		System.out.println("�ּ�>>"+getAddr());
	}
}

class student_addr {
	public static void main(String ar[]) {
	Scanner sc=new Scanner(System.in);
		int num;
		System.out.print("�Է��ο�>>");
		num=sc.nextInt();
		System.out.println("==�л������Է�==");
		System.out.println("===============");

		student s[]=new student[num];
		for(int i=0;i<num;i++) s[i]=new student();

		for(int i=0;i<num;i++) {
			System.out.print("�̸�>>");
			s[i].setName(sc.next());
			System.out.print("����>>");
			s[i].setAge(sc.nextInt());
			System.out.print("�ּ�>");
			s[i].setTel(sc.next());
			System.out.print("��Ư��>>");
			s[i].setSkill(sc.next());
			System.out.print("��ȭ��ȣ>>");
			s[i].setAddr(sc.next());
			System.out.println();
		}
		for(int i=0;i<num;i++) 
			s[i].pr();
	}
}