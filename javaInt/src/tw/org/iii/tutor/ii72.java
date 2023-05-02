package tw.org.iii.tutor;

public class ii72 {
	public static void main(String[] args) {
		ii721 thread1 =new ii721("a");
		ii721 thread2 =new ii721("b");
		ii722 obj1 =new ii722("c");
		ii722 obj2 =new ii722("d");
		Thread thread3 =new Thread(obj1);
		Thread thread4 =new Thread(obj2);

		thread1.start();thread2.start();thread3.start();thread4.start();
		System.out.println("main");
	}
}
class ii721 extends Thread{
	String name;
	public ii721(String name) {
		this.name =name;
	}
	@Override
	public void run() {
		for(int i=0 ;i<10 ;i++) {
			System.out.println(name+":"+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class ii722 implements Runnable{
	String name;
	public ii722(String name) {
		this.name =name;
	}
	@Override
	public void run() {
		for(int i=0 ;i<10 ;i++) {
			System.out.println(name+":"+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}