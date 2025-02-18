import java.util.Scanner;
public class TinhTienDien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
