class SmartPhone_main {
	public static void main(String ar[]) {
		SmartPhone s=new SmartPhone("s��",1000000,"2g","�ȵ���̵�");
		s.setOper_version("10.0.1");
		s.setMemorysize("32GB");
		s.setCamera(true);
		s.setBluetooth(true);
		System.out.println(s.getProducer()+" "+s.getPrice()+" "+s.getCommu_type()+" "+s.getOper_type()+" "+s.getOper_version()+" "+s.getMemorysize()+" "+s.getCamera()+" "+s.getBluetooth());
	}
}