class Magazine extends Book2 {
	String date;

	Magazine(String title, int page, String author) {
		super(title, page, author);
		this.title=title;
		this.page=page;
		this.author=author;
	}

	public void setDate(String date) {
		this.date=date;
	}

	public String getTitle() {
		return title;
	}
	public int getPage() {
		return page;
	}
	public String getAuthor() {
		return author;
	}
	public String getDate() {
		return date;
	}
}