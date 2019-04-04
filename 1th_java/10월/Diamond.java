class Diamond extends Shape2 {
	public void setArea(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public int getArea() {
		return x*y/2;
	}
}