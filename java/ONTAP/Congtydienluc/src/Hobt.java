public class Hobt extends Hoadon{
    public Hobt(String makh, String tenKhachHang, int chiSocu, int chiSomoi) {
        super(makh, tenKhachHang, chiSocu, chiSomoi);
    }

    @Override
    public double tinhTienDien(){
        int soKW = soKWTieuThu();
        if(soKW <= 50){
            return soKW * 1500;
        } else if (soKW >=51 && soKW <= 100){
            return soKW *2000;
        }
        else if(soKW > 100){
            return soKW * 2800;
        }
        return 0;
    }

    @Override
    public double tinhTienThanhToan() {
        double tiendien = tinhTienDien();
        double thueGTGT = 0.1 * tiendien;
        return tiendien + thueGTGT;
    }
}
