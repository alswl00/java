//5개 숫자 입력받아서 selection sort 하기
class Param_Test3 {
	public static void main(String ar[]) {
		int temp;
		int a[]=new int [5];
		for(int i=0;i<a.length;i++)
			a[i]=Integer.parseInt(ar[i]);

		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}