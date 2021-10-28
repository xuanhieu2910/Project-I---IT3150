package xuanhieu.tuan3;
import java.util.*;
public class bai12 {
    public static void main(String[] args) {
        // Bai 12: Dãy số a[ ] được gọi là dãy con của b[ ] nếu từ b [ ] xóa đi 1 vài số sẽ thu được
        //a[ ]. Cho trước 2 dãy số nguyên a[ ]; b[ ]. Hãy kiểm tra xem a[ ] có là dãy con của b[ ]
        //hay không?.
        System.out.println("Họ và tên: Vương Xuân Hiệu - MSSV : 20181063");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài số A:");
        int n = scanner.nextInt();
        int[] dayA = new int[n];
        System.out.println("Nhập dãy số A:");
        for(int i = 0 ; i <  n; i ++){
            int nhap = scanner.nextInt();
            dayA[i] = nhap;
        }
        System.out.println("Nhập độ dài số B:");
        int m = scanner.nextInt();
        System.out.println("Nhập dãy số B:");
        int[] dayB= new int[m];

        for(int i = 0 ; i < m ; i ++){
            int nhap = scanner.nextInt();
            dayB[i] = nhap;
        }

        if(isContains(dayA,dayB)){
            System.out.println("B contains A");
        }
        else{
            System.out.println("B no contains A");
        }
    }



    public static boolean isContains(int[]a , int[]b){
        boolean result = false;
        int sizeA = a.length;
        int sizeB= b.length;
        if(sizeA>sizeB){
            return result;
        }
        for(int i=0;i<sizeB;i++){
            if(b[i]==a[0] && (sizeB-i)>=sizeA){
                int k=i;
                for(int j=0;j<sizeA;j++){
                    if(a[j]==b[k]){
                        result = true;
                        ++k;
                    }
                    else{
                        break;
                    }
                }
            }
        }
        System.out.println(result);
        return result;
    }
}
