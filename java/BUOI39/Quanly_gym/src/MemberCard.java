public class MemberCard {

    protected long chiPhiCoBan;
    protected long chiPhiLopHoc;
    protected boolean dichVuXongHoi;
    protected long hoTroPT;

    public long tinhtien(){
        return chiPhiCoBan + chiPhiLopHoc + hoTroPT;
    }
}
