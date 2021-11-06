package xuanhieu.baitaptuchon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class bai2 {

    public static final List<TaiLieu>taiLieuList = new ArrayList<>();

    public static final BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));


    public static String maTaiLieu;
    public static String tenNhaXuatBan;
    public static int soBanPhatHanh;

    public static void main(String [] args) throws IOException {
        System.out.println("Họ và tên: Vương Xuân Hiệu");
        System.out.println("MSSV: 20181063");
        System.out.println(menu());
        chonChucNang();
    }


    public static void chonChucNang() throws IOException {
        System.out.println("Nhập chức năng: ");
        int chucnang = Integer.parseInt(bf.readLine());
        while (chucnang>0 && chucnang<6) {
            switch (chucnang) {
                case 1:
                    themMoi();
                    break;
                case 2:
                    xoaTaiLieu();
                    break;
                case 3:
                    hienThiThongTin();
                    break;
                case 4:
                    timKiemThongTin();
                    break;
                case 5:
                    exit();
                    break;
            }
            if(chucnang==5){
                chucnang=6;
            }
            else {
                System.out.println("-------------------------------");
                System.out.println("Chọn chức năng");
                System.out.println(menu());
                System.out.println("Nhập chức năng: ");
                chucnang = Integer.parseInt(bf.readLine());
            }
        }
    }



    public static String menu(){
        String menu="1. Thêm mới tài liệu."+"\n"+
                    "2. Xóa tài liệu"+"\n"+
                    "3. Hiển thị thông tin tài liệu"+"\n"+
                    "4. Tìm kiếm thông tin tài liệu"+"\n"+
                    "5. Thoát khỏi chương trình";
        return menu;
    }

    // chức năng 1
    public static void themMoi() throws IOException {
        System.out.println("------------------------------------");
        System.out.println("BẠN ĐÃ CHỌN CHỨC NĂNG THÊM MỚI TÀI LIỆU");
        System.out.println(menuChucNang1());
        System.out.println("Nhập chức năng:");
        int cn = Integer.parseInt(bf.readLine());

        while (cn>0 && cn<5){
            switch (cn){
                case 1: themMoiSach();
                break;
                case 2:themMoiTapChi();
                break;
                case 3:themBao();
                break;
                case 4:thoatChucNangThemMoi();
                break;
            }
            if(cn==4){
                cn=5;
            }
            else {
                System.out.println("-------------------------------");
                System.out.println("Chọn chức năng");
                System.out.println(menuChucNang1());
                cn = Integer.parseInt(bf.readLine());
            }
        }
        System.out.println(menu());
        chonChucNang();
    }

    public static void themMoiSach() throws IOException {
        System.out.println("THÊM MỚI SÁCH");
        System.out.println("Nhập mã tài liệu:");
        maTaiLieu = bf.readLine();
        System.out.println("Nhập tên nhà xuất bản:");
        tenNhaXuatBan=  bf.readLine();



        System.out.println("Nhập số bản phát hành:");
        soBanPhatHanh = Integer.parseInt(bf.readLine());
        System.out.println("Nhập tên tác giả");
        String tenTacGia = bf.readLine();
        System.out.println("Nhập số trang:");
        int soTrang = Integer.parseInt(bf.readLine());
        Sach sach = new Sach(maTaiLieu,tenNhaXuatBan,soBanPhatHanh,tenTacGia,soTrang);
        taiLieuList.add(sach);
        System.out.println("Thêm mới SÁCH thành công!");
    }

    public static void themMoiTapChi() throws IOException {
        System.out.println("THÊM MỚI TẠP CHÍ");
        System.out.println("Nhập mã tài liệu:");
        maTaiLieu =  bf.readLine();
        System.out.println("Nhập tên nhà xuất bản:");
        tenNhaXuatBan=  bf.readLine();
        System.out.println("Nhập số bản phát hành:");
        soBanPhatHanh = Integer.parseInt(bf.readLine());
        System.out.println("Nhập số phát hành:");
        int soPhatHanh = Integer.parseInt(bf.readLine());
        System.out.println("Nhập tháng phát hành:");
        int thangPhatHanh = Integer.parseInt(bf.readLine());

        TapChi tapChi = new TapChi(maTaiLieu,tenNhaXuatBan,soBanPhatHanh,soPhatHanh,thangPhatHanh);
        taiLieuList.add(tapChi);
        System.out.println("Thêm mới tạp chí thành công!");
    }

    public static void themBao() throws IOException {
        System.out.println("THÊM MỚI BÁO");
        System.out.println("Nhập mã tài liệu:");
        maTaiLieu = bf.readLine();
        System.out.println("Nhập tên nhà xuất bản:");
        tenNhaXuatBan= bf.readLine();
        System.out.println("Nhập số bản phát hành:");
        soBanPhatHanh =  Integer.parseInt(bf.readLine());
        System.out.println("Nhập ngày phát hành:");
        int ngayPhatHanh =  Integer.parseInt(bf.readLine());
        Bao bao = new Bao(maTaiLieu,tenNhaXuatBan,soBanPhatHanh,ngayPhatHanh);
        taiLieuList.add(bao);
        System.out.println("Thêm mới báo thành công!");
    }

    public static void thoatChucNangThemMoi(){
        System.out.println("Thoát chức năng thêm mới tài liệu!");
    }


    // chức năng 2
    public static void xoaTaiLieu() throws IOException {
        System.out.println("---------------------------------------");
        System.out.println("BẠN ĐÃ CHỌN XÓA TÀI LIỆU THEO MÃ TÀI LIỆU");
        System.out.println("Nhập mã tài liệu muốn xóa:");
        String maTL = bf.readLine();
        for(int i=0;i<taiLieuList.size();i++){
            if(taiLieuList.get(i).getMaTaiLieu().equals(maTL)){
                taiLieuList.remove(i);
                break;
            }
        }
        System.out.println("XÓA THÀNH CÔNG!");
        System.out.println(menu());
        chonChucNang();
    }
    // chức năng 3
    public static void hienThiThongTin(){
        System.out.println("------------------------------------");
        System.out.println("BẠN ĐÃ CHỌN CHỨC NĂNG HIỂN THỊ THÔNG TIN");
        for(int i=0;i<taiLieuList.size();i++){
            System.out.println(taiLieuList.get(i).toString());
        }
    }


    // chức năng 4
    public static void timKiemThongTin() throws IOException {
        System.out.println("------------------------------------");
        System.out.println("BẠN ĐÃ CHỌN CHỨC NĂNG TÌM KIẾM TÀI LIỆU THEO THỂ LOẠI.");
        System.out.println(menuChucNang4());
        System.out.println("Chọn chức năng:");
        int cn = Integer.parseInt(bf.readLine());
        while (cn>0 && cn<5){
            switch (cn){
                case 1:timKiemTheLoaiSach();
                break;
                case 2: timKiemTheLoaiTapChi();
                break;
                case 3:timKiemTheLoaiBao();
                break;
                case 4:thoatTimKiemTheoTheLoai();
                break;
            }
            if(cn==4){
                cn=5;
            }
            else{
                System.out.println("Chọn chức năng:");
                System.out.println(menuChucNang4());
                cn = Integer.parseInt(bf.readLine());
            }
        }
        System.out.println(menu());
        chonChucNang();
    }

    public static void timKiemTheLoaiSach(){
        System.out.println("-------------------------");
        System.out.println("Bạn đã chọn tìm kiếm theo thể loại SÁCH");
        System.out.println("Danh sách toàn bộ tài liệu thể loại SÁCH:");
            for (int i = 0; i < taiLieuList.size(); i++) {
                if (Sach.class.equals(taiLieuList.get(i).getClass())) {
                    Sach sach = (Sach) taiLieuList.get(i);
                    System.out.println(sach.toString());
                }
            }
    }
    public static void timKiemTheLoaiTapChi(){
        System.out.println("-------------------------");
        System.out.println("Bạn đã chọn tìm kiếm theo thể loại TẠP CHÍ");
        System.out.println("Danh sách toàn bộ tài liệu thể loại TẠP CHÍ:");
            for (int i = 0; i < taiLieuList.size(); i++) {
                if(TapChi.class.equals(taiLieuList.get(i).getClass())){
                    TapChi tapChi = (TapChi) taiLieuList.get(i);
                    System.out.println(tapChi.toString());
                }
            }
    }
    public static void timKiemTheLoaiBao(){
        System.out.println("-------------------------");
        System.out.println("Bạn đã chọn tìm kiếm theo thể loại Bao");
        System.out.println("Danh sách toàn bộ tài liệu thể loại Bao:");
        for (int i = 0; i < taiLieuList.size(); i++) {
            if(Bao.class.equals(taiLieuList.get(i).getClass())){
                Bao bao = (Bao) taiLieuList.get(i);
                System.out.println(bao.toString());
            }
        }
    }

    public static void thoatTimKiemTheoTheLoai(){
        System.out.println("THOÁT TÌM KIẾM THEO THỂ LOẠI!");
    }

    // chức năng 5
    public static void exit(){
        System.out.println("THOÁT KHỎI CHƯƠNG TRÌNH....");
    }

    /*-------------------------- MENU --------------------------------*/

    public static String menuChucNang1(){
        String menu1="1.1: Thêm mới SÁCH."+"\n"+
                     "1.2: Thêm mới TẠP CHÍ."+"\n"+
                     "1.3: Thêm mới BÁO."+"\n"+
                      "1.4: Thoát";
        return menu1;
    }


    public static String menuChucNang3(){
        String menu3="3.1: Hiển thị SÁCH."+"\n"+
                "3.2: Hiển thị TẠP CHÍ."+"\n"+
                "3.3: Hiển thị BÁO."+"\n"+
                "3.4: Thoát.";
        return menu3;
    }

    public static String menuChucNang4(){
        String menu4="4.1: Tìm kiếm theo loại SÁCH."+"\n"+
                    "4.2: Tìm kiếm theo loại TẠP CHÍ."+"\n"+
                    "4.3: Tìm kiếm theo loại BÁO."+"\n"+
                    "4.4: Thoát.";
        return  menu4;
    }
}
