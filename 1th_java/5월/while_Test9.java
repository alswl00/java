//2~9�� ���
class while_Test9 {
	public static void main(String ar[]) {
		int i=2;
		while (i<=9) {
			System.out.println(i+"��");
			int j=1;
			while (j<=9) {
				System.out.println(i+"*"+j+"="+i*j);
				j++;
			}
			i++;
			System.out.println("");
		}
	}
}