package xuanhieu.tuan3;
import java.util.*;
public class bai9 {
    public static void main(String[] args) {
        // Bài 9: Cho một dãy số nguyên bất kỳ, cho trước 1 số c. Hãy đếm có bao nhiêu số của
        //dãy trên =c; >c; <c.
        System.out.println("Họ và tên: Vương Xuân Hiệu");
        System.out.println("MSSV : 20181063");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài dãy số:");
        int n = scanner.nextInt();
        System.out.println("Nhập số: ");
        int b[] = new int[n];
        for (int i = 0; i < n; i++) {
            int nhap = scanner.nextInt();
            b[i] =nhap;
        }
        List<Integer> c = new ArrayList<>();
        for(int i=0;i<b.length;i++){
            c.add(b[i]);
        }
        System.out.println("Nhập số C");
        int soC = scanner.nextInt();
        System.out.println("Các số bằng số C:");
        for(int i=0;i<c.size();i++){
            if(soC==c.get(i)){
                System.out.println(c.get(i));
            }
        }
        System.out.println("Các số nhỏ hơn số C:");
        for(int i=0;i<c.size();i++){
            if(soC>c.get(i)){
                System.out.println(c.get(i));
            }
        }
        System.out.println("Các số lớn hơn số C:");
        for(int i=0;i<c.size();i++){
            if(soC<c.get(i)){
                System.out.println(c.get(i));
            }
        }

    }
}
