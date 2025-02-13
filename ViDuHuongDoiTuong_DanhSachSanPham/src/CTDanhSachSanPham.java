import java.util.ArrayList;

public class CTDanhSachSanPham {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<SanPham> dsSanPham;
		// Xin mới
		dsSanPham = new ArrayList<SanPham>();
//		// Nhập thêm vào 4 sản phẩm
//		SanPham SP1 = new SanPham(0, "Samsung S23", "Điện thoại", null);
//		SanPham SP2 = new SanPham(1, "Bún", "Món ăn", null);
//		SanPham SP3 = new SanPham(2, "Watch 3", "Đồng hồ", null);
//		SanPham SP4 = new SanPham(3, "Pepsi", "Nước giải khát", null);
//		
//		// Thêm vào ArrayList đã tạo (dsSanPham)
//		dsSanPham.add(SP1);
//		dsSanPham.add(SP2);
//		dsSanPham.add(SP3);
//		dsSanPham.add(SP4);
		
		// ----------  Cách nhập khác  -------
		// Thêm vào ArrayList đã tạo (dsSanPham)
				dsSanPham.add(new SanPham(0, "Samsung S23", "Điện thoại", null));
				dsSanPham.add(new SanPham(1, "Bún", "Món ăn", null));
				dsSanPham.add(new SanPham(2, "Watch 3", "Đồng hồ", null));
				dsSanPham.add(new SanPham(3, "Pepsi", "Nước giải khát", null));
		
		// In ra các sản phẩm
//		for(SanPham x: dsSanPham)
//			System.out.println(x.toString());
		
		// cách !=:
		for (int i = 0; i < dsSanPham.size(); i++) {
				SanPham sp = dsSanPham.get(i);
				System.out.println(sp.toString());
		 }
	}

}
