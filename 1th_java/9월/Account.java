import java.util.*;
class Account {
	Scanner sc=new Scanner(System.in);
	private String account_No="12345678";//계좌번호
	private String owner="미림";//예금주
	private int passwd=1111;//비밀번호
	private int balance=10000;//잔고
	int change=balance;

	private String setaccount_No(String account){
		if(!(account.equals(account_No))) {
			System.out.print("계좌번호가 틀렸습니다. 다시 입력하시겠습니까?(Y/N)>>");
			return (sc.next());
		}
		else return "";
	}//12345678

	private int setpasswd(){
		int i=1,pw;
		String answer;
		while(i<=3){
		System.out.print("비밀번호를 입력해주세요>>");
			pw=sc.nextInt();
			if(pw!=passwd){
				System.out.println(i+"회 오류(3회 오류시 정지됩니다)");
				if(i==3) return 0;
				System.out.print("다시 입력하시겠습니까?(Y/N)>>");
				answer=sc.next();
				if (answer.equals("N")) return 0;
				i++;
			}
			else return 1;
		}
		return 1;
	}//1111

	private int deposit() {
		int money;
		System.out.print("입금할 금액을 입력해주세요>>");
		money=sc.nextInt();
		change+=money;
		return money;
	}//입금

	private int widthDraw() {
		char answer;
		int money;
		System.out.print("출금할 금액을 입력해주세요(잔액 : "+change+")>>");
		money=sc.nextInt();
		change-=money;
		return money;
	}//출금

	private String YESorNO(String ask) {
		System.out.print(ask);
		return (sc.next());
	}
	
	private void prt(String account, String owner, int money){
		System.out.println();
		System.out.println("========================================");
		System.out.println("계좌번호 : "+account);
		System.out.println("예금주 : "+owner);
		System.out.println("입금할 금액 : "+money);
		System.out.println("통장의 잔액 : "+change);
		System.out.println();
	}
	
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		Account ac=new Account();
		String answer;
		String qustion;
		String account;
		int money=0,pw;
		do{
			System.out.print("계좌번호를 입력하세요>>");
			account=sc.next();//계좌번호
			answer=ac.setaccount_No(account);
		}while(answer.equals("Y"));
		
		System.out.print("예금주를 입력하세요>>");
		String owner=sc.next();//예금주

		pw=ac.setpasswd();
		if(pw==0) return;
		
		answer="Y";
		while(answer.equals("Y")){
			System.out.print("입금/출금/잔액확인>>");
			qustion=sc.next();
			if(qustion.equals("입금")){//입금처리 후 "다시입력하시갰습니까?"문장이 뜸
				money=ac.deposit();
			}
			else if(qustion.equals("출금")){
				money=ac.widthDraw();
				if(ac.change<0){
					answer=ac.YESorNO("잔액이 부족합니다. 다시 입력하시겠습니까?(Y/N)>>");
					ac.change+=money;
					continue;
				}	
			}
			else if(qustion.equals("잔액확인")){
				System.out.println("잔액은 "+ac.change+"원입니다");
				answer=ac.YESorNO("추가 입금|출금/잔액확인 하기(Y/N)>>");
				continue;
			}
			else answer=ac.YESorNO("다시 입력하시겠습니까?(Y/N)>>");

			if(answer.equals("N")) return;
			ac.prt(account, owner, money);
			answer=ac.YESorNO("추가 입금|출금/잔액확인 하기(Y/N)>>");
		}
	}
}