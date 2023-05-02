package tw.org.iii.tutor;

public class II30 {
	public static void main(String[] args) {
//		ii301 obj1 =new ii301();
		ii301 obj2 =new ii302();
		ii301 obj3 =new ii303();
		obj2.m2();
		obj3.m2();
	}
}
abstract class ii301{
	ii301(int a){
		System.out.println("ii301()");
	}
	void m1() {System.out.println("ii301:m1()");}
	abstract void m2() ;
}
///CLASS裡面是抽象方法的話自身必須是抽象類別

class ii302 extends ii301{
	ii302(){
		super(3);
		System.out.println("ii302()");
	}
	void m2() {System.out.println("ii302:m2()");}	
}
class ii303 extends ii301{
	ii303(){
		super(3);
		System.out.println("ii303()");
	}
	void m2() {System.out.println("ii303:m2()");}	
}