import java.util.*;
class j1204 {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		String n[]=new String [5];
		String s;
		int score[]=new int [5]; 
		int t=0,min=0,max=0,v=0; float av;
		System.out.println("5���� ������� �Է��ϼ���>>:");
		for(int i=0;i<n.length;i++) 
			n[i]=sc.next();
		System.out.println();
		System.out.println("========================");

		System.out.println("5���� ������ �Է��ϼ���>>:");
		for(int i=0;i<score.length;i++){
			score[i]=sc.nextInt();
			t+=score[i];
		}
		System.out.println();
		System.out.println("========================");

		av=t/score.length;
		for(int i=0;i<score.length;i++) {
				min=score[0];
				if(score[i]<min)
					min=score[i];
				else if(score[i]>max)
					max=score[i];
		}
		
		System.out.println("���� ����>>"+t);
		System.out.println("���� ���>>"+av);
		System.out.println("�ְ�����>>"+max);
		System.out.println("��������>>"+min);
		System.out.println();
		System.out.println("========================");
	

		while(true){
			System.out.print("�˻��� ������� �Է��ϼ���: ");
			s=sc.next();

			for(int i=0;i<n.length;i++) {
				if(s.equals(n[i]))
					v=score[i];
				else if(s.equals("�׸�"))
					return;
			}

			System.out.println(s+"�� ����: "+v);
			
		}
	}
}