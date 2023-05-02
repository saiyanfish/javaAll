package tw.org.iii.tutor;

public class ii17 {

	public static void main(String[] args) {
		int[][]a =new int[3][];
		a[0]=new int[2];
		a[1]=new int[3];
		a[2]=new int[10];
//		System.out.println(a[2][3]);
//		for(int[] a1:a) {
//			for(int a2:a1) {
//				System.out.print(a2+" ");
//			}
//			System.out.println();
		for(int i=0;i<a.length;i++) {
			for(int z=0;z<a[i].length;z++) {
				System.out.print(a[i][z]+" ");
			}
			System.out.println();
		}
		}
		
}


