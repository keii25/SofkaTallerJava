package Taller1;

import java.util.Scanner;

public class Ejercicio_2 {
    public static String name;
    public static String lastName;
    public static int age;
    public static Float height;

    public void getPerson(){
        Scanner input = new Scanner(System.in);
        System.out.print("Escriba su nombre: ");
        name = input.nextLine();

        System.out.print("Escriba su Apellido: ");
        lastName = input.nextLine();

        System.out.print("Digite su edad: ");
        age = input.nextInt();

        System.out.print("Digite su Estatura: ");
        height = input.nextFloat();
    }


}
