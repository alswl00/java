//15. 두개의 정수를 입력받아 두 수를 포함한 정수 사이에 3의배수이거나 5의 배수인 수들의 합,평균 출력
class Param_Test14 {
	public static void main(String ar[]) {
		int a=Integer.parseInt(ar[0]);
		int b=Integer.parseInt(ar[1]);
		int small,big,sum=0,count=0;

		if(a>b) {
			small=b;big=a;
		}
		else {
			small=a;big=b;
		}

		for(;small<=big;small++,count++) {
			if(small%3==0 || small%5==0) 
				sum+=small;
		}
		System.out.println("합 : "+sum+"	 평균 : "+(float)sum/count);
	}
}