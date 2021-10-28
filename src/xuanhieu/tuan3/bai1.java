package xuanhieu.tuan3;

import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        // Bai 1:Cho một dãy số tự nhiên, viết chương trình sắp xếp dãy này theo thứ tự giảm dần
        System.out.println("Họ và tên: Vương Xuân Hiệu");
        System.out.println("MSSV : 20181063");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng:");
        int n = scanner.nextInt();
        System.out.println("Nhập dãy số:");
        List<Integer> c = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            int nhap = scanner.nextInt();
            c.add(nhap);
        }
        c.stream().sorted(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        }).forEach(s-> System.out.print(s+" "));
    }
}
