package xuanhieu.tuan4;
import java.util.*;
public class bai3 {
    public static void main(String[] args) {
        // Bai 3:
        System.out.println("Họ và tên: Vương Xuân Hiệu");
        System.out.println("MSSV: 20181063");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên đầy đủ: ");
        String n = scanner.nextLine();
        String[] arr = n.split("");
        for(int i = arr.length-1; i>0;i--){
            if(arr[i].equals(" ")){
                for(int j=i+1;j<arr.length;j++){
                    System.out.print(arr[j]);
                }
                break;
            }
        }
    }
}
