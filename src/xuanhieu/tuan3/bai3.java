package xuanhieu.tuan3;

import java.util.Scanner;
import java.util.*;
import java.util.stream.Collectors;

public class bai3 {
    //Bài 3 : Cho một dãy các số tự nhiên, tìm và in ra 1 giá trị min của dãy này và tất cả các
    //chỉ số ứng với giá trị min này
    public static void main(String[] args){
        System.out.println("Họ và tên: Vương Xuân Hiệu");
        System.out.println("MSSV : 20181063");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài của dãy:");
        int n = scanner.nextInt();
        List<Integer> b = new ArrayList();
        System.out.println("Nhập dãy số : ");
        for(int i= 0 ; i<n;i++){
            int nhap = scanner.nextInt();
            b.add(nhap);
        }
        b= b.stream().sorted(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        }).collect(Collectors.toList());
        System.out.println(b.get(0));
    }
}
