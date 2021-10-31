package xuanhieu.tuan4;
import java.util.*;
public class bai15 {
    public static void main(String[] args) {
        // Bai 15:
        System.out.println("Họ và tên: Vương Xuân Hiệu");
        System.out.println("MSSV: 20181063");
        Scanner scanner = new Scanner(System.in);
        String S1= "Xuân";
        String S2= "VươngHiệu";
        System.out.println("Chèn xâu 1 vào giữa xâu 2:");
        int tb = S2.length()/2;
        String a1 = S2.substring(0,tb+1);
        String a2=  S2.substring(S2.length()-tb);
        System.out.println(a1+S1+a2);
    }
}
