import java.util.Scanner;

public class GiaiPTB1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Giai PTB1");
		System.out.print("Nhap vao he so a: ");
		float a = scanner.nextInt();
		System.out.print("Nhap vao he so b: ");
		float b = scanner.nextInt();
		if (a== 0) {
			if (b == 0) {
				System.out.println("PT có vô số nghiệm");
			}
			else {
				System.out.println("PT vô nghiệm");
			}
		}
		else {
			System.out.printf("Phuong trinh co nghiem x = %.2f",-b/a);
		}

	}

}
