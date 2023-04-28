package tw.org.iii.tutor;

import java.util.LinkedList;

public class tft {

	int[]tft =getArray(59);
	String [] []player =new String[8][];
	int[][]tftCost =new int[5][];
	int level =1;
	tft(){
		tftCost =costBuild(tftCost, tft);
		
	}
	
		
	
	
		
		
	
	private static int[] getArray(int a) {
		int [] aa =new int[a];
		for(int i=0;i<a;i++) {
			aa[i]=i;
		}
		return aa;
	}
	private static int[] refreshShop(int shopLv) {
		int [] newShop =new int[5];
		
		for(int i =0;i<5;i++) {
			int aa =(int)(Math.random()*59);
			newShop[i]=aa;
		}
		return newShop;
	}
	 int[][] costBuild(int[][] cost,int[] tft){
		cost[0]=new int[13];
		cost[1]=new int[13];
		cost[2]=new int[13];
		cost[3]=new int[12];
		cost[4]=new int[8];
		for(int j=0;j<3;j++) {
			for(int i=13*j;i<13*(j+1);i++) {
				cost[j][i-13*j]=tft[i];
			}
		}
		for(int i=0;i<12;i++) {
			cost[3][i]=tft[i+39];
		}
		for(int i=0;i<8;i++) {
			cost[4][i]=tft[i+51];
		}
		return cost;
	}


	public int levelUp(int level) {
		level =level+1;
		return level;
	}
	}