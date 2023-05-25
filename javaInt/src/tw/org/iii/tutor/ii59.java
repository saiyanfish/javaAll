package tw.org.iii.tutor;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import tw.org.iii.myclasses.Student;

public class ii59 {

	public static void main(String[] args) {
		Student s1 = new Student("Bro", 40, 60, 80);
		Student s2 = new Student("Star", 30, 20, 69);
		System.out.println("平均：" + s1.avg());
		System.out.println("平均：" + s2.avg());
		try {
			FileOutputStream fout = new FileOutputStream("dir1/s1");
			ObjectOutputStream oout = new ObjectOutputStream(fout);			
			oout.writeObject(s1);
			oout.writeObject(s2);
			oout.flush();
			oout.close();
			System.out.println("ok");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
