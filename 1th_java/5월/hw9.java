//1���� 100������ ���� �� 4�� ��� �� �ٿ� 8���� ���
class hw9 {
	public static void main(String ar[]) {
		 int a=0;
		 for (int i=4; i<=100; i++){
			 if(i%4==0){
				 a++;
				 if(a%8==0){
				 System.out.println(i+" ");
					 }
				 else {
				 System.out.print(i+" ");
					 }
			 }
		 }
	}
}