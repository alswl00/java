import java.util.*;
class Account {
	Scanner sc=new Scanner(System.in);
	private String account_No="12345678";//���¹�ȣ
	private String owner="�̸�";//������
	private int passwd=1111;//��й�ȣ
	private int balance=10000;//�ܰ�
	int change=balance;

	private String setaccount_No(String account){
		if(!(account.equals(account_No))) {
			System.out.print("���¹�ȣ�� Ʋ�Ƚ��ϴ�. �ٽ� �Է��Ͻðڽ��ϱ�?(Y/N)>>");
			return (sc.next());
		}
		else return "";
	}//12345678

	private int setpasswd(){
		int i=1,pw;
		String answer;
		while(i<=3){
		System.out.print("��й�ȣ�� �Է����ּ���>>");
			pw=sc.nextInt();
			if(pw!=passwd){
				System.out.println(i+"ȸ ����(3ȸ ������ �����˴ϴ�)");
				if(i==3) return 0;
				System.out.print("�ٽ� �Է��Ͻðڽ��ϱ�?(Y/N)>>");
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
		System.out.print("�Ա��� �ݾ��� �Է����ּ���>>");
		money=sc.nextInt();
		change+=money;
		return money;
	}//�Ա�

	private int widthDraw() {
		char answer;
		int money;
		System.out.print("����� �ݾ��� �Է����ּ���(�ܾ� : "+change+")>>");
		money=sc.nextInt();
		change-=money;
		return money;
	}//���

	private String YESorNO(String ask) {
		System.out.print(ask);
		return (sc.next());
	}
	
	private void prt(String account, String owner, int money){
		System.out.println();
		System.out.println("========================================");
		System.out.println("���¹�ȣ : "+account);
		System.out.println("������ : "+owner);
		System.out.println("�Ա��� �ݾ� : "+money);
		System.out.println("������ �ܾ� : "+change);
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
			System.out.print("���¹�ȣ�� �Է��ϼ���>>");
			account=sc.next();//���¹�ȣ
			answer=ac.setaccount_No(account);
		}while(answer.equals("Y"));
		
		System.out.print("�����ָ� �Է��ϼ���>>");
		String owner=sc.next();//������

		pw=ac.setpasswd();
		if(pw==0) return;
		
		answer="Y";
		while(answer.equals("Y")){
			System.out.print("�Ա�/���/�ܾ�Ȯ��>>");
			qustion=sc.next();
			if(qustion.equals("�Ա�")){//�Ա�ó�� �� "�ٽ��Է��Ͻð����ϱ�?"������ ��
				money=ac.deposit();
			}
			else if(qustion.equals("���")){
				money=ac.widthDraw();
				if(ac.change<0){
					answer=ac.YESorNO("�ܾ��� �����մϴ�. �ٽ� �Է��Ͻðڽ��ϱ�?(Y/N)>>");
					ac.change+=money;
					continue;
				}	
			}
			else if(qustion.equals("�ܾ�Ȯ��")){
				System.out.println("�ܾ��� "+ac.change+"���Դϴ�");
				answer=ac.YESorNO("�߰� �Ա�|���/�ܾ�Ȯ�� �ϱ�(Y/N)>>");
				continue;
			}
			else answer=ac.YESorNO("�ٽ� �Է��Ͻðڽ��ϱ�?(Y/N)>>");

			if(answer.equals("N")) return;
			ac.prt(account, owner, money);
			answer=ac.YESorNO("�߰� �Ա�|���/�ܾ�Ȯ�� �ϱ�(Y/N)>>");
		}
	}
}