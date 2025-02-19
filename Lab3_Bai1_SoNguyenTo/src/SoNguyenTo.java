import java.util.Scanner;
public class SoNguyenTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Chuong trinh kiem tra so nguyen to");
		System.out.print("Nhap vao so nguyen: ");
		int n = scanner.nextInt();
		boolean laSNT = true;
		for (int i =2; i< n-1; i++) {
			if (n % i == 0) {
				laSNT = false;
				break;
			}
			i++;
		}
		System.out.printf("So %d la so nguyen to: ", n);
		System.out.print(laSNT);
		

	}

}
