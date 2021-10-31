package xuanhieu.tuan4;
import java.util.*;
public class bai16 {
    public static void main(String[] args) {
        // Bai 16:
        System.out.println("Họ và tên: Vương Xuân Hiệu");
        System.out.println("MSSV: 20181063");
        Scanner scanner = new Scanner(System.in);
        String xau1= "Xuân";
        String xau2= "VươnXgunHâiệu";
        boolean KT = true;
        for(int i=0;i<xau1.length();i++){
            if(!xau2.contains(xau1.split("")[i])){
                KT = false;
            }
        }
        if(KT){
            System.out.println("Xâu 1 là con của xâu 2!");
        }
        else{
            System.out.println("Xâu 1 không là con của xâu 1");
        }
    }
}
