class Wine{
	private String manufacturer;
	private String name;
	private String country;
	private String region;
	private String kind;
	private int year;
	private int grade;

	Wine(){};
	
	Wine(String manufacturer, String name) {
		this.manufacturer=manufacturer;
		this.name=name;
	}

	public static void main(String ar[]) {
		Wine w1=new Wine();
		Wine w2=new Wine("1","2");
	}
}