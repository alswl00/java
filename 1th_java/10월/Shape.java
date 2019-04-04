class Shape {
	private int width;
	private int height;

	Shape(int width, int height) {
		this.width=width;
		this.height=height;
	}

	public void setWidth(int w) {
		this.width=w;
	}

	public void setHeight(int h) {
		this.height=h;
	}

	public int getArea(int x, int y) {
		return ((x*y)/2);
	}

	public double getArea(double x,double y) {
		return (x*y);
	}

	public static void main(String ar[] ) {
		Shape s1=new Shape(3,5);
		Shape s2=new Shape(6,2);

		s1.setWidth(9);
		s2.setHeight(10);

		System.out.println(s1.getArea(5,10));
		System.out.println(s2.getArea(6.3,6.9));
	}
}