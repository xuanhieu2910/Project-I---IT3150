package xuanhieu.tuan4;
import java.util.*;
public class bai4 {
    public static void main(String[] args) {
        // Bai 4:
        System.out.println("Họ và tên: Vương Xuân Hiệu");
        System.out.println("MSSV: 20181063");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên đầy đủ: ");
        String n = scanner.nextLine();
        String[] arr = n.split("");
        for(int i= 0; i< arr.length;i++){
            if(arr[i].equals(" ")){
                for(int j=0;j<i;j++){
                    System.out.print(arr[j]);
                }
                break;
            }
        }
    }
}
