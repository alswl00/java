class Movie {
	String title;
	String director;
	String producer;
	
	Movie(String title, String director, String producer) {
		this(title,director);
		this.producer=producer;
	}

	Movie(String title, String director) {
		this.title=title;
		this.director=director;
	}
}