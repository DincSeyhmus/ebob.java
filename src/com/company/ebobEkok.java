package com.company;

import java.util.*;

public class ebobEkok {

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("ilk sayı");
        float a = klavye.nextInt();

        System.out.println("ikinci sayı");
        float b = klavye.nextInt();
        List<Integer> aBolenler = new ArrayList<Integer>();
        List<Integer> bBolenler = new ArrayList<Integer>();
        for (int i = 0; i <= a; i++) {
            if (a % i == 0) {
                aBolenler.add(i);
            }
        }
        for (int i = 0; i <= b; i++) {
            if (b % i == 0) {
                bBolenler.add(i);
            }
        }
        for (int i = 0; i < aBolenler.size(); i++) {
            System.out.println(" " + aBolenler.get(i));
        }
        System.out.println("*********************");
        for (int i = 0; i < bBolenler.size(); i++) {
            System.out.println(" " + bBolenler.get(i));
        }
        List<Integer> tumBolenler = new ArrayList<Integer>();
        tumBolenler.addAll(aBolenler);
        tumBolenler.addAll(bBolenler);
        System.out.println("****************************");
        for (int i = 0; i < tumBolenler.size(); i++) {
            System.out.println(" " + tumBolenler.get(i));
        }
        System.out.println("aynı elemanlar***************************");
        for (int i = 0; i < tumBolenler.size(); i++) {
            int flag = 0;

            for (int j = 0; j < i; j++) {
                if (tumBolenler.get(i) == tumBolenler.get(j)) {
                    flag = 1;
                    break;
                }
            }

            if (flag == 0) {
                System.out.println(tumBolenler.get(i) + " ");
            }
        }

        System.out.println('\n');

       Collections.sort(tumBolenler);
        System.out.println("Tüm Bölenler ********************************************************");
        for (int i = 0; i < tumBolenler.size(); i++) {
            System.out.println(tumBolenler.get(i));
        }
        List<Integer> ortakBolenler=new ArrayList<Integer>();
        for (int i = 0; i < tumBolenler.size(); i++) {
            if(b%tumBolenler.get(i)==0 && a%tumBolenler.get(i)==0){
              ortakBolenler.add(tumBolenler.get(i));
            }
        }
        System.out.println("ortak bölenler **************************");
        for (int i = 1; i < ortakBolenler.size(); i++) {
            System.out.println(ortakBolenler.get(i));
        }
        System.out.println("ebob "+ Collections.max(ortakBolenler));
    }
}
