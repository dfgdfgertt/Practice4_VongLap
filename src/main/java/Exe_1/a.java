package Exe_1;

import java.util.ArrayList;
import java.util.Scanner;

public class a {
    public static Scanner input = new Scanner(System.in);
    public static void start(){


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


        if (check(n))
            System.out.println("Số " + n + " là số đối xứng.\n");
        else
            System.out.println("Số " + n + " không là số đối xứng.\n");
    }

    public static boolean check(int n){
        if (n < 99)
            return false;
        int model = n, result = 0;
        while(n != 0) {
            int digit = n % 10;
            result = result * 10 + digit;
            n /= 10;
        }
        if (model == result)
            return true;
        else
            return false;
    }
}
