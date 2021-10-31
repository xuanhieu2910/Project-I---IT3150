package xuanhieu.tuan4;
import java.util.*;
public class bai7 {
    public static void main(String[] args) {
        // Bai 7:
        System.out.println("Họ và tên: Vương Xuân Hiệu");
        System.out.println("MSSV: 20181063");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập dãy ký tự: ");
        String n = scanner.nextLine();
        String[] arr = n.split("");
        System.out.println("Số ban đầu: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            if(isCheckKyTu(arr[i])){
                arr[i]="$";
            }
        }
        System.out.println("");
        System.out.println("Số lúc sau: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    public static boolean isCheckKyTu(String input){
        String mang[]={"1","2","3","4","5","6","7","8","9","0"};
        for(int i =0;i<mang.length;i++){
            if(input.equals(mang[i])){
                return true;
            }
        }
        return false;
    }
}
