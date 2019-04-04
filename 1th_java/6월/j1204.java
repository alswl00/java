import java.util.*;
class j1204 {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		String n[]=new String [5];
		String s;
		int score[]=new int [5]; 
		int t=0,min=0,max=0,v=0; float av;
		System.out.println("5개의 과목명을 입력하세요>>:");
		for(int i=0;i<n.length;i++) 
			n[i]=sc.next();
		System.out.println();
		System.out.println("========================");

		System.out.println("5개의 점수를 입력하세요>>:");
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
		
		System.out.println("과목 총점>>"+t);
		System.out.println("과목 평균>>"+av);
		System.out.println("최고점수>>"+max);
		System.out.println("최저점수>>"+min);
		System.out.println();
		System.out.println("========================");
	

		while(true){
			System.out.print("검색할 과목명을 입력하세요: ");
			s=sc.next();

			for(int i=0;i<n.length;i++) {
				if(s.equals(n[i]))
					v=score[i];
				else if(s.equals("그만"))
					return;
			}

			System.out.println(s+"의 점수: "+v);
			
		}
	}
}