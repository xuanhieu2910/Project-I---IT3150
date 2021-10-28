package xuanhieu.tuan3;
import java.util.*;
import java.util.stream.Collectors;

public class bai10 {
    public static void main(String[] args) {
        // Bai 10: Cho một dãy số nguyên bất kỳ, hãy tìm ra 1 một dãy số liền nhau dài nhất bao
        //gồm các số bằng nhau. Hãy in ra số lượng và các chỉ số đầu tiên của dãy con này
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
        int max = 1;
        List<Integer>d = new ArrayList<>();
        for(int i = 0 ; i < c.size()-1;i++){
            int count =1;
            for(int j=i+1;j<c.size();j++){
                if(c.get(j)!=c.get(i)){
                    break;
                }
                else{
                    ++count;
                }
            }
            if(max<count){
                max=count;
                d.add(c.get(i));//Chi so dau tien luu gia tri
                d.add(max);//Chi so thu hai luu so luong;
            }

        }
        for(int i=1;i<d.size();i+=2){
            if(max==d.get(i)){
                System.out.println("Dãy con có số lượng dãy số bằng nhau dài nhất là: "+max + " chỉ số của dãy con là: "+d.get(i-1));
                break;
            }
        };
    }
}
