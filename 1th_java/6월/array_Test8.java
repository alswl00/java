//5번
//10개의 double 입력받아 평균출력
import java.util.*;
class array_Test8 {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		double sum=0;
		double d[]=new double[10];

		for(int i=0;i<d.length;i++) {
			d[i]=sc.nextDouble();
			sum+=d[i];
		}
		System.out.println("평균 : "+sum/d.length);
	}
}