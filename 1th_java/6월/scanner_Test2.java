//ö��, ���� ����������
//if(c.equals(y)) {   =>c�� y�� ������ ��
import java.util.*;
class scanner_Test2 {
	public static void main(String ar[]) {
	Scanner sc=new Scanner(System.in);
	System.out.print("ö��>>");
	String c=sc.next();
	System.out.print("����>>");
	String y=sc.next();
	String s;
	
	if(c.equals(y)) {
		s="�����ϴ�.";
	}
	else if(c.equals("����")) {
		switch (y) {
			case "����":s="���� ��";break;
			case "��":s="ö�� ��";break;
			default :s="����, ����, �� �߿��� �Է��� �ֽñ� �ٶ��ϴ�.";
		}
	}
	else if(c.equals("����")) {
		switch(y) {
			case "����":s="ö�� ��";break;
			case "��":s="���� ��";break;
			default :s="����, ����, �� �߿��� �Է��� �ֽñ� �ٶ��ϴ�.";
		}
	}
	else if(c.equals("��")) {
		switch(y) {
			case "����":s="���� ��";break;
			case "����":s="ö�� ��";break;
			default :s="����, ����, �� �߿��� �Է��� �ֽñ� �ٶ��ϴ�.";
		}
	}
	else {
		s="���и� �� �� �����ϴ�.";
	}

	System.out.println(s);
	}
}