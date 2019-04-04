class sum2 {
	public void sum(int x) {
		int sum=0;
		for(int i=1;i<=x;i++)
			sum+=i;
		System.out.println(sum);
	}
	public static void main(String ar[]) {
		sum2 s=new sum2();
		s.sum(5);
	}
}