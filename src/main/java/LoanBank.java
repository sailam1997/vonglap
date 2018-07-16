import java.util.Scanner;
public class LoanBank {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double money = 1.0;
        int month ;
        double IR = 1.0 ;
        System.out.println("Moi ban nhap vao so tien gui:");
        money = input.nextDouble();
        System.out.println("Moi ban nhap he so lai :");
        IR = input.nextDouble();
        System.out.println("Moi ban nhap vao so thang :");
        month = input.nextInt();
        double TI = 0;
        for (int i = 0; i < month ; i++){
            TI = money*(IR/100)/12*month;
        }
        System.out.println("Lai suat cua ban la :" + TI);
    }
}
