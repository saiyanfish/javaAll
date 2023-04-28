package tw.org.iii.tutor;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ii61 {

	public static void main(String[] args) {
		ii613 obj =new ii613();
		try {
			ObjectOutputStream oout =new ObjectOutputStream(new FileOutputStream("dir1/ii"));
			oout.writeObject(obj);
			oout.flush();
			oout.close();
			System.out.println("----");
			ObjectInputStream ooin =new ObjectInputStream(new FileInputStream("dir1/ii"));
			ooin.readObject();
			ooin.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}

class ii611 implements Serializable{
	ii611() {
		System.out.println("ii611()");
	}
}

class ii612 extends ii611  {
	ii612() {
		System.out.println("ii612()");
	}
}

class ii613 extends ii612  {
	ii613() {
		System.out.println("ii613()");
	}
}