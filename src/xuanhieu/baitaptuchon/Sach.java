package xuanhieu.baitaptuchon;

public class Sach extends TaiLieu{


    private String tenTacGia;

    private int soTrang;

    public Sach(){}
    public Sach(String maTaiLieu,String tenNhaXuatBan,int soBanPhatHanh,String tenTacGia, int soTrang) {
        super(maTaiLieu,tenNhaXuatBan,soBanPhatHanh);
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+ "Sach{" +
                "tenTacGia='" + tenTacGia + '\'' +
                ", soTrang=" + soTrang +
                '}'+"\n"+"------------------------";
    }
}
