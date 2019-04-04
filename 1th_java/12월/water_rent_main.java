import java.util.*;
class water_rent{
	Scanner sc=new Scanner(System.in);
	public int menu() {
		int choice;
		System.out.println("-------Menu-------");
		System.out.println("1. 가정용(liter당 50원)");
		System.out.println("2. 상업용(liter당 45원)");
		System.out.println("3. 공업용(liter당 30원)");
		System.out.println("---------------------");
		System.out.print("메뉴를 선택하세요=>");
		choice=sc.nextInt();
		System.out.println("---------------------");
		return choice;
	}
	public int liter() {
		int 
		System.out.print("사용량을 입력하세요(liter)=>");
		
}

class water_rent_main {
	public static void main(String ar[]) {
	Scanner sc=new Scanner(System.in);
		water_rent w=new water_rent();
		int choice;
		w.menu();
		
	}
}