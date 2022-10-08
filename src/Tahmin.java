import com.sun.jdi.IntegerValue;

import java.util.Random;
import java.util.Scanner;

public class Tahmin {
    public static int Rand(){
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int sayi = rd.nextInt(1000000);
    return sayi;
    }
    public static void tahminEt(){
        System.out.println("Bir sayi tahmin ediniz....");
        Scanner sc = new Scanner(System.in);
        int tahmin = sc.nextInt();
        int say = Rand();
        int hamle = 0;
        boolean flag = true;

        while (flag == true){
            if (tahmin== say){
                System.out.println("Tahmininiz dogru sayi : " + say);
                hamle++;
                flag=false;
            } else if (tahmin<say) {
                System.out.println("Tahmininizden daha buyuk bir sayi...");
                hamle++;
                tahmin = sc.nextInt();
            }
            else {
                System.out.println("Tahmininizden kucuk bir sayi...");
                hamle++;
                tahmin = sc.nextInt();
            }
            if (hamle==10){
                System.out.println("MAX HAMLE SAYISINA ULASTINIZ...");
                System.out.println("KAYBETTİNİZ SAYI " +say+" idi .");
                break;
            }
        }
    }
}

