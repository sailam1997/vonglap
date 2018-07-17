import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Cac so nguyen to nho hon 100 la :");
        for ( int i = 0 ; i < 100 ; i ++ ){
            if (isPrimeNumbers(i)){
                System.out.println(i+ " ");
            }
        }
    }
    public static boolean isPrimeNumbers(int n){
        if (n < 2){
            return true;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2 ; i <= squareRoot; i++){
            if (n%i==0){
                return false;
            }
        }
        return true ;
    }
}
