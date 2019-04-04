//1~100까지 7의 배수이거나 11의 배수 출력
class hw13 {
	public static void main(String ar[]) {
		for (int i=1; i<=100; i++) {
			if (i%7==0) {System.out.println(i);}
			else if (i%11==0) {System.out.println(i);}
		}
	}
}