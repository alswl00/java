class Circle extends Shape2 {
	int r;
	public void setArea(int r) {
		this.r=r;
	}
	public int getArea() {
		return (int)(r*r*3.14);
	}
}