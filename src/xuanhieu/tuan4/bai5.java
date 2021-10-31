package xuanhieu.tuan4;
import java.util.*;
public class bai5 {
    public static void main(String[] args) {
        // Bai 5:
        System.out.println("Họ và tên: Vương Xuân Hiệu");
        System.out.println("MSSV: 20181063");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập sau kí tự:");
        String n = scanner.nextLine();
        String[]a=n.split("");
        System.out.println("Xâu ban đầu ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }
        System.out.println("\n");
        for(int i=0;i<a.length;i++){
            if(a[i].equals("0")){
                a[i]="1";
            }
            else if(a[i].equals("1")){
                a[i]="0";
            }
        }
        System.out.println("Xâu lúc sau:");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }
    }
}
