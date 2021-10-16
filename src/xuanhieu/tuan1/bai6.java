package xuanhieu.tuan1;

public class bai6 {
    public static void main(String[] args) {
        System.out.println("Họ tên: Vương Xuân Hiệu ");
        System.out.println("MSSV: 20181063");
        //Bai6 : In ra màn hình 5 số hoàn hảo đầu tiên
        for(int i = 1 ; i < 10000; i++) {
            int sum = 0;
            for(int j = 1 ; j <= i/2;j++){
                if(i%j==0){
                    sum+=j;
                }
            }
            if(i==1){
                System.out.println("Số hoàn hảo là :" + i);
            }
            else if(sum == i){
                System.out.println("Số hoàn hảo là: "+i);
            }
        }
    }

}
