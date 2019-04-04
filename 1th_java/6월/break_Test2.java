//1~10에서 1,2,3,4 출력
class break_Test2 {
	public static void main(String ar[]) {
		for(int i=1;i<=10;i++) {
			System.out.println(i);
			if(i>=4) {
				break;
			}
		}
	}
}