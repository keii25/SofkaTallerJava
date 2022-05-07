package Taller1;

import java.util.Scanner;

public class Ejercicio_5 {
    public static String namePet;
    public static String typePet;
    public static String name;
    public static String lastName;
    public static int agePet;

    public void getPet(){
        Scanner input = new Scanner(System.in);

        System.out.print("Nombre Mascota: ");
        namePet = input.nextLine();

        System.out.print("Edad Mascota: ");
        agePet = input.nextInt();

        System.out.print("Tipo de Mascota: ");
        typePet = input.nextLine();

        System.out.print("Escriba su Nombre: ");
        name = input.nextLine();

        System.out.print("Escriba su apellido: ");
        lastName = input.nextLine();

        System.out.println(
                namePet + " es un " + typePet + ", el cual tiene "
                + agePet + " años de edad y " + name + " "+ lastName + " es su dueño");

    }
}
