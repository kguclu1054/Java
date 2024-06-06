package arraylistDemo;

import java.util.ArrayList;

public class Main {
    public static void main (String[] args){
        ArrayList sayilar = new ArrayList();
        System.out.println(sayilar.size());
        sayilar.add(1);
        sayilar.add(10);
        sayilar.add("Ankara");
        System.out.println(sayilar.get(2));

        sayilar.set(1,4000);
        System.out.println(sayilar.get(1));
    }
}
