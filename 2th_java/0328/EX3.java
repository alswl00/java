
public class EX3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//13.
		Integer in1=new Integer(100);
		Integer in2=new Integer(100);
		Integer in3=new Integer(200);
		System.out.println(in1.equals(in2));
		System.out.println(in1.equals(in3));
		
		//14.
		Integer wrapi=new Integer(100);
		Double wrapd=new Double(55.7);
		int i=100;
		double d=55.7;
		System.out.println(Integer.toString(i)+Double.toString(d));
		System.out.println(wrapi.toString()+wrapd.toString());
		
		//15.
		String stri="123456";
		String strd="123.56";
		System.out.println(Integer.valueOf(stri));
		System.out.println(Double.valueOf(strd));
		System.out.println(Integer.valueOf(stri)+Double.valueOf(strd));
		
		//16.
		String a="10";
		String b="20";
		int ai=Integer.parseInt(a);
		int bi=Integer.parseInt(b);
		int sum=ai+bi;
		float avg=(float)sum/2;
		System.out.println("합 : "+sum);
		System.out.println("평균 : "+avg);
		
	}

}