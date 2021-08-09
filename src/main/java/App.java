import Exe_1.a;
import Exe_1.b;
import Exe_2.d;
import Exe_2.e;
import Exe_4.SumPrime;
import Exe_5.Reverse;

import java.util.Scanner;

public class App {
    public static void main(String[] main){
        Scanner input = new Scanner(System.in);

        Boolean choose = true;
        do {
            System.out.println("*******MENU******");
            System.out.println("1. Tìm số đối xứng.");
            System.out.println("2. Tìm số chính phương.");
            System.out.println("3. Tính giai thừa.");
            System.out.println("4. Tính tổng các giai thừa.");
            System.out.println("5. Tính tổng các số nguyên nhỏ hơn n.");
            System.out.println("6. Xuất ngược số n.");
            System.out.println("0. Thoát.");
            System.out.print("Chọn số:");
            int num = input.nextInt();
            switch (num){
                case 1:
                    a.start();
                    break;
                case 2:
                    b.start();
                    break;
                case 3:
                    d.start();
                    break;
                case 4:
                    e.start();
                    break;
                case 5:
                    SumPrime.start();
                    break;
                case 6:
                    Reverse.start();
                    break;
                case 0:
                    choose = false;
                    break;
                default:
                    break;
            }

        }while (choose);

    }
}
