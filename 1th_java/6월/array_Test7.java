//4번
//5개 입력받아서 최댓값 최솟값 구하기
import java.util.*;
class array_Test7 {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		int i[]=new int[5]; int max=0,min=0;

		for(int j=0;j<i.length;j++) {
			i[j]=sc.nextInt();
			if(j==0) {
				min=i[j];
			}
			if(i[j]>max) {
				max=i[j];
			}
			else if(i[j]<min) {
				min=i[j];
			}
		}
		System.out.println("최댓값 : "+max+"	 최솟값 : "+min);
	}
}