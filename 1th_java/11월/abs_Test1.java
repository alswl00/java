abstract class person30 {
	String name;
	int age;

	public void go(){
		System.out.println("����");
	}

	abstract public void walk();
	abstract public int count(int num);//�ο���
}
//person30�� ��ü ������

abstract class child extends person30 {		//walk, count ���븸��������
	public void walk() {
		System.out.println("�ȴ�");
	}
}

class child2 extends child {
	public int count(int num) {
		return num;
	}
}

class abs_Test1 {
	public static void main(String ar[]) {
		child2 c=new child2();
		c.walk();
		System.out.println(c.count(5)+"��");
	}
}