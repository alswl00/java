class Wine2_Main {
	public static void main(String ar[]) {
		Wine2 w=new Wine2("제조자","이름","나라","부위","종류",1995,1);
		System.out.println(w.getManufacturer()+" "+w.getName()+" "+w.getCountry()+" "+w.getRegion()+" "+w.getKind()+" "+w.getYear()+" "+w.getGrade());
	}
}