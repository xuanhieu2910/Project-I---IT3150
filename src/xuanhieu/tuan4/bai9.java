package xuanhieu.tuan4;
import java.util.*;
public class bai9 {
    public static void main(String[] args) {
        // Bai 9:
        System.out.println("Họ và tên: Vương Xuân Hiệu");
        System.out.println("MSSV: 20181063");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập xâu ký tự S: ");
        String n = scanner.nextLine();
        String[] xauA = n.split("");
        System.out.println("Chỉ số dược đánh từ 0 -> n-1");
        System.out.println("Chỉ số i: ");
        int i= Integer.parseInt(scanner.nextLine());
        System.out.println("Chỉ số j: ");
        int j = Integer.parseInt(scanner.nextLine());

        if(isCheckContains(i,j,xauA)){
            System.out.println("Một trong 2 chỉ số không nằm trong dãy!\n Vui lòng kiểm tra lại!");
        }
        else{
            System.out.println("Xâu ban đầu: ");
            for(int h=0;h< xauA.length;h++){
                System.out.print(xauA[h]);
            }
            System.out.println("");
            System.out.println("Xâu lúc sau đổi chỗ: ");
            String tmp = xauA[i];
            xauA[i] = xauA[j];
            xauA[j] =tmp;
            for(int h=0;h< xauA.length;h++){
                System.out.print(xauA[h]);
            }
        }

    }

    public static boolean isCheckContains(int i,int j,String[] xau){
        if(i>= xau.length || j>= xau.length){
            return true;
        }
        else{
            return false;
        }

    }
}
