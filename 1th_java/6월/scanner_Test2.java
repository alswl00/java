//철수, 영희 가위바위보
//if(c.equals(y)) {   =>c가 y랑 같은지 비교
import java.util.*;
class scanner_Test2 {
	public static void main(String ar[]) {
	Scanner sc=new Scanner(System.in);
	System.out.print("철수>>");
	String c=sc.next();
	System.out.print("영희>>");
	String y=sc.next();
	String s;
	
	if(c.equals(y)) {
		s="비겼습니다.";
	}
	else if(c.equals("가위")) {
		switch (y) {
			case "바위":s="영희 승";break;
			case "보":s="철수 승";break;
			default :s="가위, 바위, 보 중에서 입력해 주시길 바랍니다.";
		}
	}
	else if(c.equals("바위")) {
		switch(y) {
			case "가위":s="철수 승";break;
			case "보":s="영희 승";break;
			default :s="가위, 바위, 보 중에서 입력해 주시길 바랍니다.";
		}
	}
	else if(c.equals("보")) {
		switch(y) {
			case "가위":s="영희 승";break;
			case "바위":s="철수 승";break;
			default :s="가위, 바위, 보 중에서 입력해 주시길 바랍니다.";
		}
	}
	else {
		s="승패를 알 수 없습니다.";
	}

	System.out.println(s);
	}
}