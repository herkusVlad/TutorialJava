package Base;

import java.awt.*;
import java.util.Scanner;

public class ConditionalType {
    public static void main(String[] args) {

        // !=, ==, >, <, =>, =<
        // ||, &&, |, &
        //true  &&    false
//        if ((str != str2 && a == b) || (str != str2 && a == b)) {
//            System.out.println("A = B");
//        } else {
//            System.out.println("Else ");
//        }
//        if(a > b){
//        } else if(a<b){
//        }
        //a == 3
        //str = 2
        //str2 = 21
//        switch (str2){
//            case "1":
//                System.out.println(" it`s 0 ");
//                break;
//            case "2":
//                System.out.println(" it`s 1 ");
//                break;
//            case "3":
//                System.out.println(" it`s 2 ");
//                break;
//            case "21":
//                System.out.println("it`s 3 ");
//                break;
//        }
//      тернарный оператор
        // a = 0, b =2
//        String str3 = a < b ? "A < B " : "A >=B";
//        if(a < b){
//            str3 = "123";
//        }else{
//            str3 = "321";
//        }
        Scanner scanner = new Scanner(System.in);

        int hour = 0;
        int min = 0;

        String str = "2";
        String str2 = "21";

//        System.out.println("Enter hour: ");
//        hour = scanner.nextInt();//nextLine()
//        System.out.println("Enter min: ");
//        min = scanner.nextInt();//nextLine()
//
//        System.out.println("Enters num : "+ hour + ":" + min );

        System.out.println("Enter min: ");
        min = scanner.nextInt();//nextLine()
        // 600 => 10, 180, 120,60, 30, 150,250
        // %
        System.out.println("Enters time : "+ hour + ":"  );
    }
}