package xuanhieu.tuan4;
import java.util.*;
public class bai6 {
    public static void main(String[] args) {
        // Bai 6:
        System.out.println("Họ và tên: Vương Xuân Hiệu");
        System.out.println("MSSV: 20181063");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập sau kí tự:");
        String n = scanner.nextLine();
        String[]a=n.split("");
        System.out.println("Xâu ban đầu");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }
        System.out.println("");
        System.out.println("Xâu lúc sau:");
        for(int i=a.length-1;i>=0;i--){
            System.out.print(a[i]);
        }
    }
}
