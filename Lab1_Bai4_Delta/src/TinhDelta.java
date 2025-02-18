import java.util.Scanner;

/**
 * 
 */
public class TinhDelta {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Chương trình tính delta và căn delta");
		System.out.print("Nhập vào hệ số a: ");
		double a = scanner.nextDouble();
		System.out.print("Nhập vào hệ số b: ");
		double b = scanner.nextDouble();
		System.out.print("Nhập vào hệ số c: ");
		double c = scanner.nextDouble();
		double Delta =(Math.pow(b, 2) - (4 * a * c));
		double sqrtDelta = Math.sqrt(Delta);
		System.out.printf("Delta = %f, căn Delta = %f", Delta, sqrtDelta);
	}

}
