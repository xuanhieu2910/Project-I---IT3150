package xuanhieu.tuan4;
import java.util.*;
public class bai12 {
    public static void main(String[] args) {
        // Bai 12:
        System.out.println("Họ và tên: Vương Xuân Hiệu");
        System.out.println("MSSV: 20181063");
        Scanner scanner = new Scanner(System.in);
        String s1 = "Nguyễn Thị A";
        String s2 = "Nguyễn Thị B";
        String s3 = "Nguyễn Thị C";
        String s4 = "Vương Xuân Hiệu";
        int count=0;
        List<String> arr = Arrays.asList(s1,s2,s3,s4);
        for(int i=0;i<arr.size();i++){
            if(arr.get(i).contains("Thị")){
                ++count;
            }
        }
        System.out.println("Số bạn có tên đệm Thị: "+count);

    }
}
