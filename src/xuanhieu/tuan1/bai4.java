package xuanhieu.tuan1;

public class bai4 {
    public static void main(String[] args) {
        System.out.println("Họ tên: Vương Xuân Hiệu ");
        System.out.println("MSSV: 20181063");
        //Bai4  : Các số <100 chia hết cho 3 và 7
        for(int i = 0 ; i < 100 ; i ++){
            if(i%3==0 && i%7==0){
                System.out.println("Các số < 100 chia hết cho 3 và 7 là:"+i);
            }
        }
    }
}
