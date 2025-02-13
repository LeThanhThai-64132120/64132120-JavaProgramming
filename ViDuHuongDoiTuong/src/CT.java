
public class CT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Tạo ra 2 Sản phẩm (hardcode)
		SanPham SP1 = new SanPham(); // có thể thêm thông tin sau
		SanPham SP2 = new SanPham(2, "Bánh Chuối Chiên", "Đồ ăn nhanh", "bcc.jpg");
		// SP1 chưa có thông tin thì ta tiến hành thiết lặp thông tin
		SP1.setMaSP(1);
		SP1.setTenSP("Bia Hà Nội");
		SP1.setLoaiSP("Đồ uống có cồn");
		SP1.setAnhSP("bhn.png");
		
		// In thông tin 2 SP trên ra màn hình
		String thongtinSP1 = SP1.toString();
		//String thongtinSP2 = "Mã Sản phẩm 2: "+ SP2.getMaSP() ;
				//thongtinSP2 +=" Tên Sản phẩm 2: " + SP2 .getTenSP();
		String thongtinSP2 = "Mã Sản phẩm 2: "+ SP2.getMaSP()  +" Tên Sản phẩm 2: " + SP2 .getTenSP();
		System.out.println( thongtinSP1);
		System.out.println(thongtinSP2);


	}

}
