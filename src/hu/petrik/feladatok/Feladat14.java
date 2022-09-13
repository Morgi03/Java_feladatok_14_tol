package hu.petrik.feladatok;

import java.util.Scanner;

public class Feladat14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem adjon meg egy szöveget:");
        String szoveg = sc.nextLine();
        String menupont = "";
        while (!menupont.equals("f")) {
            System.out.println("Adja meg, hogy mit szeretne csinálni a szöveggel:");
            System.out.println("\ta - nagybetűssé alakítani");
            System.out.println("\tb - kisbetűssé alakítani");
            System.out.println("\tc - lekérdezni a hosszát");
            System.out.println("\td - összehasonlítani egy másik szöveggel");
            System.out.println("\te - a szöveg egy részét kiiratni");
            System.out.println("\tf - kilépni");
            menupont = sc.nextLine().toLowerCase();
            switch (menupont) {
                case "a":
                    System.out.println(szoveg.toUpperCase());
                    break;
                case "b":
                    System.out.println(szoveg.toUpperCase());
                    break;
                case "c":
                    System.out.printf("A szöveg hossza %d karakter\n", szoveg.length());
                    break;
                case "d":
                    System.out.println("Kérem adja meg a másik szöveget: ");
                    String szoveg2 = sc.nextLine();
                    int ossehasonlitas = szoveg.compareTo(szoveg2);
                    if (ossehasonlitas < 0) {
                        System.out.println("Az első szöveg van előrébb az ABC-ben.");
                    } else if (ossehasonlitas > 0) {
                        System.out.println("Az második szöveg van előrébb az ABC-ben.");
                    } else {
                        System.out.println("A két szöveg megegyezik.");
                    }
                    break;
                case "e":
                    System.out.println("Kérem adja meg a kezdő karakter sorszámát, amit ki szeretna írni: ");
                    int a = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Kérem adja meg az utolsó karakter sorszámát, amit ki szeretna írni: ");
                    int b = sc.nextInt();
                    sc.nextLine();
                    System.out.println(szoveg.substring(a - 1, b));
                    break;
                case "f":
                    System.out.println("Viszlát!");
                    break;
                default:
                    System.out.println("Rossz lehetőséget adott meg, kére a menüpontok közül válasszon.");
                    break;
            }
        }
    }
}
