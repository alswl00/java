class extend_Test5 {
	public static void main(String ar[]) {
		Circle c=new Circle();
		Rect r=new Rect();
		Diamond d=new Diamond();
		c.setArea(8);
		r.setArea(1,6);
		d.setArea(7,8);

		System.out.println("���� ���� : "+c.getArea());
		System.out.println("���簢�� ���� : "+r.getArea());
		System.out.println("����纯�� ���� : "+d.getArea());
	}
}