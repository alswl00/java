import java.util.*;
class Product {
	private String id;
	private String info;//설명
	private String maker;//생산자
	private int price;
	Product(String id,String info,String maker, int price) {
		this.id=id;
		this.info=info;
		this.maker=maker;
		this.price=price;
	}

	public void setId(String i) {
		id=i;
	}

	public void setInfo(String in){
		info=in;
	}

	public void setMaker(String m){
		maker=m;
	}

	public void setPrice(int p) {
		price=p;
	}

	public String getId() {
		return id;
	}

	public String getInfo() {
		return info;
	}

	public String getMaker() {
		return maker;
	}

	public int getPrice(){
		return price;
	}

	public void show(){	//멤버변수 전체출력
		System.out.println("상품id : "+id+"\n상품설명 : "+info+"\n생산자 : "+maker+"\n가격 : "+price);
	}
}


class Book extends Product{
	private String title;
	private String author;
	private String isbn;	//바코드 숫자

	Book(String id,String i,String m, int p, String t, String a, String is) {
		super(id,i,m,p);
		this.title=t;
		this.author=a;
		this.isbn=is;
	}

	public void setTitle(String t){
		title=t;
	}

	public void setAuthor(String a) {
		author=a;
	}

	public void setIsbn(String i) {
		isbn=i;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getIsbn() {
		return isbn;
	}
	public void show() {
		super.show();
		System.out.println("책제목 : "+title+"\n저자 : "+author+"\nisbn : "+isbn+"\n");
	}
}

class Music extends Product {
	String titlesong;
	String singer;
	Music(String i,String in,String m, int p, String t, String s) {
		super(i,in,m,p);
		this.titlesong=t;
		this.singer=s;
	}
	public void setTitlesong(String t) {
		this.titlesong=t;
	}
	public void setSinger(String s) {
		singer=s;
	}
	public String getTitlesong() {
		return titlesong;
	}
	public String getSinger() {
		return singer;
	}
	public void show() {
		super.show();
		System.out.println("노래 제목 : "+titlesong+"\n가수 : "+singer+"\n");
	}
}

class Conversation extends Product{
	String topic;
	int unit;
	Conversation(String i,String in,String m, int p, String t, int u) {
		super(i,in,m,p);
		this.topic=t;
		this.unit=u;
	}
	public void setTopic(String t) {
		this.topic=t;
	}
	public void setUnit(int u) {
		unit=u;
	}
	public String getTopic() {
		return topic;
	}
	public int getUnit() {
		return unit;
	}
	public void show() {
		super.show();
		System.out.println("주제 : "+topic+"\n단원 : "+unit+"\n");
	}
}

class Product_main{
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		Product p[]=new Product[10];
		int main_choice,count=0,num,price,unit;
		String id,info,maker,title,author,isbn,song,singer,topic;
		while(true) {
			System.out.print("==상품추가<1>, 상품조회<2>, 끝내기<3>==");
			main_choice=sc.nextInt();
			if(main_choice==1) {
				System.out.print("상품종류 책<1>, 음악CD<2>, 회화책<3>>>");
				num=sc.nextInt();
				switch(num) {
					case 1: 
						System.out.print("상품ID>>");
						id=sc.next();
						System.out.print("상품설명>>");
						info=sc.next();
						System.out.print("생산자>>");
						maker=sc.next();
						System.out.print("가격>>");
						price=sc.nextInt();
						System.out.print("책제목>>");
						title=sc.next();
						System.out.print("저자>>");
						author=sc.next();
						System.out.print("ISBN>>");
						isbn=sc.next();
						p[count]=new Book(id,info,maker,price,title,author,isbn);
						p[count].show();
						count++;
						break;
					case 2:
						System.out.print("상품ID>>");
						id=sc.next();
						System.out.print("상품설명>>");
						info=sc.next();
						System.out.print("생산자>>");
						maker=sc.next();
						System.out.print("가격>>");
						price=sc.nextInt();
						System.out.print("노래제목>>");
						song=sc.next();
						System.out.print("가수>>");
						singer=sc.next();
						p[count]=new Music(id,info,maker,price,song,singer);
						p[count].show();
						count++;
						break;
					case 3:
						System.out.print("상품ID>>");
						id=sc.next();
						System.out.print("상품설명>>");
						info=sc.next();
						System.out.print("생산자>>");
						maker=sc.next();
						System.out.print("가격>>");
						price=sc.nextInt();
						System.out.print("주제>>");
						topic=sc.next();
						System.out.print("단원>>");
						unit=sc.nextInt();
						p[count]=new Conversation(id,info,maker,price,topic,unit);
						p[count].show();
						count++;
						break;
				}
			}
			else if(main_choice==2) {
				for(int i=0;i<count;i++)
					p[i].show();
					
			}
			else {
				System.exit(0);
			}
		}
	}
}