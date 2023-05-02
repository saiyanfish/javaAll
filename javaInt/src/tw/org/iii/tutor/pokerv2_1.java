package tw.org.iii.tutor;

import java.util.Arrays;

public class pokerv2_1 {

	public static void main(String[] args) {
		int[] poker =shuffle(52);
		int[][] players =new int[4][13];
		//發牌
		for (int i=0;i<poker.length;i++) {
			players[i%4][i/4]=poker[i];
		}
		//player0
		String[] suit= {"黑桃","紅心","方塊","梅花"};
		String[] values= {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		for(int[] player: players) {
//			Arrays.sort(player);
//			reversArray(player);
			int[]cards =pairSort(player);
			
			for(int card:cards) {

				
				System.out.print(String.format("%s%s\t",suit[card/13],values[card%13]));
			}	
//          %d十位數 %s字串 %f浮點
//			System.out.print(suit[card/13]+values[card%13]+" ");
//		}	
			System.out.println(" ");
		}
		
		}
	static void reversArray(int[] validData) {
		for(int i = 0; i < validData.length; i++)
		{
		    int temp = validData[i];
		    validData[i] = validData[validData.length - i - 1];
		    validData[validData.length - i - 1] = temp;
		}
	}
	static int[] shuffle(int num){
		int count = num;
		int[] poker = new int[count];
		boolean isRepeat;
		int temp;
		for (int i = 0; i < poker.length; i++) {
			do {
				temp = (int) (Math.random() * 52);

		// inspect mechanism
				isRepeat = false;
				for (int j = 0; j < i; j++) {
					if (temp == poker[j]) {
		// repeat
						isRepeat = true;
						break;
					}
				}
			}while (isRepeat);
			poker[i] = temp;
		}
		return poker;
	}
	static int[] pairSort(int[] mycards) {
		int[] temp =new int[mycards.length];
		int counter=0;
		for(int i=0;i<13;i++) {
			for(int j=0;j<mycards.length;j++) {
				if(mycards[j]%13==i) {
					temp[counter++]=mycards[j];
				}
			}
		}
		return temp;
	}
}

