public class Hokd extends Hoadon{
    private String linhVucKinhDoanh;
    public Hokd(String makh, String tenkh, int chisocu, int chisomoi,String linhVucKinhDoanh ){
        super(makh,tenkh,chisocu,chisomoi);
        this.linhVucKinhDoanh = linhVucKinhDoanh;
    }

    @Override
    public double tinhTienDien() {
        return soKWTieuThu()*3000;
    }
    @Override
    public double tinhTienThanhToan() {
        double tiendien = tinhTienDien();
        double ThueGTGT = 0.1 * tiendien;
            double tienuudai = (linhVucKinhDoanh.equalsIgnoreCase("công ty nhà nước"))?0.05*tiendien:0;
            return tiendien + ThueGTGT - tienuudai;
    }
    @Override
   public String toString() {
        double tienDien = tinhTienDien();
        double tienUuDai = (linhVucKinhDoanh.equalsIgnoreCase("cong ty nha nuoc")) ? 0.05 * tienDien : 0;
        return super.toString() + ", Linh vụ kinh doanh: " + linhVucKinhDoanh + ", Ưu đãi: " + tienUuDai;
   }

}
