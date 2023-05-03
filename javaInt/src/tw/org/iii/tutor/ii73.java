package tw.org.iii.tutor;

import java.util.Timer;
import java.util.TimerTask;

public class ii73 {
	public static void main(String[] args) {
	Timer timer=new Timer();	
	///Timer(true)
	ii731 task = new ii731();
	timer.schedule(task, 3*1000);
	timer.schedule(new ii732(timer),10*1000);
	timer.schedule(new ii733(), 0,1000);
	System.out.println("main");
	}

}
class ii731 extends TimerTask{
	@Override
	public void run() {
		System.out.println("ok");
	}
}
class ii732 extends TimerTask{
	private Timer timer;
	ii732(Timer timer){
		this.timer =timer;
	}
	
	@Override
	public void run() {
		timer.cancel();
		timer.purge();
		timer =null;
	}
}
class ii733 extends TimerTask{
	private int i;
	@Override
	public void run() {
		System.out.println(i++);
	}
}