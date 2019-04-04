class Animal3 {
	private String name;
	private String owner;
	private int leg;

	Animal3(String name, String owner,int leg) {
		this.name=name;
		this.owner=owner;
		this.leg=leg;
	}

	Animal3(String name, String owner) {
		this.name=name;
		this.owner=owner;
	}

	Animal3(String owner, int leg) {
		this.owner=owner;
		this.leg=leg;
	}

	public void setName(String n) {
		System.out.println(n);
	}

	public String getName() {
		return name;
	}
	
	public void setOwner(String o) {
		System.out.println(o);
	}

	public String getOwner() {
		return owner;
	}

	public static void main(String ar[] ) {
		Animal3 a1=new Animal3("cat","mike",4);
		Animal3 a2=new Animal3("dog","alice");
		Animal3 a3=new Animal3("tom",3);

		a3.setName("sheep");
		a2.setOwner("tomas");

		System.out.println(a3.getName());
		System.out.println(a2.getOwner());
	}
}