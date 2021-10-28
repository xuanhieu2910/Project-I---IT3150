package xuanhieu.tuan3;
import java.util.*;
public class bai11 {
    public static void main(String[] args) {
        // Bài 11: Cho một dãy số nguyên bất kỳ. Hãy tìm 1 một dãy con liên tục đơn điệu tăng dài
        //nhất của dãy trên
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
        for (int i = 0; i < b.length; i++) {
            c.add(b[i]);
        }
        List<Integer>d = new ArrayList<>();
        int max = 1;
        for(int i=0;i<c.size();i++){
            int count=1;
            for(int j=i;j<c.size()-1;j++){
                if(c.get(j)<=c.get(j+1)){
                    ++count;
                }
                else{
                    break;
                }
            }
            if(max<count){
                max=count;
                d.add(max);//vi tri dau luu so luong day con
                d.add(i);// vi tri 2 luu vi tri bat dau day con
            }
        }
        for(int i=0;i<d.size();i+=2){
            if(d.get(i)==max){
                System.out.println("Độ dài dãy con dài nhất liên tục đơn điệu tăng là: "+max +" tại vị trí: "+d.get(i+1));
                System.out.println("Chỉ số dãy con đó là");
                int vitri=d.get(i+1);
                for(int j=0;j<max;j++){
                    System.out.print(c.get(vitri)+" ");
                    vitri++;
                }
            }
        }
    }
}
