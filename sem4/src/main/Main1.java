package main;

import ro.ase.cts.singleton.*;

public class Main1 {
    public static void main(String[] args) {

        Radio radio1=Radio.getInstance("RomaniaFM", 89.1f, 4);
        Radio radio2=Radio.getInstance("VIrgin", 83.5f, 5);

        System.out.println(radio1.toString());
        System.out.println(radio2.toString());


        System.out.println(radio1.toString());
        System.out.println(radio2.toString());
    }

//    bunnnnaaanananana
}
