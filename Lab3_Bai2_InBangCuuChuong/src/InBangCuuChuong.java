import java.util.Scanner;

public class InBangCuuChuong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Chuong trinh in Bảng cửu chương");
		for (int i = 1; i <= 9; i++) {
			System.out.printf("Cửu chương %d: \n", i);
			for(int j = 1; j <= 10; j++)
			{
				System.out.printf("%d * %d = %d \n", i, j, i*j);
				
			}
			System.out.println();
		}

	}

}
