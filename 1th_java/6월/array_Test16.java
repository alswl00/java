//3. 100~999 사이에 7의 배수의 갯수와 합을 구하세요
class array_Test16 {
	public static void main(String ar[]) {
		int a[]=new int [900];
		int count=0,sum=0;
		for(int i=0;i<a.length;i++) {
			a[i]=i+100;
			if(a[i]%7==0) {
				count++;
				sum+=a[i];
			}
		}
		System.out.println("갯수 : "+count+"	합 : "+sum);
	}
}