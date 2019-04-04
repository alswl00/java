class song{
	private String title;
	private String artist;
	private String album;
	private String composer[]=new String[3];
	private int year;
	private int track;

	song(String title, String artist, String album, String composer[], int year, int track){
		this.title=title;
		this.artist=artist;
		this.album=album;
		for(int i=0;i<3;i++)
			this.composer[i]=composer[i];
		this.year=year;
		this.track=track;
	}

	public void show(){
		System.out.println("노래 제목 : "+title);
		System.out.println("가수 : "+artist);
		System.out.println("앨범 : "+album);
		System.out.println("작곡가 : "+composer[0]+", "+composer[1]+", "+composer[2]);
		System.out.println("년도 : "+year);
		System.out.println("트랙 번호 : "+track);

	}
	public static void main(String ar[]) {
		song Dancing_Queen=new song("Dancing Queen","ABBA","Arrival",new String[]{"Benny Andersson","Bjorn Ulvaeus","Stig Anderson"},1976,2);
		Dancing_Queen.show();
	}
}