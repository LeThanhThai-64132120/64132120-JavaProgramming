import java.io.Closeable;
import java.util.*;



public class Menu_Bai123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Menu();
		System.out.printf("Lua chon (1, 2, 3): ");
		int chon = scanner.nextInt();
		switch(chon) {
		case 1: giaiPTB1(); break;
		case 2: giaiPTB2(); break;
		case 3: tinhTienDien(); break;
		}

	}
	
	
	
	public static void Menu () {
		System.out.println("Menu:");
		System.out.println("1. Giải phương trình bậc nhất");
		System.out.println("2. Giải phương trình bậc 2");
		System.out.println("3. Tính tiền điện");
		System.out.println("4. Kết thúc");
	}
	
	// hàm Tính PTB1
	public static void giaiPTB1() {
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
// Hàm giải PTB2
	public static void giaiPTB2() {
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
	
	// Hàm tính Tiền điện
	public static void tinhTienDien() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Chương trình Tính tiền điện");
		System.out.print("Nhap vao số điện sử dụng: ");
		int soDien = scanner.nextInt();
		int tienDien = 0;
		if (soDien >= 0) {
			if (soDien <= 50) {
				tienDien = 50 *1000;
			}
			else {
				tienDien = 50 * 1000 + (soDien - 50) *1200;
			}
		}
		System.out.print("Số tiền phải thanh toán: ");
		System.out.print(tienDien);
	}
}
