package Taller1;

import java.util.Scanner;

public class Ejercicio_3 {
    public static String name;
    public static String lastName;
    public static String nameMom;
    public static String lastNameMom;
    public static String nameDaddy;
    public static String lastNameDaddy;

    public void familyPerson(){
        Scanner input = new Scanner(System.in);
        System.out.print("Escriba su nombre: ");
        name = input.nextLine();

        System.out.print("Escriba su Apellido: ");
        lastName = input.nextLine();

        System.out.print("Nombre de la Madre: ");
        nameMom = input.nextLine();

        System.out.print("Apellido de la Madre: ");
        lastNameMom = input.nextLine();

        System.out.print("Nombre del Padre: ");
        nameDaddy = input.nextLine();

        System.out.print("Apellido del Padre: ");
        lastNameDaddy = input.nextLine();

        System.out.println(
                "Yo " + name + " " + lastName + " soy hijo de " + nameMom + " " + lastNameMom
                + " y " + nameDaddy + " " + lastNameDaddy);


    }
}
