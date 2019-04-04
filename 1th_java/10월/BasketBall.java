class BasketBall extends Sports {
	BasketBall(String name, int player) {
		super(name, player);
		this.name=name;
		this.player=player;
	}
	public void rule() {
		System.out.println("파울이 4개면 퇴장");
	}
}