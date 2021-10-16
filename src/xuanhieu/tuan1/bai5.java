package xuanhieu.tuan1;

public class bai5 {
    public static void main(String[] args) {
        System.out.println("Họ tên: Vương Xuân Hiệu ");
        System.out.println("MSSV: 20181063");
        //Bai5 : Các số nằm giữa 1000 và 2000 đồng thời chia hết cho 3,7,5;
        for(int i = 1001 ; i< 2000 ; i ++){
            if(i%3==0 && i%7==0 && i%5==0){
                System.out.println("Các số nằm giữa 1000 và 2000 chia hết cho 3,7,5 là:"+i);
            }
        }
    }
}
