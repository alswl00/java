import java.util.*;
class Product {
	private String name;
	private int price;
	private int count;

	public Product(String n, int p, int c) {
		name=n;
		price=p;
		count=c;
	}

	public void setName(String n) {
		name=n;
	}
	public void setPrice(int p) {
		price=p;
	}
	public void setCount(int c) {
		count=c;
	}

	public String getName() {
		return name;
	}
	public int getPrice() {
		return price*count;
	}
	public int getCount() {
		return count;
	}

	public void pr() {
		System.out.println("이름: "+name+", 가격: "+price);
	}

}


class DiscountProduct extends Product{

	private int discount;

	DiscountProduct(String name, int price, int count,int discount) {
		super(name,price,count);
		this.discount=discount;
	}

	public void setName(String n) {
		super.setName(n);
	}
	public void setPrice(int p) {
		super.setPrice(p);
	}
	public void setCount(int c) {
		super.setCount(c);
	}
	public void setDiscount(int d) {
		discount=d;
	}

	public String getName() {
		return super.getName();
	}
	public int getPrice() {
		return super.getPrice()-(super.getPrice()*20/100);
	}
	public int getCount() {
		return super.getCount();
	}
	public int getDiscount() {
		return discount;
	}

	public void pr() {
		System.out.println("이름: "+getName()+", 가격: "+getPrice());
	}	


}

class Product_main {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		String name;
		int price, count, discount;
		name=sc.next();
		price=sc.nextInt();
		count=sc.nextInt();
		discount=sc.nextInt();
		Product p=new Product(name,price,count);
		DiscountProduct d=new DiscountProduct(name,price,count,discount);
		
		d.setName(name);
		d.setPrice(price);
		d.setCount(count);
		d.setDiscount(discount);
		d.pr();
		p.pr();
	}
}