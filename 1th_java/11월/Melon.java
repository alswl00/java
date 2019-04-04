class Melon extends Food {
	String farm;

	Melon(int calorie, int price, int weight) {
		super(calorie, price, weight);
		this.calorie=calorie;
		this.price=price;
		this.weight=weight;
	}

	public void setFarm(String farm) {
		this.farm=farm;
	}

	public int getCalorie() {
		return calorie;
	}
	public int getPrice() {
		return price;
	}
	public int getWeight() {
		return weight;
	}
	public String getFarm() {
		return farm;
	}
}