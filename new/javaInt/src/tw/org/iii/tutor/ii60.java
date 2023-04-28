package tw.org.iii.tutor;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import tw.org.iii.myclasses.Student;

public class ii60 {

	public static void main(String[] args) {
		try {
			ObjectInputStream oin = new ObjectInputStream(new FileInputStream("dir1/s1"));
			Object obj1 = oin.readObject();
			if (obj1 instanceof Student) {
				Student s1 = (Student) obj1;
				System.out.println(s1.sum() + ":" + s1.avg());
			} else {
				System.out.println("not");
			}
			Object obj2 = oin.readObject();
			if (obj2 instanceof Student) {
				Student s2 = (Student) obj2;
				System.out.println(s2.sum() + ":" + s2.avg());
			} else {
				System.out.println("not");
			}
			oin.close();
		    } catch (Exception e) {
		    	System.out.println(e);
		    }
		}
}
