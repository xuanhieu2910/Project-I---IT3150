package xuanhieu.tuan4;
import java.util.*;
public class bai13 {
    public static void main(String[] args) {
        // Bai 13:
        System.out.println("Họ và tên: Vương Xuân Hiệu");
        System.out.println("MSSV: 20181063");
        Scanner scanner = new Scanner(System.in);
        String s1 = "Nguyễn Văn H1";
        String s2 = "Nguyễn Văn T1";
        String s3 = "Nguyễn Thị CH1";
        String s4 = "Vương Xuân Hiệu";
        int count=0;
        List<String> arrA = Arrays.asList(s1,s2,s3,s4);
        for(int h=0;h<arrA.size();h++) {
            String[]arr = arrA.get(h).split("");
            for (int i = arr.length - 1; i > 0; i--) {
                if (arr[i].equals(" ")) {
                    for (int j = i + 1; j < arr.length; j++) {
                        if(arr[j].equals("H")){
                            ++count;
                        }
                        else{
                            break;
                        }
                    }
                    break;
                }
            }
        }
        System.out.println("Số bạn có tên bắt đầu bằng chữ H là : "+count);
    }
}
