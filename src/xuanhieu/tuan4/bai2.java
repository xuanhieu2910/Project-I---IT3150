package xuanhieu.tuan4;
import java.util.*;
public class bai2 {
    public static void main(String[] args) {
        // Bai 2:
        System.out.println("Họ và tên: Vương Xuân Hiệu");
        System.out.println("MSSV: 20181063");
        Scanner scanner = new Scanner(System.in);
        String[]abc={"a","b","c"};
        System.out.println("Nhập tên đầy đủ: ");
        String n = scanner.nextLine();
        String[] arr = n.split("");
        if (arr.length < 3) {
            System.out.println("Số lần xuất hiện: 0");
        } else {
            int count=0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals("a") && arr.length-i>=3) {
                    for (int j=0;j<3;j++){
                        if(!arr[i+1].equals(abc[j+1])){
                            break;
                        }
                        else{
                            ++count;
                        }
                    }

                }
            }
            System.out.println("Số dãy con là: "+count);
        }
    }
}
