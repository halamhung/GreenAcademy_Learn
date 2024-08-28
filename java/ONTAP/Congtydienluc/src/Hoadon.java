public class Hoadon {
    protected String     makh;
    protected String tenKhachHang;
    protected int chiSocu;
    protected int chiSomoi;
    public Hoadon(String makh, String tenKhachHang, int chiSocu, int chiSomoi) {
        this.makh = makh;
        this.tenKhachHang = tenKhachHang;
        this.chiSocu = chiSocu;
        this.chiSomoi = chiSomoi;
    }
    public int soKWTieuThu(){
        return chiSomoi - chiSocu;
    }

    public double tinhTienDien() {
        return 0;
    }

    public double tinhTienThanhToan() {
        return 0;
    }



    @Override
    public String toString(){
        return "Mã KH: " + makh + ", Tên KH: " + tenKhachHang +
                ", Chỉ số cũ: " + chiSocu + ", Chỉ số mới: " + chiSomoi +
                ",loại hộ kinh doanh"+
                ", Tiền thanh toán: " + tinhTienThanhToan();
    }
}
