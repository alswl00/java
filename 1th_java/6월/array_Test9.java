//배열 5개를 넣고 오름차순 정렬(낮은 숫자가 앞으로)
import java.util.*;
class array_Test9 {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int [5];
		int c;

		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					c=a[i];
					a[i]=a[j];
					a[j]=c;
				}
			}
			System.out.print(a[i]+" ");
		}	
	}
}