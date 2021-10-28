package xuanhieu.tuan3;
import java.util.*;
import java.util.stream.Collectors;

public class bai7 {
    public static void main(String[] args) {
        // Bai 7:Cho một dãy số tự nhiên, hãy tìm 1 số tự nhiên nhỏ nhất c không bằng bất cứ số
        //nào trong dãy trên.
        System.out.println("Họ và tên: Vương Xuân Hiệu");
        System.out.println("MSSV : 20181063");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài dãy số:");
        int n = scanner.nextInt();
        System.out.println("Nhập số: ");
        int b[] = new int[n];
        for (int i = 0; i < n; i++) {
            int nhap = scanner.nextInt();
            b[i] =nhap;
        }
        List<Integer> c = new ArrayList<>();
        for(int i=0;i<b.length;i++){
            c.add(b[i]);
        }
        c=c.stream().sorted().collect(Collectors.toList());
        for(int i = 0 ; i <c.size();i++){
            for(int j=i+1;j<c.size();j++){
                if(c.get(j)==c.get(i)){
                    c.set(j,0);
                    c.set(i,0);
                }
            }
        }
        System.out.println(c.stream().filter(s->s!=0).collect(Collectors.toList()).get(0));
    }
}
