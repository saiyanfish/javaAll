package tw.org.iii.myclasses;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JLabel;

public class MyClock extends JLabel {
	private Timer timer;

	public MyClock() {
		timer = new Timer();
		timer.schedule(new MyTask(), 0, 1000);
	}

	private class MyTask extends TimerTask {
		private int i;
		long now =System.currentTimeMillis();
		private SimpleDateFormat sdf ;

		@Override
		public void run() {
//			LocalDateTime today = LocalDateTime.now();
//          String time = today.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH));
//          setText(time);=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			System.out.println(sdf.format(new Date()) );
			
			
			Date currentday = new Date (now+((i++)*1000));
			setText(currentday.toString());
		}
	}
}
