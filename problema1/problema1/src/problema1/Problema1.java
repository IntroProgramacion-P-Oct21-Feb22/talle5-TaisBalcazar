/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALAA
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double costo_kilovatio;
        double kilovatios_consumidos;
        int edad;
        int porcentaje = 10;
        double descuento;
        double costo_total;

        System.out.println("Ingrese el valor de costo por kilovatio/hora");
        costo_kilovatio = entrada.nextDouble();

        System.out.println("Ingrese el número de kilovatios consumidos "
                + "en el mes.");
        kilovatios_consumidos = entrada.nextDouble();

        System.out.println("Ingrese su edad");
        edad = entrada.nextInt();

        costo_total = costo_kilovatio * kilovatios_consumidos;

        if (edad > 65) {
            /*ct ---- 100%
                 x ---- 10%
             */
            descuento = (porcentaje * costo_total) / 100;
            costo_total = costo_total - descuento;
        }

        System.out.printf("El  valor total a pagar es: %.2f", costo_total);

    }

}
