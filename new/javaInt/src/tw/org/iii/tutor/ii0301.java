package tw.org.iii.tutor;

import javax.swing.JOptionPane;

public class ii0301 {
	public static  void main (String[] args) {
		String var1 =JOptionPane.showInputDialog("II:");
		String var2 =JOptionPane.showInputDialog("II:");
		int var3 =Integer.parseInt(var1);
		int var4 =Integer.parseInt(var2);
		int var5 =var3+var4;
		JOptionPane.showMessageDialog(null, String.format("%d+%d=%d", var3,var4,var5));
	}
	}
