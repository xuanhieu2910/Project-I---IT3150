package xuanhieu.tuan1;

public class bai7 {


    public static void main(String[] args) {
        System.out.println("Họ tên: Vương Xuân Hiệu ");
        System.out.println("MSSV: 20181063");
        //Bai7: Trong các số tự nhiên < 100 hãy đếm:
        System.out.println("Kết quả: ");
        int count0=0;
        int count1=0;
        int count2=0;
        int count3=0;
        for(int i=0;i<=100;i++){
            if(i%5==0){
                count0= count0 + 1;

            }
        }
        System.out.println("Số các số tự nhiên chia hết cho 5 là:"+count0);
        for(int i=0;i<100;i++){
            if(i%5==1){
                count1=count1+1;
            }
        }
        System.out.println("Số tự nhiên chia 5 dư 1: "+count1);
        for(int i=0;i<100;i++){
            if(i%5==2){
                count2=count2+1;
            }
        }
        System.out.println("Số tự nhiên chia 5 dư 2: "+count2);
        for(int i=0;i<100;i++){
            if(i%5==3){
                count3=count3+1;
            }
        }
        System.out.println("Số tự nhiên chia 5 dư 3: "+count3);
    }
}
