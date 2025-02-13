public class SanPham {
	// định nghĩa các thuộc tính
	int maSP;
	String tenSP;
	String loaiSP;
	String anhSP; // ten file anh cua sp
	/* Viết thủ công
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
	*/
	
	// Dùng chức năng phầm mềm
	// Generate Constructer (Hàm tạo không tham số)
	public SanPham() {
		super();
	}
	// Generate Constructer (Hàm tạo có tham số)
	public SanPham(int maSP, String tenSP, String loaiSP, String anhSP) {
		super();
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.loaiSP = loaiSP;
		this.anhSP = anhSP;
	}
	
	//Generate Getter và Setter
	public int getMaSP() {
		return maSP;
	}
	public void setMaSP(int maSP) {
		this.maSP = maSP;
	}
	public String getTenSP() {
		return tenSP;
	}
	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}
	public String getLoaiSP() {
		return loaiSP;
	}
	public void setLoaiSP(String loaiSP) {
		this.loaiSP = loaiSP;
	}
	public String getAnhSP() {
		return anhSP;
	}
	public void setAnhSP(String anhSP) {
		this.anhSP = anhSP;
	}
	//Generate ToString 
	@Override
	public String toString() {
		return "SanPham [Mã Sản phẩm= " + maSP + ", Tên Sản phẩm= " + tenSP + ", Loại Sản phẩm= " + loaiSP + "]";
	}
	
	

}