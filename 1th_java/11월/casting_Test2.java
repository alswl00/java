class Shape3 {
	public void draw() {
		System.out.println("�����׸���");
	}
	public void painting() {
		System.out.println("�θ� ��ĥ�ϱ�");
	}
}
class Circle2 extends Shape3{
	public void draw() {
		System.out.println("���׸���");
	}
	public void painting() {
		System.out.println("��ĥ�ϱ�");
	}
}

class casting_Test2{
	public static void main(String ar[]) {
		Shape3 s=new Shape3();
		s.draw();//�����׸���
		s.painting();//����

		Circle2 c1=new Circle2();
			c1.draw();//���׸���
			c1.painting();//��ĥ�ϱ�

		Shape3 s2=c1;//��ĳ����
			s2.draw();//���׸���
			s2.painting();//����
	}
}