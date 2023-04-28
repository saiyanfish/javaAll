package tw.org.iii.tutor;

import javax.swing.JOptionPane;

public class ii03 {

	public static void main(String[] args) {
		String strX =JOptionPane.showInputDialog("X=?");
		String strY =JOptionPane.showInputDialog("Y=?");
		
		int x =Integer.parseInt(strX);
		int y =Integer.parseInt(strY);
		
		int r =x+y;
		
		JOptionPane.showMessageDialog(null,
				String.format("%d+%d=%d", x,y,r));
		
	}

}
