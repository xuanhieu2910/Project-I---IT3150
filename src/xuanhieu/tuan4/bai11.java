package xuanhieu.tuan4;
import java.util.*;
public class bai11 {
    public static void main(String[] args) {
        // Bai 11:
        System.out.println("Họ và tên: Vương Xuân Hiệu");
        System.out.println("MSSV: 20181063");
        Scanner scanner = new Scanner(System.in);
        String s1 = "Nguyen Van An";
        String s2 = "Ha Tuan An";
        String s3 = "Vuong Xuan Hieu";
        int count=0;
        List<String> arr = Arrays.asList(s1,s2,s3);
        for(int i=0;i<arr.size();i++){
            if(arr.get(i).contains("An")){
                ++count;
            }
        }
        System.out.println("Số bạn có tên An: "+count);

    }
}
