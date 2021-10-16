package xuanhieu.tuan1;
import java.util.*;
public class bai2 {
    public static void main(String[] args) {
        System.out.println("Họ tên: Vương Xuân Hiệu ");
        System.out.println("MSSV: 20181063");
        //Bai2: Liệt kê số nguyên tố < 20
        List<Integer> nguyento = songuyento(20);
        System.out.println("Số nguyên tố < 20 là: ");
        for(int i = 0 ; i < nguyento.size(); i++){
            System.out.print(nguyento.get(i)+" ");
        }
    }
    public static boolean nhap(int n){
        if(n<0){
            return true;
        }
        else{
            return false;
        }
    }
    public static List<Integer> songuyento(int n){
        List<Integer>nt = new ArrayList<>();
        for(int i =2 ; i <n;i++){
            boolean KT= true;
            for(int j = 2; j <i ; j++){
                if(i%j ==0){
                    KT = false;
                    break;
                }
            }
            if(KT){
                nt.add(i);
            }
        }
        return nt;
    }
}