package tw.org.iii.tutor;

public class ii29 {
	public static void main (String[] args) {
		ii292 obj1 =new ii292();
		ii291 obj2 =new ii292();
		ii293 obj3 =new ii293();
		doSth(obj3);
	}
	//多型
	
	static void doSth(ii291 obj) {
		obj.m1();
	}
}
class ii291{
	void m1() {
		System.out.println("ii291:m1();");
	}
	
}
class ii292 extends ii291{
	void m1() {
		System.out.println("ii292:m1();");
	}
	void m2() {
		System.out.println("ii292:m2();");
	}
}
class ii293 extends ii291{
	void m1() {
		System.out.println("ii293:m1();");
	}
	void m2() {
		System.out.println("ii293:m2();");
	}
}
