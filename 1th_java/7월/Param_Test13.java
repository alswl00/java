//14. 입력받은 10개의 정수 중 짝수의 개수와 홀수의 개수를 각각 출력
class Param_Test13 {
	public static void main(String ar[]) {
		int a[]=new int[10];
		int c1=0,c2=0;
		
		for(int i=0;i<a.length;i++) {
			a[i]=Integer.parseInt(ar[i]);
			if(a[i]%2!=0) c1++;
			else c2++;
		}
		System.out.println("홀수 : "+c1+"개	짝수 : "+c2+"개");
	}
}