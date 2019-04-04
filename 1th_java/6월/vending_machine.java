import java.util.*;
class vending_machine {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
			String d;String a="";
			int m=0; int change=0; int i2=0; int n=0;
			System.out.println();
			System.out.println("-------------------------------------------------");
			System.out.println("1.콜라(600원) 2.커피(300원) 3.물(500원) 4.보리차(700원)");
			System.out.println("-------------------------------------------------");
			System.out.println();
			
			System.out.print("금액을 입력하세요 : ");
			int i=sc.nextInt();
			do{
				int c1000=0;int c500=0; int c100=0; int c10=0;
				System.out.print("음료를 선택하세요 : ");
				int j=sc.nextInt();
				System.out.print("갯수를 입력하세요 : ");
				int c=sc.nextInt();
				System.out.println("-------------------------------------------------");
				if(c==0||c<0) {
					System.out.println("뽑으실 수 있는 음료가 없습니다.");
					return;
				}
			
				switch(j) {
					case 1:d="콜라";m=600;break;
					case 2:d="커피";m=300;break;
					case 3:d="물";m=500;break;
					case 4:d="보리차";m=700;break;
					default :System.out.println("음료를 뽑으시려면 1~4 중 입력해 주십시오");continue;
				}
				
				
				if(i==0) {
					System.out.println("뽑으신 음료는 "+d+" "+c+"개 입니다.");
					System.out.println("-------------------------------------------------");
					return;
				}
				else if(change<0||i<m*c) {
					//i+=m*c;
					System.out.println("잔돈이 부족합니다.");
					System.out.print("추가로 돈을 넣으시겠습니까? (y/n) : ");
					String a2=sc.next();
					if(a2.equals("y")) {
						System.out.print("추가로 넣으실 금액을 입력하세요 : ");
						i2=sc.nextInt();
						i+=i2;
						System.out.println();
						//System.out.println("잔돈은 "+i+"원입니다.");
						//continue;
						}
					else {
						return;
					}
				}
				i-=m*c; change=i;
				System.out.println("뽑으신 음료는 "+d+" "+c+"개이며 거스름돈은 "+i+"원입니다.");
			
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
				System.out.print("1000원 : "+c1000+"	"+"500원 : "+c500+"	"+"100원 : "+c100+"	"+"10원 : "+c10);
				System.out.println("");
				System.out.println("-------------------------------------------------");
	
				System.out.print("추가선택하시겠습니까? (y/n) : ");
				a=sc.next();
				if(a.equals("y")) {
					System.out.println("");
					System.out.println("잔돈은 "+i+"원입니다.");	
				}
				else {
					return;
				}
			}while(a.equals("y"));
	}
}	