class Sports_ {
	public static void main(String ar[]) {
		BaseBall base = new BaseBall("BaseBall",9);
		BasketBall basket = new BasketBall("BasketBall",5);
		System.out.println("��� ���� : "+base.getName());
		System.out.println("��� �ο� : "+base.getPlayer()+"��");
		System.out.print("��� ���� : ");
		base.rule();
		System.out.println();

		System.out.println("��� ���� : "+basket.getName());
		System.out.println("��� �ο� : "+basket.getPlayer()+"��");
		System.out.print("��� ���� : ");
		basket.rule();
	}
}