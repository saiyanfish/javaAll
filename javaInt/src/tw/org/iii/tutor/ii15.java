package tw.org.iii.tutor;

public class ii15 {

	public static void main(String[] args) {
		int p0,p1,p2,p3,p4,p5,p6;
		p0=p1=p2=p3=p4=p5=p6=0;
		for(int i =0 ;i<100;i++) {
			int pts =(int)(Math.random()*6+1);
			switch(pts) {
			case 1:
				p1++;
				break;
			case 2:
				p2++;
				break;
			case 3:
				p3++;
				break;
			case 4:
				p4++;
				break;
			case 5:
				p5++;
				break;
			case 6:
				p6++;
				break;
			default:
				p0++;
				break;
			}
			
		}
		if(p0==0) {
		System.out.printf("1點%d次,2點%d次,3點%d次,4點%d次,5點%d次,6點%d次",p1,p2,p3,p4,p5,p6);
	}
	}
}
