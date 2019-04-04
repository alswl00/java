class Wine2 {
	private String manufacturer;
	private String name;
	private String country;
	private String region;
	private String kind;
	private int year;
	private int grade;

	Wine2(String manufacturer, String name, String country, String region, String kind, int year, int grade) {
		this(manufacturer, name);
		this.country=country;
		this.region=region;
		this.kind=kind;
		this.year=year;
		this.grade=grade;
	}

	Wine2(String manufacturer, String name){ 
		this.manufacturer=manufacturer;
		this.name=name;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public String getName() {
		return name;
	}
	public String getCountry() {
		return country;
	}
	public String getRegion() {
		return country;
	}
	public String getKind() {
		return kind;
	}
	public int getYear() {
		return year;
	}
	public int getGrade() {
		return grade;
	}
}