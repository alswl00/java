//주차요금계산
import java.util.*;
class summerhw12 {
	public static void main(String ar[]) {
	Scanner sc=new Scanner(System.in);
	int day, hour, min, fee=2000;
	
	System.out.println("주차한 일, 시간, 분을 입력하시오");
	day=sc.nextInt();
	hour=sc.nextInt();
	min=sc.nextInt();
	
	min+=(hour*60);
	fee+=(day-1)*8000;
	if(min%10!=0) 
		min-=(min%10);

	for(int i=min; i>120 && fee<8000;i-=10, fee+=200){	}

	System.out.println("주차 요금은 "+fee+"원 입니다.");
	}
}