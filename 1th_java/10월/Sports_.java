class Sports_ {
	public static void main(String ar[]) {
		BaseBall base = new BaseBall("BaseBall",9);
		BasketBall basket = new BasketBall("BasketBall",5);
		System.out.println("경기 종목 : "+base.getName());
		System.out.println("경기 인원 : "+base.getPlayer()+"명");
		System.out.print("경기 종목 : ");
		base.rule();
		System.out.println();

		System.out.println("경기 종목 : "+basket.getName());
		System.out.println("경기 인원 : "+basket.getPlayer()+"명");
		System.out.print("경기 종목 : ");
		basket.rule();
	}
}