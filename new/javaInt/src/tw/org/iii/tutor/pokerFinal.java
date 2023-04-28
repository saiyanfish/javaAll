package tw.org.iii.tutor;

public class pokerFinal {

	public static void main(String[] args) {
		String[] suit= {"黑桃","紅心","方塊","梅花"};
		String[] values= {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		int pkn = 52;
		int[] poker = new int[pkn];
		for (int i = 0; i < pkn; i++) {
			poker[i] = i;
		}
		for (int i = pkn - 1; i > 0; i--) {
			int temp;
			int rd = (int) (Math.random() * i);
			temp = poker[i];
			poker[i] = poker[rd];
			poker[rd] = temp;

		}
		int [][]players= new int[4][13];
		for (int i=0;i<poker.length;i++) {
			players[i%4][i/4]=poker[i];
		}
		
		for(int[]player:players) {
			for(int card:player) {
				System.out.printf("%s%s\t",suit[card/13],values[card%13]);
			}
			System.out.println("");
		}
		
	}
}