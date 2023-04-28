package tw.org.iii.tutor;

public class ii41 {

	public static void main(String[] args) {
		int a = 10, b = 1;
		int[] c = { 1, 2, 3, 4 };
		try {
			System.out.println(a / b);
			System.out.println(c[8]);
		}catch (ArrayIndexOutOfBoundsException aiobe) {
			System.out.println("不要亂輸入白痴陣列");
		} catch (ArithmeticException ae) {
			System.out.println("不要亂輸入白痴數字");
		

	}
		System.out.println("ok");
}
}