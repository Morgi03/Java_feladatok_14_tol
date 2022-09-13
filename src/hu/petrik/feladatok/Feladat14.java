package hu.petrik.feladatok;

import java.util.Scanner;

public class Feladat14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem adjon meg egy szöveget");
        String szoveg = sc.nextLine();
        String menupont = "";
        while (!menupont.equals("f")){
            System.out.println("Adja meg, hogy mit szeretne csinálni a szöveggel:");
            System.out.println("\ta - nagybetűssé alakítani");
            System.out.println("\tb - kisbetűssé alakítani");
            System.out.println("\tc - lekérdezni a hosszát");
            System.out.println("\td - összehasonlítani egy másik szöveggel");
            System.out.println("\te - a szöveg egy részét kiiratni");
            System.out.println("\tf - kilépni");
        }
    }
}
