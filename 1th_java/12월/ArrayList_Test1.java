import java.util.*;

class ArrayList_Test1 {
	public static void main(String ar[]) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("apple");
		list.add("mango");
		list.add("melon");
		list.add("grape");
		list.add(null);
		//list.add(3);
		list.add(2,"strawberry");

		System.out.println(list.get(3)); //melon

		list.remove(2);

		System.out.println(list.size());

		System.out.println(list.indexOf("mango"));

		//System.out.println(list);

		/*for(String fruit: list) {
			System.out.println(fruit);
		}//for-each문*/

		Iterator<String> it=list.iterator();//객체 생성
		while(it.hasNext()) {				//다음 데이터가 있으면
			String s=it.next();				//데이터를 s에 대입
			System.out.print(s+"\t");
		} //가장 많이 사용


	}
}