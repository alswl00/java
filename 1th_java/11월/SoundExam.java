interface Sound {
	public void SoundUp(int level);
	public void SoundDown(int level);
}

class Tv implements Sound{
	private int SndLevel;
	Tv(int Snd) {
		SndLevel=Snd;
	}
	public void SoundUp(int level) {
		SndLevel+=level;
		if(SndLevel>100) SndLevel=100;
		System.out.println("º¼·ý : "+SndLevel);
	}
	public void SoundDown(int level) {
		SndLevel-=level;
		if(SndLevel<0) SndLevel=0;
		System.out.println("º¼·ý : "+SndLevel);
	}
}
class Radio implements Sound{
	private int SndLevel;
	Radio(int Snd) {
		SndLevel=Snd;
	}
	public void SoundUp(int level) {
		SndLevel+=level;
		if(SndLevel>50) SndLevel=50;
		System.out.println("º¼·ý : "+SndLevel);
	}
	public void SoundDown(int level) {
		SndLevel-=level;
		if(SndLevel<0) SndLevel=0;
		System.out.println("º¼·ý : "+SndLevel);
	}
}

class SoundExam {
	public static void main(String ar[] ) {
		Sound Radio=new Radio(50);
		Sound Tv=new Tv(30);
		System.out.print("tv ");
		Tv.SoundUp(20);
		System.out.print("radio ");
		Radio.SoundDown(5);
	}
}	