import java.util.*;
class Product {
	private String id;
	private String info;//����
	private String maker;//������
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

	public void show(){	//������� ��ü���
		System.out.println("��ǰid : "+id+"\n��ǰ���� : "+info+"\n������ : "+maker+"\n���� : "+price);
	}
}


class Book extends Product{
	private String title;
	private String author;
	private String isbn;	//���ڵ� ����

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
		System.out.println("å���� : "+title+"\n���� : "+author+"\nisbn : "+isbn+"\n");
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
		System.out.println("�뷡 ���� : "+titlesong+"\n���� : "+singer+"\n");
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
		System.out.println("���� : "+topic+"\n�ܿ� : "+unit+"\n");
	}
}

class Product_main{
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		Product p[]=new Product[10];
		int main_choice,count=0,num,price,unit;
		String id,info,maker,title,author,isbn,song,singer,topic;
		while(true) {
			System.out.print("==��ǰ�߰�<1>, ��ǰ��ȸ<2>, ������<3>==");
			main_choice=sc.nextInt();
			if(main_choice==1) {
				System.out.print("��ǰ���� å<1>, ����CD<2>, ȸȭå<3>>>");
				num=sc.nextInt();
				switch(num) {
					case 1: 
						System.out.print("��ǰID>>");
						id=sc.next();
						System.out.print("��ǰ����>>");
						info=sc.next();
						System.out.print("������>>");
						maker=sc.next();
						System.out.print("����>>");
						price=sc.nextInt();
						System.out.print("å����>>");
						title=sc.next();
						System.out.print("����>>");
						author=sc.next();
						System.out.print("ISBN>>");
						isbn=sc.next();
						p[count]=new Book(id,info,maker,price,title,author,isbn);
						p[count].show();
						count++;
						break;
					case 2:
						System.out.print("��ǰID>>");
						id=sc.next();
						System.out.print("��ǰ����>>");
						info=sc.next();
						System.out.print("������>>");
						maker=sc.next();
						System.out.print("����>>");
						price=sc.nextInt();
						System.out.print("�뷡����>>");
						song=sc.next();
						System.out.print("����>>");
						singer=sc.next();
						p[count]=new Music(id,info,maker,price,song,singer);
						p[count].show();
						count++;
						break;
					case 3:
						System.out.print("��ǰID>>");
						id=sc.next();
						System.out.print("��ǰ����>>");
						info=sc.next();
						System.out.print("������>>");
						maker=sc.next();
						System.out.print("����>>");
						price=sc.nextInt();
						System.out.print("����>>");
						topic=sc.next();
						System.out.print("�ܿ�>>");
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