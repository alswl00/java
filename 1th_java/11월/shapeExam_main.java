import java.util.*;
abstract class ShapeExam2 {
	public abstract double getArea();
	public abstract double getCircum();
}

class shapecircle extends ShapeExam2{
	Scanner sc=new Scanner(System.in);
	int r=sc.nextInt();
	double area=3.14*r*r;
	double circum=2*3.14*r;
	public double getArea() {
		return area;
	}
	public double getCircum() {
		return circum;
	}
}

class shapeExam_main{
	public static void main(String ar[]) {
		shapecircle s=new shapecircle();
		System.out.println("���� �ѷ� : "+s.getArea());
		System.out.println("���� ���� : "+s.getCircum());
	}
}