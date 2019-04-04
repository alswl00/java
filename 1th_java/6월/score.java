import java.util.*;
class score {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		int score[][]=new int[5][7];
		int v1[][]=new int [5][7];
		String name[]=new String[5];
		float av;
		int v;
		System.out.println("이름 학번 국어 영어 수학");

		for(int i=0;i<score.length;i++){
			name[i]=sc.next();
			score[i][0]=sc.nextInt();
			for(int j=1;j<score.length-1;j++) {
				score[i][j]=sc.nextInt();
				score[i][4]+=score[i][j];
				score[i][5]=score[i][4]/3;
			}
			score[i][6]=1;
		}

		for(int i=0;i<score.length;i++) {
			for(int j=0;j<score.length;j++) {
				if(score[i][4]>score[j][4]) {
					score[j][6]++;
				}
			}
		}
		

		for(int i=0;i<score.length;i++) {
			for(int j=i+1;j<score.length;j++) {
				if(score[i][4]<score[j][4]) {
					v1[j]=score[i];
					score[i]=score[j];
					score[j]=v1[j];
				}
			}
		}
		
		System.out.println("---------------------------------------------");
		System.out.println("|  이름|  학번|국어|영어|수학| 총점|평균|석차|");
		System.out.println("---------------------------------------------");
		for(int i=0;i<score.length;i++) {
			System.out.print("|"+name[i]);
			for(int j=0;j<score[0].length;j++) {
				System.out.print("|  "+v1[i][j]);
			}
			System.out.println();
			System.out.println("---------------------------------------------");
		}
	}
}