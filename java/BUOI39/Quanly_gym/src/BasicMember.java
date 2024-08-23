public class BasicMember extends MemberCard {
    private int soLop;
    public BasicMember(int soLop) {
        this.chiPhiCoBan = 500L;
        this.hoTroPT = 100L;
        this.dichVuXongHoi = false;
        this.chiPhiLopHoc = 100L;
        this.soLop = soLop;
    }
    public int getSoLop() {
        return soLop;
    }
    public void setSoLop(int soLop) {
        this.soLop = soLop;
    }

    @Override
    public long tinhtien() {
        return chiPhiCoBan + chiPhiLopHoc*soLop + hoTroPT;
    }
}
