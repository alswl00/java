class Rectangle {
	private int x1,y1,x2,y2;

	Rectangle(){}

	Rectangle(int x1,int y1,int x2,int y2){
		this.x1=x1;
		this.y1=y1;
		this.x2=x2;
		this.y2=y2;
	}

	public void set(int x1,int y1,int x2,int y2) {
		this.x1=x1;
		this.y1=y1;
		this.x2=x2;
		this.y2=y2;
	}

	public int square() {
		return (int)(x2-x1)*(y2-y1);
		
	}

	public void show() {
		System.out.println();
		System.out.println("x1:"+x1+" x2:"+x2);
		System.out.println("y1:"+y1+" y2:"+y2);
		System.out.println("넓이:"+square());
	}

	public boolean equals(Rectangle r) {
		if(this.square()==r.square())
			return true;
		else return false;
	}

	public static void main(String ar[]) {
		Rectangle r=new Rectangle();
		Rectangle s=new Rectangle(1,1,2,3);
		r.show();
		s.show();
		System.out.println(s.square());
		r.set(-2,2,-1,4);
		r.show();
		System.out.println(r.square());
		if(r.equals(s))
			System.out.println("두 사각형은 같습니다.");
	}
}