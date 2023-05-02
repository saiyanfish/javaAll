package tw.org.iii.tutor;

import javax.swing.JOptionPane;

public class ii09 {

	public static void main(String[] args) {
		// 
		String x =JOptionPane.showInputDialog("x=");
		int xx =Integer.parseInt(x);
		int x4 =xx%4;
		int x100 =xx%100;
		int x400=xx%400;
		boolean isLeap;
		if(x4 == 0 && x100==0 && x400==0) {
//			System.out.printf("%d閏年",xx);
			isLeap =true;
			
		}
		else if(x4 == 0 && x100==0 && x400!=0){
//			System.out.printf("%d平年",xx);
			isLeap =false;
		}
		else if(x4 == 0 && x100!=0 && x400!=0){
//			System.out.printf("%d閏年",xx);
			isLeap =true;
		}
		else {
//			System.out.printf("%d平年",xx);
			isLeap=false;
		}
		System.out.printf("%d年為%s年",xx,(isLeap?"閏":"平"));
		JOptionPane.showMessageDialog(null,String.format("%d年為%s年",xx,(isLeap?"閏":"平")));
	}
	

}
