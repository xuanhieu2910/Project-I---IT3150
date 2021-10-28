package xuanhieu.tuan3;
import java.util.*;
public class    bai8 {
    public static void main(String[] args) {
        // Bai 8:Cho một dãy số nguyên bất kỳ, hãy xóa đi trong dãy này các số hạng =0 và in ra
        //màn hình các số còn lại.
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
        c.stream().filter(s->s!=0).forEach(s-> System.out.println(s));
    }

}
