package tw.org.iii.tutor;

public class ii42 {

	public static void main(String[] args) {
		int a = 10, b = 1;
		int[] c = { 1, 2, 3, 4 };
		try {
			System.out.println(a / b);
			System.out.println(c[5]);
		}catch (ArrayIndexOutOfBoundsException aiobe) {
			System.out.println("不要亂輸入白痴陣列");
		} catch (ArithmeticException ame) {
			System.out.println("不要亂輸入白痴數字");
		}catch (RuntimeException ae) {
			System.out.println("不要亂輸入,白痴");
		}
		System.out.println("ok");
	}
}