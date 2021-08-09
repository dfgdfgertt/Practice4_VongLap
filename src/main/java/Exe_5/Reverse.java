package Exe_5;

import java.util.Scanner;

public class Reverse {
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
        int n = input.nextInt(), result=0;

        while(n != 0) {
            int digit = n % 10;
            result = result * 10 + digit;
            n /= 10;
        }
        System.out.println("Và kết quả là: " +  result);
    }




}
