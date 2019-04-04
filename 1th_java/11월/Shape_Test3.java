import java.util.*;
abstract class DObject {
	abstract public void draw();
}
 class Figure extends DObject {
	String type;//circle,line,rect
	public void draw(){
		switch(type) {
			case "Circle" : System.out.println("Circle");break;
			case "Line" : System.out.println("Line");break;
			case "Rect" : System.out.println("Rect");break;
		}
	}
}

class Menu {
	Scanner sc=new Scanner(System.in);
	Figure f[]=new Figure[10];
	Menu(){
		for(int i=0;i<f.length;i++) f[i]=new Figure();
	}
	public void Exit() {
		System.exit(0);	//���α׷� ����
	}
	public void Insert(int i) {	//i�� ���� �������� ����
		System.out.print("�������� Line(1), Rect(2), Circle(3) >>");
		int num=sc.nextInt();
		switch(num) {
			case 1: f[i].type="Line";break;
			case 2: f[i].type="Rect";break;
			case 3: f[i].type="Circle";break;
			default :System.out.println("�߸� �Է��ϼ̽��ϴ�");
		}
	}
	public void Delete(int cnt) {
		System.out.print("������ ������ ��ġ>>");
		int n=sc.nextInt();
		f[n-1].type="";
		for(int i=n-1;i<cnt-1;i++) 
			f[i].type=f[i+1].type;
	}

	public void view(int num) {
		for(int i=0;i<num;i++) 
			f[i].draw();
	}
}



class Shape_Test3 {
	public static void main(String ar[]) {
	Scanner sc=new Scanner(System.in);
		int count=0;	//�ε��� ���� (f[0], f[1]...)
		Menu m=new Menu();
		while(true) {
			System.out.print("����[1], ����[2], ��κ���[3], ����[4]>>");
			int choice=sc.nextInt();
			switch(choice) {
				case 1: 
					m.Insert(count); 
					count++; break;
				case 2: 
					m.Delete(count);count--; break;
				case 3: 
					m.view(count);break;
				case 4:
					m.Exit();break;
			}
		}
	}
}