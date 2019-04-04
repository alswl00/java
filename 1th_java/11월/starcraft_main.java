import java.util.*;
interface starcraft{
	int MAX=100;
	int MIN=0;

	public String moveable(int x,int y);
	public void attackable();
}

class jurg implements starcraft {
	int xPos=50,yPos=20;//좌표 
	String color="green";//색상
	//String Pos;
	int count;
	public String moveable(int x,int y) {
		xPos+=x;
		yPos+=y;
		if(xPos>MAX) xPos=100;
		else if(yPos>MAX) yPos=100;
		if(xPos<MIN) xPos=0;
		else if(yPos<MIN) yPos=0;
		//Pos="("+xPos+","+yPos+")";
		return "("+xPos+","+yPos+")";
	}
	public void attackable(){
		if(count%4==0) color="green";
		else if(count%4==1) color="blue";
		else if(count%4==2) color="yellow";
		else if(count%4==3) color="white";
	}
}

class teran implements starcraft {
	int xPos=10,yPos=30;//좌표
	String color="rainbow";//색상
	int count;
	public String moveable(int x, int y) {
		xPos+=x;
		yPos+=y;
		if(xPos>MAX) xPos=100;
		else if(yPos>MAX) yPos=100;
		else if(xPos<MIN) xPos=0;
		if(yPos<MIN) yPos=0;
		return "("+xPos+","+yPos+")";
	}
	public void attackable() {
		if(count%4==0) color="transparen";
		else if(count%4==1) color="pupple";
		else if(count%4==2) color="orange";
		else if(count%4==3) color="black";
	}
}

class menu {
	Scanner sc=new Scanner(System.in);
	public int menu_char() {
		int num;
		System.out.println("캐릭터를 선택하시오(1.jurg  2.teran  0.종료)");
		num=sc.nextInt();
		if(num==1) return 1;
		else if(num==2) return 2;
		else return 0;
	}
	public void menu_act(int num) {
		int i;
		System.out.println("1.좌표이동  2.공격  3.뒤로가기");
		i=sc.nextInt();
		if(num==1) {
			if(i==1) j.moveable();
			else if(i==2) j.attackable();
			else break;
		}
		else if(num==2) {
			if(i==1) t.moveable();
			else if(i==2) t.attackable();
			else break;
		}
	}
}

class starcraft_main {
	public static void main(String ar[]) {
	Scanner sc=new Scanner(System.in);
		jurg j=new jurg();
		teran t=new teran();
		menu m=new menu();
		int num;
		int x,y;

		while(1) {
			num=m.menu_char();
			if(num==0) return;
			else if(!(num==1 || num==2)) {
				System.out.println("1,2,0 중에서 입력해주세요");
				continue;
			}
			m.menu_act(num);



		for(int i=0;i<5;i++) {
			System.out.print("좌표를 입력하세요(jurg) : ");
			x=sc.nextInt();
			y=sc.nextInt();
			System.out.println(j.moveable(x,y));
			j.attackable();
			System.out.print("좌표를 입력하세요(teran) : ");
			x=sc.nextInt();
			y=sc.nextInt();
			System.out.println(t.moveable(x,y));
			t.attackable();
		}
	}
}