import java.util.*;
class water_rent{
	Scanner sc=new Scanner(System.in);
	public int menu() {
		int choice;
		System.out.println("-------Menu-------");
		System.out.println("1. ������(liter�� 50��)");
		System.out.println("2. �����(liter�� 45��)");
		System.out.println("3. ������(liter�� 30��)");
		System.out.println("---------------------");
		System.out.print("�޴��� �����ϼ���=>");
		choice=sc.nextInt();
		System.out.println("---------------------");
		return choice;
	}
	public int liter() {
		int 
		System.out.print("��뷮�� �Է��ϼ���(liter)=>");
		
}

class water_rent_main {
	public static void main(String ar[]) {
	Scanner sc=new Scanner(System.in);
		water_rent w=new water_rent();
		int choice;
		w.menu();
		
	}
}