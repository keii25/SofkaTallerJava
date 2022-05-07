package Taller1;

import java.util.Scanner;

public class Ejercicio_1 {
    public static String name;
    public static String lastName;

    public void person(){
        Scanner input = new Scanner(System.in);
        System.out.print("Escriba su nombre: ");
        name = input.nextLine();
        System.out.print("Escriba su Apellido: ");
        lastName = input.nextLine();

    }


}
