
/*
 * LC_III-guía-práctica-unidad-01-ejercicio-05
 * 5. Ingresar la cantidad de horas trabajadas por un empleado y el sueldo que cobra por hora.
 * Indique el total a cobrar teniendo en cuenta que si trabajó más de 180 horas las excedentes
 * las cobra con un 50 % de aumento.
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer horasTrabajadas = input.nextInt();
        Double sueldoPorHora = input.nextDouble();
        Double totalACobrar;

        if (horasTrabajadas > 180) {
            totalACobrar = horasTrabajadas * sueldoPorHora + (horasTrabajadas - 180) * (sueldoPorHora * 1.50);
        } else {
            totalACobrar = horasTrabajadas * sueldoPorHora;
        }
        System.out.println(totalACobrar);
    }
}