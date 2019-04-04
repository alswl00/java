class SmartPhone extends Phone{
	String oper_type;
	String oper_version;
	String memorysize;
	boolean camera;
	boolean bluetooth;

	SmartPhone(String producer, int price, String commu_type, String oper_type) {
		super(producer, price, commu_type);
		this.producer=producer;
		this.price=price;
		this.commu_type=commu_type;
		this.oper_type=oper_type;
	}

	public void setProducer(String p) {
		this.producer=p;
	}
	public void setPrice(int p) {
		this.price=p;
	}
	public void setCommu_type(String c) {
		this.commu_type=c;
	}
	public void setOper_type(String ot) {
		this.oper_type=ot;
	}
	public void setOper_version(String ov) {
		this.oper_version=ov;
	}
	public void setMemorysize(String m) {
		this.memorysize=m;
	}
	public void setCamera(boolean c) {
		this.camera=c;
	}
	public void setBluetooth(boolean b) {
		this.bluetooth=b;
	}

	public String getProducer() {
		return producer;
	}
	public int getPrice(){
		return price;
	}
	public String getCommu_type() {
		return commu_type;
	}
	public String getOper_type() {
		return oper_type;
	}
	public String getOper_version() {
		return oper_version;
	}
	public String getMemorysize() {
		return memorysize;
	}
	public boolean getCamera() {
		return camera;
	}
	public boolean getBluetooth() {
		return bluetooth;
	}
}