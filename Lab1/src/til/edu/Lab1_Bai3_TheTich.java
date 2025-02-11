/**
 * 
 */
package til.edu;
import java.util.Scanner;
/**
 * 
 */
public class Lab1_Bai3_TheTich {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập vào cạnh của khối lập phương: ");
		float canh = scanner.nextFloat();
		float theTichLapPhuong = canh * canh * canh;
		System.out.printf("Thể tích = %.2f", theTichLapPhuong);
		

	}

}
