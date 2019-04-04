//4.100~999 사이에 4의 배수가 아닌 수들의 갯수와 합
class array_Test17 {
	public static void main(String ar[]) {
		int a[]=new int[900];
		int count=0,sum=0;
		for(int i=0;i<a.length;i++) {
			a[i]=i+100;
			if(a[i]%4!=0) {
				count++;
				sum+=a[i];
			}
		}
		System.out.println("갯수 : "+count+"	합 : "+sum);
	}
}