package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {


        ArrayList<Integer>arrayList = new ArrayList<>();
        ArrayList<Integer>arrayList1 = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            int a = random.nextInt(100);
            if (a % 2 == 0){
                arrayList.add(a);
            }
            if (a % 2 != 0){
                arrayList1.add(a);
            }
            System.out.print(a+" ");
        }
        System.out.println("\nтак сандар "+arrayList);
        System.out.println("жуп сандар "+arrayList1);



//
//        }
//        System.out.println(arrayList);
//
//
//        ArrayList<Integer> arrayList1 = new ArrayList<>();
//        arrayList1.removeIf(a -> a % 2 == 0 );
//        System.out.println("fdjkgn"+arrayList1);

//        ArrayList<Integer>arrayList2 = new ArrayList<>();
//        arrayList2.removeIf(b -> b % 2 == 0);
//        System.out.println("jifskn"+arrayList2);

    }
}
