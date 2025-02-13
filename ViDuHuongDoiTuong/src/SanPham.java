public class SanPham {
	// định nghĩa các thuộc tính
	int maSP;
	String tenSP;
	String loaiSP;
	String anhSP; // ten file anh cua sp
	// Hàm tạo khong co tham so
	public SanPham() {
		// khoi tao gia tri ban dau cho cac thuoc tinh (neu co) o day
	}
	// ham tao co tham so 
	// cach 1:
	
	  /*public SanPham(int _maSP, String _tenSP, String _loaiSP, String _anhSP) {
		// khoi tao gia tri ban dau cho cac thuoc tinh (neu co) o day
		maSP = _maSP;
		tenSP = _tenSP;
		loaiSP = _loaiSP;
		anhSP = _anhSP;
	}
	*/
	// Hàm được dùng khi cần tạo mới 1 đối tượng
	// cach 2: dung this
	public SanPham(int maSP, String tenSP, String loaiSP, String anhSP) {
		// khoi tao gia tri ban dau cho cac thuoc tinh (neu co) o day
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.loaiSP = loaiSP;
		this.anhSP = anhSP;
	}
	// cac getter va setter
	public int getMaSP() {
		return maSP;
	}
	public void setMaSP(int maSP){
		this.maSP = maSP;
	}
}