class Student2 {
    private String name;
    private int grade;
    private int ban;
    private int telephone;
    
    Student2(String name) {
		this.name=name;
    }

    Student2(String name, int grade, int ban, int telephone) {
		this.name=name;
		this.grade=grade;
		this.ban=ban;
		this.telephone=telephone;
    }

	Student2(String name,int ban) {
		this.name=name;
		this.ban=ban;
	}

	Student2(int grade, int ban, int telephone){
		this.grade=grade;
		this.ban=ban;
		this.telephone=telephone;
	}

    public int study(int i) {
		return i;
    }

    public static void main(String ar[]) {
        Student2 s1=new Student2("장민재");
		Student2 s2=new Student2("김현우");
		Student2 s3=new Student2("Tomas",1,1,111);
		Student2 s4=new Student2("John",6);
		Student2 s5=new Student2(2,5,333);

		System.out.println(s3.name+"는 "+s3.grade+"학년이고 전화번호는 "+s3.telephone+"입니다");
		s5.study(4);
    }
}