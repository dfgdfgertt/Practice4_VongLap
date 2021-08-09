package Exe_4;

import java.util.Scanner;

public class SumPrime {
    public static Scanner input = new Scanner(System.in);

    public static void start(){
        Scanner input = new Scanner(System.in);
        Boolean conti = true;
        do{
            content();

            System.out.print("Nhấn phím bất kỳ để tiếp tục.\nPhím 0 để kết thúc.\nNhập: ");
            int choose= input.nextInt();
            switch (choose){
                case 0:
                    conti = false;
                    break;
                default:
                    break;
            }
        }while (conti);

    }

    public static void content(){
        int n = 0;
        do {
            System.out.print("Nhập một số nguyên dương (nhỏ hơn 50): ");
            n = input.nextInt();
        }while (n > 50);


        System.out.println("Tổng của các số nguyên tố dưới "+n+ " là: " + sumPrime(n));
    }

    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static long sumPrime(int n){
        long total=0;
        for (int i = 1; i <= n; i++) {
            if (isPrimeNumber(i)){
                System.out.print(i+" ");
                total+= i;
            }

        }
        System.out.println();
        return total;
    }
}
