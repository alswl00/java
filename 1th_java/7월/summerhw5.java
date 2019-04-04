//1+(-2)+3+(-4)+... 과 같은 식으로 계속 더할 때 몇까지 더해야 총합이 100이 되는지 구하시오
class summerhw5 {
	public static void main(String ar[]) {
		int i, sum;
		for(i=1, sum=0;sum<100;i++) {
			if(i%2!=0)
				sum+=i;
			else
				sum-=i;
		}
		System.out.println(i);
	}
}