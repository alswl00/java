class Dog {
	private String name;
	public String breed;
	private int age;

	Dog(String name, int age) {
		this.name=name;
		this.age=age;
	}
	Dog(String name, String breed, int age) {
		this(name, age);
		this.breed=breed;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setBreed(String breed) {
		this.breed=breed;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public String getBreed() {
		return breed;
	}
	public int getAge() {
		return age;
	}
}