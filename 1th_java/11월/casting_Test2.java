class Shape3 {
	public void draw() {
		System.out.println("도형그리기");
	}
	public void painting() {
		System.out.println("부모 색칠하기");
	}
}
class Circle2 extends Shape3{
	public void draw() {
		System.out.println("원그리기");
	}
	public void painting() {
		System.out.println("색칠하기");
	}
}

class casting_Test2{
	public static void main(String ar[]) {
		Shape3 s=new Shape3();
		s.draw();//도형그리기
		s.painting();//에러

		Circle2 c1=new Circle2();
			c1.draw();//원그리기
			c1.painting();//색칠하기

		Shape3 s2=c1;//업캐스팅
			s2.draw();//원그리기
			s2.painting();//에러
	}
}