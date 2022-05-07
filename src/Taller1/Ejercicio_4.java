package Taller1;

import java.util.Scanner;

public class Ejercicio_4 {

    public static String capital;
    public static String country;

    public void cityCapital(){
        Scanner input = new Scanner(System.in);
        System.out.print("Pais de residencia: ");
        country = input.nextLine();
        System.out.print("Ciudad Capital: ");
        capital = input.nextLine();
        System.out.println("La ciudad " + capital + " es la capital del pais " + country);
    }
}
