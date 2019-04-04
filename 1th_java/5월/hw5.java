//100 이하의 두 개의 정수를 입력받아 작은수부터 큰수까지 차례대로 출력
import java.util.*;
class hw5 {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();int b=sc.nextInt();
		if (a+b>200)
		{System.out.println("100이하의 자연수를 입력하십시오");
		}
		else if(a>b){for (int i=b; b<=a; b++)
			{System.out.println(b);
		}
		}
		else {for (int i=a; a<=b; a++)
		{System.out.println(a);
		}
		}
	}
}
