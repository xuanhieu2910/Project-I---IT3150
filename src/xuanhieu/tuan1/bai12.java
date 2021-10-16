package xuanhieu.tuan1;

import java.util.Scanner;

public class bai12 {
    public static void main(String[] args) {
        System.out.println("Họ tên: Vương Xuân Hiệu ");
        System.out.println("MSSV: 20181063");
        // Bai 12: Vẽ tam giác với độ cao cho trước.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập N=");
        int n = scanner.nextInt();
        while (nhap(n)){
            System.out.println("Nhập sai vui lòng nhập lại");
            System.out.println("Nhập N=");
            n = scanner.nextInt();
        }
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

    }
    public static boolean nhap(int n){
        if( (n>=2) && (n<=10)){
            return false;
        }
        else{
            return true;
        }
    }

}
