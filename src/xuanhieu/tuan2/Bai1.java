package xuanhieu.tuan2;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        // Bai 1: Tinh tong S = 1 + 1/(1+2) + 1/(1+2+3) + 1/(1+2+3+...+N)
        System.out.println("Họ và tên: Vương Xuân Hiệu");
        System.out.println("MSSV : 20181063");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số:");
        int n = scanner.nextInt();
        float result =0;
        float t =0;
        for(int i=1 ; i <=n ; i++){
            t=t+i;
            result+=(float)(1/t);
        }
        System.out.println(result);
    }
}
