class person10 {
	String name;
	String addr;
	String tel;

	person10(String name, String addr, String tel) {
		this.name=name;
		this.addr=addr;
		this.tel=tel;
	}

	public void setName(String _name) {
		this.name=_name;
	}
	public void setAddr(String _addr) {
		this.addr=_addr;
	}

	public void setTel(String _tel) {
		this.tel=_tel;
	}
	public String getName() {
		return name;
	}
	public String getAddr() {
		return addr;
	}
	public String getTel() {
		return tel;
	}
}