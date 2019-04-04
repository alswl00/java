//알파벳 대문자를 소문자로 변환하여 출력
class while_Test8 {
	public static void main(String ar[]) {
		char i=65;
		while(i<=90) {
			char c=(char)(i+32);
			System.out.println(c);
			i++;
		}
	}
}
