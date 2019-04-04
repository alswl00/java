class extend_Test5 {
	public static void main(String ar[]) {
		Circle c=new Circle();
		Rect r=new Rect();
		Diamond d=new Diamond();
		c.setArea(8);
		r.setArea(1,6);
		d.setArea(7,8);

		System.out.println("원의 넓이 : "+c.getArea());
		System.out.println("직사각형 넓이 : "+r.getArea());
		System.out.println("평행사변형 넓이 : "+d.getArea());
	}
}