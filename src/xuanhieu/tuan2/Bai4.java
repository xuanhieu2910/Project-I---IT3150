package xuanhieu.tuan2;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        // Bai 4:Tính dãy số Fibonaxi
        System.out.println("Họ và tên: Vương Xuân Hiệu");
        System.out.println("MSSV: 20181063");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số:");
        int n = scanner.nextInt();
        int result = Fibonaxi(n);
        System.out.println(result);
    }
    public static int Fibonaxi(int k){
        if(k==1){
            return 1;
        }
        else if(k==0){
            return 0;
        }
        else{
            return Fibonaxi(k-1)+Fibonaxi(k-2);
        }
    }
}
