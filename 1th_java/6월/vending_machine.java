import java.util.*;
class vending_machine {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
			String d;String a="";
			int m=0; int change=0; int i2=0; int n=0;
			System.out.println();
			System.out.println("-------------------------------------------------");
			System.out.println("1.�ݶ�(600��) 2.Ŀ��(300��) 3.��(500��) 4.������(700��)");
			System.out.println("-------------------------------------------------");
			System.out.println();
			
			System.out.print("�ݾ��� �Է��ϼ��� : ");
			int i=sc.nextInt();
			do{
				int c1000=0;int c500=0; int c100=0; int c10=0;
				System.out.print("���Ḧ �����ϼ��� : ");
				int j=sc.nextInt();
				System.out.print("������ �Է��ϼ��� : ");
				int c=sc.nextInt();
				System.out.println("-------------------------------------------------");
				if(c==0||c<0) {
					System.out.println("������ �� �ִ� ���ᰡ �����ϴ�.");
					return;
				}
			
				switch(j) {
					case 1:d="�ݶ�";m=600;break;
					case 2:d="Ŀ��";m=300;break;
					case 3:d="��";m=500;break;
					case 4:d="������";m=700;break;
					default :System.out.println("���Ḧ �����÷��� 1~4 �� �Է��� �ֽʽÿ�");continue;
				}
				
				
				if(i==0) {
					System.out.println("������ ����� "+d+" "+c+"�� �Դϴ�.");
					System.out.println("-------------------------------------------------");
					return;
				}
				else if(change<0||i<m*c) {
					//i+=m*c;
					System.out.println("�ܵ��� �����մϴ�.");
					System.out.print("�߰��� ���� �����ðڽ��ϱ�? (y/n) : ");
					String a2=sc.next();
					if(a2.equals("y")) {
						System.out.print("�߰��� ������ �ݾ��� �Է��ϼ��� : ");
						i2=sc.nextInt();
						i+=i2;
						System.out.println();
						//System.out.println("�ܵ��� "+i+"���Դϴ�.");
						//continue;
						}
					else {
						return;
					}
				}
				i-=m*c; change=i;
				System.out.println("������ ����� "+d+" "+c+"���̸� �Ž������� "+i+"���Դϴ�.");
			
				while(i>0) {
					if(i>=1000) {
						c1000++;i-=1000;
					}
					else if(i>=500) {
						c500++;i-=500;
					}
					else if(i>=100) {
						c100++;i-=100;
					}
					else {
						c10++;i-=10;
					}
				}i=change;
				System.out.print("1000�� : "+c1000+"	"+"500�� : "+c500+"	"+"100�� : "+c100+"	"+"10�� : "+c10);
				System.out.println("");
				System.out.println("-------------------------------------------------");
	
				System.out.print("�߰������Ͻðڽ��ϱ�? (y/n) : ");
				a=sc.next();
				if(a.equals("y")) {
					System.out.println("");
					System.out.println("�ܵ��� "+i+"���Դϴ�.");	
				}
				else {
					return;
				}
			}while(a.equals("y"));
	}
}	