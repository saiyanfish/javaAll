package tw.org.iii.tutor;

public class ii43 {
	public static void main(String[] args) {
		Bird b1 =new Bird();
		try {
			b1.setLeg(4);
			System.out.println("sound");
		}catch(Exception b){
			System.out.println("disabled");
		}
	}
}
class Bird {
	private int leg;
	void setLeg(int leg) throws Exception{
		if(leg>=0 && leg<=2) {
		this.leg = leg;
		}else {
			throw new Exception();
		}
	}
}