import java.util.Scanner;
/**
 * 
 */
public class TinhChuViDienTich {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập chiều dài: ");
		int chieuDai = scanner.nextInt();
		System.out.print("Nhập chiều rộng: ");
		int chieuRong = scanner.nextInt();
		int chuVi = (chieuDai + chieuRong) * 2;
		int dienTich = chieuDai * chieuRong ;
		int canhNhoNhat = Math.min(chieuDai, chieuRong);
		System.out.printf("Chu vi = %d, Diện Tích = %d, Cạnh nhỏ nhất= %d", chuVi, dienTich,canhNhoNhat);

	}

}

