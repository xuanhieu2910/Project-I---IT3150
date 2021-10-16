package xuanhieu.tuan1;
import java.util.*;
public class bai1 {
    public static void main(String[] args) {
        System.out.println("Họ tên: Vương Xuân Hiệu ");
        System.out.println("MSSV: 20181063");
        //Bai1: Liệt kê hợp số < 100
        List<Integer> nguyento = hopto(100);
        System.out.println("Hợp số < 100 là: ");
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
    public static List<Integer> hopto(int n){
        List<Integer>nt = new ArrayList<>();
        for(int i =2 ; i <n;i++){
            boolean KT= false;
            for(int j = 2; j <i ; j++){
                if(i%j ==0){
                    KT = true;
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
