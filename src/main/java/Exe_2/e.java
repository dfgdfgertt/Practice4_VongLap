package Exe_2;

import java.util.Scanner;

public class e {
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
        System.out.print("Nhập một số nguyên dương: ");
        int n = input.nextInt();

        System.out.println("S = " + totalFactorial(n));
    }

    public static long totalFactorial(int n){
        long total = 0;
        for (int i = 1; i <= n; i++) {
            total += d.loopFactorial(i);
        }
        return total;
    }
}
