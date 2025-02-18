import java.util.*;

public static void Menu () {
	System.out.println("Menu:");
	System.out.println("1. Giải phương trình bậc nhất");
	System.out.println("2. Giải phương trình bậc 2");
	System.out.println("3. Tính tiền điện");
	System.out.println("4. Kết thúc");
}

public class Menu_Bai123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lua chon: ");
		int chon = scanner.nextInt();
		Menu();

	}

}
