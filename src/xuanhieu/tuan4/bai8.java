package xuanhieu.tuan4;
import java.util.*;
public class bai8 {
    public static void main(String[] args) {
        // Bai 8:
        System.out.println("Họ và tên: Vương Xuân Hiệu");
        System.out.println("MSSV: 20181063");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập xâu ký tự S1: ");
        String n = scanner.nextLine();
        String[] xauA = n.split("");
        System.out.println("Nhập xâu ký tự S2: ");
        String n1 = scanner.nextLine();
        String[] xauB = n1.split("");
        boolean KT = true;
        int count=0;
        if(xauA.length > xauB.length){
            System.out.println("Xâu A không xuất hiện trong xâu B!");
        }
        else {
            for (int i = 0; i < xauB.length; i++) {
                if(xauB[i].equals(xauA[0]) && xauB.length >= xauA.length){
                    for(int j=0;j< xauA.length;j++){
                        if(!xauA[j].equals(xauB[i])){
                            KT=false;
                            break;
                        }
                        else{
                            i++;
                        }
                    }
                    if(KT){
                        ++count;
                    }
                }

            }
        }
        System.out.println("Số lần xuất hiện xâu A trong xâu B là: "+count);

    }
}
