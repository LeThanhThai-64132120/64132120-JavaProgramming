import java.util.Scanner;

public class GiaiPTB2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Giai PTB2");
		System.out.print("Nhap he so a: ");
		double a = scanner.nextDouble();
		System.out.print("Nhap he so b: ");
		double b = scanner.nextDouble();
		System.out.print("Nhap he so c: ");
		double c = scanner.nextDouble();
		if(a == 0) {
			if (b == 0) {
				if (c == 0) {
					System.out.print("PT vô số nghiệm");
				}
				else {
					System.out.print("PT vô nghiệm");
				}
			}
			else {
				System.out.printf("PT co nghiem x = %.2f", -c / b);
			}
		}
		else {
			double Delta = b*b -4*a*c;
			if (Delta < 0) {
				System.out.print("PT vô nghiệm");
			}
			else if (Delta == 0) {
				System.out.printf("PT có nghiệm kép x1 = x2 = %f", -b / (2*a));
			}
			else {
				System.out.printf("PT có 2 nghiệm phân biệt: ");
				double x1 = (-b + Math.sqrt(Delta)) / (2 * a);
				double x2 = (-b - Math.sqrt(Delta)) / (2 * a);
				System.out.printf("x1 = %f, x2 = %f", x1, x2);
			}
		}

	}

}
