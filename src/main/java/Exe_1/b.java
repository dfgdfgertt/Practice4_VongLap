package Exe_1;

import java.util.Scanner;

public class b {
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


        if (check(n))
            System.out.println("Số " + n + " là số chính phương.\n");
        else
            System.out.println("Số " + n + " không là số chính phương.\n");
    }



    public static boolean check(int n){
        int result= (int) Math.sqrt(n);
        if (result*result == n)
            return true;
        else
            return false;
    }
}
