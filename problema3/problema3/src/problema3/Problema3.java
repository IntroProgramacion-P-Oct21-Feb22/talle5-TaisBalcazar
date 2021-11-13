/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author TaisBalcazar
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        // variables
        String marca_auto;
        String origen_auto;
        double costo_auto;

        //porcentajes de cada pais
        double porcentaje_J = 30;
        double porcentaje_A = 20;
        double porcentaje_I = 15;
        double porcentaje_USA = 8;

        //impuestos
        double impuesto_J;
        double impuesto_A;
        double impuesto_I;
        double impuesto_USA;

        double precio_venta;

        //proceso
        System.out.println("Ingrese la marca del automóvil");
        marca_auto = entrada.nextLine();

        System.out.println("Ingrese el origen del automóvil");
        origen_auto = entrada.nextLine();

        System.out.println("Ingrese el costo del automóvil");
        costo_auto = entrada.nextDouble();

        if (costo_auto < 0) {
            System.out.println("Valor invalido");
        } else {
            if (origen_auto.equals("Alemania")) {
                impuesto_A = (costo_auto * porcentaje_A) / 100;
                precio_venta = impuesto_A + costo_auto;
                System.out.printf("El impuesto a pagar es: %.2f\n"
                        + "El precio de venta total es: %.2f\n",
                        impuesto_A, precio_venta);
            } else {
                if (origen_auto.equals("Japon")) {
                    impuesto_J = (costo_auto * porcentaje_J) / 100;
                    precio_venta = impuesto_J + costo_auto;
                    System.out.printf("El impuesto a pagar es: %.2f\n"
                            + "El precio de venta total es: %.2f\n", impuesto_J,
                            precio_venta);
                } else {
                    if (origen_auto.equals("Italia")) {
                        impuesto_I = (costo_auto * porcentaje_I) / 100;
                        precio_venta = impuesto_I + costo_auto;
                        System.out.printf("El impuesto a pagar es: %.2f\n"
                                + "El precio de venta total es: %.2f\n",
                                impuesto_I, precio_venta);
                    } else {
                        if (origen_auto.equals("USA")) {
                            impuesto_USA = (costo_auto * porcentaje_USA) / 100;
                            precio_venta = impuesto_USA + costo_auto;
                            System.out.printf("El impuesto a pagar es: %.2f\n"
                                    + "El precio de venta total es: %.2f\n",
                                    impuesto_USA, precio_venta);
                        } else {
                            System.out.printf("No requiere pagar impuesto\n"
                                    + "El precio de venta total es: %.2f\n",
                                    costo_auto);
                        }

                    }
                }
            }
        }
    }

}
