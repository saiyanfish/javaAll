package tw.org.iii.tutor;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;

public class ii58 {
	public static void main(String[] args) {
		try{
//		FileInputStream fin =new FileInputStream("dir1/Fstdata.csv");
//		InputStreamReader ir =new InputStreamReader(fin);
//		BufferedReader br =new BufferedReader(ir);
		FileReader fr =new FileReader("dir1/Fstdata.csv");
		BufferedReader br =new BufferedReader(fr);

		String line;
//		int line1;
//		byte[] buff =new byte[4*1024];
//		line1 =fin.read(buff);
//		System.out.println(new String(buff,0, line1));
		while((line=br.readLine())!=null) {
			String[] row=line.split(",");
			System.out.println(row[1]+":"+row[5]+":"+row[7]);
		}
		br.close();
//		
		}catch(Exception e){
			System.out.println(e);
		}
	}
}