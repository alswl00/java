class BaseBall extends Sports {
	BaseBall(String name,int player) {
		super(name,player);
		this.name=name;
		this.player=player;
	}
	public void rule() {
		System.out.println("3���� �ƿ��̸� ��������");
	}
}