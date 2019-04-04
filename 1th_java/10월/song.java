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
		System.out.println("�뷡 ���� : "+title);
		System.out.println("���� : "+artist);
		System.out.println("�ٹ� : "+album);
		System.out.println("�۰ : "+composer[0]+", "+composer[1]+", "+composer[2]);
		System.out.println("�⵵ : "+year);
		System.out.println("Ʈ�� ��ȣ : "+track);

	}
	public static void main(String ar[]) {
		song Dancing_Queen=new song("Dancing Queen","ABBA","Arrival",new String[]{"Benny Andersson","Bjorn Ulvaeus","Stig Anderson"},1976,2);
		Dancing_Queen.show();
	}
}