interface Buyable {
	public int getPrice();
}

class Television implements Buyable {
	String model;
	String maker;
	int price;
	Television(String model,String maker,int p){
		this.model=model;
		this.maker=maker;
		price=p;
	}
	public int getPrice() {
		return price;
	}
}

class Buyable_main {
	public static void main(String ar[]) {
		Television t=new Television("KV-102","LG",300);
		System.out.println("\""+t.model+"\", \""+t.maker+"\", "+t.getPrice());
	}
}