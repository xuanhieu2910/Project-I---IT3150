package xuanhieu.tuan4;
import java.util.*;
public class bai10 {
    public static void main(String[] args) {
        // Bai 10:
        System.out.println("Họ và tên: Vương Xuân Hiệu");
        System.out.println("MSSV: 20181063");
        Scanner scanner = new Scanner(System.in);
        String s1="Vương Xuân Hiệu";
        System.out.println("Xâu ký tự 1: "+s1);
        String s2 = "Vương Xuân Hiệu - SVBK";
        System.out.println("Xâu ký tự 2: "+s2);
        List<String> arr = Arrays.asList(s1,s2);
        Map<Integer,String>stringMap = new HashMap<>();
        int max = s1.length();
        for(int i=1;i < arr.size();i++){
            if(max < arr.get(i).length()){
                max = arr.get(i).length();
                stringMap.put(1,arr.get(i));
            }
        }
        System.out.println("Xâu có độ dài nhất là: "+stringMap.get(1));
    }

}
