package tw.org.iii.tutor;

public class ii34 {
	public static void main(String[] args) {

	}
}
interface ii341{
	void m1();
}
interface ii342{
	void m2();
}
interface ii343 extends ii341,ii342{
	void m3();
}
class ii344 implements ii343{
	public void m1() {}
	public void m2() {}
	public void m3() {}
}