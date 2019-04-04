//4.입력받은 두 정수 사이에서 3의배수이거나 7의 배수인 수들의 합, 평균 출력
class Param_Test8 {
	public static void main(String ar[]) { 
		int n=Integer.parseInt(ar[0]);
		int m=Integer.parseInt(ar[1]);
		int b,s,sum=0,count;

		if(n>m) {
			b=n;s=m;
		}
		else {
			b=m;s=n;
		}

		for(count=0;s<=b;s++) {
			if(s%3==0 || s%7==0) {
				sum+=s;	
				count++;
			}
		}
		System.out.println("합 : "+sum+" 평균 : "+((float)sum/count));
	}
}