class Magazine_main {
	public static void main(String ar[]) {
		Magazine m=new Magazine("Little_Prince",200,"author");
		m.setDate("2011.5.6");
		System.out.println(m.getTitle()+" "+m.getPage()+" "+m.getAuthor()+" "+m.getDate()+" ");
	}
}