package tw.org.iii.tutor;

public class ii28 {

	public static void main(String[] args) {
//		ii281 obj1 = new ii281(1);/// 找無傳參數的建構式
//		ii282 obj2 = new ii282();
		ii283 obj3 =new ii283();
	}
}

	class ii281 extends Object {
	ii281(int a) {
		//super();
		System.out.println("ii281(int)");
	}

}

	class ii282 extends ii281 {	
	ii282() {
		//super();
		super(4);
		System.out.println("ii282()");
	}
}
	class ii283 extends ii282{
		ii283(){
		//super();
			System.out.println("ii283()");
		}
	}