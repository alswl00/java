class Book {
	private String title;
	private String author;
	private String publish;//√‚∆«ªÁ
	private int price;

	Book(String title, String author, String publish,int price){
		this.title=title;
		this.author=author;
		this.publish=publish;
		this.price=price;
	}

	Book(String title, String publish, int price) {
		this.title=title;
		this.publish=publish;
		this.price=price;
	}

	Book(String title,int price) {
		this.title=title;
		this.price=price;
	}

	Book(){}

	public String sell(String s) {
		return s;
	}

	public String buy(String b) {
		return b;
	}

	public void setAuthor(String a) {
		System.out.println(a);
	}

	public void setTitle(String t) {
		System.out.println(t);
	}

	public String getAuthor() {
		return author;
	}
	
	public String getTitle() {
		return title;
	}

	public static void main(String ar[]) {
		Book b1=new Book("A","a","aa",100);
		Book b2=new Book("B","bb",200);
		Book b3=new Book("C",300);
		Book b4=new Book();

		b4.setAuthor("dd");
		b4.setTitle("D");
		System.out.println(b4.getAuthor());
		System.out.println(b4.getTitle());
	}
}