package tw.org.iii.tutor;

import java.awt.FontFormatException;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.management.RuntimeErrorException;

public class ii44 {

	public static void main(String[] args) {
		try {
			new ii441().m1();
		}catch(Exception e) {
			
		}
	}

}
class ii441{
	void m1() throws Exception{
		m2();
	}
	void m2() throws Exception{
		m3(3);
	}
	void m3(int a) throws FontFormatException,IOException{
		if(a>0) {
			throw new FontFormatException(null);			
		}
		else {
			throw new FileNotFoundException();
		}
	}
}
class ii442 extends ii441{
	void m3(int b){
		
	}
}