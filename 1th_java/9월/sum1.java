class sum1 {
	public void sum() {
		int sum=0;
		for(int i=1;i<=5;i++)
			sum+=i;
		System.out.println(sum);
	}
	public static void main(String ar[]) {
		sum1 s1=new sum1();
		s1.sum();
	}
}