package Member;

import java.util.Scanner;
import Support.support;
public class MemberCard {

    private long chiPhiCoBan;
    private long chiPhiLopHoc;
    private boolean dichVuXongHoi;
    private long hoTroPT;



    public MemberCard() {
    }
    public MemberCard( long chiPhiCoBan, long chiPhiLopHoc, boolean dichVuXongHoi, long hoTroPT) {

        this.chiPhiCoBan = chiPhiCoBan;
        this.chiPhiLopHoc = chiPhiLopHoc;
        this.dichVuXongHoi = dichVuXongHoi;
        this.hoTroPT = hoTroPT;
    }

    public long getChiPhiCoBan() {
        return chiPhiCoBan;
    }

    public void setChiPhiCoBan(long chiPhiCoBan) {
        this.chiPhiCoBan = chiPhiCoBan;
    }

    public long getChiPhiLopHoc() {
        return chiPhiLopHoc;
    }

    public void setChiPhiLopHoc(long chiPhiLopHoc) {
        this.chiPhiLopHoc = chiPhiLopHoc;
    }

    public boolean isDichVuXongHoi() {
        return dichVuXongHoi;
    }

    public void setDichVuXongHoi(boolean dichVuXongHoi) {
        this.dichVuXongHoi = dichVuXongHoi;
    }

    public long getHoTroPT() {
        return hoTroPT;
    }

    public void setHoTroPT(long hoTroPT) {
        this.hoTroPT = hoTroPT;
    }

    public void nhap() {

    }
    public void xuat(){
    }
}
