package xuanhieu.tuan3;
import java.util.*;
public class bai5 {
    public static void main(String[] args) {
        // Bai 5:Cho một dãy số tự nhiên, hãy đếm xem trong dãy số trên có bao nhiêu số nguyên
        //tố, có bao nhiêu hợp số.
        System.out.println("Họ và tên: Vương Xuân Hiệu");
        System.out.println("MSSV : 20181063");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài của dãy số:");
        int n = scanner.nextInt();
        System.out.println("Nhập số:");
        int b[] = new int[n];
        for(int i = 0 ; i <n ; i++){
            int nhap = scanner.nextInt();
            b[i] = nhap;
        }
        List<Integer>c = new ArrayList<>();
        List<Integer>d = new ArrayList<>();
        for(int i = 0 ; i < b.length ; i++){
            if(isCheck(b,b[i])){
                c.add(b[i]);
            };
            if(isCheckHopso(b,b[i])==false){
                d.add(b[i]);
            }
        }
        System.out.println("Nguyên tố: "+ c.size());

        System.out.println("Hợp số: "+d.size());
    }

    public static boolean isCheck(int b[],int input){
        boolean KT = true;
        if(input==1){
            KT=false;
            return KT;
        }
        for(int i=2; i<input;i++){
            if(input%i==0){
                KT=false;
                break;
            }
        }
        return KT;
    }
    public static boolean isCheckHopso(int b[],int input){
        boolean KT = true;
        if (input == 1) {
            KT=true;
            return KT;
        }
        for(int i=2;i<input;i++){
            if(input%i==0){
                KT=false;
                break;
            }
        }

        return KT;
    }
}
