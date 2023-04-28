package tw.org.iii.tutor;

public class hw2 {

	public static void main(String[] args) {
		int tol =1010;
		int[] primeYN =new int[tol];
		for(int i=0;i<tol;i++) {
			primeYN[i]=i;
		}
		for(int k=0;k<=9;k++) {
			for(int i=1+k*10;i<=(k+1)*10;i++) {
				boolean isPrime =true;
				for(int z=2;z<i;z++) {
					int rd =primeYN[i]%primeYN[z];
					if(rd==0 && z!=1) {
						isPrime =false;
						break;
					}
				}
				if(isPrime==false ||i==1) {
					System.out.printf("%d\t",primeYN[i]);				
				}
				
				else {
					System.out.printf("%d質數\t",primeYN[i]);				
				}
					
			}
			System.out.println("");
		}
		
	}
	}