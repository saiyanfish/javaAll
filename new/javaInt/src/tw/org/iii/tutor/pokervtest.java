package tw.org.iii.tutor;

import java.util.Arrays;

public class pokervtest {

	public static void main(String[] args) {
		int[] poker=bdPoker();
		int[][] players =new int[4][13];
		
		for(int i=0;i<poker.length;i++) {
			players[i%4][i/4] =poker[i];
		}
		
		String[] suit= {"黑桃","紅心","方塊","梅花"};
		String[] values= {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		for(int[]player:players) {
			Arrays.sort(player);
			for(int card:player) {
//				System.out.print(card);
			System.out.printf("%s%s\t",suit[card/13],values[card%13]);
			}
			System.out.println("");
		}
	}
	static int[] bdPoker() {
		 int[] poker =new int[52];
		 for(int i=0;i<51;i++) {
			 int temp;
			 boolean isRpeat;
			 do {
				 isRpeat =false;
				 temp =(int)(Math.random()*52);
				 for(int j=0;j<i;j++) {
				 if(poker[j]==temp) {
				 isRpeat = true;
				 break;
				}
			}}while(isRpeat);
			 poker[i]=temp;
		 }
		 return poker;
	}
}
